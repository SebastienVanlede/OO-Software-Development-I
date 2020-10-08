package cui;

import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int postcode;

		do {
			System.out.print("Geef een postcode (4 cijfers): ");
			postcode = input.nextInt();
		} while (postcode > 9999 || postcode < 1000);

		switch (postcode) {
		case 9300:
			System.out.printf("Postnummer %d komt overeen met Aalst!", postcode);
			break;
		case 2000:
			System.out.printf("Postnummer %d komt overeen met Antwerpen!", postcode);
			break;
		case 1000:
			System.out.printf("Postnummer %d komt overeen met Brussel!", postcode);
			break;
		case 9200:
			System.out.printf("Postnummer %d komt overeen met Dendermonde!", postcode);
			break;
		case 9000:
			System.out.printf("Postnummer %d komt overeen met Gent!", postcode);
			break;
		case 8500:
			System.out.printf("Postnummer %d komt overeen met Kortrijk!", postcode);
			break;
		case 9700:
			System.out.printf("Postnummer %d komt overeen met Oudenaarde!", postcode);
			break;
		case 2300:
			System.out.printf("Postnummer %d komt overeen met Turnhout!", postcode);
			break;
		default:
			System.out.printf(
					"Postnummer %d bestaat niet of komt niet overeen met een stad die in de tabel is opgenomen",
					postcode);
			break;
		}

	}

}
