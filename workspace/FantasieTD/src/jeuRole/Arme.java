package jeuRole;

public abstract class Arme {
	protected Homme proprietaire;
	protected String nature;
	protected int  degat;
	
	public Arme(String nature, int degat){
		this.nature = nature;
		this.degat =degat;
	}
	
	
	public Homme getProprietaire() {
		return proprietaire;
	}
	public void prendre(Homme proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public int getDegat() {
		return degat;
	}
	public void setDegat(int degat) {
		this.degat = degat;
	}
	
	
	public boolean estPris(){
		return this.proprietaire != null;
	}
	
	public void lacher(Homme proprietaire) {
		this.proprietaire = null;
	}
	
	public void attaque(Dragon d){
		System.out.println(proprietaire.nom + "attaque le dragon" + d.nom +"avec son" +nature);
		d.pv-= degat;
		System.out.println("Il perd" + degat +"pv");
	}
	
}
