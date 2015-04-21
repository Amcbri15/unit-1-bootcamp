/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals
{

    public static void main(String args[])
    {
        Person Andy = new Person();
        Andy.setCity("London");
        Andy.setName("Andrew");

        //        System.out.println(isOdd(4));
        //        System.out.println(isMultipleOf3(4));
        //        System.out.println(isOddAndIsMulitpleOf3(5));
        //        System.out.println(isOddAndIsMultipleOfThree2(9));
        //        fizzMultipleOfThree(4);
        //        System.out.println(isFromLondon(Andy));
        //        nameLength(Andy);
        System.out.println("Cigar party? " + cigarParty(50, false));
        System.out.println("Speeding penalty code: " + speedingTicket(65, true));
        System.out.println("Alarm for this day: " + alarmClock(5, false));
        System.out.println("Lottery result: " + lottery(2, 2, 2));
        System.out.println("Blackjack Results: " + blackJack(- 11, - 23));
        System.out.println("Evenly spaced? " + evenlySpaced(4,6,3));
    }

    public static boolean isOdd(int n)
    {
        return ! (n % 2 == 0);
    }

    public static boolean isMultipleOf3(int n)
    {
        return (n % 3 == 0);
    }

    public static boolean isOddAndIsMulitpleOf3(int n)
    {
        return isOdd(n) && isMultipleOf3(n);
    }

    public static boolean isOddAndIsMultipleOfThree2(int n)
    {
        return ! (n % 2 == 0) && n % 3 == 0;
    }

    public static void fizzMultipleOfThree(int n)
    {
        if(n % 3 == 0)
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(n);
        }
    }

    public static boolean isFromLondon(Person person)
    {
        return person.getCity().equals("London");
    }

    public static void nameLength(Person person)
    {
        if(person.getName().length() < 5)
        {
            System.out.println("Name is too short.");
        }
        else
        {
            System.out.println(person.getName());
        }
    }

    public static boolean cigarParty(int cigars, boolean weekend)
    {
        return ((cigars >= 40 && cigars <= 60) && ! weekend) || (cigars >= 40 && weekend);
    }

    public static int speedingTicket(int speed, boolean birthday)
    {
        int penalty = 0;

        if((speed > 60 && speed < 81 && ! birthday) || (speed > 65 && speed < 86 && birthday))
        {
            penalty = 1;
        }
        if((speed >= 81 && ! birthday) || (speed >= 86 && birthday))
        {
            penalty = 2;
        }
        return penalty;
    }

    public static String alarmClock(int dayOfWeek, boolean isVacation)
    {
        String time;
        if((dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5) && isVacation)
        {
            time = "10:00";
        }
        else if(dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5)
        {
            time = "7:00";
        }
        else if((dayOfWeek == 0 || dayOfWeek == 6) && ! isVacation)
        {
            time = "10:00";
        }
        else
        {
            time = "Off";
        }
        return time;
    }

    public static int lottery(int a, int b, int c)
    {
        if(a == b && b == c)
        {
            return 20;
        }
        else if((! (a == b) && (b == c)) || (a == b) || a == c)
        {
            return 10;
        }
        else
        {
            return 0;
        }
    }

    public static int blackJack(int a, int b)
    {
        if((a > 0 && b > 0) && (b <= 21) || (a > 0 && b > 0) && (a <= 21))
        {
            if((21 - a < 21 - b && a <= 21) || (b > 21 && a <= 21))
            {
                return a;
            }
            else
            {
                return b;
            }
        }
        else
        {
            return 0;
        }
    }

    public static boolean evenlySpaced(int a, int b, int c)
    {
        int small;
        int medium;
        int large;

        if(a < b && a < c && b < c)
        {
            small = a;
            medium = b;
            large = c;
        }
        else if(a < b && a < c && c < b)
        {
            small = a;
            medium = c;
            large = b;
        }
        else if(c < b && c < a && b < a)
        {
            small = c;
            medium = b;
            large = a;
        }
        else if(a < b && a > c)
        {
            small = c;
            medium = a;
            large = b;
        }
        else if(a < c && a > b)
        {
            small = b;
            medium = a;
            large = c;
        }
        else
        {
            small = b;
            medium = c;
            large = a;
        }

        return (large - medium) == (medium - small);
    }
}
