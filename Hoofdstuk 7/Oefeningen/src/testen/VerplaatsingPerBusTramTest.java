package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.VerplaatsingPerBusTram;

public class VerplaatsingPerBusTramTest {

    private VerplaatsingPerBusTram vpbt1, vpbt2;

    @BeforeEach
    public void before() 
    {
        vpbt1 = new VerplaatsingPerBusTram("Voskenslaan Gent", "Veldstraat Gent", 4.2, 1, false, true);
        vpbt2 = new VerplaatsingPerBusTram("Station Dampoort Gent", "Blaarmeersen Gent", 7.7, 49, false, false);
    }

    @Test
    public void maakVerplaatsingPerBusTram_alleAttributenViaParameters_maaktObject() 
    {
        Assertions.assertEquals("Voskenslaan Gent", vpbt1.getVan());
        Assertions.assertEquals("Veldstraat Gent", vpbt1.getNaar());
        Assertions.assertEquals(4.2, vpbt1.getAantalKm(), 0.01);
        Assertions.assertEquals(1, vpbt1.getLijnnr());
        Assertions.assertFalse(vpbt1.isBus());
        Assertions.assertTrue(vpbt1.isStadslijn());
    }

    @Test
    public void maakVerplaatsingPerBusTram_lijnNrNegatief_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new VerplaatsingPerBusTram("Voskenslaan Gent", "Veldstraat Gent", 4.2, -1, false, true));
    }

    @Test
    public void setLijnnr_waardePositief_attribuutKrijgtWaarde() 
    {
        vpbt2.setLijnnr(39);
        Assertions.assertEquals(39, vpbt2.getLijnnr());
    }

    @Test
    public void setLijnnr_waardeNegatief_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vpbt2.setLijnnr(-2));
    }

    @Test
    public void berekenPrijs_normaalGeval_geeft2Punt56Terug() 
    {
        Assertions.assertEquals(2.56, vpbt1.berekenPrijs(), 0.001);
    }

    @Test
    public void toString_normaalGeval_geeftObjectInStringvorm() 
    {
        Assertions.assertEquals("verplaatsing van Voskenslaan Gent naar Veldstraat Gent met stadstram 1", vpbt1.toString());
    }
}
