package cui;

import java.util.Scanner;

public class Oef9_StudentenApp {

	private static final int AANTALEXAMENS = 5;

	public static void main(String args[]) {
		if (args.length == 0) {
			System.out.println("Geen parameter ingegeven!");
		} else {
			int[][] examen = new int[Integer.parseInt(args[0])][];
			int[] percentages = new int[Integer.parseInt(args[0])];

			voerExamensAlleStudentenin(examen);
			berekenPercentage(examen, percentages);

			System.out.println(maakUitvoer(examen, percentages));
		}
	}

	private static String maakUitvoer(int[][] examen, int[] percentages) {
		String output = "";
		boolean geslaagdVoorElkVak, geslaagd;

		int rijIndex = 0;
		for (int[] rij : examen) {
			geslaagdVoorElkVak = true;
			geslaagd = false;
			output += String.format("Student %d", rijIndex + 1);
			for (int ex : rij) {
				output += String.format("%8d", ex);
				if (ex < 10) {
					geslaagdVoorElkVak = false;
				}
			}
			if (percentages[rijIndex] >= 60 && geslaagdVoorElkVak == true)
				geslaagd = true;

			output += String.format("%npercentage : %-5d%sgeslaagd\n", percentages[rijIndex], geslaagd ? "" : "niet ");
		}
		double gemPercent = berekenGemiddeldPercentage(percentages);
		output += String.format("%ngemiddelde : %.2f", gemPercent);
		return output;
	}

	private static void voerExamensAlleStudentenin(int[][] array) {
		Scanner input = new Scanner(System.in);
		int aantal;

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Hoeveel examens heeft student %d afgelegd (max = %d): ", i + 1, AANTALEXAMENS);
			aantal = input.nextInt();

			if (aantal > 0 && aantal <= AANTALEXAMENS) {
				array[i] = new int[aantal];
				voerPuntenPerStudentIn(array[i]);
			} else
				i--;
		}
	}

	private static void voerPuntenPerStudentIn(int[] array) {
		Scanner input = new Scanner(System.in);
		int punten;
		for (int i = 0; i < array.length; i++) {
			do {
				System.out.printf("Examen %d (op 20): ", i + 1);
				punten = input.nextInt();
			} while (!(punten >= 0 && punten <= 20));
			array[i] = punten;

		}
	}

	public static void berekenPercentage(int[][] examen, int[] percentages) {
		int i = 0, totaal;
		for (int[] student : examen) {
			totaal = 0;
			for (int punten : student) {
				totaal += punten;
			}
			percentages[i] = totaal * 5 / examen[i].length;
			i++;
		}
	}

	public static double berekenGemiddeldPercentage(int[] percentages) {
		double gem = 0;
		for (int perc : percentages) {
			gem += perc;
		}
		gem /= percentages.length;
		return gem;
	}
}
