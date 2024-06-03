class Solution {
    public int[] plusOne(int[] digits) 
    {
        int check=-1;
        int num=0;
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]!=9)
            {
                check=i;
            }
            num=num*10+digits[i];
        }
        num++;        
        if(check==digits.length-1)
        {
            digits[digits.length-1]++;
            return digits;
        } 
        else if(check!=-1)
        {
            digits[check]++;
            for(int i=check+1;i<digits.length;i++)
            {
                digits[i]=0;
            }
            return digits;
        }
        int digit[]=new int[digits.length+1];
        digit[0]=1;
        for(int i=1;i<=digits.length;i++)
        {
            digit[i]=0;
        }
        return digit;
    }
}