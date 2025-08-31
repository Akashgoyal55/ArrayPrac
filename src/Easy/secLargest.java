package Easy;

import java.util.Arrays;
// Brute force - sort the array and traverse the array is reverse order
//public class secLargest {
//    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1};
//        int ans = findSecLar(arr);
//        System.out.println(ans);
//
//    }
//    static int findSecLar(int[] arr){
//        Arrays.sort(arr);
//
//        for(int i=arr.length-2; i>=0; i--){
//            if(arr[i]!=arr[arr.length-1]){
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//}

// Optimize solution - Traverse the array twice, first find the largest and second ignore the largest
public class secLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int ans = findSecLar(arr);
        System.out.println(ans);
    }

    static int findSecLar(int[] arr){

        int n = arr.length;
        int Max = arr[0];
        int secMax = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }

        // finding the second largest
        for (int i=1; i<n; i++){
            if(arr[i]>secMax && arr[i]!=Max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
