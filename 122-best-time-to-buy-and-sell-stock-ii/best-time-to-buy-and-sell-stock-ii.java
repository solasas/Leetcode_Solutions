class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit_total=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit_total+=prices[i]-prices[i-1];
            }
        }
        return profit_total;
    }
}