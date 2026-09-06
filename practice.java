import java.util.*;
public class practice{
    public static void maxSubarraysum(int nums[]){
        int prefix[] = new int[nums.length];
        for(int i=0; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        
    }
    
    
    
    public static void main(String[] args){
        int nums[] = {2, 4, 6, 8, 10};
        
        
        
    }
}

    

