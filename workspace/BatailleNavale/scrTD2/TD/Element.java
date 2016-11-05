package TD;
public class Element {
	protected char lettre;
	protected int chiffre;
	protected boolean elementTouche = false;
	
	public Element(char lettre, int chiffre){
		this.lettre = lettre;
		this.chiffre = chiffre;
	}
	
	public boolean isElementTouche(){
		return elementTouche;
	}
	
	public boolean verifierCoordonnee(char lettre , int chiffre){
		return (this.lettre == lettre) && (this.chiffre==chiffre);
	}
	
	public void touche(){
		elementTouche=true;
	}
	
}
