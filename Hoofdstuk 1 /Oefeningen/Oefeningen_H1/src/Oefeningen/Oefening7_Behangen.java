package Oefeningen;

import java.util.Scanner;

public class Oefening7_Behangen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Geef de hoogte van de muur in cm: ");
		int hoogte = input.nextInt();
		System.out.printf("Geef de breedte van de muur in cm: ");
		int breedte = input.nextInt();
		
		int oppervlakteMuur = hoogte * breedte;
		int oppervlakteRol = 1000 * 5; // 1 rol = 1000cm * 50cm
		
		int aantalRollen = (oppervlakteMuur + oppervlakteRol * 1) / oppervlakteRol;
		
		System.out.printf("Het aantal benodigde rollen = %d%n", aantalRollen);
		
		/*
		// Other way (uncommenting will cause interference):
		Scanner scanner = new Scanner(System.in);
        	int hoogte, breedte;

        	do {
            	     System.out.printf("Geef de hoogte van de muur in cm: ");
           	     hoogte = scanner.nextInt();
       		} while (hoogte < 0 || hoogte > 1001);
        
         	do {
           	     System.out.printf("Geef de breedte van de muur in cm: ");
            	     breedte = scanner.nextInt();
        	} while (breedte < 0 || breedte > 1001);

        	double oppervlakte = breedte * hoogte;
        	double nRollen = Math.ceil(oppervlakte / (1000 * 50));

        	System.out.printf("Het aantal benodigde rollen = %d %n", (int)nRollen);
		*/
	}

}
