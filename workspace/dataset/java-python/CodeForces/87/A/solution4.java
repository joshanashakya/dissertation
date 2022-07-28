import java.io.BufferedReader;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.OutputStreamWriter;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.StringTokenizer; public class Main {	public static void main(String[] args) {		InputReader in = new InputReader(System.in);		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);		TaskB solver = new TaskB();		solver.solve(1, in, out);		out.flush();		out.close();	}} class Pair {	int first;	int second; 	Pair(int first, int second) {		this.first = first;		this.second = second;	} } class TaskB {	int INF = (int) 1e9 + 7;	int MAX_N = (int) 1e5 + 5;	long mod = (long) 1e8;	ArrayList<Integer> edges[];	ArrayList<Integer> rev_edges[];	boolean visited[];	ArrayList<Integer> topSort;	int color[];	ArrayList<Integer> list[]; 	public void solve(int testNumber, InputReader in, PrintWriter pw) {		long a = in.nextLong();		long b = in.nextLong();		long lcm = (a * b) / gcd(a, b);		long d = lcm / a - 1;		long m = lcm / b - 1;		if (d < m) {			d++;		} else {			m++;		}		if (d > m) {			pw.println("Dasha");		} else if (d == m) {			pw.println("Equal");		} else {			pw.println("Masha");		} 	} 	long gcd(long a, long b) {		if (b == 0) {			return a;		} else {			return gcd(b, a % b);		}	} 	int[] shrink(int a[]) {		int n = a.length;		long b[] = new long[n];		for (int i = 0; i < n; i++) {			b[i] = ((long) (a[i] << 32)) | i;		}		Arrays.sort(b);		int ret[] = new int[n];		int p = 0;		for (int i = 0; i < n; i++) {			if (i > 0 && (b[i] ^ b[i - 1]) >> 32 != 0) {				p++;			}			ret[(int) b[i]] = p;		}		return ret;	} 	int sum(int ft[], int i) {		int sum = 0;		for (int j = i; j >= 1; j -= (j & -j)) {			sum += ft[j];//			System.out.println(sum);		}		return sum;	} 	void add(int ft[], int i, int x) {		for (int j = i; j < ft.length; j += (j & -j)) {//			System.out.println(j);			ft[j] += x;		}	} 	boolean isValid(int i, int j, char arr[][]) { 		if (i >= arr[0].length || j >= arr[0].length) {			return false;		}		if (arr[i][j] == '*') {			return false;		}		return true;	} 	long pow(long m, long k) {		long prod = 1;		for (int i = 0; i < k; i++) {			prod = (prod * m) % INF;		}		return prod % INF;	} //	int sum(int k) {//		int sum=0;//		for(int i=k;i>=1;i) {//			sum+=ft[k];//		}//	} 	long fib(int N) {		long fib[] = new long[N + 1];		fib[0] = 1;		fib[1] = 1;		for (int i = 2; i <= N; i++) {			fib[i] = (fib[i - 1] + fib[i - 2]) % mod;		}		return fib[N] % mod;	} 	long sum(int i, int j, long arr[]) {		long sum = 0;		for (int k = i; k <= j; k++) {			sum += arr[k];		}		return sum;	} 	boolean FirstRow_Col(Pair pair) {		return pair.first == 0 || pair.second == 0;	} 	int __gcd(int a, int b) {		if (b == 0)			return a;		return __gcd(b, a % b); 	} 	public int getInt(int num) {		int ret = -1;		switch (num) {		case 0:			ret = 6;			break;		case 1:			ret = 2;			break;		case 2:			ret = 5;			break;		case 3:			ret = 5;			break;		case 4:			ret = 4;			break;		case 5:			ret = 5;			break;		case 6:			ret = 6;			break;		case 7:			ret = 3;			break;		case 8:			ret = 7;			break;		case 9:			ret = 6;			break;		}		return ret;	} 	public int isPow(long num) {		int count = 0;		while (num > 0) {			num /= 2;			count++;		}		return count;	}} class InputReader {	BufferedReader br;	StringTokenizer st; 	public InputReader(InputStream in) {		br = new BufferedReader(new InputStreamReader(in));		st = null;	} 	public String next() {		while (st == null || !st.hasMoreTokens()) {			try {				st = new StringTokenizer(br.readLine());			} catch (IOException e) {				throw new RuntimeException(e);			}		}		return st.nextToken();	} 	public int nextInt() {		return Integer.parseInt(next());	} 	public long nextLong() {		return Long.parseLong(next());	} 	public double nextDouble() {		return Double.parseDouble(next());	}}
