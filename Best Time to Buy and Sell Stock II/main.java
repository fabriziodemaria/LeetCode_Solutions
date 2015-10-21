class Solution {
    public int maxProfit(int[] prices) {
                if(prices.length<2) return 0;
                int profit = 0;
                int i = 1;
                while(true){
                        while(i<prices.length && prices[i]<=prices[i-1]){
                i++;
            }
                        //if end just don't buy anymore
            if(i==prices.length) return profit;
                        //price raised, buy prev one
            profit -= prices[i-1];
            i++;
                        //check max now...
            while(i<prices.length && prices[i]>=prices[i-1]){
                i++;
            }
                        //if end just sell! 
            if(i==prices.length) {
                    profit += prices[i-1];
                    return profit;
            }
                        //price dec, sell prev day
            profit +=prices[i-1];
            i++;
        }
            }
}
