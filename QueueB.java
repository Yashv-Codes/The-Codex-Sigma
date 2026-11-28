import java.util.*;
public class QueueB {
     public static void main(String[] args){
        Queue q = new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        while(!Queue.isEmpty()){
            System.out.println(Queue.remove());
        }
    }
}
