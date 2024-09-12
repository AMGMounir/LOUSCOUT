package model;
import java.util.*;

public class Client {

    public String nom; 
    public String prenom; 
    public String email;
    public int numero;

    public Client(String nom, String prenom,String email,int numero) {
    	this.nom = nom; 
    	this.prenom = prenom; 
        this.email = email;
        this.numero = numero;
    } 
   
    public Vector<Location> listeContrat = new Vector<Location>();
    
    public Entreprise entreprise; // ???? pour savoir a quelle entreprise appartient le client

    //get
    public String getname() {
        return nom;
    }
    
    public String getfname() {
        return prenom;
    }

    public String getmail() {
        return email;
    }
    
    public int getnum() {
        return numero;
    }
    //set
    
    public void setname(String n) {
        this.nom = n;
    }
    
    public void setfname(String p) {
        this.prenom = p;
    }
    
    public void setmail(String mail) {
        this.email = mail;
    }
    
    public void setnum(int n) {
        this.numero = n;
    }
    
    //other functions du style demanderLoc().

}