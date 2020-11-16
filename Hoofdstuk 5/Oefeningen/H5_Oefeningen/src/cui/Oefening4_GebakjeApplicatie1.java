package cui;

import java.util.Arrays;
import java.util.Scanner;

public class Oefening4_GebakjeApplicatie1 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String[] namen = new String[] { "aardbeientaartje", "eclair", "miserable", "hoorntje" };
		double[] eenheidsprijzen = new double[] { 2.75, 1.5, 2, 1.75 };

		String[] assortiment = toonAssortiment(namen, eenheidsprijzen);
		int[] aantallen = aantallen(inputScanner, assortiment);
		totalen(namen, eenheidsprijzen, aantallen);

	}

	public static int[] aantallen(Scanner inputScanner, String[] assortiment) {
		int[] aantallen = new int[assortiment.length];
		for (int i = 0; i < assortiment.length; i++) {
			System.out.printf("Geef aantal voor %s: ", assortiment[i]);
			aantallen[i] = inputScanner.nextInt();

		}
		return aantallen;
	}

	public static void totalen(String[] namen, double[] eenheidsprijzen, int[] aantallen) {
		int totaal = 0;
		for (int i = 0; i < aantallen.length; i++) {
			totaal += aantallen[i];
		}
		double subtotaal = 0.0;
		if (totaal != 0) {
			System.out.println("De bestelling: ");
			for (int i = 0; i < aantallen.length; i++) {
				if (aantallen[i] != 0) {
					System.out.printf("%d x %s%n", aantallen[i], namen[i]);
					subtotaal += aantallen[i] * eenheidsprijzen[i];
				}
			}
			System.out.printf("kost €%.2f", subtotaal);
		} else {
			System.out.println("Er is niets besteld.");
		}
	}

	private static String[] toonAssortiment(String[] namen, double[] eenheidsprijzen) {
		// String taartjes = "";
		String[] assortiment = new String[namen.length];

		for (int i = 0; i < eenheidsprijzen.length; i++) {
			// taartjes += namen[i] + " (€ " + eenheidsprijzen[i] + "), ";
			assortiment[i] = namen[i] + " (€ " + eenheidsprijzen[i] + ")";
		}
		// System.out.print("Assortiment gebakjes: " + taartjes.substring(0,
		// taartjes.length() - 2));
		System.out.println("Assortiment gebakjes: " + Arrays.toString(assortiment));

		// ook een manier om op te lossen
		return assortiment;
	}

}
