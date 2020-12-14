package domein;

import java.security.SecureRandom;

public class KauwgomAutomaat extends Automaat {
	private static String[] KLEUREN = { "blauwe", "gele", "groene", "rode", "witte", "roze", "paarse" };

	public KauwgomAutomaat(int aantalItems) {
		super(aantalItems); // constructor uit Automaat aanroepen -> EERSTE statement
	}

	public String bepaalKleur() {
		SecureRandom sr = new SecureRandom();
		int random = sr.nextInt(KLEUREN.length);
		return KLEUREN[random];
	}

}