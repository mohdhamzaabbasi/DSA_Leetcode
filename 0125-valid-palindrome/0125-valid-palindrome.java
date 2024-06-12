class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                s=s+s.charAt(i);
            }
        }      
        s=s.substring(n).toLowerCase();      
        for(int i=0;i<(s.length()/2);i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}