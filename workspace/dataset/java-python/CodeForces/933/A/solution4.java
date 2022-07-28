import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.List;import java.util.Random;import java.util.StringTokenizer; // IMPORTANT - DP to find longest subsequencepublic class Main implements Runnable { 	int sz[];	int id[];	List<Integer> edges[];	int MAXN = (int) 1.5e7 + 1; 	private void solve() throws IOException {		int n = nextInt();		int a[] = new int[n + 1];		for (int i = 1; i <= n; ++i)			a[i] = nextInt();		int l[] = new int[n + 2];		int r[] = new int[n + 2];		for (int i = 1; i <= n; ++i) {			if (a[i] == 1)				l[i] = 1;			if (a[i] == 2)				r[i] = 1;		}		for (int i = 1; i <= n + 1; ++i)			l[i] += l[i - 1];		for (int i = n; i >= 0; --i)			r[i] += r[i + 1];//		System.err.println(Arrays.toString(l));//		System.err.println(Arrays.toString(r));		// find the longest non increasing subsequence in a		int dp[][][] = new int[n + 1][n + 1][3];		// dp[i][j][k] -> longest non inc subseq from j to i ending with k		for (int i = 1; i <= n; ++i) {			dp[i][i][a[i]] = 1;			for (int j = i - 1; j >= 1; --j) {				for (int k = 1; k <= a[j]; ++k) {					dp[i][j][a[j]] = Math.max(dp[i][j][a[j]], dp[i][j + 1][k] + 1);				}				for (int k = 1; k <= 2; ++k) {					dp[i][j][k] = Math.max(dp[i][j][k], dp[i][j + 1][k]);				}			}		}		int ans = 0;		for (int i = 1; i <= n; ++i) {			for (int j = i; j <= n; ++j) {				ans = Math.max(ans, l[i - 1] + Math.max(dp[j][i][1], dp[j][i][2]) + r[j + 1]);			}		}		pw.println(ans);	} 	int find(int x) {		int p = x;		while (id[p] != p) {			p = id[p];		}		while (id[x] != x) {			int tmp = id[x];			id[x] = p;			x = tmp;		}		return p;	} 	void union(int x, int y) {		int a = find(x);		int b = find(y);		if (a == b)			return;		if (sz[a] <= sz[b]) {			id[a] = b;			sz[b] += sz[a];		} else {			id[b] = a;			sz[a] += sz[b];		} 	} 	void test() throws IOException {		Random rnd = new Random();		for (int i = 0; i < 2; ++i) {			int n = rnd.nextInt(30) + 1;			int a[] = new int[n];			System.err.println(n);			for (int j = 0; j < n; ++j) {				a[j] = rnd.nextInt(2) + 1;				System.err.print(a[j] + " ");			}//			solve(n, a);			System.err.println();		}	} 	BufferedReader br;	StringTokenizer st;	PrintWriter pw; 	public static void main(String args[]) {		new Main().run();	} 	public void run() {		try {			br = new BufferedReader(new InputStreamReader(System.in), 32768);			pw = new PrintWriter(System.out);			st = null;			solve();			pw.flush();			pw.close();			br.close();		} catch (IOException e) {			e.printStackTrace();			System.exit(1);		}	} 	int nextInt() throws IOException {		return Integer.parseInt(next());	} 	long nextLong() throws IOException {		return Long.parseLong(next());	} 	double nextDouble() throws IOException {		return Double.parseDouble(next());	} 	String next() throws IOException {		while (st == null || !st.hasMoreTokens()) {			st = new StringTokenizer(br.readLine());		}		return st.nextToken();	}}
