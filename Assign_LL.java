public class Assign_LL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node getpoint(Node head1, Node head2){
        if(head1 == null || head2 == null)
            return null;
        Node ptr1 = head1;
        Node ptr2 = head2;
        while(ptr1 != ptr2){
            ptr1 = (ptr1 == null)? head2 : ptr1.next;
            ptr2 = (ptr2 == null)? head1: ptr2.next;
        }
        return ptr1;
    }
    public void print(Node head){
        while(head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public void deleteNode(Node head, int m, int n){
        Node curr = head;
        while(curr != null){
            for(int i=1; i<m && curr!=null; i++){
                curr = curr.next;
            }
            if(curr == null)
                return;
            Node temp = curr.next;
            for(int j=1; j<=n && temp!=null; j++){
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
    }
    public Node swapNodes(Node head, int x, int y){
        if(x==y || head == null)
            return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prevX = dummy, currX = head;
        while(currX != null && currX.data!=x){
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = dummy, currY = head;
        while(currY!= null && currY.data!=y){
            prevY = currY;
            currY = currY.next;
        }
        if(currX == null || currY == null)
            return head;
        Node nextX = currX.next;
        Node nextY = currY.next;
        if(currX.next == currY){
            prevX.next = currY;
            currY.next = currX;
            currX.next = nextY;
        }
        else if(currY.next == currX){
            prevY.next = currX;
            currX.next = currY;
            currY.next = nextX;
        }
        else{
            prevX.next = currY;
            currY.next = nextX;
            prevY.next = currX;
            currX.next = nextY;
        }
        return dummy.next;
    }
    public Node OddEvenLL(Node head){
        if(head == null || head.next == null)
            return head;
        Node evendummy = new Node(0);
        Node odddummy = new Node(0);
        Node eventail = evendummy;
        Node oddtail = odddummy;
        Node curr = head;
        while(curr != null){
            if(curr.data % 2 == 0){
                eventail.next = curr;
                eventail = eventail.next;
            }
            else{
                oddtail.next = curr;
                oddtail = oddtail.next;
            }
            curr = curr.next;
        }
        eventail.next = odddummy.next;
        oddtail.next = null;
        return evendummy.next;
    }
    // Merge K Soted lists
    public Node sortedMerge(Node a, Node b){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(a != null && b !=null){
            if(a.data <= b.data){
                temp.next = a;
                a = a.next;
            }
            else{
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        if(a != null)
            temp.next = a;
        else
            temp.next = b;
        return dummy.next;
    }
    public Node merge(Node[] arr, int start, int end){
        if(start > end)
            return null;
        if(start == end)
            return arr[start];
        int mid = start+(end-start)/2;
        Node left = merge(arr,start,mid);
        Node right = merge(arr, mid+1, end);
        return sortedMerge(left, right);
    }
    
    public static void main(String[] args){
        Assign_LL list = new Assign_LL();
        
        
        list.print(head);
        
        list.print(head);
    } 
}

