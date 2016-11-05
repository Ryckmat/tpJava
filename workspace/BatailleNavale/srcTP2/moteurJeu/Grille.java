package moteurJeu;

public class Grille {
	protected Bateau[] flotte;
	protected int nbBateau=9;

	
	public static void main(String[] args){
		Grille grille = new Grille();
		Bateau torpilleur = new Bateau("torpilleur",3);
		grille.placerBateau('A', 1, 'H', torpilleur);
		System.out.println("Le torpilleur a-t-il un élément en ('A',2) ? " + torpilleur.appartientBateau('A', 2));
		System.out.println("Le torpilleur a-t-il un élément en ('B',2) ? " + torpilleur.appartientBateau('B', 2));
		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
		
	}
	public void placerBateau(char lettre, int chiffre , char sens, Bateau b){
		int i =0;
		while(flotte[i] == null ) i++;
		flotte[i] =b;
		flotte[i].placerBateau(lettre, chiffre, sens);
	}
	
	public Grille(){
		flotte = new Bateau[nbBateau];
	}
	
}
