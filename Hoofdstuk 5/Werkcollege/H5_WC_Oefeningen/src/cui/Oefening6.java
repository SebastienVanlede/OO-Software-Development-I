package cui;

public class Oefening6 {

	public static void main(String[] args) {
		int omzet[] = {360, 2100, 450, 1450, 650, 780, 321, 1200, 560, 1850, 960, 420};
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, minIndex = 0, maxIndex = 0;

		for (int i = 0; i < omzet.length; i++) {
		    if (omzet[i] < min) {
			min = omzet[i];
			minIndex = i + 1;
		    }
		    if (omzet[i] > max) {
			max = omzet[i];
			maxIndex = i + 1;
		    }
		}

		System.out.printf("Hoogste omzet %d in maand %d%nLaagste omzet %d in maand %d", max, maxIndex, min, minIndex);

	}

}
