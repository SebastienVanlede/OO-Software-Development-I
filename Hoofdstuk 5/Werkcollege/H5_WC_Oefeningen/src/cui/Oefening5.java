package cui;

import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getallen[] = new int [10];
		int extraGetal;
		
		for (int index = 0; index < getallen.length; index++) {
			System.out.printf("Geef getal %d: ", index+1);
			getallen[index] = input.nextInt();
		}
		
		System.out.println("Geef nog een extra getal: ");
		extraGetal = input.nextInt();
		
		System.out.printf("Deze getallen zijn strikt groter dan %d:%n", extraGetal);
		System.out.printf("%10s %20s %n", "Index", "Waarde");
		
		for (int index = 0; index < getallen.length; index++) {
			if (getallen[index] > extraGetal) {
				System.out.printf("%10d %20d %n", index, getallen[index]);
			}
		}
		
		input.close();
	}

}
