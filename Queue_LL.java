public class Queue_LL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue{
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty(){
            return head == null && tail == null;
        }

        static void add(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            // Single element
            if(head == tail)
                head = tail = null;
            else
                head = head.next;
            return val;
        }

        static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args){
        
    }
}
