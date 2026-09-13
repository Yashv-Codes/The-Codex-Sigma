import java.util.Arrays;
public class practice {
    public static int search(int nums[], int tar){
        int si = 0, ei = nums.length-1;
        while(si <= ei){
            int mid = si+(ei-si)/2;
            if(tar == nums[mid])
                return mid;
            else if(tar < nums[mid])
                ei = mid-1;
            else
                si = mid+1;
        }
        return -1;
        
        
    }
    

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int tar = 2;
        
        
        
        
        
        
        
    }
}

    

