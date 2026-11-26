import java.util.*;
public class practice {
    public static int trappingWater(int arr[]){
        int n = arr.length;
        Stack<Integer> left = new Stack<>();
        left.push(arr[0]);
        for(int i=1; i<n; i++){
            left.push(Math.max(arr[i], left.peek()));
        }
        Stack<Integer> right = new Stack<>();
        right.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            right.push(Math.max(arr[i], right.peek()));
        }
        Stack<Integer> rightAligned = new Stack<>();
        while(!right.isEmpty()){
            rightAligned.push(right.pop());
        }
        int trapped_water = 0;
        for(int i=n-1; i>=0; i--){
            int waterlvl = Math.min(left.pop())
        }
    }

    public static void main(String[] args){
        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
    }
}
