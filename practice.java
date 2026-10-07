// import java.util.Arrays;
public class practice{
    public static void substr(String str, int left, int right){
        if(left == str.length())
            return;
        else if(right > str.length()){
            substr(str, left+1, left+2);
            return;
        }
        if(str.charAt(left) == str.charAt(right-1))
            System.out.println(str.substring(left, right));
        substr(str, left, right+1);
    }
    
    public static void main(String[] args){
        substr("aba",0,1);
    }
}


 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

