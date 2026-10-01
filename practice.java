public class practice{
    public static int sum(int n){
        int sum = 0;
        if(n == 1)
            return 1;
        sum += n;
        sum(n-1);
        return sum;
        
    }
    
    public static void main(String[] args){
        System.out.println(sum(5));
        
        
    }

}
 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

