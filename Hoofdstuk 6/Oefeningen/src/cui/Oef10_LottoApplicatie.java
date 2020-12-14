package cui;


import java.security.SecureRandom;
import java.util.*;

public class Oef10_LottoApplicatie
{
    public static void main(String args[])
    {
        final int AANTAL_TREKKINGEN = 1000;
        final int AANTAL_GEKOZEN = 6;

		Oef10_LottoApplicatie lotto = new Oef10_LottoApplicatie();

        int keuze[] = new int[AANTAL_GEKOZEN];
        int trekkingen[][] = new int[AANTAL_TREKKINGEN][AANTAL_GEKOZEN];
        int aantalJuiste[] = new int[AANTAL_GEKOZEN + 1];
        
        String uitvoer = "";

        lotto.leesGetallen(keuze);
        uitvoer += String.format("Gekozen getallen: %s%n%n", Arrays.toString(keuze));

        for (int i = 0; i < trekkingen.length; i++)
        {
            uitvoer += String.format("Trekking %d - ", i + 1);
            lotto.kiesWillekeurigeGetallen(trekkingen[i]);
            uitvoer += String.format
                ("Getrokken getallen: %s", Arrays.toString(trekkingen[i]));
            int aantalJuist = lotto.controleer(keuze, trekkingen[i]);
            aantalJuiste[aantalJuist]++;
            uitvoer += String.format(" - Aantal juiste: %d%n", aantalJuist);
        }
        uitvoer += String.format("%n%s", lotto.geefOverzichtGewonnen(aantalJuiste));
        uitvoer += String.format("%n%s", lotto.geefStatistieken(trekkingen));
        System.out.println(uitvoer);
    }

    private void leesGetallen(int getallen[])
    {
        Scanner s = new Scanner(System.in);
        final int AANTAL_BALLEN = 45;
        int getal, i=0;
        
        while (i < getallen.length)
        {
            do
            {
                System.out.printf
                    ("Kies je %de lottogetal (1-%d): ", i+1, AANTAL_BALLEN);
                getal = s.nextInt();
            }
            while (getal < 1 || getal > AANTAL_BALLEN);
            if (!komtVoor(getal, getallen))
                getallen[i++] = getal;
        }
        Arrays.sort(getallen);
    }
    
    private void kiesWillekeurigeGetallen(int getallen[])
    {
        SecureRandom r = new SecureRandom();
        final int AANTAL_BALLEN = 45;
        int getal, i=0;
        
        while (i < getallen.length)
        {
            getal = r.nextInt(AANTAL_BALLEN) + 1;
            if (!komtVoor(getal, getallen))
                getallen[i++] = getal;
        }
        Arrays.sort(getallen);
    }

    private boolean komtVoor(int element, int array[])
    {
        for (int getal : array)
            if (getal == element)
                return true;
        return false;
    }

    private int controleer(int gekozen[], int getrokken[])
    {
        int aantal = 0;

        for (int juistnr : getrokken)
            if (komtVoor(juistnr, gekozen))
                aantal++;

        return aantal;
    }

    private String geefOverzichtGewonnen(int nrsJuist[])
    {
        String uit = "";
        int i=0;
        for (int aantal : nrsJuist)
            uit += String.format("%d keer %d nummers juist%n", aantal, i++);
        return uit;
    }
    
    private String geefStatistieken(int[][] trekkingen)
    {
        final int AANTAL_BALLEN = 45;
        
        int[] voorkomens = new int[AANTAL_BALLEN];
        for (int[] eenTrekking : trekkingen)
            for (int getal : eenTrekking)
                voorkomens[getal-1]++;
        
        String uitvoer = "";
        int nr = 1;
        for (int voorkomen : voorkomens)
            uitvoer += String.format("Bal %d werd %d keer getrokken%n", 
                nr++, voorkomen);
        
        return uitvoer;
    }
}