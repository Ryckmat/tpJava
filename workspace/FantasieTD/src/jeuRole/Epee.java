package jeuRole;

public class Epee extends Arme {
	
	protected String nom;

	public Epee(String nom) {
		super("Epee", 80);
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

}
