// import java.util.Arrays;
public class practice{
    public static void print_occurences(int arr[], int i, int key){
        if(i == arr.length)
            return;
        if(arr[i] == key){
            System.out.print(i+" ");
            print_occurences(arr,i+1,key);
        }
    }
    
    
    public static void main(String[] args){
        print_occurences()
        

        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

