import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.List;import java.util.StringTokenizer; public class Main implements Runnable { 	int INF = (int) 1e9;	List<Integer> edges[];	int anc[][];	int ts[], te[];	int t; 	private void solve() throws IOException {		int n = nextInt();		int a[] = new int[2 * n];		for (int i = 0; i < 2 * n; ++i) {			a[i] = nextInt();		}		int ans = 0;		for (int i = 0, pos = -1; i < 2 * n; i += 2) {			for (int j = i + 1; j < 2 * n; ++j) {				if (a[i] == a[j]) {					pos = j;					break;				}			}			ans += (pos - (i + 1));			while (pos > i + 1) {				int tmp = a[pos];				a[pos] = a[pos - 1];				a[pos - 1] = tmp;				pos--;			}		}		pw.println(ans);	} 	BufferedReader br;	StringTokenizer st;	PrintWriter pw; 	public static void main(String args[]) {		new Main().run();	} 	public void run() {		try {			br = new BufferedReader(new InputStreamReader(System.in));			pw = new PrintWriter(System.out);			st = null;			solve();			pw.flush();			pw.close();			br.close();		} catch (IOException e) {			e.printStackTrace();			System.exit(1);		}	} 	int nextInt() throws IOException {		return Integer.parseInt(next());	} 	long nextLong() throws IOException {		return Long.parseLong(next());	} 	double nextDouble() throws IOException {		return Double.parseDouble(next());	} 	String next() throws IOException {		while (st == null || !st.hasMoreTokens()) {			st = new StringTokenizer(br.readLine());		}		return st.nextToken();	}}