import java.util.*;
public class practice{
    public static int linear_search(int nums[], int key){
        for(int i=0; i<nums.length; i++){
             if(nums[i] == key)
                return i;
        }
        return -1;
    }

   
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int nums[] = {2, 4, 6, 8, 10, 12, 14};
        String menu[] = {"noodles", "pav bhaji", "idli sambhar",}
        int key = 10;
        System.out.println(linear_search(nums,key));
        
        sc.close();
    }
}
    

