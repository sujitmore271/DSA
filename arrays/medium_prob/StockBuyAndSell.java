package arrays.medium_prob;

public class StockBuyAndSell {
    //brute force
    static int maxProfitSell(int[] stocks){
        int maxProfit = 0 ;
        for(int i = 0 ; i < stocks.length ; i++){
            for(int j = i+1; j < stocks.length ; j++){
                int profit = stocks[j] - stocks[i];

                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    //optimal
    static int maxProfitOpt(int[] stocks){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0 ;

        for(int prices : stocks){
            if(prices < minPrice){
                minPrice = prices;
            }else{
                maxProfit = Math.max(maxProfit, prices - minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] stocks = {10,7,5,8,11,9};
        int a = maxProfitOpt(stocks);
        System.out.println(a);
    }
}
