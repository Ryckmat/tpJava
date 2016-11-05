package objet;

public class Menhirs extends Objets {
	
	private int poids;
	
	public Menhirs(int poids, String nom) {
		super(nom);
		this.poids = poids;
	}
	
	public boolean equals(Object objet){
		if(objet instanceof Menhirs){
			Menhirs m2 = (Menhirs) objet;
			return super.getNom().equals(m2.getNom());
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Menhirs [poids=" + poids + "]";
	}

}
