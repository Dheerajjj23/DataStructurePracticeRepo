package Basic;

import java.util.Arrays;

public class test123 {
    public static void main(String[] args) {
        int arr[][] = {{0,0,0,1,1,1}, {0,0,0,0,0,1,1}, {0,0,1,1,1,1,1}};
        int maxno = 0;
        int row =-1;
        System.out.println("arr.length " + arr.length + ", arr[0].length " + arr[0].length);

        int mid  = (0+arr[0].length-1)/2;
        System.out.println(mid + " " + arr[0][mid]);


//        for(int i = 0; i<=arr.length-1; i++){
//       int maxcountofone = 0;
//            for(int j= 0; j<=arr[i].length-1; j++){
//
//               if(arr[i][j]==1){
//                      maxcountofone++;
//               }
//            }
//            if(maxcountofone>=maxno){
//            maxno = maxcountofone;
//            row = i;
//            }
//
//        }

//                System.out.print("maxno" + maxno+ "row" + row);
            }

}
