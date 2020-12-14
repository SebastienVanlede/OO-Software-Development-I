package cui;

import java.util.Scanner;

import domein.Oef11_Dagjaar;
import domein.Oef11_DatumControle;

public class Oef11_DatumApplicatie {
	public static void main(String[] args) {
		int dag, maand, datum, dagenBij;
		String maandS;
		Scanner input = new Scanner(System.in);

		Oef11_Dagjaar dj = null;
		Oef11_DatumControle dc = new Oef11_DatumControle();

		System.out.print("Geef dag in: ");
		dag = input.nextInt();
		System.out.print("Geef maand in: ");
		maandS = input.next();

		boolean controle;

		if (maandS.length() > 2) {
			controle = dc.controleerDatumDDMM(dag, maandS);
			if (controle)
				dj = new Oef11_Dagjaar(dag, maandS);
		} else {
			maand = Integer.parseInt(maandS);
			datum = dag * 100 + maand;
			controle = dc.controleerDatumDDMM(datum);
			if (controle)
				dj = new Oef11_Dagjaar(dag, maand);
		}
		if (controle) {
			System.out.printf("De datum %d %s is geldig.%n", dag, maandS);

			System.out.printf("De datum in dagen: %d.%n", dj.getDagen());
			do {
				System.out.print("Hoeveel dagen wens je toe te voegen? ");
				dagenBij = input.nextInt();
			} while (dagenBij <= 0);

			dj.addDagen(dagenBij);
			System.out.printf("De datum in dagen NA de toevoeging = %d%n", dj.getDagen());
		} else {
			System.out.printf("De datum %d %s is ongeldig", dag, maandS);
		}
		input.close();
	}
}
