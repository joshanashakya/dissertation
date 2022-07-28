import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.OutputStream;import java.io.PrintWriter;import java.math.BigInteger;import java.util.ArrayList;import java.util.Arrays;import java.util.HashMap;import java.util.List;import java.util.Map;import java.util.StringTokenizer; public class Gym { 	static Map<Integer, Long> map = new HashMap<>(); 	public static void main(String[] args) {		FastScanner fs = new FastScanner();		OutputStream outputStream = System.out;		PrintWriter out = new PrintWriter(outputStream);		int t = 1;// fs.nextInt();		while (t-- > 0) { 			solve(fs, out);		}		out.flush();		out.close();	} 	private static void solve(FastScanner fs, PrintWriter out) {		char[] s = fs.next().toCharArray();		int l = s.length;		int ans = 0;		if (l >= 2)			ans = 10 * (s[l - 2] - '0') + (s[l - 1] - '0');		else			ans = s[l - 1] - '0';		if (ans % 4 == 0)			out.print(4);		else			out.print(0);	} 	static boolean isPrime(long n) {		if (n <= 1)			return false;		if (n <= 3)			return true;		if (n % 2 == 0 || n % 3 == 0)			return false;		for (int i = 5; i * i <= n; i = i + 6)			if (n % i == 0 || n % (i + 2) == 0)				return false;		return true;	} 	static void sieveOfEratosthenes(int n, int factors[]) {		factors[1] = 1;		for (int p = 2; p * p <= n; p++) {			if (factors[p] == 0) {				factors[p] = p;				for (int i = p * p; i <= n; i += p)					factors[i] = p;			}		}	} 	static long gcd(long a, long b) {		if (b == 0)			return a;		return gcd(b, a % b);	} 	static class FastScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(""); 		public String next() {			while (!st.hasMoreElements())				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a = new int[n];			for (int i = 0; i < n; i++)				a[i] = nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		} 		BigInteger nextBigInteger() {			return new BigInteger(next());		}	}}