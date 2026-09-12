import java.util.Arrays;
public class practice {
    public static void sort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos] > nums[j])
                    minPos = j;
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
    

    public static void main(String[] args) {
        int nums[] = {3,6,2,1,8,7,4,5,3,1};
        sort(nums);
        
        
        
        
        
    }
}

    

