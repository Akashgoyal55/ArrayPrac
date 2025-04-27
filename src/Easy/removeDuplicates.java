package Easy;

import java.util.ArrayList;

public class removeDuplicates {
    public static ArrayList<Integer> removeDupl(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    j = j+1;
                }else{
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4,5,5};
        System.out.println(removeDupl(arr));
    }
}
