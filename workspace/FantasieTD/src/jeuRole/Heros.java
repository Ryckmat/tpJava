package jeuRole;

public class Heros extends Homme {

	public Heros(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public void parler(String txt){
		System.out.println("Le Héro" + nom + txt);
	}
}
