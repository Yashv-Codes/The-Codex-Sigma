public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int n;
        static int front;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Add 1st element
            if(front == -1)
                front = 0;
            rear = (rear + 1) % size;
        }

    }
    
    
}
