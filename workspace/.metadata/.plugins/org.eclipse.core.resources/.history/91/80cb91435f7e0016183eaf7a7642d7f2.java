package interactionConsole;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Clavier {
	String lireString() {
		String str;
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 
			try {
				str = keyboard.readLine(); ;
			} catch (java.io.IOException e) {
				str = "erreur" ;
			}
		return str;
	}
	
	int lireEntier() {
		return ((Integer.valueOf( lireString() )).intValue());
	}
	
	char lireCaractere() {
		return (lireString().charAt(0));
	}
	
	boolean lireBoolean() {
		return Boolean.valueOf( lireString() ).booleanValue();
	}
}
