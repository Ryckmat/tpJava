package moteurJeu;

import java.text.Normalizer;

public enum EnumNomBateau {
	PORTE_AVION("porte avion"), CROISEUR("croiseur"), SOUS_MARIN("sous-marin"), CONTRE_TORPILLEUR(
			"contre torpilleur"), TORPILLEUR("torpilleur");

	private final String name;

	private EnumNomBateau(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static String[] enumToArray() {
		String[] tableau = { PORTE_AVION.getName(), CROISEUR.getName(),
				SOUS_MARIN.getName(), CONTRE_TORPILLEUR.getName(),
				TORPILLEUR.getName() };
		return tableau;
	}

	public static EnumNomBateau stringToEnum(String chaine) {
		String enumChaine = chaine.toUpperCase();
		enumChaine = Normalizer.normalize(enumChaine, Normalizer.Form.NFD)
				.replaceAll("[\u0300-\u036F]", "");
		char[] caractereChaine = enumChaine.toCharArray();
		enumChaine = "";
		for (int i = 0; i < caractereChaine.length; i++) {
			if (caractereChaine[i] == (' ') || caractereChaine[i] == ('-')) {
				caractereChaine[i] = '_';
			}
			enumChaine += caractereChaine[i];
		}
		return EnumNomBateau.valueOf(enumChaine);
	}
}
