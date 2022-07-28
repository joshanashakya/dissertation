import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class KvassAndFairNut {	private static final FastReader in = new FastReader();	private static final PrintWriter out = new PrintWriter(System.out); 	public static void main(String[] args) {		Solver sol = new Solver();		int tt = 1;		sol.solve(tt);		out.close();	} 	private static final class Solver {		public void solve(int testCase) {			int n = in.nextInt();			long s = Long.parseLong(in.next());			int[] a = new int[n];			long sum = 0L;			int min = Integer.MAX_VALUE;			for (int i = 0; i < n; ++i) {				a[i] = in.nextInt();				sum += a[i];				min = Math.min(min, a[i]);			}			if (sum < s)				out.println(-1);			else {				out.println(Math.min(min, (sum - s) / n));			}		}	} 	private static final class FastReader {		private BufferedReader br;		private StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in), 1 << 16);			st = null;		} 		public String next() {			while (st == null || !st.hasMoreTokens()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					throw new RuntimeException(e);				}			}			return st.nextToken();		} 		public int nextInt() {			return Integer.parseInt(next());		}	}}
