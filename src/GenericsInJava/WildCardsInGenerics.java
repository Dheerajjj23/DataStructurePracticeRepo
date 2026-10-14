package GenericsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardsInGenerics {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        getFirst(list1);

    }

    public static void getFirst(ArrayList<? super Integer> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
