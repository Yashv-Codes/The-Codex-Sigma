import java.util.*;
public class practice {
    public static void pushAtBottom(s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
    }
}
