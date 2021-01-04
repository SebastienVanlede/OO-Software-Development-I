package domein;

public class Rekening {
	private long rekeningnummer;
	private double saldo;
	private String houder;

	public Rekening() {
		this(123456789, "onbekend");
	}

	public Rekening(long rekeningnummer) {
		this(rekeningnummer, "onbekend");
	}

	public Rekening(long rekeningnummer, String houder) {
		setRekeningnummer(rekeningnummer);
		setHouder(houder);
	}

	public boolean stortOp(double bedrag) {
		if (bedrag > 0) {
			saldo += bedrag;
			return true;
		} else {
			return false;
		}
	}

	public boolean haalAf(double bedrag) {
		if (bedrag > 0 && saldo >= bedrag) {
			saldo -= bedrag;
			return true;
		} else {
			return false;
		}
	}

	// getters & setters
	public long getRekeningnummer() {
		return rekeningnummer;
	}

	private void setRekeningnummer(long rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getHouder() {
		return houder;
	}

	public final void setHouder(String houder) {
		this.houder = houder;
	}
}
