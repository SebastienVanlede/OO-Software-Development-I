package domein;

import java.util.Scanner;

public class Oef6_DatumControle {
	private int[] AANTALDAGEN = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean controleerDatumDDMM(int datum) {

		if (datum == 1313) {
			return false;
		}
		if (datum < 101) {
			System.out.printf("De datum %d is ongeldig", datum);
			return false;
		}
		String string = "" + datum;
		String maand = string.substring(string.length() - 2);
		String dag = string.substring(0, string.indexOf(maand));

		int maandIndex = Integer.parseInt(maand);

		if (maandIndex > AANTALDAGEN.length - 1 || AANTALDAGEN[maandIndex] < Integer.parseInt(dag)) {
			System.out.printf("De datum %d is ongeldig", datum);
			return false;
		}
		System.out.printf("De datum %d is geldig", datum);
		return true;

	}
}
