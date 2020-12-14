package domein;

public class Hoofdstuk {
	private String titel;

	public Hoofdstuk() {
		setTitel("onbekend");
	}

	public String getTitel() {
		return titel;
	}

	public final void setTitel(String titel) {
		if (titel == null || titel.trim().isEmpty())
			throw new IllegalArgumentException("Titel moet ingevuld zijn");
		if (titel.length() < 2)
			throw new IllegalArgumentException("Titel is te kort");

		this.titel = titel;
	}
}
