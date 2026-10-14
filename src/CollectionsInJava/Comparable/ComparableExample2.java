package CollectionsInJava.Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparableExample2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jay");
        names.add("Dheeraj");
        names.add("Amit");
        names.add("Rohit");
        names.sort(Comparator.comparingInt(String::length));

        for(String name: names){
            System.out.println(name);
            if (names.contains("Amit")) {
                names.add("Sumit");
            }
        }
        System.out.println(names);
    }
}
