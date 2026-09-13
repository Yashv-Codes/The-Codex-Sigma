import java.util.Arrays;
public class practice {
    public static int largest(int nums[]){
        int largest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0)
                return 0;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest)
                largest = nums[i];
        }
        return largest;
        
        
        
    }
    

    public static void main(String[] args) {
        int nums[] = {-2,-5,-8,-3,-13};
        System.out.println(largest(nums));
        
        
        
        
        
        
        
        
    }
}

    

