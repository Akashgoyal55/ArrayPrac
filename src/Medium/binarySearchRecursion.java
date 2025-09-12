package Medium;

/*
Binary search using recursion
An array and target element is given
We have to find the index of the target element, return -1 if not using recursion
 */
public class binarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9,12,15};
        int target = 9;

        int ans = search(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end){

        //base condition
        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]<target){
            return search(arr, target, mid+1, end);
        }
        return search(arr, target, start, mid-1);
    }
}

