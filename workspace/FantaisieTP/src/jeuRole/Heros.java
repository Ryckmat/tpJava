package jeuRole;

public class Heros extends Homme {

	public Heros(String nom) {
		super(nom);
		setPv(150);
	}
	
	public void parler(String txt){
		livre.ecrire("Le Héro " + nom +" : " + txt);
	}
	
	public void prendreEpee(Epee e){
		this.parler("Je prend " + e.nom+ " .");
		maPossession = e;
		e.proprietaire=this;
	}
}
