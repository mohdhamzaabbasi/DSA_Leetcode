class Solution {
    public void rotate(int[] nums, int k) {
        while(k>=nums.length)
        {
            k=k-nums.length;
        }
        for(int i=0;i<(nums.length/2);i++)
        {
            nums[i]=nums[i]+nums[nums.length-i-1];
            nums[nums.length-i-1]=nums[i]-nums[nums.length-i-1];
            nums[i]=nums[i]-nums[nums.length-i-1];
        }
        for(int j=0;j<(k/2);j++)
        {
            nums[j]=nums[j]+nums[k-1-j];
            nums[k-1-j ]=nums[j]-nums[k-1-j];
            nums[j]=nums[j]-nums[k-1-j];
        }
        for(int j=k;j<((nums.length+k)/2);j++)
        {
            nums[j]=nums[j]+nums[nums.length-j+(k-1)];
            nums[nums.length-j+(k-1)]=nums[j]-nums[nums.length-j+(k-1)];
            nums[j]=nums[j]-nums[nums.length-j+(k-1)];
        }
    }
}