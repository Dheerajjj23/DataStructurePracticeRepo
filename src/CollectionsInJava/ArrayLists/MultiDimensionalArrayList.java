package CollectionsInJava.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {

        List<ArrayList<Integer>> multiDimList = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();
        row.add(1);
        row.add(2);
        row.add(3);

        column.add(1);
        column.add(2);
        column.add(3);

        multiDimList.add(row);
        multiDimList.add(column);

        System.out.println(multiDimList);
//        for(ArrayList<Integer> list : multiDimList) {
//            for(Integer num : list) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
        // Another way to print the multi-dimensional ArrayList is by using nested for loops. The outer loop iterates through each row of the multi-dimensional ArrayList, while the inner loop iterates through each element in the current row and prints it.
        for(int i = 0; i< multiDimList.size(); i++){
            for(int j=0;j< multiDimList.get(i).size(); j++){
                System.out.print(multiDimList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
