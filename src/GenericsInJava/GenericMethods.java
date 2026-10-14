package GenericsInJava;

public class GenericMethods{

    public static <T> void printArray(T[] arr){
        for(T element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] arr, int start, int end){
        for(int i=start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static <T> String returString(T[] arr){
        StringBuilder sb = new StringBuilder();
        for(T element: arr){
            sb.append(element).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"Hello", "World", "Generics"};

        printArray(intArr);
        printArray(strArr);
    }
}
