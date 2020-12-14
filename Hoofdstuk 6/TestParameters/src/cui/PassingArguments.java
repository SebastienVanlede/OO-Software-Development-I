package cui;
import domein.NatuurlijkGetal;

public class PassingArguments {

	public static void main(String[] args) {
		int getal = 1;
		NatuurlijkGetal referentie = new NatuurlijkGetal(1);

		wijzigParamaterPrimitiefType(getal);
		System.out.printf("Na aanroep heeft getal de waarde %d%n", getal);

		wijzigParamaterReferentieType(referentie);
		System.out.printf("Na aanroep wijst referentie naar een object met waarde %d%n", referentie.getWaarde());

		wijzigParamaterReferentieType2(referentie);
		System.out.printf("Na aanroep wijst referentie naar een object met waarde %d%n", referentie.getWaarde());
	}

	private static void wijzigParamaterPrimitiefType(int par) {
		par = 2;
	}

	private static void wijzigParamaterReferentieType(NatuurlijkGetal par) {
		par = null;
		//par =  new NatuurlijkGetal(99);
	}

	private static void wijzigParamaterReferentieType2(NatuurlijkGetal par) {
		par.setWaarde(2);
	}

}
