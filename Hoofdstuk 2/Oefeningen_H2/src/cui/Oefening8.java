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
	}

}
