package domein;

public class Rechthoek {
	private double lengte, breedte;

	// getters
	public double getLengte() {
		return lengte;
	}

	public double getBreedte() {
		return breedte;
	}

	// setters
	private void setLengte(double lengte) {
		this.lengte = lengte > 0 ? lengte : 1.0;
	}

	private void setBreedte(double breedte) {
		this.breedte = breedte > 0 ? breedte : 1.0;
	}

	// constructors
	public Rechthoek() {
		this(10, 7);

		// setBreedte(7);
		// setLengte(10);
	}

	public Rechthoek(double lengte, double breedte) {
		setBreedte(breedte);
		setLengte(lengte);
	}

	public double berekenOmtrek() {
		return breedte * 2 + lengte * 2;
	}

	public double berekenOppervlakte() {
		return breedte * lengte;
	}

}
