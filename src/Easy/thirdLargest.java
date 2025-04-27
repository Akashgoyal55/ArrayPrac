package Easy;

import java.util.Arrays;

public class thirdLargest {
//    public static int thirdLarge(int[] arr){
//
//        Arrays.sort(arr);
//        int n = arr.length;
//
//        return arr[n-3];
//    }

//    public static int thirdLarge(int[] arr){
//        int firstLar = -1;
//        int secondLar = -1;
//        int thirdLar = -1;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>firstLar){
//                firstLar  = arr[i];
//            }
//        }
//
//        // loop to find the second largest
//        for (int i=0; i<arr.length; i++){
//            if(arr[i]>secondLar && arr[i]<firstLar){
//                secondLar = arr[i];
//            }
//        }
//        // third loop to find the third-largest item in the array
//        for (int i=0; i<arr.length; i++){
//            if(arr[i]>thirdLar && arr[i]<secondLar){
//                thirdLar = arr[i];
//            }
//        }
//        return thirdLar;
//    }


    // In just one loop pass, using three variables
    public static int thirdLarge(int[] arr){
        int n = arr.length;

        int firstLar = -1;
        int secondLar = -1;
        int thirdLar = -1;

        for (int i=0; i<n; i++){
            if(arr[i]>firstLar){
                thirdLar = secondLar;
                secondLar = firstLar;
                firstLar = arr[i];
            }
            else if(arr[i]>secondLar){
                thirdLar = secondLar;
                secondLar = arr[i];
            }else if(arr[i]>thirdLar){
                thirdLar = arr[i];
            }
        }
        return thirdLar;
    }


    public static void main(String[] args) {
        int[] arr = {1,14,2,16,10,20};
        System.out.println(thirdLarge(arr));
    }
}
