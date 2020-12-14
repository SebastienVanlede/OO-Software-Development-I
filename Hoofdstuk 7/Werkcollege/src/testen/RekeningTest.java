package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Rekening;

public class RekeningTest
{
	private Rekening piet, sofie;

	@BeforeEach
	public void before()
	{
		piet = new Rekening(232346789122L, "Piet");
		sofie = new Rekening(232346789122L, "Sofie");
	}

	@Test
	public void maakRekening_verkeerdRekeningnummer_werptException()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rekening(232346789123L, "Jan"));
	}

	@Test
	public void maakRekening_rekeningnummerEnHouder_maaktObject()
	{
		Assertions.assertEquals(232346789122L, piet.getRekeningNr());
		Assertions.assertEquals(0.0, piet.getSaldo(),0.01);
		Assertions.assertEquals("Piet", piet.getHouder());
	}

	@Test
	public void maakRekening_defaultWaardenZonderParameters_maaktObject()
	{
		Rekening rek = new Rekening();
		Assertions.assertEquals(0L, rek.getRekeningNr());
		Assertions.assertEquals(0.0, rek.getSaldo(),0.01);
		Assertions.assertEquals("onbekend", rek.getHouder());
	}

	@Test
	public void stortOp_150EuroStorten_saldoVerhoogt()
	{
		piet.stortOp(150);
		Assertions.assertEquals(150.0, piet.getSaldo(),0.01);
	}

	@Test
	public void stortOp_negatiefBedrag_saldoBlijftGelijk()
	{
		piet.stortOp(-300);
		Assertions.assertEquals(0., piet.getSaldo(),0.01);
	}

	@Test
	public void haalAf_30EuroAfhalen_saldoDaalt()
	{
		sofie.stortOp(150);
		sofie.haalAf(30);
		Assertions.assertEquals(120., sofie.getSaldo(),0.01);
	}

	@Test
	public void haalAf_bedragAfhalenSaldoOnderNul_saldoWordtNegatief()
	{
		sofie.haalAf(230);
		Assertions.assertEquals(-230, sofie.getSaldo(),0.01);
	}

	@Test
	public void schrijfBedragOverNaar_30EuroOverschrijven_overschrijvingLukt()
	{
		sofie.stortOp(150);
		sofie.schrijfBedragOverNaar(30, piet);
		Assertions.assertEquals(120., sofie.getSaldo(),0.01);
		Assertions.assertEquals(30., piet.getSaldo(),0.01);
	}

	@Test
	public void schrijfBedragOverNaar_negatiefBedragOverschrijven_geenOverschrijvingSaldiBlijvenGelijk()
	{
		sofie.stortOp(150);
		sofie.schrijfBedragOverNaar(-30, piet);
		Assertions.assertEquals(150., sofie.getSaldo(),0.01);
		Assertions.assertEquals(0., piet.getSaldo(),0.01);
	}

	@Test
	public void schrijfBedragOverNaar_bedragOverschrijvenWaarbijSaldoOnderNulGaat_saldoWordtNegatief()
	{
		sofie.stortOp(150);
		sofie.schrijfBedragOverNaar(200, piet);
		Assertions.assertEquals(-50, sofie.getSaldo(),0.01);
		Assertions.assertEquals(200, piet.getSaldo(),0.01);
	}
}
