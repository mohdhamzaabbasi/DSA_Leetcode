class Solution {
    public int findPermutationDifference(String s, String t) {
        int res=0;
        for(int is=0; is<s.length(); is++){
            char ch=s.charAt(is);
            int it=t.indexOf(ch);
            res+=Math.abs(is-it);
        }
        return res;
    }
}