/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects
{

    public static void main(String args[])
    {
        Cat Garfield = new Cat("Garfield");
        Cat PinkPanther = new Cat("Pink Panther");
        Cat Catwoman = new Cat("Catwoman");

        Garfield.setFavoriteFood("Lasagna");
        PinkPanther.setFavoriteFood("Salmon");
        Catwoman.setFavoriteFood("Black Sole");

        Garfield.setAge(8);
        PinkPanther.setAge(7);
        Catwoman.setAge(9);


    }

    public static boolean isOlder(Cat a, Cat b)
    {
        return a.getAge() > b.getAge();
    }

    public static void makeBestFriends(Cat a, Cat b)
    {
        a.setFavoriteFood("Friskies");
        b.setFavoriteFood("Friskies");
    }

    public static Cat makeKitten(Cat a, Cat b)
    {
        Cat c = new Cat(
                a.getName().substring(0, 3) + b.getName().substring(3, b.getName().length()));

        c.setAge(0);

        return c;
    }

    public static void adoption(Person p, Cat c)
    {
        if (c.getName().equals("Catwoman")){
            System.out.println("Catwoman will never be anyone's pet!");
        }
        else
        {
            c.setOwner(p);
        }
    }
    public static boolean isFree (Cat a) {
        return a.getOwner() == null;
    }
    public static boolean isSibling (Cat a, Cat b) {
        return a.getOwner().equals(b.getOwner());
    }

}
