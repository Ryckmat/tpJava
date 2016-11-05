package moteurJeu;

public class Jeu {
	
	protected Grille grilleJoueur1= new Grille(); 
	protected Grille grilleJoueur2= new Grille();
	
	public void initialiser(int joueur, String nom,int taille,char sens, int chiffre,char lettre){
		int i = 0;
		if(joueur==1){
			while(grilleJoueur1.flotte[i] != null ) i++;
			grilleJoueur1.flotte[i] = new Bateau(nom ,taille);
			grilleJoueur1.flotte[i].placerBateau(lettre, chiffre, sens);
		}
		else{
			while(grilleJoueur2.flotte[i] != null ) i++;
			grilleJoueur2.flotte[i] = new Bateau(nom , taille);
			grilleJoueur2.flotte[i].placerBateau(lettre, chiffre, sens);
	
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
}