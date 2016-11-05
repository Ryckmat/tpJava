package jeuRole;

public class Dragon extends EtreVivant {

	int bouleDeFeu = 10;
	int degat = 100;
	public Dragon(String nom) {
		super(nom);
		setPv(200);
	}

	public void rejointBataille(Bataille b){
		b.ajouter(this);
	}
	
	public void mourut(Bataille b){
		livre.ecrire("C'est ainsi que le dragon " + this.nom + " mourut");
		b.eliminer(this);
	}

	@Override
	public void mourir() {
		// TODO Auto-generated method stub
		
	}
	public void cracheBouleFeu(Homme h){
		if(bouleDeFeu >0){
			livre.ecrire(getNom() + " crache une boule de feu sur " + h.getNom() ); 
			bouleDeFeu--;
			h.subirAttaque(degat);
		}else{
			livre.ecrire(getNom() + " Òn'avait plus de boule de feu en lui " + h.getNom() +" a eu beaucoup de chance"); 
		}
	}
	
}
