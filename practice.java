public class practice {
    public static int addOne(int n){
        int mask = 1;
        while((n & 1) != 0){
            n = n ^ mask;
            mask <<= 1;
        }
        n = n ^ mask;
        return n;

    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println(addOne(7));
        
        
        
            
        
        
        
        
        

        }
        


        

    }

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

