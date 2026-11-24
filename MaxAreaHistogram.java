import java.util.*;
public class MaxAreaHistogram {
    public static int maxArea(int[] height){
        int n = height.length;
        int maxArea = 0;
        int nsr[] = new int[n]; // Next Smaller Right
        int nsl[] = new int[n]; // Next Smaller Left

        // NSR
        Stack<Integer> s = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty())
                nsr[i] = 
        }
    }
    
}
