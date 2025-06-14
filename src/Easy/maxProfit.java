package Easy;
import java.util.*;
public class maxProfit {
//    public static int maxiProfit(int[] arr){
//        // Brute force - i = buy , j = sell
//        int maxProfit = 0;
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                int profit = arr[j]-arr[i];
//                if(profit>maxProfit){
//                    maxProfit = profit;
//                }
//            }
//        }
//        return maxProfit;
//    }

    public static int maxiProfit(int[] arr){
        //we will keep the track of min found so far
        int minItem = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<minItem){
                minItem = arr[i];
            }else if(arr[i]-minItem>maxProfit){
                maxProfit = arr[i]-minItem;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,5};
        System.out.println(maxiProfit(arr));
    }
}
