public class practice{
   
    public static int largest_num(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        return largest;

    }
    
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 5, 23, 3};
        System.out.println(largest_num(arr));
        
        

    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

