import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class WorkFile {    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer sToken = new StringTokenizer(reader.readLine());        int n = Integer.parseInt(sToken.nextToken());        int m = Integer.parseInt(sToken.nextToken());        int b = Integer.parseInt(sToken.nextToken());        int mod = Integer.parseInt(sToken.nextToken());        int[] a = new int[n+1];        sToken = new StringTokenizer(reader.readLine());        for (int i=1; i<=n; i++) a[i] = Integer.parseInt(sToken.nextToken());        int[][] dp = new int[n+1][b+1];        int[][] dp2 = new int[n+1][b+1];        for (int i=1; i<=n; i++) {            if (b<a[i]) continue;            dp[i][a[i]] = 1;        }        for (int i=1; i<=n; i++) {            for (int j=0; j<=b; j++) {                dp2[i][j] = (dp[i][j] + dp2[i-1][j]) % mod;            }        }        for (int i=2; i<=m; i++) {            dp = new int[n+1][b+1];            for (int j=1; j<=n; j++) {                for (int k=0; k<=b; k++) {                    if (k<a[j]) continue;                    dp[j][k] = dp2[j][k-a[j]];                }            }            dp2 = new int[n+1][b+1];            for (int j=1; j<=n; j++) {                for (int k=0; k<=b; k++) {                    dp2[j][k] = (dp[j][k] + dp2[j-1][k]) % mod;                }            }        }        int ans = 0;        for (int i=0; i<=b; i++) {            ans = (ans + dp2[n][i]) % mod;        }        PrintWriter writer = new PrintWriter(System.out);        writer.print(ans);        writer.close();    }}
