class Solution {
    public int maxProfit(int[] prices){
        if(prices.length == 0){
            return 0;
        }
        int sum = 0;
        int mid = prices[0];
        for(int i = 1;i < prices.length;i++){
            if(mid < prices[i]){
                sum = Math.max(sum,prices[i] - mid);
            }else{
                mid = prices[i];
            }
        }
    return sum;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0;i < prices.length;i++){
            for(int j = i + 1;j < prices.length;j++){
                sum = Math.max(prices[j] - prices[i],sum);
            }
        }
        return sum;
    }
}
