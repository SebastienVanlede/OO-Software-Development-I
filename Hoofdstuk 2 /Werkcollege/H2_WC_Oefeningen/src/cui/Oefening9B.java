package cui;

import java.util.Scanner;

public class Oefening9B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal, grootste = Integer.MIN_VALUE, kleinste = Integer.MAX_VALUE;

		System.out.print("Geef een getal (0 om te stoppen): ");
		getal = input.nextInt();

		while (getal != 0) {
			if (getal > grootste) {
				grootste = getal;
			}
			if (getal < kleinste) {
				kleinste = getal;
			}

			System.out.print("Geef een getal (0 om te stoppen): ");
			getal = input.nextInt();
		}

		if (grootste == Integer.MIN_VALUE) {
			System.out.print("Er werden geen geldige getallen ingevoerd!");
		} else {
			System.out.printf("Het grootste van alle ingevoerde getallen is: %d.%nHet kleinste is: %d.", grootste,
					kleinste);
		}

	}

}
