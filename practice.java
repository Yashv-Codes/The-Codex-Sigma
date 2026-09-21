import java.util.*;
public class practice {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == ' ' && str.charAt(i) != ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
        
    
    
   
   
    public static void main(String[] args) {
        String str = "yash v";
        System.out.println(toUppercase(str));
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    }
}

    

