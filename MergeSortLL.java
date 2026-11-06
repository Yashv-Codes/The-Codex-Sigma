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

    public Node mergeSort(Node head){
        // Base Case
        if(head == null || head.next == null)
            return head;

        // Mid
        Node mid = getmid(head);

        // Left & Right Half
        Node right
    }
}
   


    

