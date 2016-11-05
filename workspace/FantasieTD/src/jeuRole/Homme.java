package jeuRole;

public class Homme extends EtreVivant {

	public Homme(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public void parler(String txt){
		System.out.println(nom + ":" +txt );
	}
	public void rejointBataille(Bataille b){
		b.ajouter(this);
	}
	
	public void mourut(Bataille b){
		System.out.println("C'est ainsi que le courageux" + this.nom + "mourut");
		b.eliminer(this);
	}

}
