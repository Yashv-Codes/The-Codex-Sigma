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
        return ptr1;
    }
    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deleteNode(Node head, int m, int n){
        Node curr = head;
        while(curr != null){
            for(int i=1; i<m && curr!=null; i++){
                curr = curr.next;
            }
            if(curr == null)
                return;
            Node temp = curr.next;
            for(int j=1; j<=n && temp!=null; j++){
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
    }
   
    
    public static void main(String[] args){
        practice list = new practice();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
    } 
}

