import java.util.Arrays;
public class practice {
    public static void insertion_sort(int nums[]){
        for(int i=1; i<nums.length-1; i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev>=0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    
        
        System.out.println(Arrays.toString(nums));
    }
    

    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        
        
        
        
    }
}

    

