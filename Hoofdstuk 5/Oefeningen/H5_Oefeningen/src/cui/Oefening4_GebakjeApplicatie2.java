package cui;

import java.util.Arrays;
import java.util.Scanner;

public class Oefening4_GebakjeApplicatie2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String[] namen = new String[] { "aardbeientaartje", "eclair", "miserable", "hoorntje" };
		double[] eenheidsprijzen = new double[] { 2.75, 1.5, 2, 1.75 };

		String[] assortiment = toonAssortiment(namen, eenheidsprijzen);
		int[] aantalGebak = aantallen(inputScanner, assortiment);
		totalen(namen, eenheidsprijzen, aantalGebak);

	}

	private static String[] toonAssortiment(String[] namen, double[] eenheidsprijzen) {
		String[] assortiment = new String[namen.length];
		for (int i = 0; i < eenheidsprijzen.length; i++) {
			assortiment[i] = namen[i] + " (€ " + eenheidsprijzen[i] + ")";
		}
		System.out.println("Assortiment gebakjes: " + Arrays.toString(assortiment));
		return assortiment;
	}

	public static int[] aantallen(Scanner inputScanner, String[] assortiment) {
		int[] aantalGebak = new int[assortiment.length];
		int[] totaalGebak = new int[assortiment.length];
		for (int i = 0; i < 3; i++) {
			System.out.printf("%nGeef bestelling voor klant %d:%n", i + 1);
			for (int j = 0; j < assortiment.length; j++) {
				System.out.printf("Geef een aantal voor %s; ", assortiment[j]);
				aantalGebak[j] = inputScanner.nextInt();
				totaalGebak[j] += aantalGebak[j];
			}
		}

		return totaalGebak;
	}

	public static void totalen(String[] namen, double[] eenheidsprijzen, int[] aantalGebak) {
		System.out.println("Totaal te bakken: ");
		for (int i = 0; i < aantalGebak.length; i++) {
			if (aantalGebak[i] != 0) {
				System.out.printf("%d x %s%n", aantalGebak[i], namen[i]);

			}
		}
	}

}
