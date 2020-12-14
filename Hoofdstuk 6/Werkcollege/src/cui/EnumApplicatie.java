package cui;

import java.security.SecureRandom;
import java.util.EnumSet;
import util.Dag;
import util.Dag2;

public class EnumApplicatie 
{
    public static void main(String[] args) {

        System.out.println("Dagen van de week");
        for (Dag d : Dag.values()) 
        {
            System.out.println(d.name()); // name() is altijd beschikbaar!
          // of: System.out.println(d);
        }

        System.out.println("Lang weekend");
        for (Dag d : EnumSet.range(Dag.VRIJDAG, Dag.ZONDAG)) 
        {
            System.out.println(d.name());
        }
        
        for (Dag2 d : Dag2.values()) 
        {
            System.out.println(String.format("Dag %d: %s", d.getDagNr(), d.name()));
        }
        
        for (Dag2 d : Dag2.values()) 
        {
            System.out.println(String.format("Dag %d: %s", d.getDagNr(), d));
        }

        SecureRandom s = new SecureRandom();
        int getal;
        Dag d;

        for (int i = 0; i < 10; i++) 
        {
            getal = s.nextInt(7);
            d = Dag.values()[getal];// 0 - 6
            System.out.println(String.format("Dagnummer %d: %s", getal + 1, d.name()));
        }

        d = Dag.MAANDAG;

        if (d == Dag.MAANDAG) 
        {
            System.out.println("Eerste dag van de werkweek.");
        } else 
        {
            System.out.println("Dit is niet de eerste dag van de werkweek.");
        }

        d = Dag.values()[3];
        System.out.println(d);
    }
}