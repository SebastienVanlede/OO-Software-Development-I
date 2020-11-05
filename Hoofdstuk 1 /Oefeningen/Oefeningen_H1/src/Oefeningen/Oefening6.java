package Oefeningen;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;

		System.out.printf("Geef een getal (>=999 en <= 9999) in: ");
		getal = input.nextInt();

		int duizendtallen, honderdtallen, tientallen, eenheden;
		duizendtallen = getal / 1000;
		getal = getal % 1000;
		honderdtallen = getal / 100;
		getal = getal % 100;
		tientallen = getal / 10;
		eenheden = getal % 10;

		System.out.printf("%s%n%d%s%n%d%s%n%d%s%n%d%s%n", "Het getal bestaat uit:", duizendtallen, " duizendtallen",
				honderdtallen, " hondertallen", tientallen, " tientallen", eenheden, " eenheden");
	}

}
