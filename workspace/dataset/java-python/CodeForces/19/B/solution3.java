import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.StringTokenizer; public class Solution {    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(reader.readLine());        long[] dp = new long[n+1];        Arrays.fill(dp, Long.MAX_VALUE);        dp[0] = 0;        for (int i=1; i<=n; i++) {            StringTokenizer sToken = new StringTokenizer(reader.readLine());            int t = Integer.parseInt(sToken.nextToken());            int x = Integer.parseInt(sToken.nextToken());            for (int j=n; j>-1; j--) {                if (dp[Math.max(0, j-t-1)]==Long.MAX_VALUE) continue;                dp[j] = Math.min(dp[j], dp[Math.max(0, j-t-1)]+x);            }        }        System.out.println(dp[n]);    }}
