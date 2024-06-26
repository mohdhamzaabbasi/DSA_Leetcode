class Solution {
    public String addBinary(String a, String b) {
        while(a.length()!=b.length())
        {
            if(a.length()<b.length())
            {
                a="0"+a;
            }
            else
            {
                b="0"+b;
            }
        }
        System.out.println(a+"\t"+b);
        String res="";
        String flag="0";
        for(int i=a.length()-1;i>=0;i--)
        {
            String temp=a.substring(i,i+1)+b.substring(i,i+1)+flag;
            flag="0";
            if(temp.equals("000"))
            {
                res="0"+res;
            }
            else if(temp.equals("101") || temp.equals("110") || temp.equals("011"))
            {
                res="0"+res;
                flag="1";
            }
            else if(temp.equals("111"))
            {
                res="1"+res;
                flag="1";
            }
            else
            {
                res="1"+res;
            }
        }
        if(flag.equals("1"))
        {
            res=flag+res;
        }
        return res;
    }
}