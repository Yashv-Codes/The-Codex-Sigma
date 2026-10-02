public class practice{
    public static boolean isPalindrome(int n){
        if(n < 0 || (n % 10 == 0 && n != 0))
            return false;
        int rev = 0;
        while(n != 0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev == n;
        

    }
    
    public static void main(String[] args){
        System.out.println(isPalindrome(121));

        
        
       
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

