import java.util.*;
public class StockSpan {
    public static void stock_span(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0); // Person 0 enters the line
        for(int i=1; i<stocks.length; i++){
            int currprice = stocks[i];
            
            // Rule 1: Kick out everyone behind me who is shorter/equal (they don't block me!)
            while(!s.isEmpty() && currprice >= stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
                span[i] = i+1;
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    
    public static void main(String[] args){
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stock_span(stocks, span);
        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
    }
}
