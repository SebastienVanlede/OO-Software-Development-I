package cui;

import java.util.Scanner;

public class Oef2_TemperatuurApp {

	public static void main(String[] args) {
		Oef2_TemperatuurApp app = new Oef2_TemperatuurApp();
		Scanner input = new Scanner(System.in);
		int menu;

		do {
			menu = app.kiesUitMenu();
			switch (menu) {
			case 1:
				float celsius = app.leesTemp();
				float fahren = app.calcFahren(celsius);
				System.out.printf("%.1f in Celcius komt overeen met %.1f in Fahrenheit%n", celsius, fahren);
				break;

			case 2:
				float fahrenheit = app.leesTemp();
				float celsiuss = app.calcCelsius(fahrenheit);
				System.out.printf("%.1f in Fahrenheit komt overeen met %.1f in Celsius%n", fahrenheit, celsiuss);
				break;
			}
		} while (menu != 3);

	}

	private float leesTemp() {
		Scanner input = new Scanner(System.in);
		float temp;
		System.out.print("Geef een temperatuur: ");
		temp = input.nextFloat();

		return temp;
	}

	private float calcFahren(float celcius) {
		float fahren = 32 + (celcius * 9) / 5;
		return fahren;
	}

	private float calcCelsius(float fahren) {
		float celsius = 5 * (fahren - 32) / 9;
		return celsius;
	}

	private int kiesUitMenu() {
		Scanner keuzeScanner = new Scanner(System.in);
		int keuze;

		System.out.printf("Menu%n1) Omzetten naar Fahrenheit%n2) Omzetten naar Celcius%n3) Stoppen%n");
		
		do {
			System.out.println("Wat kies je?");
			keuze = keuzeScanner.nextInt();
			if (keuze < 1 || keuze > 3) {
				System.out.println("Ongeldige keuze");
			}
		} while (keuze < 1 || keuze > 3);

		return keuze;

	}
}
