import java.io.*;import java.util.*;public class Solution {    public static void main(String ag[])    {        Scanner sc=new Scanner(System.in);        int i,j,k;        int N=sc.nextInt();        int M=sc.nextInt();        int type[]=new int[N];        double location[]=new double[N];        for(i=0;i<N;i++)        {            type[i]=sc.nextInt();            location[i]=sc.nextDouble();        }                int dp[]=new int[N];        Arrays.fill(dp,1);        int max=1;        for(i=1;i<N;i++)        {            for(j=0;j<i;j++)            {                if(dp[j]+1>dp[i]&&type[i]>=type[j])                {                    dp[i]=dp[j]+1;                }            }            max=Math.max(max,dp[i]);        }        System.out.println(N-max);    }}