class Solution 
{
    public int hIndex(int[] citations) 
    {
        for(int i=citations.length;i>0;i--)
        {
            int sum=0;
            for(int j=0;j<citations.length;j++)
            {
                if(citations[j]>=i)
                {
                    sum++;
                }
            }
            if(sum>=i)
            {
                return i;
            }
        }     
        return 0;
    }
}