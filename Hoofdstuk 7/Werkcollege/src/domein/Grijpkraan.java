package domein;

import java.security.SecureRandom;

public class Grijpkraan extends Automaat {

	public Grijpkraan(int aantalItems) {
		super(aantalItems);
	}

	@Override
	public boolean draaiHendel() {
		SecureRandom sr = new SecureRandom();
		boolean gewonnen = sr.nextBoolean();
		
		if (gewonnen) {
			return super.draaiHendel();
		} else {
			setMuntInGleuf(false);
			return false;
		}
	}
}