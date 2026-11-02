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
    public static int size;

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void add_middle(int data){

    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.print();
    }
    
}
