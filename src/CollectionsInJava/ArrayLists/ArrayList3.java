package CollectionsInJava.ArrayLists;

import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        //Another way to declare an ArrayList is by using Generics. It is a feature in Java that allows you to specify the type of objects that an ArrayList can hold. This provides type safety and eliminates the need for casting when retrieving elements from the list.

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);
//        try {
//            list.add(8);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }finally {
//            List.of(1,2,3,4,5).forEach(System.out::println);
//        }
        List<String> names = List.of("DHeeraj", "Kartik", "Amit", "Rohit");
        names.add("Sahil");
    }
}
