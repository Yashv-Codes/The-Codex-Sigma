// import java.util.*;
public class QueueB {
    class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
    

    public static boolean isEmpty(){
        return rear == -1;
    }

    public static int add(int data){
        if(rear == size-1){
            System.out.println("queue is full");
            return -1;
        }
        rear = rear+1;
        arr[rear] = data;
    }
}
    

    public static void main(String[] args){
        
    }
}
