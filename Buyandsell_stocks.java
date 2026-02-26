public class Buyandsell_stocks {
    public static int stocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int sellprice[] = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            if( buyprice < sellprice[i] ){
                int profit = sellprice[i] - buyprice; // today's profit.
                maxprofit = Math.max(maxprofit, profit);
            }
            buyprice = sellprice[i];
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit = "+(stocks(prices)));
    }
}

