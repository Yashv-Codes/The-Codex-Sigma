import java.util.*;
public class practice{
    public static int linear_search(String menu[], String key){
        for(int i=0; i<menu.length; i++){
             if(menu[i] == key)
                return i;
        }
        return -1;
    }
    public static int largest_num(int nums[], int largest){
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest)
                largest = nums[i];
        }
        return largest;
    }
    public static int smallest_num(int nums[], int smallest){
        for(int i=0; i<nums.length; i++){
            if(smallest > nums[i])
                nums[i] = smallest;
            }
    }

   
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int largest = nums[0];
        int smallest = nums[1];
        System.out.println("Largest num = "+largest_num(nums,largest));
        // String menu[] = {"noodles", "pav bhaji", "idli sambhar", "samosa", "butter paneer"};
        // String key = "puchka";
        // int index = linear_search(menu,key);
        // if(index == -1)
        //     System.out.println("Key not found");
        // else{
        //     System.out.println("Key found at index: "+index);
        // }
        
        sc.close();
    }
}
    

