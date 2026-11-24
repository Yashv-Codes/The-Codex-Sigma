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
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch=='[')
                s.push(ch);
            else{
                if(s.isEmpty())
                    return false;
                if(s.peek() == '(' && ch == ')' || s.peek() == '{' && ch == '}' || s.peek() == '[' && ch == ']')
                    s.pop();
                else
                    return false;
            }
        }
        if(s.isEmpty())
            return true;
        return false;
    }
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // Closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1)
                    return true; // Duplicate
            }
        }
        
    }


    public static void main(String[] args){
        System.out.println(isValid("({[]}())"));
    }
}
