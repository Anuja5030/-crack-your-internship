class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
           
        
    }
    return index;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int buy_stock=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy_stock){
                buy_stock=prices[i];
            }else if(prices[i]-buy_stock>profit){
                profit=prices[i]-buy_stock;
            }
        }
        return profit;
        
    }
}