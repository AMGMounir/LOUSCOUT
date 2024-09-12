package model;
import java.util.*;

public class Scooter {

    public String modele;
    public int id;
    public int kilometrage;
    public int etat; 
    public String couleur;
    public String marque;

    public Scooter(String marque,String modele,String couleur,int id,int kilometrage,int etat) {
    	this.modele = modele;
    	this.id = id;
    	this.kilometrage = kilometrage;
    	this.etat = etat;
    	this.couleur = couleur;
    	this.marque = marque;
    }

    public Vector<Location> listeContrat = new Vector<Location>();
    
    public Parc parc; //?????? besoin pour connaitre le parc du scoot actuel.

    //get
    public String getmodel() {
        return modele;
    }
    
    public int getid() {
        return id;
    }
    
    public int getkm() {
        return kilometrage;
    }
    
    public int getEtat() {
        return etat;
    }
    public String getColor() {
        return couleur;
    }
    public String getMarque() {
        return marque;    
    }
    
    //set
    public void setmodel(String modele) {
        this.modele = modele;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    
    public void setkm(int kilometrage) {
        this.kilometrage = kilometrage;
    }
    
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public void setColor(String couleur) {
        this.couleur = couleur;
    }
    public void setMarque(String marque) {
        this.marque = marque;    
    }
    
    //other functions;
    public Location getcontrat() {
    	for (int i=0; i<listeContrat.size(); i++) {
    		  if (listeContrat.get(i).id == id && etat == 1 ){
    			  return listeContrat.get(i);
    		  }
    	}
    	System.out.print("erreur : le sooter selectioné est inexistant ou non loué actuellement");
		return null;

    }

}