class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int res[]={0,numbers.length-1};
        while(res[0]<=res[1])
        {
            if(numbers[res[0]]+numbers[res[1]]>target)
            {
                res[1]=res[1]-1;
            }
            else if(numbers[res[0]]+numbers[res[1]]<target)
            {
                res[0]=res[0]+1;
            }
            else
            {
                break;
            }
        }
        res[0]=res[0]+1;
        res[1]=res[1]+1;
        return res;
    }
}