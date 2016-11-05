package jeuRole;
public abstract class EtreVivant extends EntiteLivre {
	protected int pv;
	protected String nom;
	protected Bataille bataille;
	
	
	public EtreVivant(String nom){
		this.nom = nom;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public String getNom() {
		return nom;
	}
	
	public abstract void mourir();
	
	public void subirAttaque(int force){
		livre.ecrire(getNom() + " subit une violente attaque");
		if(getPv() - force <0 ){
			livre.ecrire(" trop violente pour survivre");
			mourir();
		}
		else {
			this.pv -= force;
			livre.ecrire(" mais il parvient à se relever");
		}
	}
	
}
