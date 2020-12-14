package testen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Doos;



public class DoosTest
{
    private Doos doos1, doos2;

    @BeforeEach
    public void before()
    {
        doos1 = new Doos(1, 2, 3,"groen");
        doos2 = new Doos();
    }

    @Test
    public void maakDoos_zonderArgumenten_steltLengteBreedteHoogteOp1In()
    {
        Assertions.assertEquals(1., doos2.getLengte(),0.01);
        Assertions.assertEquals(1., doos2.getBreedte(),0.01);
        Assertions.assertEquals(1., doos2.getHoogte(),0.01);
        Assertions.assertEquals("rood", doos2.getKleur());
        Assertions.assertEquals("D000000000000002", doos2.getCode());
    }

    @Test
    public void setLengte_waarde4_wordtIngesteld()
    {
        doos1.setLengte(4);
        Assertions.assertEquals(4., doos1.getLengte(),0.01);
    }
    
    @Test
    public void setLengte_waardeMin2_geeftException()
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {doos1.setLengte(-2);});
        
    }  
}