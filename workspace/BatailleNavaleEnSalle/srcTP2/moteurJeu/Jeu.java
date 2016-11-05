package moteurJeu;

public class Jeu {
	
	protected Grille grilleJoueur1= new Grille(); 
	protected Grille grilleJoueur2= new Grille();
	
	public boolean initialiser(int joueur, String nom,int taille,char sens, int chiffre,char lettre){
		int i = 0;
		Bateau b = new Bateau(nom , taille);
		if(joueur==1){
			while(grilleJoueur1.flotte[i] != null ) i++;
			return grilleJoueur1.placerBateau(lettre, chiffre, sens, b);
		}
		else{
			while(grilleJoueur2.flotte[i] != null ) i++;
			
			return grilleJoueur2.placerBateau(lettre, chiffre, sens, b);
	
		}
	}
	
	public String[] nomsBateaux(){
		return EnumNomBateau.enumToArray();
	}
	
	public int nbElementBateau(String nomBateau){
		int nbElement =0;
		switch(EnumNomBateau.stringToEnum(nomBateau)){
		case PORTE_AVION: nbElement = 5; break;
		case CROISEUR: nbElement = 4; break;
		case SOUS_MARIN: nbElement = 3; break;
		case CONTRE_TORPILLEUR: nbElement = 3; break;
		case TORPILLEUR : nbElement = 2; break;
		default: System.out.println("Erreur de reconnaissance du nom du bateau.");
		}
		return nbElement;
		
	}
	
	public String jouer(int joueur,char lettre,int chiffre){
		char resultat;
		if(joueur ==1) resultat = grilleJoueur2.jouerCoup(lettre, chiffre);
		else resultat = grilleJoueur1.jouerCoup(lettre, chiffre);
		
		if(resultat =='C') return "Bateau coule";
		else if (resultat == 'T') return "Bateau touche";
		else return "A l'eau";
	}
	
	public boolean finDuJeu(){
		return (grilleJoueur1.flotteCoulee() || grilleJoueur2.flotteCoulee());
	}
	
	public char affichageElementGrilleCoteJoueur(int joueur, int i , int chiffre){
		if (joueur ==1){
			return grilleJoueur1.visualisationCaseGrille(i, chiffre);
		}
		else return grilleJoueur2.visualisationCaseGrille(i, chiffre);
	}
	
	public char affichageElementGrilleCoteAdversaire(int joueur, char lettre, int chiffre){
		char visualisationElement;
		if(joueur == 1){
			visualisationElement = grilleJoueur1.visualisationCaseGrille(lettre, chiffre);
		}
		else visualisationElement = grilleJoueur2.visualisationCaseGrille(lettre, chiffre);
		if (visualisationElement == 'S') return 'X';
		else return visualisationElement;
	}
}