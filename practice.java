import java.util.Arrays;
public class practice {
    public static boolean anagrams(String str, String str1){
        if(str.length() != str1.length())
            return false;
        str.toLowerCase();
        str1.toLowerCase();
        char[] charArray = str.toCharArray();
        char[] charArray1 = str.toCharArray();
        Arrays.sort(charArray);
            Arrays.sort(charArray1);
            if(Arrays.equals(charArray, charArray1))
                return true;
            return false;
        }

    
    

    
    public static void main(String[] args) {
        String str = "race";
        String str1 = "ponds";
        System.out.println(anagrams(str, str1));
        
            

        }
        


        

    }

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

