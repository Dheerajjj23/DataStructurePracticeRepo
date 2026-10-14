package CollectionsInJava.Comparable;


import java.util.ArrayList;
import java.util.Comparator;

class MyStringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jay");
        names.add("Dheeraj");
        names.add("Amit");
        names.add("Rohit");
        names.sort(new MyStringComparator());
        System.out.println(names);
    }
}
