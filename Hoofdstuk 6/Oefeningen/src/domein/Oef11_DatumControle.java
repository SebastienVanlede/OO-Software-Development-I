package domein;

public class Oef11_DatumControle {
	private int[] AANTALDAGEN = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private String[] MAANDEN = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	public boolean controleerDatumDDMM(int datum) {

		if (datum == 1313) {
			return false;
		}
		if (datum < 101) {
			System.out.printf("De datum %d is ongeldig", datum);
			return false;
		}
		String string = "" + datum;
		String maand = string.substring(string.length() - 2);
		String dag = string.substring(0, string.indexOf(maand));

		int maandIndex = Integer.parseInt(maand);

		if (maandIndex > AANTALDAGEN.length - 1 || AANTALDAGEN[maandIndex] < Integer.parseInt(dag)) {
			System.out.printf("De datum %d is ongeldig", datum);
			return false;
		}
		System.out.printf("De datum %d is geldig", datum);
		return true;

	}

	public boolean controleerDatumDDMM(int d, String m) {
		int maandIndex = 0;
		int i = 1;
		for (String maand : MAANDEN) {
			if (maand.equalsIgnoreCase(m)) {
				maandIndex = i;
				break;
			}
			i++;
		}

		int datum = d * 100 + maandIndex;
		return controleerDatumDDMM(datum);
	}
}
