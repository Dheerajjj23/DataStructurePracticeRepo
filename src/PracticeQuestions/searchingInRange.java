package PracticeQuestions;

public class searchingInRange {
    public static void main(String[] args) {

    }
    static int searchInRange(int[] arr, int target, int start, int end){
        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
