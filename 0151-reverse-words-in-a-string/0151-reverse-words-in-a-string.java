class Solution {
    public String reverseWords(String s) 
    {
        s=s.trim();
        String res="";
        while(s.indexOf(" ")!=-1)
        {
            res=res+" "+s.substring(s.lastIndexOf(" ")+1);
            s=s.substring(0,s.lastIndexOf(" ")).trim();
        }
        return (res+" "+s).trim();
    }
}