package Easy;
import java.util.HashSet;

public class remDup {
//    public static int removeDuplicates(int[] arr){
//        // we don't need a count so instead of using a map, we can use a hashset which allow us to store unique elements
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0; i<arr.length; i++){
//            set.add(arr[i]);
//        }
//        return set.size();
//    }
    public static int removeDuplicates(int[] arr){
        // let's solve it without using any extra space in O(1)
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
