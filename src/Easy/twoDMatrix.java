package Easy;

import java.util.Arrays;

// here we have been given a 2D matrix and a target, we have to find if the target element exist in the array
public class twoDMatrix {
    public static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 99;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
