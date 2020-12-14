package domein;

public class RekeningOperaties {

	public static void stortOpEenRekening(int index, double bedrag, Rekening[] rekeningen) {
		if (index < rekeningen.length && index >= 0) {
			rekeningen[index].stortOp(bedrag);

		}

	}
}
