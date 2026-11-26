import java.util.*;
public class practice {
    public static int trappingWater(int arr[]){
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i=1; i<arr.length; i++)
    }

    public static void main(String[] args){
        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
    }
}
