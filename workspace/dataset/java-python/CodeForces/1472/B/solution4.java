import java.util.*; public class B_Fair_Division{    public static void main(String args[]) {        Scanner sc = new Scanner(System.in);        int q = sc.nextInt();        while (q-- > 0) {            int n = sc.nextInt();            int ar[]=new int[n];            int i=0;            int s=0;            for(i=0;i<n;i++)            {                ar[i]=sc.nextInt();                s+=ar[i];            }            if(s%2!=0)            {                System.out.println("NO");                continue;            }            boolean dp[][]=new boolean[n+1][s+1];            int j=0;            for(i=0;i<=s;i++)            {                dp[0][i]=false;            }            for(i=0;i<=n;i++)            {                dp[i][0]=true;            }            for(i=1;i<=n;i++)            {                for(j=1;j<=s;j++)                {                    dp[i][j]=dp[i-1][j];                    if(j-ar[i-1]>=0)dp[i][j]=dp[i][j]||dp[i-1][j-ar[i-1]];                }            }            if(dp[n][s/2])            {                System.out.println("YES");            }            else            {                System.out.println("NO");            }        }    }}