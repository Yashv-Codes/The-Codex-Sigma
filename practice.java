// import java.util.Arrays;
public class practice{
    public static void Subsequence(String str, StringBuilder sb, int i){
        if(i == str.length()){
            System.out.println(sb);
            return;
        }
        Subsequence(str,sb.append(str.charAt(i)),i+1);
        Subsequence(str,sb,i+1);

    }
    public static void main(String[] args){
        
        
        
    }
}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

