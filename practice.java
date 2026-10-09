public class practice{
    public static void quicksort(int arr[], int si, int ei){
        if(si >= ei)
            return;
        int pIdx = partition(arr, si, ei);
        quicksort(arr,si,pIdx-1);
        quicksort(arr,pIdx+1,ei);
    }

}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

