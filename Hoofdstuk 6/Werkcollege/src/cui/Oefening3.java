package cui;

import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int getal1, getal2;
		String res = "";

		do {
			System.out.print("Geef het eerste getal: ");
			getal1 = inputScanner.nextInt();
			System.out.printf("Geef een tweede getal (> %d): ", getal1);
			getal2 = inputScanner.nextInt();
		} while (getal1 >= getal2);

		Oefening3 object = new Oefening3(); // object aanmaken van huidige klasse

		for (int getal = getal1; getal <= getal2; getal++) {
			if (object.isPerfect(getal)) {
				res += String.format("%5d", getal);
			}
		}
		if (res.isEmpty()) {
			System.out.println("Er zijn geen perfecte getallen in dit interval");
		} else {
			System.out.printf("De perfecte getallen tussen %d en %d zijn %s", getal1, getal2, res);
		}
	}

	public boolean isPerfect(int x) {
		return x == berekenSomVanDelers(x);
	}

	public int berekenSomVanDelers(int x) { // 1 is geen perfect getal
		int som = 0;
		for (int deler = x / 2; deler >= 1; deler--) {
			if (x % deler == 0) {
				som += deler;
			}
		}
		return som;
	}

}
