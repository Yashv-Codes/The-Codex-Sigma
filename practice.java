public class practice {
    static class Node{
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
        if(head == null || head.next == null)
            return true;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        while(right != null){
            if(left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean exists = false;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                exists = true;
                break;
            }
        }
        if(!exists)
            return;
        if(slow == head){
            Node prev = head;
            while(prev.next!= head){
                prev = prev.next;
            }
            prev.next = null;
            return;
        }
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        return;

    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(head1!=null && head2!= null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null)
            return head;
        Node mid = getmid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);
        return merge(newleft, newright);
    }
    public static void ZigZagll(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
    }
    public static void main(String[] args){
        head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(9);
        head.next.next.next = new Node(4);
        print();
        head = mergeSort(head);
        print();
    }
}

