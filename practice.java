// import java.util.Arrays;
public class practice{
    public static void reverse(String str, int i, StringBuilder sb){
        char currchar = str.charAt(i);
        if(i == str.length()-1){
            System.out.print(sb.append(currchar));
            return;
        }
        reverse(str,i+1,sb);
        System.out.print(sb.append(currchar));
        
            

    }
   
    public static void main(String[] args){
        reverse("abcd",0,new StringBuilder(""));
        
    }
}


 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

