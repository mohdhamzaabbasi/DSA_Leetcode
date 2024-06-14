class Solution 
{
    public boolean canJump(int[] nums) 
    {
        if(nums.length<2)
        {
            return true;
        }
        int i=nums.length-2;
        while(i!=-1)
        {
            if(nums[i]==0)
            {
                int j=i-1;
                for(;j>=0;j--)
                {
                    if(nums[j]+j>=i+1)
                    {
                        break;
                    }
                }
                if(j==-1)
                {
                    return false;
                }
                else if(j==0)
                {
                    return true;
                }
                else
                {
                    i=j-1;
                }
            }
            else if(nums[i]!=0)
            {
                i--;
            }
        }   
        return true;     
    }
}