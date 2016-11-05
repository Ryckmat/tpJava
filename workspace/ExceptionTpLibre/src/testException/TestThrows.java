package testException;

public class TestThrows {
	Animal[] animal = new Animal[3];
	AffichageTableau afficheur = new AffichageTableau();

	public TestThrows() {
		animal[0] = new Animal("Singe");
		animal[1] = new Animal("Elephant");
		animal[2] = new Animal("Hippopotame");

	}

	public void affichageAnimal() {
		afficheur.affichageNom(animal);
	}

	public static void main(String[] args) {
		try{
			new TestThrows().affichageAnimal();
		}catch(NullPointerException e){
			System.out.println("exception : l"
					+ "e tableau des animaux n'a "
					+ "pas été entièrement intialisée");
		}
		finally{
			
			System.out.println("fin de lecture du tableau");
		}
	
		
	}

}
