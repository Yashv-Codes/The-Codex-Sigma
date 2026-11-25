import java.util.*;
public class practice {
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
    }
}
