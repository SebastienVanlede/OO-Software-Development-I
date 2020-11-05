package cui;

import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal1, getal2, getal3, som, gemiddelde, rest, grootste;

		System.out.print("Geef een eerste getal in: ");
		getal1 = input.nextInt();
		System.out.print("Geef een tweede getal in: ");
		getal2 = input.nextInt();
		System.out.print("Geef een derde getal in: ");
		getal3 = input.nextInt();

		som = getal1 + getal2 + getal3;
		gemiddelde = som / 3;
		rest = gemiddelde % 3;

		System.out.printf(
				"Van de ingevoerde getallen %d, %d en %d%n is de som %d%n het gemiddelde %d%n en de rest %d%n", getal1,
				getal2, getal3, som, gemiddelde, rest);

		if (getal1 > getal2 && getal1 > getal3)
			grootste = getal1;
		else if (getal3 > getal1 && getal3 > getal2)
			grootste = getal3;
		else
			grootste = getal2;
		System.out.printf("en het grootste getal is %d", grootste);

	}

}
