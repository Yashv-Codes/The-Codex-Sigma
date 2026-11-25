import java.util.*;
public class UnixStyle {
    public static String Simplify(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(curr == '/')
                continue;
            int st = i;
            while(i < str.length() && curr != '/'){
                i++;
            }
            String dir = str.substring(st, i);
            if(dir == ".."){
                if(!s.isEmpty())
                    s.pop();
            }
            else 
        }
    }
}
