package objet;

import java.util.ArrayList;
import java.util.Iterator;
import objet.TypeInstruments;




public class OutilsGestion<T> {
	
	private ArrayList<T> obj;


	public OutilsGestion() {
		this.obj = new ArrayList<T>();
	}
	
	public  void ajouterOjbets(T o){

			for(Iterator<T> it= obj.iterator();it.hasNext();){
				if (it.next().equals(o)) return;
		}
			obj.add(o);
	}
	
	
	public static void main(String[] args) {
		OutilsGestion<Robes> r = new OutilsGestion<Robes>();
		OutilsGestion<Menhirs> m = new OutilsGestion<Menhirs>();
		OutilsGestion<Instruments> i = new OutilsGestion<Instruments>();
		
		Robes tulipe = new Robes("tulipe", "Orange");
		Robes soiree = new Robes("soiree", "noire");
		Robes ete = new Robes("ete", "bleu");
		
		Menhirs petit = new Menhirs(1, "petit");
		Menhirs moyen = new Menhirs(2, "moyen");
		Menhirs gros = new Menhirs(3, "gros");
		
		Instruments guitard = new Instruments("guitard", TypeInstruments.CORDE);
		Instruments tambour = new Instruments("tambour", TypeInstruments.PERCUSSION);
		Instruments clairon = new Instruments("clairon", TypeInstruments.CUIVRE);
		
		r.ajouterOjbets(soiree);
		r.ajouterOjbets(tulipe);
		r.ajouterOjbets(ete);
		r.ajouterOjbets(soiree);
		
		for(int j = 0; j<r.obj.size(); j++){
			System.out.println(r.obj.get(j).toString());
		}
		
		
	}
	

}
