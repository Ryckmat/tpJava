package TD;

public class Bateau {
	protected String nom;
	protected int tailleBateau;
	protected char etatBateau = 'S';
	protected Element[] bateau;
	
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
				lettre2 = lettre=(char) (lettre+i);
				bateau[i] = new Element(lettre2,chiffre);
			}
			break;
		
		default: System.out.println("Erreur on vous a demandé H OU V !!!!");
		}
	}
}
