package practices;
;
import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("jerry");
        items.add("inem");
        items.add("zaza");
        items.add("kinzy");
        items.add("dami");
        items.add(2,"cephas");

        System.out.println(items);
        System.out.println("we have " + items.size() + " people in our list");
        System.out.println("Let's remove some whimps!!!");

        items.remove("jerry");
        System.out.println(items);
        System.out.println("we have " + items.size() + " people in our list");

        items.remove(2);
        System.out.println(items);
        System.out.println("we have " + items.size() + " people in our list");
        System.out.println("before cloning");
        System.out.println(items.clone());
        System.out.println("we have " + items.size() + " people in our list");
        System.out.println(items.contains("inem"));
        System.out.println(items.contains("zaza"));
        System.out.println(items.lastIndexOf("kinzy"));
        items.add("kinzy");
        System.out.println(items);
        System.out.println(items.lastIndexOf("kinzy"));

        List<Integer> numbers =Arrays.asList(1,2,3,4,5,6);
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
}

}






