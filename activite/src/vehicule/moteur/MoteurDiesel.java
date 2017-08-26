package vehicule.moteur;

import java.io.Serializable;

public class MoteurDiesel extends Moteur implements Serializable{

	public MoteurDiesel(String cylindre, Double prix) {
        super(cylindre, prix);
        super.type = TypeMoteur.DIESEL;
    }
}
