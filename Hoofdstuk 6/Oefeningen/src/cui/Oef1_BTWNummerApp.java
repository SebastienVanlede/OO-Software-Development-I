package cui;

import java.util.Scanner;

public class Oef1_BTWNummerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int btwNr;
		Oef1_BTWNummerApp app = new Oef1_BTWNummerApp();

		System.out.print("Geef een btw-nummer van de vorm ABC.PQR.XYZ zonder de puntjes: ");
		btwNr = input.nextInt();

		System.out.printf("%d is een %s btw-nummer", btwNr, app.isGeldig(btwNr) ? "geldig" : "ongeldig");

		input.close();
	}

	private boolean isGeldig(int nr) {
		int rest = (nr / 100) % 97;
		String string = "" + nr;
		int getal = Integer.parseInt(string.substring(7));

		if (getal + rest == 97) {
			return true;
		}
		return false;

	}

}
