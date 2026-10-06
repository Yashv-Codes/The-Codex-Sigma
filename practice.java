// import java.util.Arrays;
public class practice{
    public static void toString(String digits[], int n){
        if(n == 0)
            return;
        int ld = n % 10;
        toString(digits, n/10);
        System.out.print(digits[ld]+" ");
    }
    
    
    
    public static void main(String[] args){
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        

        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

