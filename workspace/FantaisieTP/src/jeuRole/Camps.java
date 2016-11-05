package jeuRole;

import java.util.Vector;

public class Camps {
	private Vector<EtreVivant> compagnons = new Vector<EtreVivant>();

	public void ajouterEtreVivant(EtreVivant compagnon) {
		compagnons.add(compagnon);
	}

	public void supprimerCompagnon(EtreVivant compagnon) {
		compagnons.remove(compagnon);
	}

	public int nbCompagnon() {
		return compagnons.size();
	}
}