public class LinkedList_2 {
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

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) // Cycle exists
                return true;
        }
        return false;
    }

    public static void removeCycle(){
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean exists = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                exists = true;
                break;
            }
        }
        if(!exists)
            return;

        // SPECIAL CASE
        if(slow == head){
            // Find last node
            Node prev = head;
            while(prev.next != head){
                prev = prev.next;
            }
            prev.next = null;
            return;
        }

        // Normal Case
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next; // +1
            fast = fast.next; // +1
        }
        prev.next = null; // Break Cycle
        return; 
    }

    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}

