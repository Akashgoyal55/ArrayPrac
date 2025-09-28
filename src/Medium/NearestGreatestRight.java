package Medium;

import java.util.*;

public class NearestGreatestRight {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        List<Integer> ans = NGR(arr);
        System.out.println(ans);
    }

    static List<Integer> NGR(int[] arr){
        //creating empty list and stack
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        //traverse the array in reverse order
        for(int i=arr.length-1; i>=0; i--){

            //1st condition - when stack is empty
            if(stack.isEmpty()){
                list.add(-1);
            }
            //2nd condition - when the peek element is greater the current element
            else if(stack.peek()>arr[i]){
                list.add(stack.peek());
            }
            //3rd condition - when the peek element is smaller than the current element - pop until greater found
            else{
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    list.add(-1);
                }else{
                    list.add(stack.peek());
                }
            }
            // push current element on to the stack for future comparison
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}
