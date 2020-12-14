package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.SpaarRekening;

public class SpaarRekeningTest {

    private SpaarRekening sprek1, sprek2;

    @BeforeEach
    public void before() {
        sprek1 = new SpaarRekening(123456789911L, "Antoon");
        sprek2 = new SpaarRekening(123123456784L, "Carla");
        SpaarRekening.setAangroeiIntrest(0.0);
    }

    @Test
    public void setAangroeiIntrest_waarde0_attribuutKrijgtWaarde() {
        Assertions.assertEquals(0.0, SpaarRekening.getAangroeiIntrest(), 0.0);
    }

    @Test
    public void setAangroeiIntrest_waardeNegatief_werptException() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> SpaarRekening.setAangroeiIntrest(-2.5));
    }

    @Test
    public void setAangroeiIntrest_waardePositief_attribuutKrijgtWaarde() {
        SpaarRekening.setAangroeiIntrest(2.5);
        //delta toegevoegd
        Assertions.assertEquals(2.5, sprek1.getAangroeiIntrest(), 0.0);
        Assertions.assertEquals(2.5, sprek2.getAangroeiIntrest(), 0.0);
    }

    @Test
    public void stortOp_250Euro_saldoVerhoogt() {
        Assertions.assertTrue(sprek1.stortOp(250));
        Assertions.assertEquals(250.0, sprek1.getSaldo(), 0.0);
    }

    @Test
    public void stortOp_meerdereKeren_saldoVerhoogtMetTotaleSom() {
        Assertions.assertTrue(sprek1.stortOp(250));
        Assertions.assertTrue(sprek1.stortOp(50));
        Assertions.assertTrue(sprek1.stortOp(20050));
        Assertions.assertEquals(20350.0, sprek1.getSaldo(), 0.0);
    }

    @Test
    public void haalAf_meerdereKeren_saldoVerlaagtMetTotaleSom() {
        sprek1.stortOp(250);
        Assertions.assertTrue(sprek1.haalAf(60));
        Assertions.assertTrue(sprek1.haalAf(40));
        Assertions.assertEquals(150.0, sprek1.getSaldo(), 0.0);
    }

    @Test
    public void haalAf_teGrootBedragRekeningSaldo0_saldoWijzigtNiet() {
        Assertions.assertFalse(sprek1.haalAf(300));
        Assertions.assertEquals(0.0, sprek1.getSaldo(), 0.0);
    }

    @Test
    public void haalAf_teGrootBedragRekeningSaldo250_saldoWijzigtNiet() {

        sprek1.stortOp(250);
        Assertions.assertFalse(sprek1.haalAf(300));
        Assertions.assertEquals(250.0, sprek1.getSaldo(), 0.0);
    }

}
