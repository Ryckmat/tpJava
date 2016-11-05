package TD;

public class Jeu {
	
	public void initialiser(int joueur, String nom,int taille,char sens, int chiffre,char lettre){
		Bateau b = new Bateau(nom,taille);
		b.placerBateau(lettre, chiffre, sens);
		if(joueur==1){
		//on met dans la grille1	
		}
		else{
		//on met dans la grille2
		}
	}
}