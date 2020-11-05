package cui;

import java.util.Scanner;

public class Oefening10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// A
		/*
		int getal;
		do {
			System.out.print("Geef een strikt negatief oneven getal in: ");
			getal = input.nextInt();
		} while (!(getal < 0 && getal % 2 != 0));
		*/
		// B
		int getal1, getal2;

		do {
			System.out.print("Geef een eerste getal: ");
			getal1 = input.nextInt();
		} while (getal1 == 1000 || getal1 % 12 == 0);

		do {
			System.out.print("Geef een tweede getal: ");
			getal2 = input.nextInt();
		} while (!(getal2 > getal1));

	}
}
