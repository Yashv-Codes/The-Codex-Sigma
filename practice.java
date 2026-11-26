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
                numstack.push(currnum);
                strstack.push(currstr.toString());
                currstr = new StringBuilder();
                currnum = 0;
            }

            else if(ch == ']'){
                int repeat = numstack.pop();
                StringBuilder prev = new StringBuilder(strstack.pop());
                for(int k=0; k<repeat; k++){
                    prev.append(currstr);
                }
                currstr = prev; // 2[a2[b]] -> 2[abb] i.e. store "abb" in strstack
            }
            else
                currstr.append(ch);
        }
        return currstr.toString();
    }

    public static void main(String[] args){
        
    }
}
   

