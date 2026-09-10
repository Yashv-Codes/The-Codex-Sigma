import java.util.Arrays;
public class practice {
    public static void bubble_sort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int swap = 0;
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0)
                return;
        }
        System.out.println(Arrays.toString(nums));
        
         
        
    }
    

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        bubble_sort(nums);
        // System.out.println(Arrays.toString(nums));
        
    }
}

    

