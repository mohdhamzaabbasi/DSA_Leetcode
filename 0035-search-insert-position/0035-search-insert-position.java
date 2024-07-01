class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int n=nums.length;
        int ans=n ;
        int low=0,high=n-1;
        while(low <= high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>=target)
            {
                high=mid-1;
                ans=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}