package CollectionsInJava.ArrayLists;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
    public static void main(String[] args) {
        //Whenever we perform any read operation on the list, it will return the reference of the original list. Whenever we perform any write operation on the list, it will create a new copy of the original list and perform the write operation on that new copy. After performing the write operation, it will return the reference of the new copy of the list.
        //This should be used when we have more read operations than write operations on the list. It is thread-safe and can be used in concurrent programming.
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        for(Integer num : list) {
            System.out.println(num);
            if(num.equals(3)){
                list.add(3,6);
                System.out.println("Added a new number while iterating through the list");
            }
        }
        System.out.println(list);
    }
}
