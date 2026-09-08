import java.util.*;
public class practice{
    public int subarrsum(int nums[]){
        int currsum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currsum += nums[i];
            if(currsum < 0)
                currsum = 0;
            maxSum = Math.max(currsum, maxSum);
        }
        return maxSum;
    }
    

        
        
        
    
    
    
    
    public static void main(String[] args){
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(subarrsum(nums));
        
        
        
        
    }
}

    

