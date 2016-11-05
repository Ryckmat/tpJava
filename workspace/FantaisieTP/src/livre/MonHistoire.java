package livre;

import jeuRole.Arc;
import jeuRole.Bataille;
import jeuRole.Dragon;
import jeuRole.EntiteLivre;
import jeuRole.Epee;
import jeuRole.Heros;
import jeuRole.Homme;
import jeuRole.LancePierre;

public class MonHistoire {

	public static void main(String[] args) {
		
		Livre livre = new Ecran();
		//Livre livre = new Fichier();
		EntiteLivre.setLivre(livre);

		Bataille bataille = new Bataille();

		Dragon dragonRouge = new Dragon("Rougeoyant");
		Dragon dragonet = new Dragon("Dragonet");
		Homme thomas = new Homme("Thomas");
		Heros arthur = new Heros("Arthur");
		Epee excalibure = new Epee("excalibure");
		Arc transperce = new Arc(3);
		LancePierre lancePierre = new LancePierre(); 
		
		dragonRouge.rejointBataille(bataille);
		dragonet.rejointBataille(bataille);
		thomas.rejointBataille(bataille);
		arthur.rejointBataille(bataille);
		
		arthur.prendre(excalibure);
		arthur.combattre(dragonet);
		dragonRouge.cracheBouleFeu(arthur);
		thomas.prendre(excalibure);
		thomas.combattre(dragonRouge);
		thomas.lacher();
		arthur.prendre(excalibure);
		arthur.combattre(dragonRouge);
		thomas.prendre(transperce);
		thomas.combattre(dragonet);
		arthur.combattre(dragonRouge);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);
		thomas.lacher();
		thomas.prendre(lancePierre);
		dragonet.cracheBouleFeu(arthur);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);
		thomas.combattre(dragonet);
		}
}