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

    public Node 

    public Node mergeSort(Node head){
        // Base Case
        if(head == null || head.next == null)
            return head;

        // Mid
        Node mid = getmid(head);

        // Left & Right Half
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head); // Store in Node beacuse head will change
        Node newright = mergeSort(rightHead); // Same

        return merge(newleft, newright);
    }
}
   


    

