package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Voorwerp;

public class VoorwerpTest 
{
    private Voorwerp vwp1, vwp2;

    @BeforeEach
    public void before() 
    {
        vwp1 = new Voorwerp("speer", 150.0, 3);
    }

    @Test
    public void maakVoorwerp_alleAttributenNormaal_objectWordtGemaakt() 
    {
        Assertions.assertEquals("speer", vwp1.getNaam());
        Assertions.assertEquals(3, vwp1.getNiveau());
        Assertions.assertEquals(150.0, vwp1.getGewicht(), 0.01);
    }

    @Test
    public void maakVoorwerp_naamNietsDoorgegeven_werptException() 
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Voorwerp(null, -5.0, 3));
    }

    @Test
    public void maakVoorwerp_naamLegeTekst_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Voorwerp("", -5.0, 3));
    }

    @Test
    public void maakVoorwerp_gewichtTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Voorwerp("speer", -5.0, 3));
    }

    @Test
    public void maakVoorwerp_gewichtTeGroot_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Voorwerp("speer", 1500.0, 3));
    }

    @Test
    public void maakVoorwerp_gewichtRandGeval_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Voorwerp("speer", 1000.0, 3));
    }

    @Test
    public void maakVoorwerp_niveauTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Voorwerp("speer", 1000.0, 0));
    }

    @Test
    public void maakVoorwerp_niveauTeGroot_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Voorwerp("speer", 1000.0, 11));
    }

    @Test
    public void maakVoorwerp_defaultWaardeNiveau_objectWordtGemaakt() 
    {
        vwp2 = new Voorwerp("speer", 150.0);
        Assertions.assertEquals("speer", vwp2.getNaam());
        Assertions.assertEquals(1, vwp2.getNiveau());
        Assertions.assertEquals(150.0, vwp2.getGewicht(), 0.01);
    }

    @Test
    public void setNiveau_niveauTeGroot_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vwp1.setNiveau(17));
    }

    @Test
    public void setNiveau_niveauTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vwp1.setNiveau(-5));
    }

    @Test
    public void setNiveau_normaleWaarde_wijzigtWaardeAttribuut() 
    {
        vwp1.setNiveau(2);
        Assertions.assertEquals(2, vwp1.getNiveau());
    }

    @Test
    public void setGewicht_normaleWaarde_wijzigtWaardeAttribuut() 
    {
        vwp1.setGewicht(750);
        Assertions.assertEquals(750.0, vwp1.getGewicht(), 0.01);
    }

    @Test
    public void setGewicht_gewichtTeGroot_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vwp1.setGewicht(1200.0));
    }

    @Test
    public void setGewicht_gewichtTeKlein_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> vwp1.setGewicht(-5.0));
    }

    @Test
    public void toString_normaal_geeftTekstWeergaveObject() 
    {
        Assertions.assertEquals("Voorwerp speer met gewicht 150,000 kg uit niveau 3", vwp1.toString());
    }
}
