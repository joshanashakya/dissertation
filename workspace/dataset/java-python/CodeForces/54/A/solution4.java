import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Arrays;import java.util.Locale;import java.util.StringTokenizer; public class Main { 	private void solve() throws IOException {		int n = nextInt();		int k = nextInt();		int c = nextInt();		int[] h = new int[c + 2];		boolean[] b = new boolean[n + 1];		Arrays.fill(b, false); 		for (int i = 1; i <= c; i++)			h[i] = nextInt(); 		int ans = 0;		h[0] = 0;		h[c + 1] = n + 1;		for (int i = 0; i <= c; i++) {			for (int j = h[i]; j < h[i + 1]; j += k)				b[j] = true;		} 		for (int i = 1; i <= n; i++)			if (b[i])				ans++; 		out.println(ans);	} 	public static void main(String[] args) {		new Main().run();	} 	BufferedReader br;	StringTokenizer st;	PrintWriter out;	boolean eof = false; 	private void run() {		Locale.setDefault(Locale.US);		try {			br = new BufferedReader(new InputStreamReader(System.in));			out = new PrintWriter(System.out);			solve();			out.close();		} 		catch (Throwable e) {			e.printStackTrace();			System.exit(566);		}	} 	String nextToken() {		while (st == null || !st.hasMoreTokens()) {			try {				st = new StringTokenizer(br.readLine());			} catch (Exception e) {				eof = true;				return "0";			}		}		return st.nextToken();	} 	int nextInt() {		return Integer.parseInt(nextToken());	} 	long nextLong() {		return Long.parseLong(nextToken());	} 	double nextDouble() {		return Double.parseDouble(nextToken());	} }