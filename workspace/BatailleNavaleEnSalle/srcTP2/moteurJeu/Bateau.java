package moteurJeu;

public class Bateau {
	protected String nom;
	protected int tailleBateau;
	protected char etatBateau = 'S';
	protected Element[] bateau;
	int nbElementTouche = 0;
	
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
				bateau[i] = new Element(lettre,chiffre+i);
			}
			break;
			
		case 'V':
			for(int i = 0; i<tailleBateau; i++){
				lettre2 = (char) (lettre+i);
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
	
	public char etatElement(char lettre, int chiffre){
		for(int i = 0; i< tailleBateau;){
			if(bateau[i].verifierCoordonnee(lettre, chiffre) && bateau[i].elementTouche){
				return 'T';
				
			}
			else return 'S';
		}
		return 'C';
	}
	
	public boolean coup(char lettre, int chiffre){
		for (int i = 0; i<tailleBateau ; i++){
			if (bateau[i].verifierCoordonnee(lettre, chiffre)){
				etatBateau='T';
				nbElementTouche++;
				bateau[i].touche();
				if (nbElementTouche == tailleBateau) etatBateau ='C';
				return true;
			} 
		}
		return false;
	}
	
	public static void main(String[] args){
		Bateau torpilleur = new Bateau("torpilleur",2);
		torpilleur.placerBateau('A', 1, 'H');
		System.out.println("Le torpilleur a-t-il un élément en ('A',1) ? " + torpilleur.appartientBateau('A', 1));
		System.out.println("Le torpilleur a-t-il un élément en ('B',2) ? " + torpilleur.appartientBateau('B', 2));
		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
		System.out.println("L'état de son élément A,1 est : " + torpilleur.etatElement('A', 1));
		System.out.println("Attaque en 1,1");
		torpilleur.coup('A', 1);
		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
		System.out.println("L'état de son élément A,1 est : " + torpilleur.etatElement('A', 1));
		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
		System.out.println("Attaque en 1,2");
		torpilleur.coup('A', 2);
		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());


	}
}
