public class practice {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node getpoint(Node head1, Node head2){
        if(head1 == null || head2 == null)
            return null;
        Node ptr1 = head1;
        Node ptr2 = head2;
        while(ptr1 != ptr2){
            ptr1 = (ptr1 == null)? head2 : ptr1.next;
            ptr2 = (ptr2 == null)? head1: ptr2.next;
        }
    }
    

   
    
    public static void main(String[] args){
        practice list = new practice();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newnode = new Node(6);
        head2.next = newnode;
        newnode = new Node(9);
        head2.next.next = newnode;
        newnode = new Node(15);
        head1.next = newnode;
        head2.next.next.next = newnode;
        newnode = new Node(30);
        head1.next.next = newnode;
        head1.next.next.next = null;
        Node intersection = list.getpoint(head1,head2);
        if(intersection == null)
            System.out.println("No intersection point");
        else
            System.out.println("Intersection point = "+intersection.data);
    }
}

