import java.util.*;
public class practice{
    public static int binomial_coeff(int n, int r){
        
    }
    public static int factorial(int n){
        int fact = 1;
        int i = 2;
        if(n < 0)
            return -1;
        else if(n==0 || n==1)
            return 1;
        while(i <= n){
            fact *= i;
            i++;
        }
        return fact;
        
    }
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(factorial(5));
        
       
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

