package cui;

import domein.Rekening;

public class RekeningApplicatie {

	public static void main(String[] args) {
		double[] saldi = { 100, 777.77, 287.15, -350, 399.99, 123.45, 987.65, -68.18, 413.26 };
		Rekening[] rekeningen = new Rekening[saldi.length];
		String houder;
		
		/*
		// Ook mogelijk:
		final int aantalRekeningen = saldi.length;
		Rekening[] rekeningen = new Rekening[aantalRekeningen];
		*/

		for (int index = 0; index < saldi.length; index++) {
			houder = String.format("%c", 'A' + index);//'A'=65
			rekeningen[index] = new Rekening(index, houder);
			rekeningen[index].stortOp(saldi[index]);
		}
		
		double totaal = 0;
		for (Rekening rekening : rekeningen) {
			System.out.printf("Rekening %d van %s bevat %.2f%n", rekening.getRekeningnummer(), rekening.getHouder(), rekening.getSaldo());
			totaal += rekening.getSaldo();
		}
		
		System.out.printf("%nHet gemiddelde saldo van deze %d rekeningen bedraagt: %.2f euro", rekeningen.length, totaal / rekeningen.length);
	}

}
