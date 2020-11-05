package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Auto;
import domein.*;

class AutoTest {
	
	    private Auto auto1, auto2, auto3;

	    @BeforeEach
	    public void before() {
	        auto1 = new Auto();
	        auto2 = new Auto("geel");
	        auto3 = new Auto("rood", "Porche");
	    }

	    @Test
	    public void maakAuto_geenWaardenDoorgeven_objectMetDefaultWaardenAangemaakt() {
	        Assertions.assertEquals("grijs", auto1.getKleur());
	        Assertions.assertEquals("onbekend", auto1.getMerk());
	        Assertions.assertEquals("onbekend", auto1.getNrPlaat());
	    }

	    @Test
	    public void maakAuto_metInitialisatieKleur_objectMetKleurEnRestDefaultWaarden() {
	        Assertions.assertEquals("geel", auto2.getKleur());
	        Assertions.assertEquals("onbekend", auto1.getMerk());
	        Assertions.assertEquals("onbekend", auto1.getNrPlaat());	        
	    }

	    @Test
	    public void maakAuto_metInitialisatieKleurEnMerk_objectMetKLeurMerkenDefaultNrplaat() {
	        Assertions.assertEquals("rood", auto3.getKleur());
	        Assertions.assertEquals("Porche", auto3.getMerk());
	        Assertions.assertEquals("onbekend", auto1.getNrPlaat());		        
	    }

	    @Test
	    public void setKleur_nieuweWaarde_correctGewijzigd() {
	        auto1.setKleur("blauw");
	        Assertions.assertEquals("blauw", auto1.getKleur());
	    }


	    @Test
	    public void setNrplaat_nieuweWaarde_correctGewijzigd() {
	        auto1.setNrPlaat("AAA111");
	        Assertions.assertEquals("AAA111", auto1.getNrPlaat());
	    }

	    @Test
	    public void versnel_50_snelheidCorrectGewijzigd() {
	        auto1.versnel(50);
	        Assertions.assertEquals(50, auto1.getSnelheid());
	    }	
	    
	    @Test
	    public void versnel_teVeel_snelheidIngesteldOpMax220() {
	        auto1.versnel(100);
	        auto1.versnel(100);
	        auto1.versnel(100);
	        Assertions.assertEquals(220, auto1.getSnelheid());
	    }	    
}
