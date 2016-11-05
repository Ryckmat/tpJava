package testException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier {
	
	
	public static void main(String[] args) {
		
		try{
			String chemin="/Un/chemin/vers/un/fichier/qui/n'existe/pas";
			FileReader reader = new FileReader(chemin);
			int data = reader.read();
			while (data != -1) {
				System.out.println("Donne� suivante : " + (char)data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException fnfe){
			System.out.println("Le fichier n'a pas été trouvé");
			fnfe.printStackTrace();
		} catch (IOException ioE){
			System.out.println("Une exeption concernant les entrées/sorties a été relevé");
		}
		finally{
			System.out.println("Fin des donn�es");
		}
			
		
		
	}
}
