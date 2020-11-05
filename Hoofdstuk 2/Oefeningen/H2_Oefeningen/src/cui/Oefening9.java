package cui;

import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal, counter = 0;

		System.out.print("Geef een strikt positief geheel getal in: ");
		getal = input.nextInt();

		do {
			if (getal % 2 == 0) {
				getal = getal / 2;
				counter++;

			} else {
				getal = (getal * 3) + 1;
				counter++;

			}

		} while (getal != 1);
		System.out.printf("Het getal wijzigt %d keer", counter);

	}

}
