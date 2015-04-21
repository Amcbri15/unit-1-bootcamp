import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods
{

    public static void main(String args[])
    {
        System.out.println(calculateSquare(7));
        System.out.println(calculateSquareRoot(49));
        System.out.println(toLowerCase("HELLO, WORLD!"));
        System.out.println(isMultiple(2, 5));
        prettyInteger(10);
        System.out.println(random(5, 10));
    }

    public static int calculateSquare(int n)
    {
        return n * n;
    }

    public static double calculateSquareRoot(int n)
    {
        return Math.sqrt(n);
    }

    public static String toLowerCase(String s)
    {
        return s.toLowerCase();
    }

    public static boolean isMultiple(int num1, int num2)
    {
        return num2 % num1 == 0;
    }

    public static void prettyInteger(int n)
    {
        String front = "";
        String back = "";
        for(int i = 0; i < n; i++)
        {
            front += "*";
            back += "*";
        }
        System.out.println(front + " " + n + " " + back);

    }

    public static int random(int n, int n2)
    {
        Random rand = new Random();

        long range = (long)n2 - (long)n + 1;
        long fraction = (long)(range * rand.nextDouble());

        return (int)(fraction + n);
    }
}
