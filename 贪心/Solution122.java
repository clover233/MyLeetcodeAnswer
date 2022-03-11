package 贪心;

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int len = prices.length;
        for (int i = 1 ;i < len ; i++){
            result += Math.max(0,(prices[i]-prices[i-1]));
        }
        return result;
    }
}