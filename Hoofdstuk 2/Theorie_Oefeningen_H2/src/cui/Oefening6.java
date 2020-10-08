package cui;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// A
		/*
		 * int getal, x = 1, som = 0;
		 * 
		 * while (x <= 5) { System.out.printf("Geef getal %d: ", x); getal =
		 * input.nextInt(); som += getal; ++x; }
		 * 
		 * System.out.printf("De som van de getallen is %d%n", som);
		 */

		// B
		/*
		 * int getal, x = 1, deelbaar = 0, even = 0; while (x <= 5) {
		 * System.out.printf("Geef getal %d: ", x); getal = input.nextInt(); if (getal %
		 * 2 == 0) even++; if (getal % 3 == 0) deelbaar++; ++x; }
		 * 
		 * System.out.
		 * printf("Je gaf %d even getallen en %d getallen deelbaar door 3 in%n", even,
		 * deelbaar);
		 */

		// C %6d
		/*
		 * int x = 1;
		 * 
		 * while (x <= 5) { System.out.printf("%6d%6d%6d%6d%n", x, x*10, x*100, x *
		 * 1000); x++; }
		 */

	}

}
