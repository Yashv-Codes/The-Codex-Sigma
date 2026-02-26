public class Buyandsell_stocks {
    public static int stocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if( buyprice < prices[i] ){
                int profit = prices[i] - buyprice; // today's profit.
                maxprofit = Math.max(maxprofit, profit);
            }
            buyprice = prices[i];
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit = "+(stocks(prices)));
    }
}


