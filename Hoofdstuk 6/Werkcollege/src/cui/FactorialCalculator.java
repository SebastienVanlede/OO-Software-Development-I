package cui;

public class FactorialCalculator
{
    public static void main(String args[])
    {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        factorialCalculator.displayFactorials();
    } // einde main
    
    public void displayFactorials()
    {
            System.out.printf("%d! = %d%n", 5, factorial(5));
    } // einde displayFactorials

    public long factorial(long number)
    {
        if (number == 0) //basis case voorwaarde waarbij recursie stopt
            return 1;
        else
            return number * factorial(number - 1);
    }  // einde factorial
}
