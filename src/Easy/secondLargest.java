package Easy;

import java.util.Arrays;

public class secondLargest {
//    public static int secLargest(int[] arr){
//        Arrays.sort(arr);
//        int n = arr.length;
//        // start from n-2 and traverse reverse
//        for (int i=n-2; i>=0; i--){
//            if(arr[i]!=arr[n-1]){
//                return arr[i];
//            }
//        }
//        return -1;
//    }

    public static int secLargest(int[] arr){
        int max = -1;
        int secondMax = -1;
        // first loop to find the largest element
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // second loop to find the second-largest element
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }


    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,1};
        System.out.println(secLargest(arr));
    }
}
