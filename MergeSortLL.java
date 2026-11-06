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

    public Node merge

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
}
   


    

