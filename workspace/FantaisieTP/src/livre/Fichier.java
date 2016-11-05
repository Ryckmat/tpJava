package livre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fichier implements Livre {
	public void ecrire(String texte) {
		try {
			File f = new File("./histoire.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f,true);
			fw.write(texte);
			fw.flush();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}