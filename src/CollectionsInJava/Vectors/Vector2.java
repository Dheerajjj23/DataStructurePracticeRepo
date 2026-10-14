package CollectionsInJava.Vectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();


        Thread t1 = new Thread(() -> {;
            for (int i = 0; i < 1000; i++) {
                v1.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                v1.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(v1.size());
    }
}
