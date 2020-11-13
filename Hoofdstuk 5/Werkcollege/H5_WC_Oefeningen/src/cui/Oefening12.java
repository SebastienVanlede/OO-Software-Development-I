package cui;

import java.util.Scanner;

import domein.Rekening;

public class Oefening12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rekening[][] rekeningen = new Rekening[3][];
		int aantalKol;

		for (int rij = 0; rij < rekeningen.length; rij++) {
			System.out.printf("Geef aantal kolommen in voor rij %d: ", rij + 1);
			aantalKol = input.nextInt();
			rekeningen[rij] = new Rekening[aantalKol];
			for (int kol = 0; kol < rekeningen[rij].length; kol++) {
				rekeningen[rij][kol] = new Rekening();
				rekeningen[rij][kol].stortOp(10 * (kol + 1) + rij);
			}
		}
		
		for (Rekening[] rij : rekeningen) {
			for (Rekening rek : rij) {
				System.out.printf("%-8.2f", rek.getSaldo());
			}
			System.out.println();
		}

		input.close();

	}

}
