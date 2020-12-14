package cui;

import java.util.Scanner;

import domein.Oef6_DatumControle;

public class Oef6_DatumApp {

	public static void main(String[] args) {
		int datum;
		Scanner input = new Scanner(System.in);
		Oef6_DatumControle controle = new Oef6_DatumControle();

		do {
			System.out.printf("%nGeef datum (DDMM)(STOP met 1313): ");
			datum = input.nextInt();
			controle.controleerDatumDDMM(datum);
		} while (datum != 1313);
		

	}

}
