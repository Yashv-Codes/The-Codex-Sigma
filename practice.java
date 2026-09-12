import java.util.Arrays;
public class practice {
    public static void sort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int minPos = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(minPos > nums[j])
                    minPos = nums[j];
            }
            int temp = minPos;
            minPos = 
        }
        System.out.println(Arrays.toString(nums));
    }
    

    public static void main(String[] args) {
        int nums[] = {3,6,2,1,8,7,4,5,3,1};
        sort(nums);
        
        
        
        
        
    }
}

    

