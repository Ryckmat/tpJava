package jeuRole;

public class Dragon extends EtreVivant {

	public Dragon(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void rejointBataille(Bataille b){
		b.ajouter(this);
	}
	
	public void mourut(Bataille b){
		System.out.println("C'est ainsi que le dragon" + this.nom + "mourut");
		b.eliminer(this);
	}
	
}
