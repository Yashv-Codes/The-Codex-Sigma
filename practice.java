import java.util.*;
public class practice{
    public static int maxSubarraysum(int nums[]){
        int currsum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=0; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                currsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(currsum < maxSum)
                maxSum = currsum;
        }
        
        
    }
    
    
    
    public static void main(String[] args){
        int nums[] = {2, 4, 6, 8, 10};
        
        
        
        
    }
}

    

