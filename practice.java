import java.util.*;
public class practice {
    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
    }
    public static void main(String[] args){
        
    }
}
