import java.util.Arrays;
public class practice {
    public static int get_ithbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0)
            return 0;
        return 1;

    }
    
    public static void main(String[] args) {
        System.out.println(get_ithbit(11,3));
        
        

        }
        


        

    }

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

