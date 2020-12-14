package domein;

public class Rekening {
	private final long rekeningNr; // eenmaal een waarde, daarna niet meer wijzigbaar -> geen setter
	private double saldo;
	private String houder;

	public Rekening(long rekeningNr, String houder) {
		controleerRekeningNr(rekeningNr);
		this.rekeningNr = rekeningNr;
		setHouder(houder);
	}

	public Rekening() {
		this(0L, "onbekend");
	}

	private void controleerRekeningNr(long rekeningNr) {
		long eerste10 = rekeningNr / 100;
		int rest = (int) (rekeningNr % 100);

		if (!(eerste10 % 97 == rest || (eerste10 % 97 == 0 && rest == 97))) {
			throw new IllegalArgumentException("Rekeningnummer moet correct zijn");
		}
	}

	private void setHouder(String houder) {
		if (houder == null || houder.equals("")) {
			throw new IllegalArgumentException("Houder mag niet leeg zijn");
		}
		this.houder = houder;
	}

	public long getRekeningNr() {
		return rekeningNr;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getHouder() {
		return houder;
	}

	@Override
	public String toString() {
		long eerste3 = getRekeningNr() / 1000000000;
		long rest = getRekeningNr() % 100;
		long midden7 = (getRekeningNr() / 100) % 10000000;

		return String.format("%s%s %03d-%07d-%02d%n%s %s%n%s%.2f %s", this.getClass().getSimpleName(),
				" met rekeningnummer", eerste3, midden7, rest, "staat op naam van", getHouder(), "en bevat ",
				getSaldo(), "euro");
	}

	public boolean stortOp(double bedrag) {
		boolean succes = false;
		if (bedrag > 0) {
			saldo += bedrag;
			succes = true;
		}
		return succes;
	}

	public boolean haalAf(double bedrag) {
		boolean succes = false;
		if (bedrag > 0) {
			saldo -= bedrag;
			succes = true;
		}

		return succes;
	}

	public boolean schrijfBedragOverNaar(double bedrag, Rekening naarRek) {
		boolean succes = false;
		if (naarRek != null && haalAf(bedrag)) {
			succes = naarRek.stortOp(bedrag);
			if (!succes) {
				stortOp(bedrag);
			}
		}
		return succes;
	}

} // einde klasse Rekening
