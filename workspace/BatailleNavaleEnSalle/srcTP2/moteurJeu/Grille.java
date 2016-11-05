package moteurJeu;

import java.util.ArrayList;

public class Grille {
	protected Bateau[] flotte;
	protected int nbBateau=9;
	int nbLigne =10;
	int nbColonne=10;
	private ArrayList<int[]> coupJoue = new ArrayList<int[]> ();

	
	public static void main(String[] args){
		Grille grille = new Grille();
		Bateau torpilleur = new Bateau("torpilleur",3);
		System.out.
		println("Peut-on placer le torpilleur en ('G',9) horizontalement ? " + grille.placerBateau('G', 9,'H',torpilleur));
		System.out.
		println("Peut-on placer le torpilleur en ('E',4) horizontalement ? " + grille.placerBateau('E', 4,'H',torpilleur));
		Bateau croiseur = new Bateau("croiseur",4);
		System.out.
		println("Peut-on placer le croiseur en ('C',4) Vertivalement ? " + grille.placerBateau('C', 4,'V',croiseur));
		System.out.
		println("Peut-on placer le croiseur en ('B',1) Verticalement ? " + grille.placerBateau('B', 1,'V',croiseur));
		grille.placerBateau('E', 4, 'H', torpilleur);
		grille.placerBateau('B', 1, 'V', croiseur);
		System.out.println("Ma grille");
		for(char i ='A'; i <'K';i++){
			for(int j=1; j< 11; j++){
				System.out.print(" " + grille.visualisationCaseGrille(i, j));
			}
			System.out.println();
		}
		
		System.out.println("Mon adversaire joue les coups 1,1 5,4 5,5 5,6 2,1 3,1 4,1");
		grille.jouerCoup('A', 1);
		grille.jouerCoup('E', 4);
		grille.jouerCoup('E', 5);
		grille.jouerCoup('E', 6);
		grille.jouerCoup('B', 1);
		grille.jouerCoup('C', 1);
		grille.jouerCoup('D', 1);

		System.out.println("Ma grille");
		for(char i ='A'; i <'K';i++){
			for(int j=1; j< 11; j++){
				System.out.print(" " + grille.visualisationCaseGrille(i, j));
			}
			System.out.println();
		}






	}
	public boolean placerBateau(char lettre, int chiffre , char sens, Bateau b){
		int i =0;
		int ligne =0;
		char lettrechar ='A';
		while(lettrechar != lettre){ 
			lettrechar=(char) (lettrechar+1);
			ligne++;
		}
		while(flotte[i] != null ) i++;
		
		if(verifierSortieBateau(b,sens,ligne,chiffre) && verifierSupperpositionBateau(b,sens,ligne,chiffre)){
			flotte[i] = new Bateau(b.nom,b.tailleBateau);
			flotte[i].placerBateau(lettre, chiffre, sens);
			return true;
		}
		return false;
	}
	
	public Grille(){
		flotte = new Bateau[nbBateau];
	}
	
	public boolean verifierSortieBateau(Bateau b, char sens , int ligne, int colonne){
		
		if ((ligne > 10 || colonne > 10) && (ligne < 0 || colonne <0)){
			return false;
		}
		if (sens == 'H'){
			for (int i = 0; i< b.tailleBateau; i++){
				if (i+colonne  >10) return false;
			}
		}
		else if (sens == 'V'){
			for (int i = 0; i< b.tailleBateau; i++){
				if (i+ligne >10) return false;
			}
		}
		return true;
	}
	
	public boolean verifierSupperpositionBateau(Bateau b, char sens , int ligne, int colonne){
			 Element[] listeElement = new Element[17]; 
			 char lettre = (char) ('A'+ligne);
			 int cptElement =0;
			 int cptBateau = 0;
			 while (flotte[cptBateau] != null){
			  for (int i=0; i<flotte[cptBateau].tailleBateau; i++){
			   listeElement[cptElement] = new Element(flotte[cptBateau].bateau[i].lettre, flotte[cptBateau].bateau[i].chiffre);
			   cptElement++;
			  }
			  cptBateau++;
			 }
			 
			 if (sens == 'H'){
				 int colonne2 = colonne;
				 for (int j =0; j<b.tailleBateau; j++) {
					 colonne2++;
					 for (int i=0; i<cptElement; i++ ){
						 if (listeElement[i].verifierCoordonnee(lettre, colonne2)) return false;
					 }
				 }
			 }
			 else{
				 char lettre2 = lettre;
				 for (int j =0; j<b.tailleBateau; j++) {
					 lettre2 = (char) (lettre +j);
					 for (int i=0; i<cptElement; i++ ){
						 
						 if (listeElement[i].verifierCoordonnee(lettre2, colonne)) return false;
						 
					 }
				 }
			 }
			 
		return true;
	}
	
	public boolean flotteCoulee(){
		for(int i =0; i<nbBateau; i++){
			if(flotte[i].etatBateau!='C') return false;
		}
		return true;
	}
	
	char jouerCoup(char lettre, int chiffre){
		int i=0;
		char resultat ='O';
		int[] coordonne = new int[2];
		coordonne[0] = lettre;
		coordonne[1] = chiffre;
		coupJoue.add(coordonne);
		
		while(flotte[i] != null){
			if(flotte[i].coup(lettre,chiffre)) resultat = (flotte[i].etatBateau);
			i++;
		}
		
		
//		for(int i=0;i<nbBateau;i++){
//			if(flotte[i].coup(lettre,chiffre)) resultat = (flotte[i].etatBateau);
//		}
	
		return resultat;
		
	}
	
	public char visualisationCaseGrille(int ligne, int colonne){
		int i=0;
		char lettre = (char) (ligne);
		 while (flotte[i] != null){
			 for(int j = 0; j<flotte[i].tailleBateau; j++){
				 if(flotte[i].bateau[j].verifierCoordonnee(lettre, colonne)) return flotte[i].etatBateau;
			 }
			i++; 
		 }
		 for(int k = 0; k<coupJoue.size(); k++){
			 if((coupJoue.get(k))[0] == ligne && (coupJoue.get(k))[1] == colonne) return 'E';
		 }
		 return 'X';
	}
	
	
	
}
