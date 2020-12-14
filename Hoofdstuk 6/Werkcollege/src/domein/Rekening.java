package domein;

public class Rekening {
	private long rekeningnummer;
	private double saldo;
	private String houder;

	public Rekening() {
		this(123456789);
	}

	public Rekening(long rekeningnummer) {
		this(rekeningnummer, "onbekend");
	}

	public Rekening(long rekeningnummer, String houder) {
		this.rekeningnummer = rekeningnummer;
		this.houder = houder;
	}

	public boolean stortOp(double bedrag) {
		if (bedrag > 0) {
			saldo += bedrag;
			return true;
		}
		return false;
	}

	public boolean haalAf(double bedrag) {
		if (bedrag <= saldo && bedrag > 0) {
			saldo -= bedrag;
			return true;
		}
		return false;
	}

	public boolean schrijfBedragOverNaar(double bedrag, Rekening naarRek) {
		boolean afhalenGelukt = this.haalAf(bedrag);
		if (afhalenGelukt) {
			boolean stortenGelukt = naarRek.stortOp(bedrag);
			if (stortenGelukt) {
				return true;
			}
			this.stortOp(bedrag);
		}
		return false;
		
//		if (haalAf(bedrag))
//			return naarRek.stortOp(bedrag);
//		return false; -> werkt ook 
	}

	@Override
	public String toString() {
		return String.format("De rekening met rekeningnummer %d behoort toe aan %s en heeft als saldo €%.2f%n", rekeningnummer, houder, saldo);
	}

	public long getRekeningnummer() {
		return rekeningnummer;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getHouder() {
		return houder;
	}

	public void setHouder(String houder) {
		this.houder = houder;
	}

}
