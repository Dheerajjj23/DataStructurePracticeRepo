package CollectionsInJava.Vectors;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(10,7);
        vector.add(1);
        vector.add(1,2);
        vector.set(0, 5);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        System.out.println(vector.capacity());
    }
}
