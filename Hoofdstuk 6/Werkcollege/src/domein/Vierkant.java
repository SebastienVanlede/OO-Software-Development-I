package domein;

public class Vierkant {

	public static String maakVierkant(int z) {
		String res = maakVierkant(z, '*');
		return res;

	}

	public static String maakVierkant(int z, char teken) {
		String res = "";
		for (int rij = 1; rij <= z; rij++) {
			for (int kolom = 1; kolom <= z; kolom++) {
				res += teken + " ";
			}
			res += "\n";

		}
		return res;
	}

}
