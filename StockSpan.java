import java.util.*;
public class StockSpan {
    public static void stock_span(int stocks[], int span[]){
        
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
