package PracticeQuestions;

public class Practice2 {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        int key = 3;
        int result = linearSearch1(arr, key);
        if(result == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int linearSearch1(int[] arr, int integer){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == integer){
                return i;
            }
        }
        return -1;

    }
}
