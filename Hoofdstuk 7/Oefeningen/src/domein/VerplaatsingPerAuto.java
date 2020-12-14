package domein;

public class VerplaatsingPerAuto extends Verplaatsing {
	
	private double benzineprijs;
	private double verbruik;

	public VerplaatsingPerAuto(String van, String naar, double aantalKm, double benzineprijs, double verbruik) {
		super(van, naar, aantalKm);
		setBenzineprijs(benzineprijs);
		setVerbruik(verbruik);
	}
	
	public double berekenPrijs() {
		return verbruik*benzineprijs*getAantalKm()*2; //idk mss beter gwn verbruik*benzineprijs*aantalKm doen
	}

	@Override
	public String toString() {
		
		return String.format("%s per auto",super.toString());
	}

	public double getBenzineprijs() {
		return benzineprijs;
	}

	public void setBenzineprijs(double benzineprijs) {
		if(benzineprijs < 0.50 || benzineprijs > 2.00)
			throw new IllegalArgumentException("Benzineprijs moet tussen 0.5 en 2.00 euro per liter liggen.");
		this.benzineprijs = benzineprijs;
	}

	public double getVerbruik() {
		return verbruik;
	}

	public void setVerbruik(double verbruik) {
		if(verbruik < 0.02 || verbruik > 0.07)
			throw new IllegalArgumentException("Verbruik moet tussen 0.02 en 0.07 liter per km liggen.");
		this.verbruik = verbruik;
	}
	
}