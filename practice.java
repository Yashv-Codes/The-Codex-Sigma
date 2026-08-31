import java.util.*;
public class practice{
    public static int factorial(int n){
        int fact = 1;
        if(n < 0)
            return -1;
        else if(n==0 || n==1)
            return 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        return fact;
        
    }
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(factorial(0));
        
       
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

