import java.io.File;import java.util.Scanner;import java.util.StringTokenizer; public class p004 {	public static void main(String args[]) throws Exception {		StringTokenizer stok = new StringTokenizer(new Scanner(System.in).useDelimiter("\\A").next());		StringBuilder sb = new StringBuilder();		int n = Integer.parseInt(stok.nextToken());		int m = Integer.parseInt(stok.nextToken());		long mod = (long)1e9+7;		long[][] dp = new long[100005][2];		dp[1][0]=2;		for(int i=2;i<=100000;i++) {			dp[i][0]=(dp[i-1][0]+dp[i-1][1])%mod;			dp[i][1]=dp[i-1][0];		}		long tot = (dp[n][0]+dp[n][1]+dp[m][0]+dp[m][1]+mod-2)%mod;		System.out.println(tot);	}}