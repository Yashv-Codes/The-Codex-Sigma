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
        int left_count = count_majority(arr,left,si,ei);
        int right_count = count_majority(arr,right,si,ei);
    }
    public static int count_majority(int arr[], int num, int si, int ei){
        
    }
    
    
    

    public static void main(String[] args){
        
        

    }

}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

