import java.util.*;
public class practice{
    public static void printPrimesinRange(int n){
        for(int i=0; i<=n; i++){
            if(isPrime(i);
        }
    }
    public static boolean isPrime(int n){
        if(n <= 0 || n == 1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(printPrimesinRange(15));
        
        
        
       
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

