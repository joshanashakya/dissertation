//created by Whiplash99import java.io.*;import java.util.*;public class A{    public static void main(String[] args) throws IOException    {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int i,N;         String[] s=br.readLine().trim().split(" ");        N=Integer.parseInt(s[0]);        int M=Integer.parseInt(s[1]);         int[] a=new int[N];        s=br.readLine().trim().split(" ");        for(i=0;i<N;i++) a[i]=Integer.parseInt(s[i]);         if(N>M) //Pigeonhole Principle        {            System.out.println("YES");            System.exit(0);        }         boolean[][] dp=new boolean[2][M+1];        dp[0][0]=dp[1][0]=true;         for(i=1;i<=N;i++) //Subset-Sum DP        {            a[i-1]%=M;            for(int j=1;j<=M;j++)            {                if(a[i-1]==0) dp[1][j]=true;                else dp[1][j]=false;                 dp[1][j]|=dp[0][j];                if(a[i-1]>j) dp[1][j]|=dp[0][j-a[i-1]+M];                else dp[1][j]|=dp[0][j-a[i-1]];            }            for(int j=0;j<=M;j++) dp[0][j]=dp[1][j];        }        System.out.println(dp[1][M]?"YES":"NO");    }}
