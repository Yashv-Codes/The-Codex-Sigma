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
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        Node nextl, nextr;
        while(left!=null && right!=null){
            nextl = left.next;
            nextr = right.next;
            left.next = right;
            right.next = nextl;
            left = nextl;
            right = nextr;
        }
    }
    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        print();
        ZigZagll();
        print();
    }
}

