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

        return left_count > right_count ? left : right;
    }
    public static int count_majority(int arr[], int num, int si, int ei){
        int count = 0;
        for(int i=si; i<=ei; i++){
            if(arr[i] == num)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {}
        
    }
}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

