import java.util.*;
public class practice{
    public static int binary_search(int nums[], int key){
        int si = 0, ei = nums.length-1;
        while(si <= ei){
            int mid = si+(ei-si)/2;
            if(nums[mid] == key)
                return mid;
            else if(key < nums[mid])
                end = mid-1;
        }
    }
    
    
    public static void main(String[] args){
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        
        
    }
}

    

