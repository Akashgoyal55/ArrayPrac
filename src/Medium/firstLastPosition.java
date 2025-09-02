package Medium;

import java.util.Arrays;

// Here we have been given an array, and we have to find the first and last position of the target element
//public class firstLastPosition {
//    public static void main(String[] args) {
//        int[] arr = {5,7,7,8,8,10};
//        int target = 8;
//
//        int[] ans = firLastPosition(arr, target);
//        System.out.println(Arrays.toString(ans));
//    }
//
//    static int[] firLastPosition(int[] arr, int target){
//
//        int first = -1;
//        int last = -1;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==target){
//                //check if this is the first occurrence
//                if(first==-1){
//                    first = i;
//                }
//                last = i;
//            }
//        }
//        return new int[]{first, last};
//    }
//}

public class firstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;

        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] arr, int target){
        int first = first(arr, target);
        int last = last(arr, target);

        return new int[]{first, last};
    }

    // find the first occurrence
    static int first(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                ans = mid; //possible answer found
                end = mid-1; //check on the left side if target occurs there
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    // function to find the last occurrence of the target element
    static int last(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                ans = mid; //one possible answer is found now check on the right hand side of the mid
                start = mid+1;

            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

}