package cui;

import java.util.Scanner;

public class Oef3_PriemApplicatie {

	public static void main(String[] args) {
		Oef3_PriemApplicatie applicatie = new Oef3_PriemApplicatie();

		int getal = applicatie.leesInteger();
		int random = applicatie.geefRandomGetal(getal);
		System.out.printf("Het random bepaalde getal tussen 0 en %d is %d%n", getal, random);
		boolean priem = applicatie.isPriem(random);
		applicatie.drukRes(priem);

	}

	private boolean isPriem(int getal) {
		if (getal < 2) {
			return false;
		}
		int deler = 2;
		while (deler < getal / 2) {
			if (getal % deler == 0 && getal != 1) {
				return false;
			}
			deler++;
		}
		return true;
	}

	private int leesInteger() {
		Scanner input = new Scanner(System.in);
		int getal;

		do {
			System.out.print("Geef eens strik positief geheel getal: ");
			getal = input.nextInt();
		} while (getal <= 0);

		return getal;

	}

	private void drukRes(boolean janee) {
		System.out.printf("Dit getal is %s priemgetal", janee ? "een" : "geen");
	}

	private int geefRandomGetal(int n) {
		int max = n;
		int min = 0;
		int random = (int) (Math.random() * (max - min + 1) + min);

		return random;
	}

}
