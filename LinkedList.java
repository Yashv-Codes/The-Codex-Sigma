public class LinkedList {
    public static class Node{
        int data; 
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void addFirst(int data){
        // Create new node
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
            }

        // newnode next -> head
        newnode.next = head;

        // head = newnode
        head = newnode;
    }

    public void addLast(int data){
        // Create a new node
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add_middle(int idx, int data){
        Node newnode = new Node(data);
        if(idx == 0){
            addFirst(data);
            return;
        }
        int i = 0;
        Node temp = head;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        // temp -> prev
        newnode.next = temp.next;
        temp.next = newnode;
        

    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);
        ll.print();
    }
}

