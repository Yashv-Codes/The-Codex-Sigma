// import java.util.Arrays;
public class practice{
    public static int occurence(int arr[], int i, int key){
        if(i == arr.length)
            return -1;
        int isFound = occurence(arr,i+1,key);
        if(isFound == -1 && arr[i] == key)
            return i;
        return isFound;


    }
   
   
     public static void main(String[] args){
        int arr[] = {1,4,3,4,5};
        System.out.println(occurence(arr,0,4));
        
        
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

