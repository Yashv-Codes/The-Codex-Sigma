public class practice{
    public static int toBinary(int n){
        int pow = 0; int new_num = 0;
        while(n != 0){
            new_num += (n % 2) * Math.pow(10,pow);
            n /= 2;
            pow++;
            
        }
        return new_num;

    }
    
    public static void main(String[] args){
        System.out.println(toBinary(111));

        
        
       
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

