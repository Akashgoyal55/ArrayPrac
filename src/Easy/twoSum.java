package Easy;
// Here we have been given an array and, we have to find the index of two number whose sum gets equal to the target element

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
//    public static int[] sumTwo(int[] arr, int target){
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] + arr[j]==target){
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }

    //optimize solution using hashmap
    public static int[] findTwoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }


    public static void main(String[] args) {
        int[] arr = {4,2,6,8,9};
        int target = 11;
        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }
}
