class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int x = 1;
        int y = 1;
        for(int i=1; i < nums.length; i++)
        {
            if (nums[i] == nums[i-1])
            {
                y++;
            }
            else
            {
                y = 1;
            }
            if (y <= 2)
            {
                nums[x] = nums[i];
                x++;
            }
        }  
        return x;
    }
}