// practice with rainboyimport java.io.*;import java.util.*; public class CF232B extends PrintWriter {	CF232B() { super(System.out, true); }	Scanner sc = new Scanner(System.in);	public static void main(String[] $) {		CF232B o = new CF232B(); o.main(); o.flush();	} 	static final int MD = 1000000007;	long power(int a, long k) {		if (k == 0)			return 1;		long p = power(a, k / 2);		p = p * p % MD;		if (k % 2 == 1)			p = p * a % MD;		return p;	}	void main() {		int n = sc.nextInt();		long m = sc.nextLong();		int k = sc.nextInt();		int[][] ch = new int[n + 1][n + 1];		ch[0][0] = 1;		for (int i = 1; i <= n; i++) {			ch[i][0] = 1;			for (int j = 1; j <= i; j++)				ch[i][j] = (ch[i - 1][j] + ch[i - 1][j - 1]) % MD;		}		int[][] pp = new int[n + 1][n + 1];		for (int i = 0; i <= n; i++)			for (int j = 0; j <= i; j++)				pp[i][j] = (int) power(ch[i][j], m / n);		int[][] dp = new int[n + 1][k + 1];		dp[0][0] = 1;		for (int i = 0; i < n; i++)			for (int j = 0; j <= k; j++) {				int x = dp[i][j];				if (x == 0)					continue;				for (int h = 0; h <= n && j + h <= k; h++)					dp[i + 1][j + h] = (int) ((dp[i + 1][j + h] + (long) x * pp[n][h] % MD * (i < m % n ? ch[n][h] : 1)) % MD);			}		println(dp[n][k]);	}}