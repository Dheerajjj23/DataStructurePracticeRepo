package CollectionsInJava.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsPractice {
    public static void main(String[] args) {

        String arr[] = {"Hello", "World", "Java", "Programming"};
        List<String> list  = Arrays.asList(arr);
        List<String> names = new ArrayList<>();
        names.add("Dheeraj");
        names.add("Amit");
        names.add("Rohit");
        List<String> surnames = List.of("Joshi", "Sharma", "Singh", "Gupta", "Kumar");

        names.stream().distinct().forEach(System.out::println);
        names.addAll(surnames);
        names.addAll(List.of(arr)); //We can also add an array to the list by using the addAll() method and passing the array as an argument. This will add all the elements of the array to the list.
        names.toArray();
        System.out.println(names);
    }
}
