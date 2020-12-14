package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;


import domein.Kluis;

class KluisTest {
    private Kluis kluis;
    private static final String GELDIGE_CODE = "AB12";
    @BeforeEach
    public void setUp() {
        this.kluis = new Kluis(GELDIGE_CODE);
    }
    

    @Test
    public void maakKluis_geldigeCode_maaktKluis() {
        
        //assert
        Assertions.assertEquals(GELDIGE_CODE, kluis.getCode());
    }
    @ParameterizedTest
    @ValueSource(strings = {"    "," ABC","A BC","ABC ", "  C", "A  "})
    public void maakKluis_OngeldigeCode_ThrowsExecption(String code) {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code));
        
    }
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"ABC","ABCDE"})
    public void maakKluis_BevatGeenVierChars_ThrowsExecption(String code) {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Kluis(code));
        
    }
    @Test
    public void valideerCode_JuistCode_retourneertTrue(){
        //Assert
        Assertions.assertTrue(kluis.valideerCode(GELDIGE_CODE));
    }
    @Test
    public void valideerCode_JuistCode_retourneertFalse(){
        //Assert
        Assertions.assertFalse(kluis.valideerCode("AAAA"));
    }

}