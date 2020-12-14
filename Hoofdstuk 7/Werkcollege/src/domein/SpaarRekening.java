package domein;

public class SpaarRekening extends Rekening {

	private static double aangroeiIntrest;

	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder); // aanroepen van constructor uit moederklasse
	}

	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}

	public static void setAangroeiIntrest(double aangroeiIntrest) {
		if (aangroeiIntrest < 0) {
			throw new IllegalArgumentException("Aangroeiintrest moet >= 0 zijn");
		}
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}

	@Override
	public boolean haalAf(double bedrag) {
		if (bedrag <= super.getSaldo()) // this. of niets => getSaldo()
			return super.haalAf(bedrag);
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s. Aangroeiintrest = %.2f %%", super.toString(), aangroeiIntrest);
	}

	
}
