package Easy;
import java.util.*;
//We have been given an array, find maximum product of a triplet in the array
public class maxTripletSum {
    public static void main(String[] args) {
        int[] arr = {10,3,5,6,20};
        int ans = findProduct(arr);
        System.out.println(ans);
    }
//    static int findProduct(int[] arr){
//        Arrays.sort(arr);
//
//        int n = arr.length;
//        return arr[n-1]*arr[n-2]*arr[n-3];
//    }

    static int findProduct(int[] arr){
        int n = arr.length;

        int firstMax = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if(arr[i]>firstMax){
                firstMax = arr[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>secondMax && arr[i]<firstMax){
                secondMax = arr[i];
            }
        }
        int thirdMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>thirdMax && thirdMax<secondMax && thirdMax<firstMax){
                thirdMax = arr[i];
            }
        }

        return firstMax * secondMax * thirdMax;
    }

}
