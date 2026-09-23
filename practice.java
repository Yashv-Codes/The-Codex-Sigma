import java.util.Arrays;
public class practice {
    

    
    

    
    public static void main(String[] args) {
        String s = "nap";
        String t = "pan";
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;

            

        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0)
                System.out.println("not anagram");
        }
        System.out.println("Anagrams");
        
            

        }
        


        

    }

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

