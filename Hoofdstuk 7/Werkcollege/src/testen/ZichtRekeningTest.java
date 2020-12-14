package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.ZichtRekening;

public class ZichtRekeningTest {

    private ZichtRekening zrek1, zrek2;

    @BeforeEach
    public void before() {
        zrek1 = new ZichtRekening(123456789911L, "Antoon", -500);
        zrek2 = new ZichtRekening(123123456784L, "Carla", -1000);
    }

    @Test
    public void maakZichtRekening_NegatieveMaxKredietOnderNul_objectWordtGemaakt() {
        Assertions.assertEquals(-500.0, zrek1.getMaxKredietOnderNul(), 0.01);
        Assertions.assertEquals(-1000.0, zrek2.getMaxKredietOnderNul(), 0.01);
    }

    @Test
    public void maakZichtRekening_PositieveMaxKredietOnderNul_werptException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> zrek1.setMaxKredietOnderNul(2000.0));
    }

    @Test
    public void setMaxKredietOnderNul_Waarde0_attribuutWordtAangepast() {
        zrek2.setMaxKredietOnderNul(0);
        Assertions.assertEquals(0.0, zrek2.getMaxKredietOnderNul(), 0.0);
    }

    @Test()
    public void haalAf_bedragZonderOnderMaxKredietOnderNulUitkomen_saldoWijzigtNiet() {
        //zrek1 heeft maxKredietOnderNul van -500 
        Assertions.assertFalse(zrek1.haalAf(1000));
        Assertions.assertEquals(0.0, zrek2.getSaldo(), 0.0);
    }

    @Test
    public void haalAf_bedragBovenOnderMaxKredietOnderNul_saldoWijzigtEnIsNegatief() {
        //zrek2 heeft maxKrediet van -1000 

        zrek2.haalAf(500);
        Assertions.assertEquals(-500.0, zrek2.getSaldo(), 0.0);
    }

    @Test
    public void haalAf_bedragPreciesZelfdeAlsMaxKredietOnderNul_saldoWijzigtEnIsNegatief() {
        //zrek2 heeft maxKrediet van -1000 

        zrek2.haalAf(1000);
        Assertions.assertEquals(-1000.0, zrek2.getSaldo(), 0.0);
    }

}
