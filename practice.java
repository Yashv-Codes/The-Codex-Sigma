import java.util.Arrays;
public class practice{
    public static void subarray_sum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
    
    
    
   
    public static void main(String[] args){
        int arr[] = {2, 3, 4, 5};
        subarray_sum(arr);
        

        
        
        
        
        

    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

