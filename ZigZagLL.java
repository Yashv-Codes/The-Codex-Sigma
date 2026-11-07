public class ZigZagLL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void zigZag(){
        // Find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd Half
        Node curr = mid.next;
        mid.next = null; // Split into two halves
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alternate Merging
        Node left = head; // 1st half head
        Node right = prev; // 2nd half head
        Node nextL, nextR;

        while(left != null && right != null){
            // ZigZag Fashion
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // Update
            left = nextL;
            right = nextR;
        }
    }

    public void print(){}

    
}
