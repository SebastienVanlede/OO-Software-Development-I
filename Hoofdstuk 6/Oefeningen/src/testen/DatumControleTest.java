package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Oef11_DatumControle;
import domein.Oef6_DatumControle;

public class DatumControleTest {

	private Oef11_DatumControle dctl;

	@BeforeEach
	public void before() {
		dctl = new Oef11_DatumControle();
	}

	@Test
	public void controleerGeldigeDatumDag2CijfersMaand2Cijfers() {
		int datum = 1101;
		Assertions.assertEquals(true, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerGeldigeDatumDag1CijferMaand2CijfersOndergrens() {
		int datum = 101;
		Assertions.assertEquals(true, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerGeldigeDatumDag1CijferMaand2Cijfers() {
		int datum = 805;
		Assertions.assertEquals(true, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerGeldigeDatumDag2CijfersMaand2CijfersBovengrens() {
		int datum = 3112;
		Assertions.assertEquals(true, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerOnGeldigeDatumDagTeGroot() {
		int datum = 4005;
		Assertions.assertEquals(false, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerOnGeldigeDatumDagTeGrootVoorDieMaand() {
		int datum = 3104; // 31 april bestaat niet
		Assertions.assertEquals(false, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerOnGeldigeDatumDagTeGrootVoorDieMaand2() {
		int datum = 3002; // 30 februari bestaat niet
		Assertions.assertEquals(false, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerOnGeldigeDatumMaandTeGroot() {
		int datum = 1213; // geen 13de maand
		Assertions.assertEquals(false, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerOnGeldigeDatumTeWeinigCijfers() {
		int datum = 11;
		Assertions.assertEquals(false, dctl.controleerDatumDDMM(datum));
	}

	@Test
	public void controleerOnGeldigeDatumTeVeelCijfers() {
		int datum = 12056;
		Assertions.assertEquals(false, dctl.controleerDatumDDMM(datum));
	}

	/*
	 * Onderstaande testmethodes dienen alleen gebruikt te worden voor oefening 11
	 * en niet voor oefening 6. Haal ze dus uit commentaar als je aan oefening 11
	 * begint.
	 */

	@Test
	public void controleer3januari() {

		Assertions.assertEquals(true, dctl.controleerDatumDDMM(3, "januari"));
	}

	@Test
	public void controleer3Januari() {

		Assertions.assertEquals(true, dctl.controleerDatumDDMM(3, "Januari"));
	}

	@Test
	public void controleer25maort() {

		Assertions.assertEquals(false, dctl.controleerDatumDDMM(25, "maort"));
	}

	@Test
	public void controleer35maart() {

		Assertions.assertEquals(false, dctl.controleerDatumDDMM(35, "maart"));
	}

}
