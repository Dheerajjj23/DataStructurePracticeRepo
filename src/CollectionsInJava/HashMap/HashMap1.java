package CollectionsInJava.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {

        //HashMap store the data in key-value pair. It is not synchronized and it allows null key and null values. It is a part of collection framework and it extends AbstractMap class. It implements Map interface. It is based on hashing technique.
        HashMap<Integer, String> map = new HashMap<>(8, 0.5f);
        map.put(1, "Dheeraj");
        map.put(2, "Amit");
        map.put(3, "Rohit");
        map.put(4, null);
        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.get(7));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Dheeraj"));


        Set<Integer> set1= map.keySet();
        System.out.println(set1);

        Set<Map.Entry<Integer, String>> entries1 = map.entrySet();

        for(Map.Entry<Integer, String> i: entries1){
            System.out.println(map.get(i.getKey()));
        }


        for(Integer key: set1){
            System.out.println(map.get(key));
        }
        System.out.println(map.getOrDefault(4, "Not Found"));
        System.out.println(map);
//        System.out.println(map.hashCode());
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(map.get(2).hashCode());
        //entryset is used to get the key and value both at the same time in a set of map entries. Each entry contains a key and its corresponding value. It allows us to iterate through the map and access both keys and values together, which can be more efficient than using keySet() and then calling get() for each key to retrieve its value.
    }
}
