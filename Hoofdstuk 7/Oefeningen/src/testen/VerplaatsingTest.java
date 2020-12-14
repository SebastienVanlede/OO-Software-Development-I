package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Verplaatsing;

public class VerplaatsingTest 
{
    private Verplaatsing v1;

    @BeforeEach
    public void before() 
    {
        v1 = new Verplaatsing("Gent", "Antwerpen", 60.5);
    }

    @Test
    public void maakVerplaatsing_vanNaarAantalKm_maaktObject() 
    {
        Assertions.assertEquals("Gent", v1.getVan());
        Assertions.assertEquals("Antwerpen", v1.getNaar());
        Assertions.assertEquals(60.5, v1.getAantalKm(), 0.01);
    }

    @Test
    public void maakVerplaatsing_zonderVan_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Verplaatsing(null, "Antwerpen", 60.5));
    }

    @Test
    public void maakVerplaatsing_legeVan_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Verplaatsing("", "Antwerpen", 60.5));
    }

    @Test
    public void maakVerplaatsing_zonderNaar_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Verplaatsing("Gent", null, 60.5));
    }

    @Test
    public void maakVerplaatsing_legeNaar_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Verplaatsing("Gent", "", 60.5));
    }

    @Test
    public void maakVerplaatsing_negatieveAfstand_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Verplaatsing("Gent", "Antwerpen", -20));
    }

    @Test
    public void maakVerplaatsing_grensWaardeAfstand_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Verplaatsing("Gent", "Antwerpen", 0));
    }

    @Test
    public void setVan_instellenNieuweWaarde_attribuutWijzigt() 
    {
        v1.setVan("Brugge");
        Assertions.assertEquals("Brugge", v1.getVan());
    }

    @Test
    public void setVan_geenWaarde_attribuutWijzigt() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> v1.setVan(null));
    }

    @Test
    public void setVan_legeWaarde_attribuutWijzigt() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> v1.setVan(""));
    }

    @Test
    public void setNaar_instellenNieuweWaarde_attribuutWijzigt() 
    {
        v1.setNaar("Brugge");
        Assertions.assertEquals("Brugge", v1.getNaar());
    }

    @Test
    public void setNaar_geenWaarde_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> v1.setNaar(null));
    }

    @Test
    public void setNaar_legeWaarde_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> v1.setNaar(""));
    }

    @Test
    public void setAantalKm_normaleWaarde_attribuutWijzigt() 
    {
        v1.setAantalKm(20.5);
        Assertions.assertEquals(20.5, v1.getAantalKm(), 0.01);
    }

    @Test
    public void setAantalKm_negatieveWaarde_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> v1.setAantalKm(-10));
    }

    @Test
    public void setAantalKm_grensWaarde0_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> v1.setAantalKm(0));
    }

    @Test
    public void toString_infoOpvragen_geeftTekstWeergaveObject() 
    {
        Assertions.assertEquals("verplaatsing van Gent naar Antwerpen", v1.toString());
    }

}
