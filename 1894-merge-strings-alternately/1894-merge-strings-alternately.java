class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder("");
        int len1=word1.length();
        int len2=word2.length();
        int len=len1<len2?len1:len2;
        for(int i=0;i<len;i++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(len1>len2)
        {
            sb.append(word1.substring(len));
        }
        else if(len1<len2)
        {
            sb.append(word2.substring(len));
        }
        return sb.toString();
    }
}