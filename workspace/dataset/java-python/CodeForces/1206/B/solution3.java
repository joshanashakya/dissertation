import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;/** Optimal(Maximum,Minimum) Answers * 1. Binary search * 2. Prefix Suffix * 3. Greedy (sorting searching) * 4. DP **/public class Solution {    /** Optimal(Maximum,Minimum) Answers     * 1. Binary search     * 2. Prefix Suffix     * 3. Greedy (sorting searching)     * 4. DP     **/    private static final Scanner sc = new Scanner(System.in);    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    private static final long MOD = (long) (1e9 + 7);    private static PrintWriter out = new PrintWriter(System.out);     static long getAns(long[] a,int n,int prod,long[][] dp){        if (n == 0){            return prod == 1 ? 0 : Long.MAX_VALUE/2;        }        if (dp[n][(prod%3 + 3)%3] != -1){            return dp[n][(prod%3 + 3)%3];        }        long ans1 = Math.abs(a[n-1] - 1) + getAns(a,n-1,prod,dp);        long ans2 = Math.abs(a[n-1] + 1) + getAns(a,n-1,prod * -1,dp);        return dp[n][(prod%3 + 3)%3] = Math.min(ans1,ans2);    }    public static void solve(int T) throws IOException {        int n = sc.nextInt();        long[] a = new long[n];        for (int i = 0; i < n; i++) {            a[i] = sc.nextLong();        }        int prod = 1;        long[][] dp = new long[n+1][3];        for (long[] i : dp){            Arrays.fill(i,-1);        }        long ans = getAns(a,n,prod,dp);        System.out.println(ans);    }    public static void main(String[] args) throws IOException{        /** Optimal(Maximum,Minimum) Answers         * 1. Binary search         * 2. Prefix Suffix         * 3. Greedy (sorting searching)         * 4. DP         **/        int t;//        t = sc.nextInt();        t = 1;        for (int tt = 1; tt <= t; tt++) {            solve(tt);        }        System.gc();    }}    
