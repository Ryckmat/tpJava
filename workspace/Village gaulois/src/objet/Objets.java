package objet;

public class Objets extends OutilsGestion<Object> {

	@Override
	public String toString() {
		return "Objets [nom=" + nom + "]";
	}

	private String nom;
	
	public Objets(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
