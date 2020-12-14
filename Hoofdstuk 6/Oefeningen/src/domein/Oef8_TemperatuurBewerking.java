package domein;

import java.util.Arrays;

public class Oef8_TemperatuurBewerking {
	private static final String[] MAAND = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	public String formateerGemiddeldenPerMaand(int[][] t) {
		String gem = "";

		int i = 0;
		for (int[] rij : t) {
			gem += String.format("In %s: %.2f\n", MAAND[i++], berekenGemiddeldenPerMaand(rij));
		}

		return gem;

	}

	public String formateerMaximumTempDecember(int[] t) {
		String max = "De maximum temperatuur in december is: " + bepaalMaximumTemperatuur(t);
		return max;

	}

	public double berekenGemiddeldenPerMaand(int[] temp) {
		double gem = 0;

		for (int t : temp) {
			gem += t;
		}
		gem /= temp.length;
		return gem;
	}

	public int bepaalMaximumTemperatuur(int[] temp) {
		int max = 0;
		for (int t : temp) {
			if (max < t) {
				max = t;
			}
		}
		return max;
	}
}
