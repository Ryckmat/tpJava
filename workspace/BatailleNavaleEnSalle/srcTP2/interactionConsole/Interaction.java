package interactionConsole;

import moteurJeu.Jeu;

public class Interaction {
	private Clavier lecture = new Clavier();
	private Jeu jeu;
	
	public Interaction(Jeu pjeu) {
		jeu = pjeu;
		initialiser();
		int numJoueur = 1;
		affichageGrilleCoteJoueur(numJoueur);
		jouer();
	}
	
	private void initialiser() {
		for (int i = 1; i < 2 + 1; i++) {
			System.out.println("Placement des bateaux du joueur " + i);
			String[] nomsBateaux = jeu.nomsBateaux();
			for (int j = 0; j < nomsBateaux.length; j++) {
				String nomBateau = nomsBateaux[j];
				int tailleBateau = jeu.nbElementBateau(nomBateau);
				this.placerBateau(i, nomBateau, tailleBateau);
			}

		}
	}
	
	private void placerBateau(int numJoueur, String nomBateau, int tailleBateau) {
		char lettre;
		int chiffre;
		char sensLu;
		char sens;

		boolean place = false;
		while (!place) {
			// Initialisation des grilles des joueurs
			System.out.println("Où souhaitez-vous positionner votre "
					+ nomBateau + "?");
			System.out.println("Donnez les coordonn�es de la première case : ");
			System.out.print("Lettre = ");
			lettre = lecture.lireCaractere();
			System.out.print("Chiffre = ");
			chiffre = lecture.lireEntier();
			System.out
					.println("Sens de votre bateau (H : horizontale, V : verticale) ? ");
			sensLu = lecture.lireCaractere();
			if (sensLu == 'H')
				sens = 'H';
			else
				sens = 'V';

			place =jeu.initialiser(numJoueur, nomBateau, tailleBateau, lettre,
					chiffre, sens);
			
			//TODO ligne ci-dessous a effacer durant la s�ance de TP en classe
			if (place){
				System.out.println(nomBateau + "placé");
			}
			else{
				System.out.println(nomBateau + "non placé : le bateau ne rentre pas dans la grille"
						+ "ou superpose un bateau déjà placé!");
			}
		}
		
	}
	private void affichageGrilleCoteJoueur(int joueur){
		System.out.println("Ma grille");
		for(int i = 'A'; i<'K'; i++){
			for(int j =1; j<11;j++){
				//modification de la methode suite à un pb de typage
				System.out.println(" "+ jeu.affichageElementGrilleCoteJoueur(joueur,i,j) +" ");
			}
			System.out.println();
		}
	}
	
	private void affichageGrilleCoteAdversaire(int joueur) {
		System.out.println("Grille adversaire");
		for (char i = 'A'; i < 'K'; i++) {
			for (int j = 1; j < 11; j++) {
				System.out
						.print(" "
								+ jeu.affichageElementGrilleCoteAdversaire(joueur,i , j) + " ");
			}
			System.out.println();
		}
	}
	
	public void jouer() {
		char lettre;
		int chiffre;
		int joueur = 1;
		int j = 0;
		while (!jeu.finDuJeu()) {
			j = (j + 1) % 2;
			if (j == 1)
				joueur = 2;
			System.out.print("joueur : " + joueur);
			System.out.println(" entrer les coordon�es de tir");
			System.out.print("lettre = ");
			lettre = lecture.lireCaractere();
			System.out.print("chiffre = ");
			chiffre = lecture.lireEntier();
			System.out.println(jeu.jouer(j, lettre, chiffre));
			affichageGrilleCoteJoueur(j);
			affichageGrilleCoteAdversaire((j + 1) % 2);
		}
		System.out.println("LE JOUEUR " + joueur + " A GAGNEE");
	}
	
}
