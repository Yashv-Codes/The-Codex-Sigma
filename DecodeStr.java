import java.util.*;
public class DecodeStr{
    public static String decode(String str){
        Stack<Integer> numstack = new Stack<>();
        Stack<String> strstack = new Stack<>();
        StringBuilder currstr = new StringBuilder("");
        int currnum = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                currnum = currnum * 10 + (ch - '0'); // for num >= 100

            else if(ch == '['){
                numstack.push(currnum);
                strstack.push(currstr.toString());
                currstr = new StringBuilder(); // reset for upcoming values
                currnum = 0; // same
            }

            else if(ch == ']'){
                int repeat = numstack.pop();
                StringBuilder prev = new StringBuilder(strstack.pop());
                for(int k=0; k<repeat; k++){
                    prev.append(currstr); // 2[a2[b]] -> 2[abb]
                }
                currstr = prev; // store "abb" in strstack
            }
            else
                currstr.append(ch); // store str in strstack
        }
        return currstr.toString();
    }

    public static void main(String[] args){
        System.out.println(decode("2[a2[b]]"));
    }
}
   

