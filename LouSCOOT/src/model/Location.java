package model;
import java.util.*;

public class Location {

    public Calendar datedebut;
    public Calendar datefin;
    public int id;
    public int idscoot;

    public Location(Calendar datedebut,Calendar datefin,int id,int idscoot) {
    	this.datedebut = datedebut;
    	this.datefin = datefin;
    	this.id = id;
    	this.idscoot = idscoot;
    }
    public Entreprise entreprise; //?????? besoin pour connaitre l'entreprise qui gere la loc

    public Client client; //?????? besoin pour savoir a quel client la loc appartient
    
    public Scooter scooter; //?????? besoin pour savoir quel est le scoot concerné par la loc
    
    //get
    public int getContratid() {
        return id;
    }
    public int getScootid() {
        return idscoot;
    }
    
    public Calendar getdated() {
        return datedebut;
    }

    public Calendar getdatef() {
       return datefin;
    }

    //set
    public void setdated(Calendar d) {
    	this.datedebut = d;
    }
    
    public void setScootid(int id) {
    	this.idscoot = id;
    }

    public void setdatef(Calendar d) {
    	this.datefin = d;
    }
    public void setContratid(int id) {
    	this.id = id;
    }

}