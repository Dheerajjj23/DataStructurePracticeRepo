package CollectionsInJava.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsInJava {
    public static void main(String[] args) {

        //The initial capacity of the array list is 10 but it can grow dynamically as we add more elements to it. When the number of elements exceeds the initial capacity, the array list will automatically resize itself to accommodate the new elements.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dheeraj");
        list1.add("Kartik");
        list1.add("Vinamra");
        list1.add("Satyarth");

        list1.get(2); //method to get the value at the index 4 but it will throw an error because there is no index 4 in the list

        System.out.println(list1.size());//method to get the size of the list

        System.out.println(list1);

        for(String name: list1){
            System.out.println(name);
        }

        List<String> names = List.of("Rajat", "Rahul", "Pankaj", "Amit"); // this method will create a immutable list.

        names.add("Dheeraj");

        list1.remove(2);//method to remove the value at the index 2

        list1.add(2,"Tushar");//method to add a value at the index 2
        list1.set(2, "Pratham");//method to set a value at the index 2 will replace the existing value at the index 2
        list1.trimToSize();//method to trim the capacity of the list to the current size of the list. This can be useful to save memory if you know that you won't be adding any more elements to the list.


        System.out.println(list1.contains("Dheeraj"));//method to check if the list contains a specific value
    }
}
