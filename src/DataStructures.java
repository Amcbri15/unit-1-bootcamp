import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures
{

    public static void main(String args[])
    {

        Cat aCat = new Cat("Acat");
        Cat bCat = new Cat("Bcat");
        Cat cCat = new Cat("Ccat");
        Cat dCat = new Cat("Dcat");
        Cat eCat = new Cat("Ecat");

        ArrayList<Cat> Cats = new ArrayList<Cat>();

        Cats.add(aCat);
        Cats.add(bCat);
        Cats.add(cCat);
        Cats.add(dCat);
        Cats.add(eCat);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(0);
        nums.add(6);

//        for(int i = 0; i < Cats.size(); i++)
//        {
//            System.out.println(Cats.get(i).getName());
//        }

        // mostFrequentElement(nums);

        HashMap<String, Integer> pod = new HashMap<String, Integer>();

        pod.put("Anthony", 28);
        pod.put("Luke Lee", 29);
        pod.put("Joshelyn Vivas", 21);
        pod.put("Raynaldie Acevedo", 26);
        pod.put("Vanice Yee", 27);
        pod.put("Hoshiko Oki", 28);

        String name;
        int age;

        for (String key : pod.keySet()) {
            name = key;
            age = pod.get(key);
            System.out.println(name + " is " + age + " years old!");
        }

        System.out.println("Can rent car? " + canRentACar(pod));
    }
                                                //  <String> This would need to be changed to iterate using strings.
    public static void mostFrequentElement(ArrayList<Integer> nums)
    {        //<String,                                 <String,
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();


        // My initial attempt
        //        for (int i = 0; i < nums.size(); i++) {
        //
        //            int current = Counts.get(i);
        //
        //
        //            if (Counts.containsKey(nums.get(i))){
        //                numCount = Counts.get(nums.get(i)) + 1;
        //                Counts.put(nums.get(i), numCount);
        //            }
        //        }
        //        for (int i = 0; i < Counts.size(); i++) {
        //            mostFrequent = Counts.get(i);
        //            if ()
        //        }
        Integer keyCount; //(Sidenote) keyCount needs to be Integer here because int cannot be null and the initial iteration would be null.
        for(int i = 0; i < nums.size(); i++)
        {//String
            int key = nums.get(i);
            keyCount = countMap.get(key);

            if(keyCount == null)
            {
                keyCount = 1;
            }
            else
            {
                keyCount++;
            }
            countMap.put(key, keyCount);
        }
    //String                  ""
        int mostFrequentKey = 0;
        int mostFrequentKeyCount = 0;
        //   String
        for(Integer key : countMap.keySet())
        {
            if(countMap.get(key) > mostFrequentKeyCount){
                mostFrequentKey = key;
                mostFrequentKeyCount = countMap.get(key);
            }
        }
        System.out.println("Most frequent key: " + mostFrequentKey + " occures " + mostFrequentKeyCount + " times.");
    }
    public static boolean canRentACar (HashMap<String, Integer> pod) {
        int isOldEnough = 0;
        for (String key : pod.keySet()) {
            if (pod.get(key) >= 25)
                isOldEnough++;
        }
        return isOldEnough > 0;
    }
}
