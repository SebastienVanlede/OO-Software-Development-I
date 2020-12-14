package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Sleutel;
import domein.VoorwerpRepository;
import domein.Wapen;

public class VoorwerpRepositoryTest
{
    private VoorwerpRepository verzameling;

    @BeforeEach
    public void before()
    {
        verzameling = new VoorwerpRepository();
    }

    @Test
    public void toonOverzicht_legeVerzameling_geeftJuisteTekstTerug()
    {
        Assertions.assertEquals("collectie is leeg", verzameling.geefOverzicht());
    }

    @Test
    public void toonOverzicht_wapenInVerzameling_geeftJuisteTekstTerug()
    {
        verzameling.voegVoorwerpToe(new Wapen("Colt", 1.5, 3, 6, false));
        Assertions.assertEquals(String.format("Wapen Colt met gewicht 1,500 kg uit niveau 3 en met kracht 6 nog niet gebruikt.%n"),
                verzameling.geefOverzicht());
    }

    @Test
    public void toonOverzicht_sleutelInVerzameling_geeftJuisteTekstTerug()
    {
        verzameling.voegVoorwerpToe(new Sleutel("voordeur", 0.5, 3, 1));
        Assertions.assertEquals(String.format("Sleutel voordeur met gewicht 0,500 kg uit niveau 3 past op deur 1.%nEr zijn 1 sleutel(s) in omloop.%n"),
                verzameling.geefOverzicht());
    }

}
