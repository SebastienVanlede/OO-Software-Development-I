package domein;

public class Palindroom {
	public static boolean isPalindroom(String tekst) {
		if (tekst == null || tekst.isBlank()) {
			throw new IllegalArgumentException("Ongeldige tekst");
		}
		
		if (tekst.length() == 1) {
			throw new IllegalArgumentException("Tekst moet meer dan een karakter bevatten");
		}			

		String omgekeerd = new StringBuilder(tekst).reverse().toString();

		return (tekst.equalsIgnoreCase(omgekeerd));

	}
}
