package LinearSearchQuestions;

import java.util.Scanner;

public class linearSearching {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 12,22,56};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        int result = linearSearch_(arr, key);
        if(result == -1){
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
    }
    }

    static int linearSearch_(int arr[], int key){

        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
