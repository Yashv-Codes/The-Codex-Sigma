import java.util.*;
public class StackB {
    static class Node{
        int data;
        Node next;
        
    }
    static class Stack{
        public boolean isEmpty(){
            return 
        }

        // push
        public void push(int data){
            
        }

        // pop
        public int pop(){
            
            return top;
        }

        // peek
        public int peek(){
            return ;
        }
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
