class Solution {
    public int removeDuplicates(int[] nums)
    {
        int i=0,j=1;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]<nums[j])
            {
                i++;
                j++;
            }
            else if(nums[i]==nums[j])
            {
                i++;
            }
            else if(nums[i]!=nums[j-1])
            {
                nums[j]=nums[i];
                j++;
                i++;
            }
            else if(nums[i]==nums[j-1])
            {
                i++;
            }
        }
        return j;
    }
}