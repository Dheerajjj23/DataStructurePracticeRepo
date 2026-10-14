package Basic;

import java.util.ArrayList;
import java.util.List;

public class basic1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");

        for(Object obj : list){
            System.out.println(obj);
        }

        String name = null;

        System.out.println(name.length());
    }
}
