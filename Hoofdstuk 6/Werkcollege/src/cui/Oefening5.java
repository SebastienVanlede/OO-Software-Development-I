package cui;

import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String schaal = "Celcius";
		int keuze;
		char schaalletter;

		do {
			System.out.print("Geef de schaal: Celcius [1] of Fahrenheit [2]: ");
			keuze = inputScanner.nextInt();
		} while (keuze != 1 && keuze != 2);
		System.out.printf("Geef de temperatuur in graden (9999 om te stoppen): ");
		int temp = inputScanner.nextInt();
		schaal = keuze == 1 ? "Celcius" : "Fahrenheit";
		schaalletter = keuze == 1 ? 'C' : 'F';

		while (temp != 9999) {
			String resultaat = geefTemperatuurStatus(temp, schaalletter);
			System.out.printf("%d graden %s voelt aan als %s%n", temp, schaal, resultaat);
			do {
				System.out.print("Geef de schaal: Celcius [1] of Fahrenheit [2]");
				keuze = inputScanner.nextInt();
			} while (keuze != 1 && keuze != 2);
			System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen): ", schaal);
			temp = inputScanner.nextInt();
			schaal = keuze == 1 ? "Celcius" : "Fahrenheit";
			schaalletter = keuze == 1 ? 'C' : 'F';
		}

		inputScanner.close();
	}

	private static String geefTemperatuurStatus(int temp, char schaalletter) {
		if (schaalletter == 'F')
			temp = (temp - 32) * 5 / 9; // omvormen naar Celcius
		return geefTemperatuurStatus(temp);
	}

	private static String geefTemperatuurStatus(int temp) {
		if (temp < 10) {
			return "koud";
		} else if (temp <= 20) {
			return "lauw";
		} else {
			return "warm";
		}

	}

}
