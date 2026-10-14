package CollectionsInJava.LinkedListsInJava;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> namesToBeRemoved = new LinkedList<>(Arrays.asList("Dheeraj", "Rohit"));
        list.add("Jay");
        list.add("Dheeraj");
        list.add("Amit");
        list.add("Rohit");

        list.addFirst("Hello");
        list.addLast("World");
        list.remove(2); //we can also provide a user defined condition to remove a specific element from the list. For example, we can remove all the elements that start with a specific letter or we can remove all the elements that are greater than a specific value.
        list.removeAll(namesToBeRemoved); //we can also remove all the elements from the list by using the removeAll() method. This will remove all the elements from the list and the list will be empty.

        System.out.println(list.getLast());
    }
}
