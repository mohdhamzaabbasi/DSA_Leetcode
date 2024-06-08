class Solution {
    public int maxProfit(int[] prices) 
    {
        int buy=0;
        int sell=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<prices[buy])
            {
                buy=i;
            }
            else if(prices[i]-prices[buy]>sell)
            {
                sell=prices[i]-prices[buy];
            }
        }    
        return sell;
    }
}