import java.util.*;
public class MergeSortLL{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
        // Dummy node
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        
        // Compare
        while(head1 != null && head2 != null){
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
        
        // Leftover elements
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        // Skip Dummy Node
        return mergedll.next;
    }

    public Node mergeSort(Node head){
        // Base Case
        if(head == null || head.next == null)
            return head;

        // Mid
        Node mid = getMid(head);

        // Left & Right Half
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head); // Store in Node beacuse head will change
        Node newright = mergeSort(rightHead); // Same

        return merge(newleft, newright);
    }

    public static void main(String[] args){
        LinkedList<Integer>ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        
    }
}
   


    

