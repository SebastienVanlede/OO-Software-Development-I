package domein;

public class Oef7_ArrayBewerking {
	public static double[] deel(int[] rij1, int[] rij2) {
		double[] rij3 = new double[rij1.length];

		for (int i = 0; i < rij1.length; i++) {
			rij3[i] = (double) rij1[i] / (double) rij2[i];
		}
		return rij3;
	}

	public static void schuifOp(double[] rij, int aantalPlaatsen) {
		double[] temp = new double[rij.length];
		for (int i = 0; i < rij.length; i++) {
			temp[i] = rij[(rij.length - aantalPlaatsen + i) % rij.length];
		}
		for (int i = 0; i < rij.length; i++) {
			rij[i] = temp[i];
		}
	}

	public static String toon(double[] rij) {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < rij.length; i++) {
			sBuilder.append(String.format("%10.2f", rij[i]));
		}
		return sBuilder.toString();

	}

	public static String toon(int[] rij) {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < rij.length; i++) {
			sBuilder.append(String.format("%10d", rij[i]));
		}
		return sBuilder.toString();

	}
}
