public class BinarySearching {
    public static void main(String[] args) {

    }
    static int BinarySearch_(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
