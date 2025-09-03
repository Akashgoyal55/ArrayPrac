package Medium;
import java.util.*;
// Cyclic sort - whenever the range is given from 1 to N, then apply cyclic sort
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSorting(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;

            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
