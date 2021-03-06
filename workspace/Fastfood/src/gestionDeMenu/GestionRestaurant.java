package gestionDeMenu;

import nourriture.Accompagnement;
import nourriture.Boisson;
import nourriture.Hamburger;

public class GestionRestaurant {
	
	private Carte carte;
	
	public void ajouterHamburger(String nom){
		Hamburger h = new Hamburger(nom);
		carte.ajouterHamburger(h);
	}
	
	public void ajouterAccompagnement(String nom){
		Accompagnement a = new Accompagnement(nom);
		carte.ajouterAccompagnement(a);
	}
	
	public void ajouterBoisson(String nom){
		Boisson b = new Boisson(nom);
		carte.ajouterBoisson(b);
	}
}
