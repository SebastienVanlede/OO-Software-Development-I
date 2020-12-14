package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Oef12_Punt;

public class PuntTest
{
    private Oef12_Punt punt;

    @BeforeEach
    public void before()
    {
        punt = new Oef12_Punt(10, 20);
    }

    @Test
    public void puntXcoordNaConstructie()
    {
        Assertions.assertEquals(10, punt.getXCoord());

    }

    @Test
    public void puntYcoordNaConstructie()
    {
        Assertions.assertEquals(20, punt.getYCoord());

    }

    @Test
    public void puntXenYcoordNaSetter()
    {
        punt.setXCoord(50);
        punt.setYCoord(60);
        Assertions.assertEquals(50, punt.getXCoord());
        Assertions.assertEquals(60, punt.getYCoord());
    }

}
