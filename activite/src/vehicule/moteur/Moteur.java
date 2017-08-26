package vehicule.moteur;
import java.io.Serializable;

public class Moteur implements Serializable{

	protected TypeMoteur type;
    protected String cylindre;
    protected Double prix;

    public Moteur(String cylindre, Double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
        this.type = type;
    }

    public String toString() {
        return this.type
        		+"\t cylindre: "+this.cylindre;
    }

    public Double getPrix() {
        return this.prix;
    }
    public String getCylindre() { 
    	return this.cylindre;
    }
}
