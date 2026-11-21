import java.util.*;
public class StackB {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static class Stack{
        public boolean isEmpty(){
            return head == null;
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
