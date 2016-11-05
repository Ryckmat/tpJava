package objet;

public class Instruments extends Objets {
	
	@Override
	public String toString() {
		return "Instruments [type=" + type + "]";
	}
	
	public boolean equals(Object objet){
		if(objet instanceof Instruments){
			Instruments i2 = (Instruments) objet;
			return super.getNom().equals(i2.getNom());
		}
		return false;
		
	}

	private TypeInstruments type;
	
	public Instruments(String nom, TypeInstruments type) {
		super(nom);
		this.type = type;
	}

}
