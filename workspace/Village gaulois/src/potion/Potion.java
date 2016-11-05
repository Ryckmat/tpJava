package potion;

import java.util.ArrayList;
import java.util.ListIterator;


public class Potion {

	private ArrayList<Ingredient> potion;


	public Potion() {
		this.potion = new ArrayList<Ingredient>();
	}


	public  void ajouterIngredient(Ingredient i){
		ListIterator<Ingredient> it= potion.listIterator();
		if(i.isIndispenssable() == false){
			while(it.hasNext() && it.next().isIndispenssable());
			it.add(i);
		}else{
			it.add(i);
		}
	}
	
	
	public static void main(String[] args) {
		Potion p = new Potion();
		Ingredient gui = new Ingredient("gui", true);
		Ingredient carotte = new Ingredient("carotte", true);
		Ingredient sel = new Ingredient("sel", true);
		Ingredient tqf = new Ingredient("trefle à quatre feuille", true);
		Ingredient poisson = new Ingredient("poisson", true);
		Ingredient miel = new Ingredient("miel", true);
		Ingredient hydromel = new Ingredient("hydromel", true);
		Ingredient hr = new Ingredient("huile de roche", true);
		Ingredient homard = new Ingredient("homard", false);
		p.ajouterIngredient(gui);
		p.ajouterIngredient(sel);
		p.ajouterIngredient(tqf);
		p.ajouterIngredient(homard);
		p.ajouterIngredient(poisson);
		p.ajouterIngredient(miel);
		p.ajouterIngredient(hydromel);
		p.ajouterIngredient(hr);
		p.ajouterIngredient(carotte);
		
		for(int i = 0; i<p.potion.size(); i++){
			System.out.println(p.potion.get(i).toString());
		}
		
		
	}

}
