import java.util.Arrays;
public class practice {
    public static void sort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    

    public static void main(String[] args) {
        int nums[] = {3,6,2,1,};
        sort(nums);
        
        
        
        
        
    }
}

    

