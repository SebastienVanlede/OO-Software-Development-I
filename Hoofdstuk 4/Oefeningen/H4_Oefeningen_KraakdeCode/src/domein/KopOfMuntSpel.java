package domein;

import java.security.SecureRandom;

public class KopOfMuntSpel {
	private String code;
	private int moeilijkheidsgraad;

	public KopOfMuntSpel(int moeilijkheidsgraad) {
		setMoeilijkheidsgraad(moeilijkheidsgraad);
		String code = genereerCode();
		setCode(code);
	}

	

	private String genereerCode() {
		String resultaat = "";
		SecureRandom sr = new SecureRandom();
		char kopOfMunt;

		for (int i = 1; i <= (moeilijkheidsgraad == 1 ? 3 : 4); i++) {
			kopOfMunt = sr.nextInt(2) == 0 ? 'K' : 'M'; // 0 - 1
			resultaat += String.format("%c", kopOfMunt);
		}

		return resultaat;
	}

	public int geefScore(String geradenCode) {
		int score = 0;
		for (int i = 0; i < (moeilijkheidsgraad==1?3:4); i++) {
			if (code.charAt(i)==geradenCode.charAt(i)) {
				score++;
			}
		}
		return score;
	}

	public boolean isGeraden(String geradenCode) {
		return geefScore(geradenCode)==(moeilijkheidsgraad==1?3:4);
	}
	
	private void setMoeilijkheidsgraad(int moeilijkheidsgraad) {
		if (moeilijkheidsgraad == 1 || moeilijkheidsgraad == 2) {
			this.moeilijkheidsgraad = moeilijkheidsgraad;
		} else {
			this.moeilijkheidsgraad = 1;
		}
	}

	private void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public int getMoeilijkheidsgraad() {
		return this.moeilijkheidsgraad;
	}
}