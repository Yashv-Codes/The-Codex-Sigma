import java.util.Arrays;
public class practice{
    public static int majority_element(int arr[], int si, int ei){
        if(si == ei)
            return arr[si];
        int mid = si+(ei-si)/2;
        int left = majority_element(arr, si, mid);
        int right = majority_element(arr, mid+1, ei);
        if(left == right)
            return left;
        
    }
    
    
    

    public static void main(String[] args){
        
        

    }

}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

