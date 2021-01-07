package cui;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] maanden = new double[12];
		double totaal = 0, gemiddelde;
		String resultaat = "";

		for (int index = 0; index < maanden.length; index++) {
			System.out.printf("Geef de uitgaven in voor maand %d: ", index + 1);
			maanden[index] = input.nextDouble();
			totaal += maanden[index];
		}
		
		gemiddelde = totaal / maanden.length;
		
		for (int index = 0; index < maanden.length; index++) {
			if (maanden[index] > gemiddelde) {
				resultaat += String.format("%d ", index + 1);
			}
		}
		
		if (resultaat.isEmpty()) { // .length / == 0 / .equals("")
			System.out.println("Er zijn geen maanden waarin meer werd uitgegeven dan het gemiddelde.");
		} else {
			System.out.printf("In volgende maanden werd meer uitgegeven dan het gemiddelde %s: ", resultaat);
		}
		
		input.close();
	}

}
