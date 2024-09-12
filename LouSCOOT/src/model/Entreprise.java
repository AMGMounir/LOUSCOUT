package model;
import java.util.*;

public class Entreprise {

    public String nomEntreprise;
    
    public Entreprise(String nomEntreprise) {
    	this.nomEntreprise = nomEntreprise;
    }
 
    public Vector<Location> listeContrat = new Vector<Location>();
    public Vector<Parc> listeParcs = new Vector<Parc>();
    public Vector<Client> listeClient = new Vector<Client>();
    
    //get
    public String getname() {
    	return nomEntreprise;
    }
    
    //set
    public void setname(String n) {
    	 this.nomEntreprise = n;
    }
    
    //other functions
    public void ajoutContrat(Location l) {
    	listeContrat.add(l);
    }
    
    public void removeContrat(Location l) {
    	listeContrat.remove(l);
    }
    
    public void ajoutClient(Client c) {
    	listeClient.add(c);
    }
    public void removeClient(Client c) {
    	listeClient.remove(c);
    }
    
    public void ajoutParc(Parc p) {
    	listeParcs.add(p);
    }
    public void removeParc(Parc p) {
    	listeParcs.add(p);
    }
}