public class practice {
    class Node{
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
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        int i = 0;
        while(i < size-2){
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        tail = prev;
        return val;
    }
    public void add_middle(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;

        Node prev = head;
        int i = 0;
        while(i < idx-1){
            prev = prev.next;
            i++;
        }
        newnode.next = prev.next;
        prev.next = newnode;
    }
    public int search(int key){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key)
                return i ;
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void removeNth(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;
            return;
        }

        int i = 1;
        int idx = size-n;
        Node prev = head;
        while(i < idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
        return;
    }
    public boolean isPalindrome(){
        if(size == 1)
            return true;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        practice ll = new practice();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println("size = "+practice.size);
        
    }
}

