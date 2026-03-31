class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices==null){
            return 0;
        }
        int maxprofit=0;
        int minprice=prices[0];
        for(int r=1;r<prices.length;r++){
            maxprofit=Math.max(maxprofit,prices[r]-minprice);
            minprice=Math.min(minprice,prices[r]);
        }
        return maxprofit;
    }
}
