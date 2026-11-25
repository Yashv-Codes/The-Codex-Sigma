import java.util.*;
public class UnixStyle {
    public static String Simplify_Path(String str){
        Stack<String> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(curr == '/')
                continue;
            int st = i;
            while(i < str.length() && str.charAt(i) != '/'){
                i++;
            }
            String dir = str.substring(st, i);
            if(dir.equals("..")){
                if(!s.isEmpty())
                    s.pop();
            }
            else if(dir != ".")
                s.push(dir);
        }
        if(s.isEmpty())
            return "/";

        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.size(); i++){
            sb.append("/").append(s.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(Simplify_Path("/a/.."));
    }
}
