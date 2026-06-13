class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0 ; i <=prices.length-1 ; i++){
             int sellprice = prices[i];
           if(sellprice> buyprice){
           int  profit = sellprice - buyprice;
          maxprofit = Math.max(maxprofit , profit);
           }
           else{
            buyprice = sellprice;
           }
        }
        return maxprofit;
    }
}
