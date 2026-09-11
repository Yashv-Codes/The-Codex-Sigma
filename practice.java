import java.util.Arrays;
public class practice {
    public static void selection_sort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos] > nums[j])
                    minPos = j;
            }
            int temp = nums[minPos];
        }
        
        
         
        
    }
    

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        
        
    }
}

    

