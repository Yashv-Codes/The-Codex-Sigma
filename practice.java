import java.util.Arrays;
public class practice{
    public static int inversion_count(int arr[], int count){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j])
                    count++;
            }
        }
        return count;

    }
    
    public static void main(String[] args){
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println()
        
        
    }
}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

