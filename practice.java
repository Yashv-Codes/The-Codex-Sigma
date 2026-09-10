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
                }
                swap++;
                else if(swap == 0)
                    return;

            }
        }
        
         
        
    }
    

    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        bubble_sort(nums);
        
    }
}

    

