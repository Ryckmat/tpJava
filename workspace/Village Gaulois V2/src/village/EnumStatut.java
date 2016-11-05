package village;

public enum EnumStatut {
	DRUIDE("Druide"), ANCIEN("Ancien"), CHEF("Chef"), BARDE("Barde"), VILLAGEOIS("Villageois");

	private String name = "";
	   
	EnumStatut(String name){
	    this.name = name;
	  }
	   
	  public String toString(){
	    return name;
	  }
}
