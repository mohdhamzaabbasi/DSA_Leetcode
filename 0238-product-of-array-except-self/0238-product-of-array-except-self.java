class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int pro=1;
        int flag=0;
        int f2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                f2=1;
                pro=pro*nums[i];
            }
            else
            {
                flag++;
            }
        }   
        if(f2==0)
        {
            return nums;
        }
        int answer[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(flag==0)
            {
                answer[i]=pro/nums[i];
            }
            else
            {
                if(nums[i]==0 && flag==1)
                {
                    answer[i]=pro;
                }
                else
                {
                    answer[i]=0;
                }
            }
        }     
        return answer;
    }
}