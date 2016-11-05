package morpion;

import java.util.Scanner;

class JeuTD{
	public static void main(String[] args) {
		
		int longueur = 9;
		Boolean JoueurO = true;
		String[] plateau = new String[longueur];


		System.out.println("EXO1: ");
		System.out.println("Jeu du morpion");

		System.out.println("EXO2: ");
		if (JoueurO) {
			System.out.println("|O|");		
		}
		else {
			System.out.println("|X|");
		}
		System.out.println("EXO3: ");
		for (int i = 0; plateau.length >i ; i++ ) {
			plateau[i]="   |";
		}

		System.out.println("|");

		for (int i =0; plateau.length>i ; i++ ) {
			System.out.print(plateau[i]);
		}
		System.out.println();
		System.out.println("EXO4: et EXO5");
		afficherTableau(plateau);
		System.out.println();
		System.out.println("EXO6");
		enterCoordonne(JoueurO,plateau,1,1," O |");
		JoueurO=false;
		enterCoordonne(JoueurO,plateau,3,3," X |");
		afficherTableau(plateau);

	}

	static void afficherTableau(String[] plateau){
		System.out.print("|");
		for (int i=0; plateau.length > i ; i++ ) {

			if (i == 2 || i == 5) {
				System.out.println(plateau[i]);
				System.out.println("------------");
				System.out.print("|");
			}
			else{
				System.out.print(plateau[i]);
			}
		}
	}

	static void enterCoordonne(Boolean j, String[] plateau, int l , int c , String s){
		
		if(j){
				switch (l) {
				case 1 : if (plateau[c-1] == "   |") plateau[c-1]=s; break;
				case 2 : if (plateau[c+2] == "   |") plateau[c+2]=s; break;
				case 3 : if (plateau[c+5] == "   |") plateau[c+5]=s; break;
				default : System.out.println("Erreur");
			
			}	
		} else{
			switch (l) {
			case 1 : if (plateau[c-1] == "   |") plateau[c-1]=s; break;
			case 2 : if (plateau[c+2] == "   |") plateau[c+2]=s; break;
			case 3 : if (plateau[c+5] == "   |") plateau[c+5]=s; break;
			default : System.out.println("Erreur");
			}
		}
	}

	static int lireClavier(){
		String entre;
		Scanner clavier = new Scanner(System.in);
		entre = clavier.next();
		return Integer.parseInt(entre);
	}
}


