import java.util.Arrays;
public class practice{
    public static void reverse(int arr[]){
        int left = 0, right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
        
        System.out.println(Arrays.toString(arr));

    }
    
   
    
    
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 3, 9, 10, 7};
        reverse(arr);
        
        
        
        

    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

