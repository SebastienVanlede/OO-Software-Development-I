package cui;

import java.util.Scanner;

import domein.Rekening;
import domein.RekeningOperaties;

public class Oefening7_Rekening {

	public static void main(String[] args) {
		Rekening[] rekeningen = new Rekening[3];
		rekeningen[0] = new Rekening(123123456712L, "Sam");
		rekeningen[1] = new Rekening(123456789012L, "Arno");
		rekeningen[2] = new Rekening(101010101010L, "Stef");

		Scanner input = new Scanner(System.in);
		boolean storten = true;
		Oefening7_Rekening object = new Oefening7_Rekening();

		do {
			object.stortOpRekeningen(rekeningen);
			System.out.print("Wil je nog storten op een rekening (ja = 1)? ");
			storten = input.nextInt()==1;
		} while (storten);

		System.out.println("Beginsituatie: ");
		object.toonRekeningen(rekeningen);

		rekeningen[0].haalAf(299);
		rekeningen[1].stortOp(50);
		rekeningen[2].schrijfBedragOverNaar(25, rekeningen[0]);

		System.out.println("Eindsituatie");
		object.toonRekeningen(rekeningen);

		input.close();
	}// einde main

	private void toonRekeningen(Rekening[] rekeningen) {
		for (Rekening rek : rekeningen) {
			toon1Rekening(rek);
		}
	}

	private void toon1Rekening(Rekening rek) {
		System.out.println(rek); // rek.toString()
	}

	private void stortOpRekeningen(Rekening[] rekeningen) {
		Scanner input = new Scanner(System.in);
		int index;
		do {
			System.out.printf("Geef nummer van de rekening [1, %d]: ", rekeningen.length);
			index = input.nextInt();
		} while (index < 1 || index > rekeningen.length);
		System.out.print("Geef het bedrag: €");
		double bedrag = input.nextDouble();
		RekeningOperaties.stortOpEenRekening(index - 1, bedrag, rekeningen);

		
	}

}