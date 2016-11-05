package jeuRole;

public class Bataille {
	private Camps campHomme = new Camps();
	private Camps campDragon = new Camps();

	public void ajouter(Homme homme) {
		campHomme.ajouterEtreVivant(homme);
		if (campHomme.nbCompagnon() > 1) {
			homme.parler("Bonjour, je m'appelle " + homme.getNom()
					+ " et je viens me joindre au combat.");
		} else
			System.out.print(homme.getNom()
					+ " est le premier � se joindre � la derni�re bataille entre les Hommes et les dragons.\n");
	}

	public void ajouter(Dragon dragon) {
		campDragon.ajouterEtreVivant(dragon);
		if (campDragon.nbCompagnon() > 1) {
			System.out.print("Un nouveau dragon " + dragon.getNom()
					+ " s'approchait du champ de bataille.\n");
		} else
			System.out.print("Le dragon " + dragon.getNom()
					+ " fut le premier � arriver sur le champ de bataille.\n");
	}

	public void eliminer(Dragon dragon) {
		campDragon.supprimerCompagnon(dragon);
		if (campDragon.nbCompagnon() == 0 && campHomme.nbCompagnon() > 0)
			System.out.print("Les Hommes ont conquis la lande, leurs villages n'auront plus jamais � trembler devant les dragons.");
	}

	public void eliminer(Homme humain) {
		campHomme.supprimerCompagnon(humain);
		if (campHomme.nbCompagnon() == 0 && campDragon.nbCompagnon() > 0)
			System.out.print("Les dragons ont conquit la lande, les Hommes n'ont pas pu survivre dans ce monde hostile");
	}
}