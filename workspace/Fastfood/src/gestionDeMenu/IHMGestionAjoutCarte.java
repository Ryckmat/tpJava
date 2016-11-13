package gestionDeMenu;

import java.util.Scanner;

public class IHMGestionAjoutCarte {
	
	private GestionRestaurant gestionRestaurant;
	
	public IHMGestionAjoutCarte(GestionRestaurant gestionRestaurant) {
	}
	
	public void ajoutCarte(){
	}
	
	private int choixAliment(){
		int c =0;
		do{
			System.out.println("Choisissez votre aliment 1: Hamburger 2:Boisson 3:Accompagnment");
			Scanner sc = new Scanner(System.in);
			c = sc.nextInt();
		}while(c > 0 && c<4);
		return c;
		
	}
	
	private String saisirNomAliment(String typeAliment){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un aliment :");
		typeAliment = sc.nextLine();
		return typeAliment;
	}
	
	private boolean choixNouvelAjout(){
		int c =0;
		do{
			System.out.println("Voulez-vous ajouter un nouvel aliment 1: OUI 0:NON");
			Scanner sc = new Scanner(System.in);
			c = sc.nextInt();
		}while(c !=1 || c !=2);
		return (c==1);
	}
	private void ajouterAccompagnement(){	
		System.out.println("Entrer le nom de votre accompagnament:");
		String nom = null;
		nom = saisirNomAliment(nom);
		gestionRestaurant.ajouterAccompagnement(nom);
	}
	private void ajouterHamburger(){
		System.out.println("Entrer le nom de votre hamburger:");
		String nom = null;
		nom = saisirNomAliment(nom);
		gestionRestaurant.ajouterHamburger(nom);
		
	}
	private void ajouterBoisson(){
		System.out.println("Entrer le nom de votre boisson:");
		String nom = null;
		nom = saisirNomAliment(nom);
		gestionRestaurant.ajouterBoisson(nom);	
	}
	
}
