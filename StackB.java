import java.util.*;
public class StackB {
    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty())
            return;

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);

    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static boolean isValid(String str){
        
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        
    }
}
