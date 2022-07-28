import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.OutputStream;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.HashMap;import java.util.List;import java.util.Map;import java.util.StringTokenizer; public class Gym { 	static Map<Integer, Long> map = new HashMap<>(); 	public static void main(String[] args) {		FastScanner fs = new FastScanner();		OutputStream outputStream = System.out;		PrintWriter out = new PrintWriter(outputStream);		int t = 1;// fs.nextInt();		while (t-- > 0) { 			solve(fs, out);		}		out.flush();		out.close();	} 	private static void solve(FastScanner fs, PrintWriter out) {		int n = fs.nextInt();		int a[] = new int[n];		int min = Integer.MAX_VALUE;		for (int i = 0; i < a.length; i++) {			int val = fs.nextInt();			a[i] = val;			min = Math.min(min, val); 		}		int ans = -1;		boolean flag = true;		for (int i = 0; i < a.length; i++) {			if (a[i] % min != 0) {				flag = false;				break;			}		}		out.print((flag) ? min : ans);	} 	static boolean isPrime(long n) {		if (n <= 1)			return false;		if (n <= 3)			return true;		if (n % 2 == 0 || n % 3 == 0)			return false;		for (int i = 5; i * i <= n; i = i + 6)			if (n % i == 0 || n % (i + 2) == 0)				return false;		return true;	} 	static void sieveOfEratosthenes(int n, int factors[]) {		factors[1] = 1;		for (int p = 2; p * p <= n; p++) {			if (factors[p] == 0) {				factors[p] = p;				for (int i = p * p; i <= n; i += p)					factors[i] = p;			}		}	} 	static class FastScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(""); 		public String next() {			while (!st.hasMoreElements())				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a = new int[n];			for (int i = 0; i < n; i++)				a[i] = nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		}	}}
