public class practice {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    

   
    
    public static void main(String[] args){
        practice list = new practice();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newnode = new Node(6);
        head2.next = newnode;
        Node newnode = new Node(9);
    }
}

