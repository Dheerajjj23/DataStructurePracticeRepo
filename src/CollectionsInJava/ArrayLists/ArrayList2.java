package CollectionsInJava.ArrayLists;

import java.util.ArrayList;
import java.util.Optional;


public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);

        list.add(1);
        list.add("Dheeraj Joshi");
        list.add(3.14);
        list.add(true);

        for(Object value: list){
            System.out.println(value);
        }

        System.out.println(list);
    }
}
