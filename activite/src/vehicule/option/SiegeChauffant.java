package vehicule.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 5374387273313766286L;
	private double prix;
	 private String nom;

	    public SiegeChauffant() {
	        prix = 562.9;
	        this.nom = "Siege chauffant";
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
