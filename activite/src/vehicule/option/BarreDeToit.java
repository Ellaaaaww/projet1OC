package vehicule.option;
import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5946933621469863395L;
	private double prix;
    private String nom;

    public BarreDeToit() {
        this.prix = 29.9;
        this.nom = "Barre de toit";
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
