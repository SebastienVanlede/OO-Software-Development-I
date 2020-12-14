package cui;

import java.util.Arrays;
import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		int[] ingevoerd = new int[5];
		Oefening9 object = new Oefening9();

		object.voerGetallenIn(ingevoerd);
		System.out.println(Arrays.toString(ingevoerd));

	}// einde main

	private void voerGetallenIn(int[] ingevoerd) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < ingevoerd.length; i++) {
			System.out.printf("Geef getal %d: ", i + 1);
			ingevoerd[i] = input.nextInt();
			if (zitAlInArray(ingevoerd, i)) {
				System.out.println("Dit getal heb je al gekozen! Opnieuw!");
				i--;
			}
		}
	}

	private boolean zitAlInArray(int[] array, int index) {
		for (int i = 0; i < index; i++) {
			if (array[i] == array[index]) {
				return true;
			}
		}
		return false;
	}

}
