package domein;

public class Oef11_Dagjaar {
	private int dagen;
	private int[] AANTDAGEN = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
	private String[] MAANDEN = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	public Oef11_Dagjaar(int d, int m) {
		dagen = AANTDAGEN[m - 1] + d;
	}

	public Oef11_Dagjaar(int d, String m) {
		int maandIndex = 0;
		int i = 0;
		for (String maand : MAANDEN) {
			if (maand.equalsIgnoreCase(m)) {
				maandIndex = i;
				break;
			}
			i++;
		}
		dagen = AANTDAGEN[maandIndex] + d;

	}

	public void addDagen(int d) {
		if ((dagen + d) > 365) {
			int aantal = (d + dagen) / 365;
			dagen = dagen + d - aantal * 365;
		} else {
			dagen += d;
		}
	}

	public int getDagen() {
		return dagen;
	}

}
