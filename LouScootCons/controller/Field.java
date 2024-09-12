package controller;

import java.util.*;
import view.Programme;
import model.Parc;
import java.awt.event.*;
import javax.swing.*;

public class Field implements ActionListener {
	JButton value;
	Parc p;

	public Field(JButton l, Parc pp) {
		value = l;
		p = pp;
	}

	public void actionPerformed(ActionEvent e) {

		try {
			int ans = Integer.parseInt(((JTextField) e.getSource()).getText());
			if ((value.getText().equals("Louer un Scooter"))) {
				p.check(ans);
			}
			if ((value.getText().equals("Retourner un Scooter"))) {
				p.retourner(ans);
			}
			if ((value.getText().equals("Etat d'un Scooter"))) {
				p.etat(ans);
			}
			if ((value.getText().equals("Etat du Parc"))) {
				p.affEtat();
			}

		} catch (NumberFormatException ex) {
			System.out.println("Veuillez entrez un id valide : ");

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("L'id entré n'existe pas : ");
		}
	}

}