package LinearSearchQuestions;

public class SearchingInRange {
    public static void main(String[] args) {

    }
    static int searchInRange(int arr[], int key, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
