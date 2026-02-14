public class BuyAndSellStocke {
    public static void main(String[] args) {
     int prices [] = {1,2};   
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int buy_index = 0;
        int sell_index = 0;
        int diff = 0;
        
        for(int i = 0; i < prices.length - 1;i++){
            for(int j = i + 1 ; j<prices.length; j++ ){
                if (prices[j]-prices[i] > diff) {
                    diff = prices[j]-prices[i];
                    buy_index = i;
                    sell_index = j;
                }
            }
        }

        System.out.println("buy Index" + buy_index);
        System.out.println("sell Index" + sell_index);

        
        
        return diff;
    }
}
