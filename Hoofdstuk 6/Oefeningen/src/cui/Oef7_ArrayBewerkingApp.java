package cui;

import java.security.SecureRandom;
import java.util.Scanner;

import domein.Oef7_ArrayBewerking;

public class Oef7_ArrayBewerkingApp {

	public static void main(String[] args) {
		int[] rij1 = {2,7,1,9,4};
		
		int[] rij2 = new int[rij1.length];
		Oef7_ArrayBewerkingApp.invoerRij(rij2);
		
		double[] rij3 = Oef7_ArrayBewerking.deel(rij1, rij2);


		SecureRandom sRandom = new SecureRandom();
		int random = 1 + sRandom.nextInt(4);
		double[] rij4 = rij3.clone();
		Oef7_ArrayBewerking.schuifOp(rij3, random);
		
		System.out.printf("Rij 1 = %s%nRij 2 = %s%nRij 3 = %s%n%nRij 3 na verschuiving van %d %s = %s%n",
				Oef7_ArrayBewerking.toon(rij1),
				Oef7_ArrayBewerking.toon(rij2),
				Oef7_ArrayBewerking.toon(rij3),
				random, 
				(random==1?"plaats":"plaatsen"),
				Oef7_ArrayBewerking.toon(rij4));
		
		

	}

	public static void invoerRij(int[] rij) {
		int getal;
		Scanner inputScanner = new Scanner(System.in);

		for (int i = 0; i < rij.length; i++) {
			do {
				System.out.printf("Geef een strikt positief getal nr%d in:", i + 1);
				getal = inputScanner.nextInt();
			} while (getal <= 0);
			rij[i] = getal;
		}
		inputScanner.close();
	}

}
