package domein;

public class Kapitaal {
	private double beginBedrag, intrest;
	
	//constructors
	
	public Kapitaal(double beginBedrag, double intrest) {
		setBeginBedrag(beginBedrag);
		setIntrest(intrest);
	}
	
	//methodes
	public double berekenKapitaalNaNJaar(int n) {
		if(n == 0) //basiscase - stopvoorwaarde van de recursie
			return beginBedrag;		
		return berekenKapitaalNaNJaar(n-1)*(intrest/100 + 1);
	}
	
	
	//getter en setter

	public double getBeginBedrag() {
		return beginBedrag;
	}
	
	public final void setBeginBedrag(double beginBedrag) {
		if(beginBedrag < 0)
			throw new IllegalArgumentException("Beginbedrag moet minstens 0 zijn.");
		this.beginBedrag = beginBedrag;
	}
	
	public double getIntrest() {
		return intrest;
	}
	
	public final void setIntrest(double intrest) {
		if(intrest < 0 || intrest >100)
			throw new IllegalArgumentException("Intrest moet in het interval 0 tot 100 liggen.");
		this.intrest = intrest;
	}



}
