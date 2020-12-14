package domein;

public class Oef12_Vierkant {
	private int zijde;
	private Oef12_Punt linkerBovenHoek;

	public Oef12_Vierkant(int x, int y, int zijde) {
		setZijde(zijde);
		linkerBovenHoek = new Oef12_Punt(x, y);

	}

	public int geefOmtrek() {
		int omtrek = zijde * 4;
		return omtrek;

	}

	public int geefOpp() {
		int oppervlakte = zijde * zijde;
		return oppervlakte;
	}

	public void groei() {
		if (zijde < 495) {
			setZijde(zijde + 5);
		}
	}

	public void krimp() {
		if (zijde > 5) {
			setZijde(zijde - 5);
		}
	}

	@Override
	public String toString() {
		String output = String.format("Het vierkant heeft: %n");
		output += String.format("Zijn linkerbovenhoek op: %s", linkerBovenHoek);
		output += String.format("%nEen zijde van: %d", zijde);
		output += String.format("%nEen omtrek van: %d", geefOmtrek());
		output += String.format("%nEen oppervlakte van: %d", geefOpp());
		return output;
	}

	public int getZijde() {
		if (zijde < 1 || zijde > 500)
			throw new IllegalArgumentException("De zijde moet tussen 1 en 500 liggen");
		return zijde;
	}

	public void setZijde(int zijde) {
		this.zijde = zijde;
	}

	public Oef12_Punt getLinkerBovenHoek() {
		return linkerBovenHoek;
	}

}
