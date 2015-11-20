class Solution {
    public int maxProfit(int[] prices) {
        int i, j, tmp;
        int maxprofit = 0;
                if(prices.length==0){
            return 0;
        }
                tmp=prices[0];
                for(i=0; i<prices.length-1; i++){
            if(i!=0 && prices[i]>tmp) {} else {
                tmp=prices[i];
            }
                        if((prices[i+1]-tmp)>maxprofit){
                maxprofit = (prices[i+1]-tmp);
            }
        }
        return maxprofit;
    }
}
