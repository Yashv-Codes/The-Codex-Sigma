
public class practice{
    public static int binary_search(int nums[], int key){
        int si = 0, ei = nums.length-1;
        while(si <= ei){
            int mid = si+(ei-si)/2;
            if(nums[mid] == key)
                return mid;
            else if(key < nums[mid])
                ei = mid-1;
            else{
                si = mid+1;
            }
        }
        return -1;
    }
    public static void reverse(int nums[]){
        int si = 0, ei = nums.length-1;
        while(si < ei){
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++; ei--;
        }
    }
    public static void pairs(int nums[]){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                System.out.print("("+nums[i]+","+nums[j]+")"+" ");
                count++;
            }
            System.out.println();
            
        }
        System.out.println("Total pairs = "+count);

    }
    public static void subarrays(int nums[]){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print("("+nums[k]+")"+" ");
                    count++;
                }
                
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args){
        int nums[] = {2, 4, 6, 8, 10};
        subarrays(nums);
        
        
    }
}

    

