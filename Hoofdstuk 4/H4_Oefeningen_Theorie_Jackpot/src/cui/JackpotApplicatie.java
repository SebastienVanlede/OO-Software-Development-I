package cui;

import java.util.List;
import java.util.Scanner;

import domein.DomeinController;

public class JackpotApplicatie {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int antwoord;
		DomeinController dController = new DomeinController();
		dController.startNieuweJackpot();

		List<Integer> getallen = dController.geefGetallenVanWielen();
		for (int getal : getallen) {
			System.out.printf("%d ", getal);
		}
		System.out.println();
		
		do {
		dController.speel();
		getallen = dController.geefGetallenVanWielen();
		for (int getal : getallen) {
			System.out.printf("%d ", getal);

		}
		System.out.printf("%nJouw score is %d.%n", dController.geefScore());
		System.out.println("Wil je verder spelen? (1 = ja, 0 = nee");
		antwoord = inputScanner.nextInt();
		}while(antwoord == 1); 
	}

}
