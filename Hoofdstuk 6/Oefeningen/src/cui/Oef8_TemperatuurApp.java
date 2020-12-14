package cui;

import domein.Oef8_TemperatuurBewerking;

public class Oef8_TemperatuurApp {

	public static void main(String[] args) {
		int temp[][] = { { 4, -3, 2, 0, -5 }, { -1, 8, 3 }, { 11, 3, 7, 9 }, { 10, 14, 7, 5 }, { 10, 9, 17, 14, 21 },
				{ 18, 10, 24, 27, 14, 22 }, { 17, 32, 27, 24, 25 }, { 31, 28, 22, 30, 17 }, { 22, 24, 17, 14, 12, 11 },
				{ 12, 14, 9, 7, 12 }, { 7, 11, 14, 11, 6, 0, 7 }, { 3, -1, -3, 5 } };

		Oef8_TemperatuurBewerking temperatuurBewerking = new Oef8_TemperatuurBewerking();

		System.out.print("De gemiddelde temperatuur is:\n\n" + temperatuurBewerking.formateerGemiddeldenPerMaand(temp)
				+ "\n" + temperatuurBewerking.formateerMaximumTempDecember(temp[11]) + "\n");
	}

}
