package testen;

import domein.KauwgomAutomaat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KauwgomAutomaatTest {

    @Test
    public void maakKauwgomAutomaat_defaultConstructor_maaktObject() {
    	KauwgomAutomaat ka = new KauwgomAutomaat();
        Assertions.assertEquals("rood", ka.getKleur());
        Assertions.assertEquals(0, ka.getAantalBallen());
    }

    @Test
    public void maakKauwgomAutomaat_aantalBallenOk_maaktObject() {
    	KauwgomAutomaat ka = new KauwgomAutomaat(50);
        Assertions.assertEquals("rood", ka.getKleur());
        Assertions.assertEquals(50, ka.getAantalBallen());
    }   
    
    @Test
    public void maakKauwgomAutomaat_aantalBallenNegatiefWordt0_maaktObject() {
    	KauwgomAutomaat ka = new KauwgomAutomaat(-50);
        Assertions.assertEquals("rood", ka.getKleur());
        Assertions.assertEquals(0, ka.getAantalBallen());
    }
    
    @Test
    public void maakKauwgomAutomaat_aantalBallenTeGrootWordt0_maaktObject() {
    	KauwgomAutomaat ka = new KauwgomAutomaat(200);
        Assertions.assertEquals("rood", ka.getKleur());
        Assertions.assertEquals(0, ka.getAantalBallen());
    }
    
    @Test
    public void isLeeg_legeAutomaat_returnTrue() {
    	KauwgomAutomaat ka = new KauwgomAutomaat();
        Assertions.assertEquals(true, ka.isLeeg());
        
    }   
    
    @Test
    public void isLeeg_gevuldeAutomaat_returnFalse() {
    	KauwgomAutomaat ka = new KauwgomAutomaat(50);
        Assertions.assertEquals(false, ka.isLeeg());
        
    }
    
    @Test
    public void vulBij_bereiktMaxNogNietEnNietVergrendeld_extraToegevoegd() {
    	KauwgomAutomaat ka = new KauwgomAutomaat(50);
    	ka.setVergrendeld(false);
    	ka.vulBij(20);
        Assertions.assertEquals(70, ka.getAantalBallen());
    }  
    
    @Test
    public void vulBij_bereiktMaxNogNietEnVergrendeld_nietsToegevoegd() {
    	KauwgomAutomaat ka = new KauwgomAutomaat(50);
    	ka.vulBij(20);
        Assertions.assertEquals(50, ka.getAantalBallen());
    } 
    
    @Test
    public void vulBij_maxOverschrijdenEnNietVergrendeld_nietsToegevoegd() {
    	KauwgomAutomaat ka = new KauwgomAutomaat(50);
    	ka.setVergrendeld(false);
    	ka.vulBij(200);
        Assertions.assertEquals(50, ka.getAantalBallen());
    }
}
