package vehicule.option;

import java.io.Serializable;


public class GPS implements Option, Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 3597149323828731497L;
	private double prix;
	    private String nom;

	    public GPS() {
	        prix = 113.5;
	        this.nom = "GPS";
	    }

	    /* Return the price of the option */
	    @Override
	    
	    public Double getPrix() {
	        return this.prix;
	    }

	    @Override
	    public String getNom() {
	    	return this.nom;
	    }
	    public String toString(){
			return this.nom +" ("+this.prix +"€)";
			
		}
	  
	 
	
}
