class Solution 
{
    public int jump(int[] nums) 
    {
        int count=0;
        int i=nums.length-1;
        while(i!=0)
        {
            int j=i-1;
            for(int k=j;k>=0;k--)
            {
                if(nums[k]+k>=i)
                {
                    j=k;
                }
            }
            i=j;
            count++;
        }        
        return count;
    }
}