public class practice{
    public static boolean isPalindrome(int n){
        if(n < 0 || (n % 10 == 0 && n != 0))
            return false;
        int rev = 0; int org = n;
        while(n != 0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev == org;
        

    }
    
    public static void main(String[] args){
        System.out.println(isPalindrome(10));

        
        
       
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

