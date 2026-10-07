// import java.util.Arrays;
public class practice{
    public static void reverse(String str, int i, StringBuilder sb){
        if(i == str.length())
            return;
        reverse(str,i+1,sb);
        sb.append(str.charAt(i));
        
            

    }
   
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");
        reverse("abcd",0,new StringBuilder(""));
        System.out.println(sb.toString());
        
    }
}


 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

