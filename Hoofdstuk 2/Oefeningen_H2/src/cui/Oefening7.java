package cui;

import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal, d2 = 0, d3 = 0, d6 = 0;

		do {
			System.out.print("Geef een positief geheel getal (Stoppen met 0): ");
			getal = input.nextInt();

			if (getal > 0)
				if (getal % 6 == 0) {
					d2++;
					d3++;
					d6++;
				} else if (getal % 3 == 0)
					d3++;
				else if (getal % 2 == 0)
					d2++;

		} while (getal != 0);

		System.out.printf("Er %s %d %s deelbaar door 2%n", (d2 > 1) ? "zijn" : "is", d2,
				(d2 > 1) ? "getallen" : "getal");
		System.out.printf("Er %s %d %s deelbaar door 3%n", (d3 > 1) ? "zijn" : "is", d3,
				(d3 > 1) ? "getallen" : "getal");
		System.out.printf("Er %s %d %s deelbaar door 6%n", (d6 > 1) ? "zijn" : "is", d6,
				(d6 > 1) ? "getallen" : "getal");
	}

}
