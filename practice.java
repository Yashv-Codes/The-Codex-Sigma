// import java.util.Arrays;
public class practice{
    public static void remove_duplicates(String str, StringBuilder sb, boolean map[], int i){
        if(i == str.length()){
            System.out.print(str);
            return;
        }
        char ch = str.charAt(i);
        if(map[ch - 'a'] == true)
            remove_duplicates(str,sb,map,i+1);
        else{
            map[ch - 'a'] = true;
            remove-duplicates(str,sb,)
        }
            map[ch - 'a'] = true;
            

    }
    
   
   
   
     public static void main(String[] args){
        
        
        
        
        
        
    }
}

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

