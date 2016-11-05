package interactionConsole;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clavier {
	public static String lireString() {
		String str;
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 
			try {
				str = keyboard.readLine(); ;
			} catch (java.io.IOException e) {
				str = "erreur" ;
			}
		return str;
	}
	
	public static int lireEntier() {
		return ((Integer.valueOf( lireString() )).intValue());
	}
	
	public static char lireCaractere() {
		return (lireString().charAt(0));
	}
	
	public static boolean lireBoolean() {
		return Boolean.valueOf( lireString() ).booleanValue();
	}
}
