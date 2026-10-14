package GenericsInJava;

import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {
        GenericsEx<Integer> g1= new GenericsEx<>();
        g1.setObj(5);

        int s = g1.getObj();
        System.out.println(g1.getObj());

        Pair<Integer, String> p1 = new Pair<>(1, "Dheeraj");
        Pair<Integer, String> p2 = new Pair<>(2, "Rajat");
        Pair<Integer, String> p3 = new Pair<>(3, "Amit");
        System.out.println(p1.getKey() + ": " + p1.getValue());
    }
}
