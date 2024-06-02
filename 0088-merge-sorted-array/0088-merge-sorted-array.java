import java.util.*;
class Solution
{
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int a=0;
        int b=0;
        int res[]=new int[m+n];
        for(int i=0;i<m+n;i++)
        {
            if(a<m)
            {
                if(b==n)
                {
                    res[i]=nums1[a++];
                    continue;
                }
                else if(nums1[a]<nums2[b])
                {
                    res[i]=nums1[a++];
                    continue;
                }
            }
            if(b<n)
            {
                if(a==m)
                {
                    res[i]=nums2[b++];
                    continue;
                }
                else if(nums1[a]>=nums2[b])
                {
                    res[i]=nums2[b++];
                    continue;
                }
            }
        }
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=res[i];
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int nums1[]=new int[m+n];
        int nums2[]=new int[n];
        for(int i=0;i<m+n;i++)
        {
            if(i<m)
            {
                nums1[i]=sc.nextInt();
            }
            else
            {
                nums1[i]=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums2[i]=sc.nextInt();
        }
        merge(nums1,m,nums2,n);
        for(int i=0;i<m+n;i++)
        {
            System.out.println(nums1[i]);
        }
    }
}