package cui;

import java.security.SecureRandom;
import java.util.Arrays;

public class Oefening3_Euromillions {

	public static void main(String[] args) {
		int[] getrokkenGetal = new int[4];
		int[] getrokkenSter = new int[2];
		String sterrenbeeld[] = { "Ram", "Leeuw", "Boogschutter", "Stier", "Maagd", "Steenbok", "Tweelingen",
				"Weegschaal", "Waterman", "Kreeft", "Schorpioen", "Vissen" };
		SecureRandom random = new SecureRandom();
		int getalWaarde, sterWaarde;

		for (int i = 0; i < getrokkenGetal.length; i++) {
			getalWaarde = random.nextInt(51);
			getrokkenGetal[i] = getalWaarde;
		}
		for (int i = 0; i < getrokkenSter.length; i++) {
			sterWaarde = random.nextInt(13);
			getrokkenSter[i] = sterWaarde;
		}

		int sterrenBeeld = random.nextInt(sterrenbeeld.length);
		System.out.printf("De getallen zijn: " + Arrays.toString(getrokkenGetal));
		System.out.printf("%nDe sterren zijn: " + Arrays.toString(getrokkenSter));
		System.out.printf("%nHet sterrenbeeld = %s ", sterrenbeeld[sterrenBeeld]);

	}

}
