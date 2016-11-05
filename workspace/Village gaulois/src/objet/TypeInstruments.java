package objet;

public enum TypeInstruments {
	BOIS("bois"),CORDE("corde"),CUIVRE("cuivre"),PERCUSSION("percussion");
	 
	private String name = "";
	   
	  TypeInstruments(String name){
	    this.name = name;
	  }
	   
	  public String toString(){
	    return name;
	  }
}

