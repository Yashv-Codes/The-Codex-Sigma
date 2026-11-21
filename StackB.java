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
            Node newnode = new Node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;   
        }

        // pop
        public int pop(){
            if(isEmpty())
                return -1;
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
