package testException;

public class AffichageTableau {
	public void affichageNom(Animal[] tableau){
		for (int i = 0; i < tableau.length; i++) {
			if(tableau[i] == null){
				throw new NullPointerException();
			}
			System.out.println(tableau[i].getNom());
		}
	}
}
