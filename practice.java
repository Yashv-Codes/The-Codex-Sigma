import java.util.*;
public class practice {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
    
}
