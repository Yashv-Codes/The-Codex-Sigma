import java.util.Arrays;
public class practice{
    public static int add(int n){
        int sum = 0;
        if(n == 1)
            return n;
        sum += n;
        add(n-1);
        return sum;
        
        
    }
   
    
    
    
   
    public static void main(String[] args){
        System.out.println(add(5));
        
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

