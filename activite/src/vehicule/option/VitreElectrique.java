package vehicule.option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8286577005894998940L;
	private double prix;
    private String nom;

    public VitreElectrique() {
        this.prix = 212.35;
        this.nom = "Vitre electrique";
    }

   
    public Double getPrix() {
        return this.prix;
    }

    
    public String getNom() { 
    	return this.nom;
    	}
    public String toString(){
		return this.nom +" ("+this.prix +"€)";
		
	}
}

