package jeuRole;

public class Arc extends Arme {
	
	protected int nbfleche;

	public Arc(int nbfleche) {
		super("Arc", 30);
		this.nbfleche = nbfleche;
	}
	
	public void attaque(Dragon d){
		if(nbfleche == 0){
			System.out.println("Malheureusement" + proprietaire.nom+ "n'a plus de fleche");
		}
		else{
			super.attaque(d);
			nbfleche--;
		}
	}

}
