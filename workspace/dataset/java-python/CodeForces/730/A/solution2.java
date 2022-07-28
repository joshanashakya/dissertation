import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Arrays;import java.util.Random;import java.util.StringTokenizer; public class Main implements Runnable { 	int INF = (int) 1e9 + 7;	int MAXN = (int) 1e6 + 1; 	private boolean check(int a[]) {		int tmp = a[0];		int n = a.length;		for (int i = 0; i < n; ++i) {			if (a[i] != tmp)				return false;		}		return true;	} 	private void solve() throws IOException {		int n = nextInt();		int a[] = new int[n];		for (int i = 0; i < n; ++i) {			a[i] = nextInt();		}		int maxn = (int) 1e4;		int ans[][] = new int[maxn][n];		int m = 0;		while (!check(a)) {			int b[][] = new int[n][2];			for (int i = 0; i < n; ++i) {				b[i][0] = a[i];				b[i][1] = i;			}			Arrays.sort(b, (int x[], int y[]) -> y[0] - x[0]);			int p = 1;			while (p < n && (p < 2 || b[p][0] == b[0][0])) {				++p;			}			if (p % 2 == 0) {				for (int i = 0; i < p; i += 2) {					ans[m][b[i][1]] = ans[m][b[i + 1][1]] = 1;					++m;				}			} else {				ans[m][b[0][1]] = ans[m][b[1][1]] = ans[m][b[2][1]] = 1;				++m;				for (int i = 3; i < p; i += 2) {					ans[m][b[i][1]] = ans[m][b[i + 1][1]] = 1;					++m;				}			}			for (int i = 0; i < p; ++i) {				a[b[i][1]] = Math.max(a[b[i][1]] - 1, 0);			}		}		pw.println(a[0]);		pw.println(m);		for (int i = 0; i < m; ++i) {			for (int j = 0; j < n; ++j) {				pw.print(ans[i][j]);			}			pw.println();		} 	} 	private void brute() throws Exception {	} 	void test() throws IOException {		Random rnd = new Random();		for (int i = 0; i < 5; ++i) {			int n = rnd.nextInt(5) + 1;			int m = rnd.nextInt(5) + 1;			System.err.println(n + " " + m);			for (int j = 0; j < m; ++j) {				int l = rnd.nextInt(n) + 1;				int r = l + rnd.nextInt(n - l + 1);				int q = rnd.nextInt(10);				System.err.println(l + " " + r + " " + q);			}//			solve(n, a);			System.err.println();		}	} 	BufferedReader br;	StringTokenizer st;	PrintWriter pw; 	public static void main(String args[]) {		new Main().run();	} 	public void run() {		try {			br = new BufferedReader(new InputStreamReader(System.in), 32768);			pw = new PrintWriter(System.out);			st = null;			solve();			pw.flush();			pw.close();			br.close();		} catch (IOException e) {			e.printStackTrace();			System.exit(1);		}	} 	int nextInt() throws IOException {		return Integer.parseInt(next());	} 	long nextLong() throws IOException {		return Long.parseLong(next());	} 	double nextDouble() throws IOException {		return Double.parseDouble(next());	} 	String next() throws IOException {		while (st == null || !st.hasMoreTokens()) {			st = new StringTokenizer(br.readLine());		}		return st.nextToken();	}}
