package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.VerplaatsingPerAuto;

public class VerplaatsingPerAutoTest 
{
    private VerplaatsingPerAuto vpa1, vpa2;

    @BeforeEach
    public void before() 
    {
        vpa1 = new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 1.591, 0.0538);
        vpa2 = new VerplaatsingPerAuto("Gent", "Eeklo", 23.8, 1.314, 0.0477);
    }

    @Test
    public void maakVerplaatsingPerAuto_vanNaarAantalKmBenzinePrijsVerbruik_maaktObject() 
    {
        Assertions.assertEquals("Gent", vpa1.getVan());
        Assertions.assertEquals("Oudenaarde", vpa1.getNaar());
        Assertions.assertEquals(29.4, vpa1.getAantalKm(), 0.01);
        Assertions.assertEquals(1.591, vpa1.getBenzineprijs(), 0.01);
        Assertions.assertEquals(0.0538, vpa1.getVerbruik(), 0.01);
    }

    @Test
    public void maakVerplaatsingPerAuto_benzinePrijsTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 0.4, 0.0538));
    }

    @Test
    public void maakVerplaatsingPerAuto_benzinePrijsTeGroot_werptException()  
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 2.2, 0.0538));
    }

    @Test
    public void maakVerplaatsingPerAuto_benzinePrijsGrenswaarde0Punt5_maaktObject() 
    {
        vpa2 = new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 0.5, 0.0538);
        Assertions.assertEquals(0.5, vpa2.getBenzineprijs(), 0.01);
    }

    @Test
    public void maakVerplaatsingPerAuto_benzinePrijsGrenswaarde2_maaktObject() 
    {
        vpa2 = new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 2.0, 0.0538);
        Assertions.assertEquals(2.0, vpa2.getBenzineprijs(), 0.01);
    }

    @Test
    public void maakVerplaatsingPerAuto_verbruikTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 1.02, 0.01));
    }

    @Test
    public void maakVerplaatsingPerAuto_verbruikTeGroot_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 1.02, 0.08));
    }

    @Test
    public void maakVerplaatsingPerAuto_verbruikGrenswaarde0Punt02_maaktObject() 
    {
        vpa2 = new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 0.5, 0.02);
        Assertions.assertEquals(0.02, vpa2.getVerbruik(), 0.01);
    }

    @Test
    public void maakVerplaatsingPerAuto_verbruikGrenswaarde0Punt07_maaktObject() 
    {
        vpa2 = new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 2.0, 0.07);
        Assertions.assertEquals(0.07, vpa2.getVerbruik(), 0.01);
    }

    @Test
    public void setVerbruik_waardeInInterval_attribuutKrijgtWaarde() 
    {
        vpa2.setVerbruik(0.056);
        Assertions.assertEquals(0.056, vpa2.getVerbruik(), 0.01);
    }

    @Test
    public void setVerbruik_waardeTeGroot_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vpa2.setVerbruik(0.09));
    }

    @Test
    public void setVerbruik_waardeTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vpa2.setVerbruik(0.01));
    }

    @Test
    public void setBenzinePrijs_waardeInInterval_attribuutKrijgtWaarde() 
    {
        vpa2.setBenzineprijs(1.03);
        Assertions.assertEquals(1.03, vpa2.getBenzineprijs(), 0.01);
    }

    @Test
    public void setBenzinePrijs_waardeTeGroot_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vpa2.setBenzineprijs(2.1));
    }

    @Test
    public void setBenzinePrijs_waardeTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vpa2.setBenzineprijs(0.4));
    }

    @Test
    public void berekenPrijs_normaalGeval_geeft5Punt033Terug() 
    {
        Assertions.assertEquals(5.033, vpa1.berekenPrijs(), 0.001);
    }

    @Test
    public void toString_normaalGeval_geeftObjectInStringvorm() 
    {
        Assertions.assertEquals("verplaatsing van Gent naar Oudenaarde per auto", vpa1.toString());
    }
}
