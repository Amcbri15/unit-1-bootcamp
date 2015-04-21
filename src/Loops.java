/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops
{

    public static void main(String args[])
    {

        // printOneThroughTen();
        // print1Through10();
        // printOneThroughN(13);
        // printTwoThroughN(29);
        // sumOf1Through10();
        // sumOf1ThroughN(10000);
        // printStringNTimes("Fubar", 5);
        System.out.println(tenthFibonacci(10));

    }

    public static void printOneThroughTen()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }

    public static void print1Through10()
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }

    public static void printOneThroughN(int n)
    {
        if(n < 1)
        {
            System.out.println("Your number is too low.");
        }

        for(int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }

    public static void printTwoThroughN(int n)
    {
        if(n < 2)
        {
            System.out.println("Your number is too low.");
        }

        for(int i = 2; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void sumOf1Through10()
    {
        int sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sumOf1ThroughN(int n)
    {
        int sum = 0;
        if(n < 1)
        {
            System.out.println("Your number is too low.");
        }

        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printStringNTimes(String string, int n)
    {
        if(n < 0)
        {
            System.out.println("");
        }
        // Exercise 8
        for(int i = 0; i < n; i++)
        {

            System.out.print(string);

        }
        System.out.println("\n");
        //Exercise 9
        for(int i = 0; i < n; i++)
        {

            System.out.print(string + string);

        }
    }

    public static int tenthFibonacci(int n)
    {
        int fib1 = 0;
        int fib2 = 1;
        int fibonacci;
        int sum = 1;

        /* Prints the first ten fibonacci numbers (starting from 1)

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(fibonacci);
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;

        }
        */

        // Takes the parameter n and uses it in a loop starting from the second position in the fibonacci sequence (starting from 0)
        for(int i = 2; i <= n; i++)
        {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;

            sum += fibonacci;
        }

        return sum;
    }
}
