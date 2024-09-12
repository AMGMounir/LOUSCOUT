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

	public Parc(String etat, int idParc) {
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

	// FONCTION 1
	public int check(int id) {

		Calendar datedb = Calendar.getInstance();
		datedb.set(2021, 00, 12);
		Calendar datefin = Calendar.getInstance();
		datefin.set(2022, 9, 24);

		if (listeScooter.get(id).etat == 0) {
			//System.out.println("\nLe scooter est disponible pour location.\n");
			louer(datedb, datefin, E.listeContrat.size(), listeScooter.get(id).id);
			return 1; // dispo
		}
		return -1;
	}

	public void louer(Calendar db, Calendar df, int id, int scid) {
		listeScooter.get(scid).setEtat(1);
		E.listeContrat.add(new Location(db, df, listeScooter.get(id).id, scid));

	}

	// FONCTION 2
	public int retourner(int id) {

		if (listeScooter.get(id).etat == 1) {

			// System.out.print("\nNombre de kilomètres effectués : ");

			listeScooter.get(id).setkm(listeScooter.get(id).kilometrage);
			listeScooter.get(id).setEtat(0);

			// System.out.println("\nLe scooter a bien été retourné.");
			return 1;
		}
		return -1;
	}
	
	public int getKm() {
		int km = 0;
		for (int i = 0; i < listeScooter.size(); i++) {
			km+=listeScooter.get(i).kilometrage;
		}
		return km/listeScooter.size();
	}
	// FONCTION 3 DONE
	public Scooter getScoot(int id) {

		return listeScooter.get(id);
	}

	// FONCTION 4 DONE
	public Vector<Scooter> getlist() {
//       if (etat == "plein" || listeScooter.size() == capacité) {
//			System.out.print("\nLe Parc de Scooters est plein, il y a donc " + listeScooter.size() + " scooters\n\n");
//
//		} else {
//			System.out.print("\nLe Parc de Scooters dispose de " + (capacité - listeScooter.size()) + " places.\n\n");
//		} 
//		for (int i = 0; i < listeScooter.size(); i++) {
//			System.out.println("Marque : " + listeScooter.get(i).marque);
//			System.out.println("Modele : " + listeScooter.get(i).modele);
//			System.out.println("Couleur : " + listeScooter.get(i).couleur);
//			System.out.println("Kilometrage : " + listeScooter.get(i).kilometrage);
//			System.out.println("Id : " + listeScooter.get(i).id + "\n");
//		}

		return listeScooter;
	}

	// FONCTION 5 DONE
	public Vector<Scooter> saisieparc() {
		Vector<Scooter> ids1 = new Vector<Scooter>();
		for (int i = 0; i < listeScooter.size(); i++) {
			if (listeScooter.get(i).etat == 0) {
				ids1.add(listeScooter.get(i));
			}
		}
		return ids1;
	}
	public Vector<Scooter> notSaisie() {
		Vector<Scooter> ids1 = new Vector<Scooter>();
		for (int i = 0; i < listeScooter.size(); i++) {
			if (listeScooter.get(i).etat == 1) {
				ids1.add(listeScooter.get(i));
			}
		}
		return ids1;
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
}
