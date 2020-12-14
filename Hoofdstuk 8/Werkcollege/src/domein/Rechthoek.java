package domein;

public class Rechthoek {
	private double lengte;
	private double breedte;

	public Rechthoek(double lengte, double breedte) {
		setLengte(lengte);
		setBreedte(breedte);
	}

	public double geefOmtrek() {
		return (lengte + breedte) * 2;
	}

	public double geefOppervlakte() {
		return lengte * breedte;
	}

	public void schaal(int percentage) {
		if (percentage < 1 || percentage > 200) {
			throw new IllegalArgumentException("Schalingspercentage moet in het interval [1, 200] liggen");
		}
		setLengte(lengte * percentage / 100);
		setBreedte(breedte * percentage / 100);
	}

	private void setLengte(double lengte) {
		if (lengte <= 0) {
			throw new IllegalArgumentException("De lengte moet een strikt positief getal zijn.");
		}
		this.lengte = lengte;
	}

	private void setBreedte(double breedte) {
		if (breedte <= 0) {
			throw new IllegalArgumentException("De breedte moet een strikt positief getal zijn.");
		}
		this.breedte = breedte;
	}

	public double getLengte() {
		return lengte;
	}

	public double getBreedte() {
		return breedte;
	}

}
