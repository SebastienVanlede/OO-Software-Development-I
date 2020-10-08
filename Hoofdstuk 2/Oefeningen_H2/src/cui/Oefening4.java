package cui;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double afstand, snelheid, tijd, uren, min;

		do {
			System.out.print("Geef een afstand in kilometer (strikt positief geheel getal): ");
			afstand = input.nextDouble();
		} while (afstand <= 0);

		for (double i = 40; i <= 140; i += 10) {
			tijd = afstand / i;
			uren = Math.floor(afstand / i);
			min = ((afstand / i) - uren) * 60;

			System.out.printf("%3.0f km%10.0f km/u%8.0f u %2.0f min%n", afstand, i, uren, min);
		}

	}

}
