package jeuRole;

public class Homme extends EtreVivant {
	
	Arme maPossession;
	

	public Homme(String nom) {
		super(nom);
		setPv(100);
	}
	
	public void parler(String txt){
		livre.ecrire(nom + " : " +txt );
	}
	public void rejointBataille(Bataille b){
		b.ajouter(this);
	}
	
	public void mourut(Bataille b){
		livre.ecrire("C'est ainsi que le courageux " + this.nom + " mourut");
		b.eliminer(this);
	}

	@Override
	public void mourir() {
		if(maPossession != null) lacher();
		
	}
	
	public void lacher(){
		livre.ecrire(getNom() + " a laché " + maPossession.nature);
		maPossession.lacher(this);
		maPossession = null;
	}
	
	public void prendre(Arme a){
		if(maPossession != null){
			lacher();
		}
		if(a.estPris()){
			
			parler( a.proprietaire.getNom() +" peux tu me laisser ton " + a.nature + " ?");
			a.proprietaire.parler(" pas de soucis, cela me permettra de reprendre mon souffle");
			a.proprietaire.lacher();
		}
		if(a instanceof Epee){
			
			prendreEpee((Epee) a);
			
		}else {
			parler("Je prend " + a.nature + " .");
			maPossession = a;
			a.proprietaire = this;
		}
		
	}
	
	public void combattre(Dragon d){
		if(maPossession == null){
			mourir();
		}
		else{
			maPossession.attaque(d);
			d.subirAttaque(maPossession.degat);
		}
	}
	
	public void prendreEpee(Epee e){
		this.pv-=10;
		parler("Je prends l'épé même si pour cela je dois perdre mes force ");
		maPossession = e;
		e.proprietaire = this;
		
		if(this.pv <0){
			livre.ecrire(getNom() + " a voulu prendre l'épé mais son état de fatigue ne lui permettait pas cet ultime effort, il est mort");
			mourir();
		}
	}
}
