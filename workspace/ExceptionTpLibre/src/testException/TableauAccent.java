package testException;

public class TableauAccent {
	
	public void traitementAccent(String[] tableau){
		try{
			for (int i = 0; i < tableau.length; i++) {
				tableau[i] = tableau[i].replace('�', 'e');
				System.out.println(tableau[i]);
			}
		} catch(NullPointerException tab){
			System.out.println("exception : tableau incomplet");
		}
			System.out.println("fin traitement des accents");
		
	}
		
	
	public static void main(String[] args) {
		TableauAccent traitementTableau = new TableauAccent();
		String[] tableau = new String[3];
		tableau[0] = new String("�gale");
		tableau[1] = new String("�toile");
		traitementTableau.traitementAccent(tableau);
	}
}