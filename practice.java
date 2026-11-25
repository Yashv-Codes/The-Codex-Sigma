import java.util.*;
public class practice {
    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static String reverse(Stack<Character>s, String str){
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder("");
        while(s.isEmpty()){
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty())
            return;
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void stockspan(int[] stocks, int[] span){
        Stack<Integer>s = new Stack<>();
        for(int i=0; i<stocks.length; i++){
            while(!s.isEmpty() && stocks[s.peek()] <= stocks[i]){
                s.pop();
            }
            if(s.isEmpty())
                span[i] = i+1;
            else{
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
    }
    public static void nxt_greater(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] nxt = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty())
                nxt[i] = -1;
            else
                nxt[i] = arr[s.peek()];
            s.push(i);
        }
        for(int i=0; i<nxt.length; i++){
            System.out.print(nxt[i])
        }
    }

    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        //Stack<Character> s = new Stack<>();
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];
        int[] arr = {6, 8, 0, 1, 3};
        s.push(1);
        s.push(2);
        s.push(3);
        stockspan(stocks, span);
    }
}
