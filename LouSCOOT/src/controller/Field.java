package controller;

import java.util.*;
import view.Programme;
import controller.Button;
import model.Location;
import model.Scooter;
import model.Parc;
import java.awt.event.*;
import javax.swing.*;

public class Field implements ActionListener {
	JButton value;
	Parc p;
	JPanel panel;
	JLayeredPane layer;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;

	public Field(JButton l, Parc pp) {
		value = l;
		p = pp;
	}

	public Field(JButton l, Parc pp, JPanel pn, JLayeredPane lay, JLabel lab) {
		value = l;
		p = pp;
		panel = pn;
		layer = lay;
		label1 = lab;
	}

	public Field(JButton l, Parc pp, JPanel pn, JLayeredPane lay, JLabel lab1, JLabel lab2, JLabel lab3, JLabel lab4,
			JLabel lab5) {
		value = l;
		p = pp;
		panel = pn;
		layer = lay;
		label1 = lab1;
		label2 = lab2;
		label3 = lab3;
		label4 = lab4;
		label5 = lab5;
	}

	public void switchPanels(JPanel panel, JLayeredPane layer) {
		layer.add(panel);
	}

	public void clear(JPanel panel) {
		layer.removeAll();
	}

	public void actionPerformed(ActionEvent e) {
		int last = 0;
		try {
			int ans = Integer.parseInt(((JTextField) e.getSource()).getText());
			Scooter scoot = p.getScoot(ans);

			if ((value.getText().equals("Louer un Scooter"))) {

				if (p.check(ans) == 1) {
					label1.setText("Le scooter " + scoot.marque + " " + scoot.modele
							+ " vous a bien été loué ");
				} else {
					label1.setText("Erreur : Le scooter est deja en location.");
				}

				if (last != 1) {
					layer.remove(panel);
					switchPanels(panel, layer);
					last = 1;
				}
			}

			if ((value.getText().equals("Retourner un Scooter"))) {

				if (p.retourner(ans) == 1) {
					label1.setText("Le scooter " + scoot.marque + " " + scoot.modele + " a bien été rendu.");
				} else {
					label1.setText("Erreur : Le scooter n'est pas en location.");
				}
				if (last != 2) {
					layer.remove(panel);
					switchPanels(panel, layer);
					last = 2;
				}
			}
			if ((value.getText().equals("Etat d'un Scooter"))) {

				if (scoot.etat == 0) {
					label1.setText("Etat : disponible");
				} else {
					label1.setText("Etat : indisponible");
				}
				label2.setText("Marque : " + scoot.marque);
				label3.setText("Modele : " + scoot.modele);
				label4.setText("Couleur : " + scoot.couleur);
				label5.setText("Kilometrage : " + Integer.toString(scoot.kilometrage) + " km");

				if (last != 3) {
					layer.remove(panel);
					switchPanels(panel, layer);
					last = 3;
				}
			}

		} catch (

		NumberFormatException ex) {
			label1.setText("Veuillez entrer un id valide:");

		} catch (ArrayIndexOutOfBoundsException ex) {
			label1.setText("L'id entré n'existe pas.");
		}
	}

}