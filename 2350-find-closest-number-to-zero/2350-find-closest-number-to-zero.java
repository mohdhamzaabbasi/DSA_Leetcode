class Solution {
    public int findClosestNumber(int[] nums) {
        int min=nums[0];
        int mindis=Math.abs(min);
        for(int i=0;i<nums.length;i++)
        {
            int curr=nums[i];
            int currdis=Math.abs(curr);
            if(currdis<mindis)
            {
                min=curr;
                mindis=currdis;
            }
            else if(currdis==mindis)
            {
                min=min>curr?min:curr;
            }
        }
        return min;
    }
}