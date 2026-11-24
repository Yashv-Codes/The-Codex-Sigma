public class practice {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
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
    public static void main(String[] args){
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('D');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');
        System.out.println(isPalindrome(head));
    }
}
