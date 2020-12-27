package cui;

import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int getal, deler,counter = 0;
		
		do {
			System.out.print("Geef een strikt positieve deler in: ");
			deler = input.nextInt();
		}while(deler <= 0);
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Geef positief getal %d in (Stop met -1): ",i);
			getal = input.nextInt();
			
			if(getal % deler == 0)
				counter++;
			else if(getal == -1)
				break;
		}
		System.out.printf("Er zijn %d getallen deelbaar door %d",counter,deler);
		
		/*
		// Other way (uncommenting might cause interference):
		Scanner scanner = new Scanner(System.in);
		int i = 1, deler, getal = 0, aantalDeelbaar = 0;

		do {
		    System.out.print("Geef een strikt positieve deler in: ");
		    deler = scanner.nextInt();
		} while (deler <= 0);

		do {
		    System.out.printf("Geef postief getal %d in (Stoppen met -1):", i);
		    getal = scanner.nextInt();
		    if (getal > 0) {
			if (getal % deler == 0) {
			    aantalDeelbaar++;
			}
			i++;
		    }
		} while (getal != -1);

		System.out.printf("Er %s %d %s deelbaar door %d%n", (aantalDeelbaar > 1) ? "zijn" : "is", aantalDeelbaar, (aantalDeelbaar > 1) ? "getallen" : "getal", deler);
		*/
	}

}
