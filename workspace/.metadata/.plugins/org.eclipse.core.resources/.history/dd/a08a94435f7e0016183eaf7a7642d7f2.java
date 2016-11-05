package lancementJeu;

import interactionConsole.Interaction;
import moteurJeu.Jeu;

public class MainConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Interaction(new Jeu());
	}

}
