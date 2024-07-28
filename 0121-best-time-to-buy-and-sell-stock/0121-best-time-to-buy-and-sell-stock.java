class Solution {
    public int maxProfit(int num[])
    {
        int max=0;
        int bp=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(num[i-1]<bp)
            {
                bp=num[i-1];
            }
            int pro=num[i]-bp;
            if(pro>max)
            {
                max=pro;
            }
        }
        return max;
    }  
}