package controller;

import model.Parc;
import model.Scooter;
import view.Programme;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class Button implements ActionListener {
	JButton value;
	JTextField id;
	Parc p;
	JPanel pan;
	JLayeredPane layer;
	JPanel souspan;
	JTable tb;
	DefaultTableModel dm;
	public Button(JButton l, JTextField t, Parc pp) {
		value = l;
		id = t;
		p = pp;
	}

	public Button(JButton l, Parc pp) {
		value = l;
		p = pp;
	}

	public Button(JButton l, JTextField t, Parc pp, JPanel pn, JLayeredPane lay) {
		value = l;
		id = t;
		p = pp;
		pan = pn;
		layer = lay;
	}

	public Button(JButton l, Parc pp, JPanel pn, JLayeredPane lay) {
		value = l;
		p = pp;
		pan = pn;
		layer = lay;
	}
	
	public Button(JButton l, Parc pp, JPanel pn, JLayeredPane lay,JTable ls,DefaultTableModel dfm) { //remetre JLSIT
		value = l;
		p = pp;
		pan = pn;
		layer = lay;
		tb = ls;
		dm = dfm;
		
	}
	


	public void switchPanels(JPanel panel, JLayeredPane layer) {
		layer.removeAll();
		layer.add(panel);
		layer.repaint();
		layer.revalidate();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Vector<Scooter> listeScooter;
		String ans = ((JButton) e.getSource()).getText();
		if (ans == "Etat du Parc") {
			dm.getDataVector().removeAllElements();
			for (Scooter s : p.listeScooter) {
	            String marque = s.marque;
	            String modele = s.modele;
	            String coul = s.couleur;
	            int id = s.id;
	            int km = s.kilometrage;
	            int etat = s.etat;
	            String etat2;
	            if (etat==1)etat2="indispo";else etat2="disponible";
	            Object[] rowData = { marque, modele, coul, id ,km ,etat2 };
	            dm.addRow(rowData);
	        }
			switchPanels(pan, layer);
	
		} else if (ans == "Saisie du Parc") {
			dm.getDataVector().removeAllElements();
		
			Object[] rowData = { p.listeScooter.size(),p.listeScooter.size()-p.saisieparc().size(),p.saisieparc().size(),p.getKm()};
			Object[] rowData2 = { "","","",""};
			Object[] rowData3 = { "Ids Dispos :","","",""};
			dm.addRow(rowData);
			dm.addRow(rowData2);
			dm.addRow(rowData3);
			
				for (Scooter s : p.saisieparc()) { // dispos
		  
		            int id = s.id;
		         
		           
		            Object[] row = { id,"" , "", ""};
		            dm.addRow(row);
		        }
				Object[] rowData4 = { "Ids loués :","","",""};
				dm.addRow(rowData4);
				for (Scooter s : p.notSaisie()) { // dispos
					  
		            int id = s.id;
		         
		           
		            Object[] row = { id,"" , "", ""};
		            dm.addRow(row);
		        }
				
				
			
			
			switchPanels(pan, layer);

		} else if (ans == "Quitter le programme") {
			JFrame frame = new JFrame("EXIT");
			if (JOptionPane.showConfirmDialog(frame, "Voulez vous vraiment quitter le programme?", "Quitter",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				p.save();
				System.exit(0);
			}
		} else
			switchPanels(pan, layer);

	}

}