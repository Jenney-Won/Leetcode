//Best time to buy and sell stock II
//array prices for which the ith element is the price of a given stock on day i.

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int prev = 0;
        int curr = 1;
        
        if((prices.length <= 1) || (prices == null)){
            return max;
        }
        
        else{
            while(curr < prices.length){
                if(prices[prev] < prices[curr]){
                    max += (prices[curr]-prices[prev]);
                }
                prev++;
                curr++;
            }
            return max;
        }
    }
}