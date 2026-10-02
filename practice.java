public class practice{
    public static int toDecimal(int n){
        int pow = 0; int decimal = 0;
        while(n != 0){
            decimal += (n % 10) * Math.pow(2,pow);
            n /= 10;
            pow++;
        }
        return decimal;

    }
    
    public static void main(String[] args){
        System.out.println(toDecimal(111));

        
        
       
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

