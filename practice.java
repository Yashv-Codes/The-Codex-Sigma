import java.util.Arrays;
public class practice {
    public static int count_setbits(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) != 0)
                count++;
            n >>= 1;
        }
        return count;
    }
    
    
    
    public static void main(String[] args) {
        int a = 1011101, count = 0;
        String str = String.valueOf(a);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != 0)
                count++;
        }
        System.out.println(count);
        
            
        
        
        
        
        

        }
        


        

    }

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

