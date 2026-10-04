// import java.util.Arrays;
public class practice{
    public static int power(int x, int n){
        if(n == 1)
            return n;
        int halfpower = power(x, n/2);
        int halfpowersq = halfpower * halfpower;
        if(n % 2 != 0)
            return x * halfpowersq;
        return halfpowersq;
    }
   
   
   
     public static void main(String[] args){
        System.out.println(power(2,8));
        
        
        
        
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

