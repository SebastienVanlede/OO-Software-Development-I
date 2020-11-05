package domein;

import java.security.SecureRandom;

public class Wiel {
	private int getal; // (0-9)

//	public Wiel() { // default constructor krijg je cadeau
//		
//	}

	public int getGetal() {
		return this.getal;
	}

	public void draai() {
		SecureRandom sRandom = new SecureRandom();
		getal = sRandom.nextInt(10); // bovengrens wordt nooit gegenereerd -> je krijgt een getal tussen 0 en 9
	}
}