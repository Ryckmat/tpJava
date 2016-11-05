package jeuRole;
public class EtreVivant {
	protected int pv;
	protected String nom;
	protected Bataille bataille;
	
	
	public EtreVivant(String nom){
		this.nom = nom;
	}

	public int getPv() {
		return pv;
	}

	public String getNom() {
		return nom;
	}
	
	
}
