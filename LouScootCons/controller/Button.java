package controller;

import model.Parc;
import view.Programme;
import java.awt.event.*;
import javax.swing.*;

public class Button implements ActionListener {
	JButton value;
	JTextField id;
	Parc p;

	public Button(JButton l, JTextField t, Parc pp) {
		value = l;
		id = t;
		p = pp;
	}

	public Button(JButton l, Parc pp) {
		value = l;
		p = pp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String ans = ((JButton) e.getSource()).getText();

		if (ans == "Etat du Parc") {
			p.affEtat();
		}
		if (ans == "Saisie du Parc") {
			p.saisieparc();
		}
		if (ans == "Quitter le programme") {
			p.save();
		}

	}

}