package morpion;

import java.util.Scanner;

class JeuTP{
	private static Scanner clavier;

	public static void main(String[] args){
		int longueur = 9;
		Boolean JoueurO = true;
		String[] plateau = new String[longueur];
		int ligne , colonne;
//		System.out.println("EXO 1");
//		System.out.println("Jeu du morpion");
//		plateau=creationGrille();
//		afficherTableau(plateau);
//		System.out.println("EXO 2");
//		System.out.println("Entré le numéro de ligne:");
//		ligne=lireEntier();
//		System.out.println("Entré le numéro de colonne:");
//		colonne=lireEntier();
//		enterCoordonne(JoueurO,plateau,ligne,colonne," O |");
//		afficherTableau(plateau);
//		System.out.println("EXO 3");
//		enterCoordonne(JoueurO,plateau,1,1," O |");
//		System.out.println("Case(1,1) : "+isCaseValide(plateau,1,1)); 
//		enterCoordonne(JoueurO,plateau,7,3," O |");
//		System.out.println("Case(7,3) : "+isCaseValide(plateau,7,3)); 
//		enterCoordonne(JoueurO,plateau,2,2," O |");
//		System.out.println("Case(2,2) : "+isCaseValide(plateau,2,2)); 
//		afficherTableau(plateau);
//		System.out.println("EXO 4");
//		plateau=creationGrille();
//		afficherTableau(plateau);
//		System.out.println("Partie finie?" + isPartieFinie(plateau) );
//		enterCoordonne(JoueurO,plateau,1,1," O |");
//		enterCoordonne(JoueurO,plateau,1,2," O |");
//		enterCoordonne(JoueurO,plateau,1,3," O |");
//		JoueurO=false;
//		enterCoordonne(JoueurO,plateau,3,3," X |");
//		afficherTableau(plateau);
//		System.out.println("Partie finie?" + isPartieFinie(plateau) );
//		
		jouerPartie();
		
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
		System.out.println();
	}
	static String[] creationGrille(){
		String[] plateau = new String[9];
		for (int i = 0; plateau.length >i ; i++ ) {
			plateau[i]="   |";
		}
		return plateau;
	}
	
	static int lireEntier(){
		String entre;
		clavier = new Scanner(System.in);
		entre = clavier.next();
		return Integer.parseInt(entre);
	}
	static void enterCoordonne(Boolean j, String[] plateau, int l , int c , String s){
		
		if(j && s== " O |"){
				switch (l) {
				case 1 : plateau[c-1]=s; break;
				case 2 : plateau[c+2]=s; break;
				case 3 : plateau[c+5]=s; break;
			
			}	
		} else{
			switch (l) {
			case 1 : plateau[c-1]=s; break;
			case 2 : plateau[c+2]=s; break;
			case 3 : plateau[c+5]=s; break;
			}
		}
	}
	
	static String isCaseValide(String[] plateau, int l , int c ){
		if (l>0 && l<4){
			if(c>0 && c<4){
				if(plateau[l*2+c-1] == "   |"){
					return "OK";
				}
				else return "case déjà utilisé";
			} else return "hors tableau";
		} else return "hors tableau";
	}
	
	static boolean[] créationTableauVérif(String[] plateau, String s){
		boolean[] verif = new boolean[9];
		for (int i=0; plateau.length > i ; i++ ) {
			verif[i]= plateau[i] == s;
		}
		return verif;
	}
	
	static boolean verifLigne(boolean[] t){
		boolean b = false;
			for(int j=0; j<t.length;j+=3){
				b = b || (t[j] && t[j+1] && t[j+2]);
			}
		return b;
	}
	
	static boolean verifColonne(boolean[] t){
		boolean b = false;
			for(int j=0; j<3;j++){
				b = b || (t[j] && t[j+3] && t[j+6]);
			}
		return b;
	}
	
	static boolean verifDiagonal(boolean[] t){
		return (t[0] && t[4] && t[8]) || (t[2] && t[4] && t[6]);
	}
	static boolean controlTableauVerif(boolean[] t){
		return verifLigne(t) ||verifColonne(t) ||verifDiagonal(t);
	}
	
	static boolean isPartieFinie(String[] plateau){
		boolean[] b = new boolean[9];
		b = créationTableauVérif(plateau," O |");
		if(controlTableauVerif(b)) return true;
		b = créationTableauVérif(plateau," X |");
		
		if(controlTableauVerif(b)) return true;
		
		return false;
		
	}
	
	static void jouerCase(Boolean j, String[] plateau){
		int ligne, colonne;
		do{
			System.out.println("Entré le numéro de ligne:");
			ligne=lireEntier();
			System.out.println("Entré le numéro de colonne:");
			colonne=lireEntier();
			System.out.println("Case("+ligne+","+colonne+") : "+isCaseValide(plateau,ligne,colonne)); 
		}while( isCaseValide(plateau,ligne,colonne) !="OK");
			
		
		if(j)enterCoordonne(j,plateau,ligne,colonne," O |");
			else enterCoordonne(j,plateau,ligne,colonne," X |");
			afficherTableau(plateau);
			
		
		
	}
	
	static void jouerPartie(){
		System.out.println("EXO5 :");
		int longueur = 9;
		Boolean JoueurO = true;
		String[] plateau = new String[longueur];
		plateau=creationGrille();
		do{
			jouerCase(JoueurO,plateau);
			if (JoueurO) JoueurO=false;
			else JoueurO=true;
		}while(!isPartieFinie(plateau));
		System.out.println("EXO5 : Finis");
	}
	
}


