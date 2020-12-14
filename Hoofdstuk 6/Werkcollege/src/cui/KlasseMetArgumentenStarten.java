package cui;

public class KlasseMetArgumentenStarten
{
    public static void main(String[] args)
    {
        // controleer of er 3 strings werden doorgegeven aan de methode main
        if (args.length != 3)
        {
            System.out.printf(
                    "Error: Please re-enter the entire command, including%n"
                    + "an array size, initial value and increment.%n");
        } 
        else
        {
            // vraag het eerste element van de array args op
            int arrayLength = Integer.parseInt(args[ 0]);
            int array[] = new int[arrayLength]; // creatie van een array

            // Vraag het tweede en derde element van de array args op
            int initialValue = Integer.parseInt(args[ 1]);
            int increment = Integer.parseInt(args[ 2]);
            
            // bereken de waarde van elk element van de array “array”
            for (int counter = 0; counter < array.length; counter++)
            {
                array[ counter] = initialValue + increment * counter;
            }

            System.out.printf("%s%8s%n", "Index", "Value");

            // geef de index en de waarde van elk element weer
            for (int counter = 0; counter < array.length; counter++)
            {
                System.out.printf("%5d%8d%n", counter, array[ counter]);
            }
        } // end else
    }
}
