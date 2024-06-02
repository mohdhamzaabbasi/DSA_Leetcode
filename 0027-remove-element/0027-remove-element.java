class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int p=nums.length-1;
        int i=0;
        while(i<p)
        {
            if(nums[i]==val)
            {
                nums[i]=nums[i]+nums[p];
                nums[p]=nums[i]-nums[p];
                nums[i]=nums[i]-nums[p];
                p--;
            }
            if(nums[i]!=val)
            {
                i++;
            }
        }      
        i=0;
        for(;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                break;
            }
        }  
        return i;
    }

}