package potion;

public class Ingredient {
	private String ingredient;
	private boolean indispenssable;

	public Ingredient(String ingredient, boolean indis) {
		this.ingredient = ingredient;
		this.indispenssable=indis;
	}

	public String getIngredient() {
		return ingredient;
	}

	public boolean isIndispenssable() {
		return indispenssable;
	}
	
	public static void main(String[] args) {
		Ingredient sel = new Ingredient("sel", true);
		System.out.println(sel);
		
	}

	@Override
	public String toString() {
		return "Ingredient [ingredient=" + ingredient + "]";
	}
	

	
	
}
