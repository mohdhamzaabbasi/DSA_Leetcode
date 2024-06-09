class Solution 
{
    public int trap(int[] height) 
    {
        int sum=0;
        for(int i=1;i<height.length-1;i++)
        {
            int left=height[i];
            int right=height[i];
            for(int j=i;j>=0;j--)
            {
                if(height[j]>left)
                {
                    left=height[j];
                }
            }
            for(int j=i;j<height.length;j++)
            {
                if(height[j]>right)
                {
                    right=height[j];
                }
            }
            sum=sum+((left<=right?left:right)-height[i]);
        }        
        return sum;
    }
}