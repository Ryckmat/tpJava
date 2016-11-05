package village;

public enum EnumGenre {
	
		FEMME("Femme"), HOMME("Homme");

		private String name = "";
		   
		EnumGenre(String name){
		    this.name = name;
		  }
		   
		  public String toString(){
		    return name;
		  }
}
