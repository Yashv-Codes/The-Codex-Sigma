import java.util.*;
public class practice {
    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static String reverse(Stack<Character>s, String str){
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder("");
        while(s.isEmpty()){
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty())
            return;
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void stockspan()
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        //Stack<Character> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        print(s);
    }
}
