public class BuyAndSellStocke {
    public static void main(String[] args) {
     int prices [] = {7,6,4,10,3,1};

        System.out.println(maxProfit_1(prices));

    }

    public static int maxProfit_1(int[] prices) {
        //Brute-Force Approach
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

    public static int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        int buy_index = 0;
        int sell_index = 0;
        int temp_buy = 0;

        for (int i = 0; i < prices.length; i++) {

            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                temp_buy = i;
            }

            // Calculate profit
            int profit = prices[i] - minPrice;

            //Chnage Profit
            if (profit > maxProfit) {
                maxProfit = profit;
                buy_index = temp_buy;
                sell_index = i;
            }
        }

        System.out.println("buy Index: " + buy_index);
        System.out.println("sell Index: " + sell_index);

        return maxProfit;
    }
}

