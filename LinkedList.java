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
    public static int size;

    public void addFirst(int data){
        // Create new node
        Node newnode = new Node(data);
        size++;
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
        size++;
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
        size++;

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

    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
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
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size - 2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // current tail.data
        prev.next = null;
        tail = prev; // new tail
        size--;
        return val;
    }

    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key)
                return i;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null) // Base Case
            return -1;

        if(head.data == key)
            return 0;

        int idx = helper(head.next, key);
        
        if(idx == -1)
            return -1;

        return idx + 1; // Return phase

    }
    
    public int recursive_search(int key){
        return helper(head, key);
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

    public void RemoveNthfromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        // Cornor Case
        if(n == size){
            head = head.next;
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;

        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        // Actual prev
        prev.next = prev.next.next;
        return;
    }

    // Linked List is Palindrome
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is mid 
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null)
            return true;

        Node mid = findmid(head);

        // Reverse 2nd Half
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // Compare left and right
        while(right != null){
            if(left.data != right.data)
                return false;

            left = left.next;
            right = right.next;
        }
        return true;
    }

     public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.isPalindrome();
        ll.print();
        
        

    }
}

