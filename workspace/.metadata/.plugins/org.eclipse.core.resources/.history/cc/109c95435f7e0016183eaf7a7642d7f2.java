package moteurJeu;

public class Bateau {
	protected String nom;
	protected int tailleBateau;
	protected char etatBateau = 'S';
	protected Element[] bateau;
	
	public int getTailleBateau() {
		return tailleBateau;
	}

	public char getEtatBateau() {
		return etatBateau;
	}

	public Bateau(String nom, int tailleBateau){
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		this.bateau = new Element[tailleBateau];
	}
	
	public void placerBateau(char lettre, int chiffre , char sens){
		char lettre2;
		switch(sens){
		
		case 'H' :
			for(int i = 0; i<tailleBateau; i++){
				bateau[i] = new Element(lettre,chiffre+1);
			}
			break;
			
		case 'V':
			for(int i = 0; i<tailleBateau; i++){
				lettre2 = lettre=(char) (lettre+i);
				bateau[i] = new Element(lettre2,chiffre);
			}
			break;
		}
	}
	
	public  boolean appartientBateau(char lettre, int chiffre){
		for(int i = 0; i< tailleBateau;i++){
			if (bateau[i].verifierCoordonnee(lettre, chiffre)) return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Bateau torpilleur = new Bateau("torpilleur",2);
		torpilleur.placerBateau('A', 1, 'H');
		System.out.println("Le torpilleur a-t-il un élément en ('A',2) ? " + torpilleur.appartientBateau('A', 2));
		System.out.println("Le torpilleur a-t-il un élément en ('B',2) ? " + torpilleur.appartientBateau('B', 2));
		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
	}
}
