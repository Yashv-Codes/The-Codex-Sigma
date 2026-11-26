import java.util.*;
public class practice{
    public static String decode(String str){
        Stack<Integer> numstack = new Stack<>();
        Stack<String> strstack = new Stack<>();
        StringBuilder currstr = new StringBuilder("");
        int currnum = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                currnum = currnum * 10 + (ch - '0');
            else if(ch == '['){
                
            }
        }
    }
}
   

