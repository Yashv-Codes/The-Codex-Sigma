public class practice{
    public static int sum_num(int n, int sum){
        if(n == 1)
            return 1;
        sum += n;
        sum_num(n-1);
        return sum;
        
    }
    
    public static void main(String[] args){
        int sum = 0;
        System.out.println(sum_num(5));
        
        
    }

}
 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

