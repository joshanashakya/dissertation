import java.util.*;import java.util.Arrays;public class program{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int t=sc.nextInt();        for(int i=0;i<t;i++)        {            int n=sc.nextInt();            int[] a=new int[n];            for(int j=0;j<n;j++)            {                a[j]=sc.nextInt();            }            Arrays.sort(a);            int k=0,count=0;            for(int j=n-1;j>=0;j--)            {                if(a[j]>=k+1)                {                    count++;                }                k++;            }            System.out.println(count);        }            }}
