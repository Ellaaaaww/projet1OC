package garageOpenClassroom;
import vehicule.option.Option;
import vehicule.moteur.Moteur;
import vehicule.moteur.MoteurHybride;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Option, Serializable{

	protected double prix;
	protected String nom;
	protected Marque nomMarque;
	private Moteur moteur;
	private double valOpt = 0; 
	
	private ArrayList<Option> options;
	
	//Constructeur par defaut
	
	public Vehicule(){
		options = new ArrayList<Option>();
		
	}
	//Surcharge de constructeur
	
	public Vehicule(double prix, String nom, ArrayList<Option> options, Marque nomMarque){
		this.prix= prix;
		this.nom = nom;
		this.options = options;
		this.nomMarque = nomMarque;
				
	}
	
	//methode pour ajouter des options
	public void addOption( Option opt){
		options.add(opt);
		
	}
	/**
	public double valeurOptions(Vehicule vehi){
		 for(int i = 0; i < options.size(); i++)
		    {
			 valOpt += Option.getPrix(i);
		    }
		 	return valOpt;
		 	
	}
	*/
	
    public double prixOptions(ArrayList<Option > options, double valOpt){
        this.valOpt = valOpt;
        valOpt = 0;
        for(int i = 0; i < options.size(); i++){
            valOpt = valOpt + options.get(i).getPrix();
            }
        	return prix + valOpt;
        }
        
	
	
	// fait apparaitre les lignes d'affichage
	
	/**
	public String toString() {
        return "\t nom : "+this.nom+"\t prix : "
	+this.getPrix()+" marque : "
	+this.nomMarque+ " \t moteur :"+this.moteur
	+ "\t options : "+this.options
	+"valeur totale :" +this.prixOptions(options, prix);
      
        	}
	
	*/
    
    public String toString(){
    	return "+ Voiture " +this.nomMarque +" : \t" +this.nom+"\t MOTEUR "+ this.moteur+" "+"\t ("+this.prix+" €)"+" \t"+this.options+" "
    +" d'une valeur totale de " +this.prixOptions(options, prix) +"€";
    }
	
	  
	
	public Marque getMarque(){
		return this.nomMarque;
	}
	
	public List<Option> getOption(){
		return this.options;
	}
	
//getter et setter pour le prix
	
	public Double getPrix(){
		return this.prix;
	}
	public void setPrix(double prix){
		this.prix = prix;
	}
// getter et setter pour le nom
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom(){
		return this.nom;
	}

	 public void setMoteur(Moteur moteur) {
	        this.moteur = moteur;
	    }


		
	
	
}
