package objet;

public class Robes extends Objets {
	
	@Override
	public String toString() {
		return "Robes [couleur=" + couleur + "]";
	}
	
	public boolean equals(Object objet){
		if(objet instanceof Robes){
			Robes r2 = (Robes) objet;
			return super.getNom().equals(r2.getNom());
		}
		return false;
		
	}

	private String couleur;
	
	public Robes(String nom , String couleur) {
		super(nom);
		this.couleur = couleur;
	}

}
