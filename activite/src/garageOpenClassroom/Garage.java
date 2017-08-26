package garageOpenClassroom;
import java.io.*;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;

public class Garage {

		private List<Vehicule> voitures;
		private FileInputStream fis;
	    private ObjectInputStream ois;
	    private BufferedInputStream bis;
	    private FileOutputStream fos;
	    private ObjectOutputStream oos;
	    private BufferedOutputStream bos;
	    private File file;
	    
	    
	    public Garage() {
	        voitures = new ArrayList<Vehicule>();
	        file = new File("../../garage.txt");
	        initialisation();
	    }
	    
	    private void initialisation() {
	        try {
	            fis = new FileInputStream(file);
	            bis = new BufferedInputStream(fis);
	            ois = new ObjectInputStream(bis);

	            for(Vehicule v : (ArrayList<Vehicule>)ois.readObject())
	                voitures.add(v);
	        }catch (FileNotFoundException e) {
	            System.err.println("Aucune voiture sauvegardee !");
	        }catch (EOFException e) {
	            e.printStackTrace();
	        }catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(ois != null) try {
	                ois.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    /* Add a vehicle to the Garage */
	    public void addVoiture(Vehicule voit) {
	        voitures.add(voit);
	        try {
	            file.createNewFile();
	            fos = new FileOutputStream(file);
	            bos = new BufferedOutputStream(fos);
	            oos = new ObjectOutputStream(bos);


	            oos.writeObject(voitures);
	        }catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(oos != null) try {
	                oos.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public String toString() {
	        String str = new String();
	        str += "****************************\n";
	        str += "*   Garage Openclassroom   *\n";
	        str += "****************************\n";
	        for(Vehicule v : voitures)
	            str += v.toString() + "\n";
	        return str;
	    }
	
	
}

