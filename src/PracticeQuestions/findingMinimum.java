package PracticeQuestions;

public class findingMinimum {
    public static void main(String[] args) {
        int arr [] = {1, 2, 20, 0, 5};
        int result = findMinimun(arr);
        System.out.println("Minimum element in the array is: " + result);
    }
    static int findMinimun(int[] arr){
        int min = arr[0];
        for(int i = 0; i<= arr.length-1;i++ ){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
