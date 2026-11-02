public class practice {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node size;

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(){
        Node newnode = new Node(1);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst();
    }
    
}
