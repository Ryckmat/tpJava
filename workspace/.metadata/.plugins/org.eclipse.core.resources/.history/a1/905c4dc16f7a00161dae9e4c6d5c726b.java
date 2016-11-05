package moteurJeu;

public class Element {
		private char ligne;
		private int colonne;
		private boolean elementTouche;
		
		public static void main(String[] args){
			Element e = new Element('B',3);
			System.out.println("L'élément a-t-il pour coordonnée ('A',3) ? " + e.verifierCoordonnee('A', 3));
			System.out.println("L'élément a-t-il pour coordonnée ('B',3) ? " + e.verifierCoordonnee('B', 3));
			System.out.println("L'élément est-il touché ? " + e.isElementTouche());
			e.touche();
			System.out.println("L'élément est-il touché ? " + e.isElementTouche());
			
		}

		private Element(char c, int i) {
			this.ligne=c;
			this.colonne=i;
			this.elementTouche=false;
			
		}
		
		private boolean isElementTouche(){
			return this.elementTouche;
		}
		
		private boolean verifierCoordonnee(char l , int c){
			if (l == this.ligne && c == this.colonne) return true;
			else return false;
		}
		
		private boolean touche(){
			System.out.println("ATTAQUE DE L'ELEMENT");
			return this.elementTouche = true;
		}
}
