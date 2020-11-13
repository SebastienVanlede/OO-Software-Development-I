package cui;

import java.util.Scanner;

public class Oefening11 {

	public static void main(String[] args) {
		double gem = 0;
		double table[][] = new double[3][2];
		Scanner input = new Scanner(System.in);

		for (int rij = 0; rij < table.length; rij++) {
			for (int kolom = 0; kolom < table[rij].length; kolom++) {
				System.out.printf("Geef een getal op rij %d en kolom %d: ", rij + 1, kolom + 1);
				table[rij][kolom] = input.nextInt();
				gem += table[rij][kolom];
			}
		}
		gem /= table.length * table[0].length;

		String uitvoer = String.format("gemiddelde is %.1f", gem);
		System.out.print(uitvoer);

		input.close();
	}

}
