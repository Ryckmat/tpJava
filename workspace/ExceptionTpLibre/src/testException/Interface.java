package testException;

public class Interface {

	public void verificationCoordonnee(char lettre, int chiffre) throws DonneIncorrecte {
		if (lettre > 'J')
			throw new DonneIncorrecte("lettre inadaptée");
		if (chiffre > 10 || chiffre < 1)
			throw new DonneIncorrecte("chiffre inadaptée");
	}

	public static void main(String[] args) {
		Interface io = new Interface();
		try{
			io.verificationCoordonnee('K', 8);
			} catch(DonneIncorrecte d){
			System.out.println("erreur" +d);
		}
		
		
		try{
			io.verificationCoordonnee('B', 11);
			} catch(DonneIncorrecte d){
			System.out.println("erreur" +d);
		}
		
		
	}
}