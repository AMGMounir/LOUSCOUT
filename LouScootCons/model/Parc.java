package model;

import java.io.BufferedWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Parc {
	Entreprise E = new Entreprise("LOUSCOOT");
	public String etat;
	public int idParc;

	public Parc(String etat, int capacité, int idParc) {
		this.etat = etat;
		this.idParc = idParc;
	}

	public Vector<Scooter> listeScooter = new Vector<Scooter>();
	public Entreprise entreprise; // ?????? besoin pour savoir dans quelle entreprise le Parc est

	public void addScoot(Scooter s) {
		listeScooter.add(s);
	}

	public void removeScoot(Scooter s) {
		listeScooter.remove(s);
	}


	public int check(int id) {

		Calendar datedb = Calendar.getInstance();
		datedb.set(2021, 00, 12);
		Calendar datefin = Calendar.getInstance();
		datefin.set(2022, 9, 24);

		if (listeScooter.get(id).etat == 0) {
			System.out.println("\nLe scooter est disponible pour location.\n");
			louer(datedb, datefin, E.listeContrat.size(), listeScooter.get(id).id);
			return 1; // dispo
		} else if (listeScooter.get(id).etat == 1) {
			System.out.println("\nLe scooter est déjà loué.");
			return 0; // loué
		} else
			System.out.println("\nLe scooter n'existe pas.");
		return -1; // inexistant
	}

	public void louer(Calendar db, Calendar df, int id, int scid) {
		listeScooter.get(scid).setEtat(1);
		E.listeContrat.add(new Location(db, df, listeScooter.get(id).id, scid));
		System.out.println("Le scooter vous a bien été loué, informations de la location : ");
		System.out.println("Date de debut :" + E.listeContrat.get(id).datedebut.getTime());
		System.out.println("Date de fin :" + E.listeContrat.get(id).datefin.getTime());
		System.out.println("id de la location :" + E.listeContrat.get(id).id);
	}


	public void retourner(int id) {
		boolean y = false;
		int v = 0;
		if (listeScooter.get(id).etat == 0) {
			System.out.println("\nImpossible de retourner un scooter disponible.");
		}

		if (listeScooter.get(id).etat == 1) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\nNombre de kilomètres effectués : ");
			do {
				String km = scanner.nextLine();
				try {
					v = Integer.parseInt(km);
					y = true;
				} catch (NumberFormatException ex) {
					System.out.println("\n====================================");
					System.out.println("Erreur! Saisie incorrecte.");
					System.out.println("====================================\n");
					System.out.println("Veuillez entrez un kilometrage valide : ");
				}
			} while (y == false);
			listeScooter.get(id).setkm(listeScooter.get(id).kilometrage + v);
			listeScooter.get(id).setEtat(0);

			System.out.println("\nLe scooter a bien été retourné.");
			
		}
	}

	// FONCTION 3 DONE
	public void etat(int id) {

		if (listeScooter.get(id).etat == 0) {
			System.out.println("le scooter est disponnible");
			System.out.println("Marque : " + listeScooter.get(id).marque);
			System.out.println("Modele : " + listeScooter.get(id).modele);
			System.out.println("Couleur : " + listeScooter.get(id).couleur);
			System.out.println("Kilometrage : " + listeScooter.get(id).kilometrage);
			System.out.println("Id : " + listeScooter.get(id).id);

		} else if (listeScooter.get(id).etat == 1) {
			System.out.println("le scooter est indisponnible");
			System.out.println("Marque : " + listeScooter.get(id).marque);
			System.out.println("Modele : " + listeScooter.get(id).modele);
			System.out.println("Couleur : " + listeScooter.get(id).couleur);
			System.out.println("Kilometrage : " + listeScooter.get(id).kilometrage);
			System.out.println("Id : " + listeScooter.get(id).id);
		}

	}

	// FONCTION 4 DONE
	public void affEtat() {
		
		for (int i = 0; i < listeScooter.size(); i++) {
			System.out.println("Marque : " + listeScooter.get(i).marque);
			System.out.println("Modele : " + listeScooter.get(i).modele);
			System.out.println("Couleur : " + listeScooter.get(i).couleur);
			System.out.println("Kilometrage : " + listeScooter.get(i).kilometrage);
			System.out.println("Id : " + listeScooter.get(i).id + "\n");
		}
	}

	// FONCTION 5 DONE
	public void saisieparc() {
		System.out.println("Le nombre total de scooters est : " + listeScooter.size());
		int cpt1 = 0;
		int cpt2 = 0;

		ArrayList<Integer> ids1 = new ArrayList<Integer>();
		ArrayList<Integer> ids2 = new ArrayList<Integer>();
		for (int i = 0; i < listeScooter.size(); i++) {
			if (listeScooter.get(i).etat == 0) {
				cpt1++;
				ids1.add(listeScooter.get(i).id);
			}
			if (listeScooter.get(i).etat == 1) {
				cpt2++;
				ids2.add(listeScooter.get(i).id);
			}
		}
		System.out.println("\nLe nombre de scooters disponibles est : " + cpt1);
		if (cpt1 == 0)
			System.out.println("\n");
		if (cpt1 == 1) {
			System.out.println("\nVoici son N° d'identification :");
			for (int j = 0; j < ids1.size(); j++) {
				System.out.println("- " + ids1.get(j));
			}
		}
		if (cpt1 > 1) {
			System.out.println("\nVoici leurs N° d'identification :");
			for (int j = 0; j < ids1.size(); j++) {
				System.out.println("- " + ids1.get(j));
			}
		}

		System.out.println("\nLe nombre de scooters en location est : " + cpt2);
		if (cpt2 == 0)
			System.out.println("\n");
		if (cpt2 == 1) {
			System.out.println("\nVoici son N° d'identification :");
			for (int k = 0; k < ids2.size(); k++) {
				System.out.println("- " + ids2.get(k));
			}
		}
		if (cpt2 > 1) {
			System.out.println("\nVoici leurs N° d'identification :");
			for (int k = 0; k < ids2.size(); k++) {
				System.out.println("- " + ids2.get(k));
			}
		}
		int kmtot = 0;
		int r = 0;
		for (r = 0; r < listeScooter.size(); r++) {
			kmtot = kmtot + listeScooter.get(r).kilometrage;
		}

		System.out.println("le kilometrage moyen de l'ensemble des scooters est : " + kmtot / (r));

	}

	public List<List<String>> load() {

		System.out.print("Chargement de la sauvegarde\n\n");
		List<List<String>> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(
				new FileReader("D:\\Perso\\java\\LouSCOOT\\src\\model\\data.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				records.add(Arrays.asList(values));

			}
			for (int i = 0; i < records.size(); i++) {
				Scooter sc1 = new Scooter(records.get(i).get(0), records.get(i).get(1), records.get(i).get(2),
						Integer.parseInt(records.get(i).get(3)), Integer.parseInt(records.get(i).get(4)),
						Integer.parseInt(records.get(i).get(5))); // marque | modele | couleur | id | KM | etat.
				addScoot(sc1);
				br.close();
			}
			System.out.print("Chargement terminé \n");
			return records;

		} catch (IOException ex) {
			System.out.print("\nerreur dans l'ouverture du fichier");
		}
		return records;
	}

	public void save() {
		System.out.println("sauvegarde en cours...");
		try (BufferedWriter br = new BufferedWriter(
				new FileWriter("D:\\Perso\\java\\LouSCOOT\\src\\model\\data.csv"))) {
			for (int i = 0; i < listeScooter.size(); i++) {
				br.append(listeScooter.get(i).marque);
				br.append(',');
				br.append(listeScooter.get(i).modele);
				br.append(',');
				br.append(listeScooter.get(i).couleur);
				br.append(',');
				br.append(Integer.toString(listeScooter.get(i).id));
				br.append(',');
				br.append(Integer.toString(listeScooter.get(i).kilometrage));
				br.append(',');
				br.append(Integer.toString(listeScooter.get(i).etat));
				br.append("\n");
			}
			br.close();
		} catch (IOException ex) {
			System.out.print("erreur dans l'ouverture du fichier");
		}
		System.out.println("sauvegarde terminée, au revoir");
	}

	public static void main(String[] args) {

		// System.out.print(data.get(0).get(1)+ "\n");
		String input;
		int n = 0;
		int x;
		String ids;
		Scanner s = new Scanner(System.in);
		boolean test1;
		boolean conf = false;
		boolean t1, t2, t3, t4, t5, t6;
		Parc p1 = new Parc("contient", 100, 0);
		p1.load();
		System.out.println("Bienvenue dans votre espace location.\n");
		System.out.println("====================================");

		while (conf == false) {
			test1 = false;
			conf = false;
			t1 = false;
			t2 = false;
			t3 = false;
			t4 = false;
			t5 = false;
			t6 = false;

			System.out.println("1- Louer un scooter");
			System.out.println("2- Retour d'un scooter");
			System.out.println("3- Etat d'un scooter");
			System.out.println("4- Affichage de l'etat du parc de scooter");
			System.out.println("5- Saisie du parc de scooter");
			System.out.println("6- Quitter le programme");

			System.out.print("\nVeuillez selectionner une des options qui vous sont proposees : ");

			do {
				input = s.nextLine();
				try {
					n = Integer.parseInt(input);
					if (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 6) {
						System.out.println("\n====================================");
						System.out.println("Erreur! Saisie incorrecte.");
						System.out.println("====================================\n");
						System.out.print("Veuillez choisir une option parmi celle qui vous sont proposées : ");
					} else {
						if (n == 4) {
							p1.affEtat();
							t4 = true;

						} else if (n == 6) {
							p1.save();
							t6 = true;
							break;
						} else if (n == 5) {
							p1.saisieparc();
							t5 = true;

						} else {
							System.out.print("\nEntrez le N° d'identifiant du scooter concerné : ");
							do {
								ids = s.nextLine();

								try {
									test1 = false;
									x = Integer.parseInt(ids);

									if (n == 1) {
										p1.check(x);
										t1 = true;
									}
									if (n == 2) {
										p1.retourner(x);
										t2 = true;
									}
									if (n == 3) {
										p1.etat(x);
										t3 = true;
									}
									test1 = true;
								} catch (NumberFormatException ex) {
									System.out.println("====================================");
									System.out.println("Erreur! Veuillez entrez un nombre!");
									System.out.println("====================================");
									System.out.print("Entrez le N° d'identifiant du scooter concerné : ");
								} catch (ArrayIndexOutOfBoundsException ex) {
									System.out.println("====================================");
									System.out.println("Erreur! Veuillez entrez un id existant!");
									System.out.println("====================================");
									System.out.print("Entrez le N° d'identifiant du scooter concerné : ");
								}
							} while (test1 == false);
						}
					}
				} catch (NumberFormatException ex) {
					System.out.println("\n====================================");
					System.out.println("Erreur! Saisie incorrecte.");
					System.out.println("====================================\n");
					System.out.print("Veuillez choisir une option parmi celle qui vous sont proposées : ");
				}
			} while (t1 == false && t2 == false && t3 == false && t4 == false && t5 == false);
			if (t1 == true || t2 == true || t3 == true || t4 == true || t5 == true) {

				System.out.println("\n====================================");
				System.out.println("====================================");
				conf = false;

			}
			if (t6 == true) {
				break;
			}
		}
		s.close();
	}

}