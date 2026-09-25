import java.util.Arrays;
public class practice {
    public static int clear_bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public static int update_bit(int n, int i, int v){
        n = clear_bit(n, i);
        return n | v<<i;
    }
    
    
    public static void main(String[] args) {
        System.out.println(update_bit(11,2,0));
        
        
        
        

        }
        


        

    }

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

