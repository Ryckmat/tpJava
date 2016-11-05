package testException;

public class DonneIncorrecte extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DonneIncorrecte() {}

	public  DonneIncorrecte(Throwable cause){
		super(cause);
	}
	
	public  DonneIncorrecte(String s){
		super(s);
	}
	
	public  DonneIncorrecte(Throwable cause, String s){
		super(s,cause);
	}
}
