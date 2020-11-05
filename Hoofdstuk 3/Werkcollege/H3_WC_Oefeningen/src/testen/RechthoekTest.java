package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Rechthoek;

class RechthoekTest {

    private Rechthoek r2;
    
    @BeforeEach
    public void before() {
       
    }
    
    @Test
    public void maakRechthoek_lengte2Breedte4_maaktRechthoek() {
        r2 = new Rechthoek(2,4);
        Assertions.assertEquals(4.0, r2.getBreedte(),0.01);
        Assertions.assertEquals(2.0, r2.getLengte(),0.01);
    }

    @Test
    public void maakRechthoek_defaultRechthoek_maaktRechthoek() {
        r2 = new Rechthoek();
        Assertions.assertEquals(7.0, r2.getBreedte(),0.01);
        Assertions.assertEquals(10.0, r2.getLengte(),0.01);
    }    
    
    @Test
    public void berekenOppervlakte_lengte2Breedte4_oppIs8(){
        r2 = new Rechthoek(2, 4);
        Assertions.assertEquals(8.0, r2.berekenOppervlakte(),0.01);
    }
    
    @Test
    public void berekenOmtrek_lengte2Breedte4_omtrekIs12(){
        r2 = new Rechthoek(2, 4);
        Assertions.assertEquals(12.0, r2.berekenOmtrek(),0.01);
    }
   
    
    @Test
    public void maakRechthoek_lengteMin2Breedte4_maaktRechthoekDefaultLengte() {
        r2 = new Rechthoek(-2,4);
        Assertions.assertEquals(4.0, r2.getBreedte(),0.01);
        Assertions.assertEquals(1.0, r2.getLengte(),0.01);
    }

    @Test
    public void maakRechthoek_lengte2BreedteMin4_maaktRechthoekDefaultBreedte() {
        r2 = new Rechthoek(2,-4);
        Assertions.assertEquals(1.0, r2.getBreedte(),0.01);
        Assertions.assertEquals(2.0, r2.getLengte(),0.01);
    } 
    
}
