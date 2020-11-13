package cui;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int omzet[] = { 360, 2100, 450, 1450, 650, 780, 321, 1200, 560, 1850, 960, 420 };
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, minIndex = 0, maxIndex = 0;

//		for (int index = 1; index <= omzet.length; index++) {
//			if (omzet[index] < min) {
//				min = omzet[index];
//				minIndex = index;
//			}
//			if (omzet[index] > max) {
//				max = omzet[index];
//				maxIndex = index;
//			}
//
//		} -> valt buiten array range

		for (int index = 0; index < omzet.length; index++) {
			if (omzet[index] < min) {
				min = omzet[index];
				minIndex = index + 1;
			}
			if (omzet[index] > max) {
				max = omzet[index];
				maxIndex = index + 1;
			}

		} 

		System.out.printf("Hoogste omzet %d in maand %d%nLaagste omzet %d in maand %d", max, maxIndex, min, minIndex);

		input.close();
	}

}
