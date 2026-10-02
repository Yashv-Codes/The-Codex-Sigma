public class practice{
   
    public static int smallest_num(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            smallest = Math.max(smallest, arr[i]);
        }
        return smallest;

    }
    
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 5, 23, 3};
        System.out.println(smallest_num(arr));
        
        

    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

