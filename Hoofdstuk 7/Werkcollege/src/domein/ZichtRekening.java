package domein;

public class ZichtRekening extends Rekening {
	
	private double maxKredietOnderNul;

	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		setMaxKredietOnderNul(maxKredietOnderNul);
	}

	

	public double getMaxKredietOnderNul() {
		return maxKredietOnderNul;
	}

	public final void setMaxKredietOnderNul(double maxKredietOnderNul) {
		if (maxKredietOnderNul > 0 || maxKredietOnderNul >  getSaldo()) {
			throw new IllegalArgumentException("Maxkrediet moet <= 0 zijn en <= huidige saldo");
		}
		this.maxKredietOnderNul = maxKredietOnderNul;
	}



	@Override
	public String toString() {
		return String.format("%s. Max krediet onder nul = %.2f euro", super.toString(), maxKredietOnderNul);
	}



	@Override
	public boolean haalAf(double bedrag) {
		if (getSaldo() - bedrag >= getMaxKredietOnderNul()) {
			return super.haalAf(bedrag);
		}
		return false;
	}

	
	
}
