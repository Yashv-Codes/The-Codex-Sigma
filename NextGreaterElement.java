import java.util.*;
public class NextGreaterElement {
    public static void Greater(int arr[], int[] nxtGreater){
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty())
                nxtGreater[i] = -1;
            else
                nxtGreater[i] = arr[s.peek()];
            
            s.push(i);
        }
    }

    public static void main(String[] args){
        int arr[] = {6, 8, 0, 1, 3};
        int nxtGreater[] = new int[arr.length];
        Greater(arr, nxtGreater);
        for(int i=0; i<)
    }
    
}
