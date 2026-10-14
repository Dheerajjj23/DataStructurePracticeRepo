package PracticeQuestions;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,3,1,32,3};
        int target = 2;
        int start = 1;
        int end = 5;
        int result = findInRange(arr, target, start, end);
        System.out.println("Index of " + target + " in range [" + start + ", " + end + "]: " + result);
    }
    static int findInRange(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
