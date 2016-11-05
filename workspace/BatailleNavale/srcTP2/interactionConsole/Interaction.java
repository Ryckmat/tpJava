package interactionConsole;

import moteurJeu.Jeu;

public class Interaction {
	private Clavier lecture = new Clavier();
	private Jeu jeu;
	
	public Interaction(Jeu pjeu) {
		jeu = pjeu;
		initialiser();
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

			jeu.initialiser(numJoueur, nomBateau, tailleBateau, lettre,
					chiffre, sens);
			
			//TODO ligne ci-dessous a effacer durant la s�ance de TP en classe
			place = true;
		}

	}
}
