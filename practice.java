public class practice{
    public static int binary_search(int arr[], int key){
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == key)
                return mid;
            else if(key < arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
   
    
    
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binary_search(arr,5));
        
        
        

    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

