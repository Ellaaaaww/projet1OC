package vehicule.option;
import java.io.Serializable;

public class Climatisation implements Option, Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 7169271172527738905L;
	private double prix;
	    private String nom;

	    public Climatisation() {
	        this.prix = 347.3;
	        this.nom = "Climatisation";
	    }

	    /* Return the price of the option */
	
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
