public class LinkedList {
    public static class Node{
        int data; 
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
    
}
