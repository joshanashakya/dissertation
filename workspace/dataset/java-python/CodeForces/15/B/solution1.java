import java.io.BufferedInputStream;import java.io.BufferedOutputStream;import java.io.BufferedReader;import java.io.FileNotFoundException;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.OutputStreamWriter;import java.io.PrintWriter;import java.util.StringTokenizer; public class Main {	public static void main(String[] args) throws FileNotFoundException, IOException {		InputReader in = new InputReader(new BufferedInputStream(System.in));		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(System.out)));		TaskB solver = new TaskB();		long t1 = System.currentTimeMillis();		solver.solve(1, in, out);		out.flush();		long t2 = System.currentTimeMillis();//		System.err.println(t2 - t1);		out.close(); 	}} class Seg implements Comparable<Seg> {	double a;	double b; 	public Seg(double a, double b) {		this.a = a;		this.b = b;	} 	public int compareTo(Seg t) {		return Double.compare(a, t.a);	} } class TaskB { 	int id[];	int sz[];	double eps = 1e-10;	long INF = (long) 1e15; 	void solve(int testNumber, InputReader in, PrintWriter pw) {		int t = in.nextInt();		for (int tt = 0; tt < t; ++tt) {			long n = in.nextLong();			long m = in.nextLong();			long x1 = in.nextLong();			long y1 = in.nextLong();			long x2 = in.nextLong();			long y2 = in.nextLong();			long dr = Math.min(n - x1, n - x2);			long dd = Math.min(m - y1, m - y2);			long du = Math.min(y1 - 1, y2 - 1);			long dl = Math.min(x1 - 1, x2 - 1);			long rec1[] = new long[4];			long rec2[] = new long[4];			rec1[0] = x1 - dl;			rec1[1] = y1 - du;			rec1[2] = x1 + dr;			rec1[3] = y1 + dd;			rec2[0] = x2 - dl;			rec2[1] = y2 - du;			rec2[2] = x2 + dr;			rec2[3] = y2 + dd;//			System.err.println(Arrays.toString(rec1));//			System.err.println(Arrays.toString(rec2));			long l = 0, b = 0;//			System.err.println(inter(rec1, rec2));			if (inter(rec1, rec2)) {				if (rec1[0] < rec2[0]) {					l = Math.abs(rec1[2] - rec2[0]) + 1;				} else {					l = Math.abs(rec2[2] - rec1[0]) + 1;				}				if (rec1[1] < rec2[1]) {					b = Math.abs(rec1[3] - rec2[1]) + 1;				} else {					b = Math.abs(rec2[3] - rec1[1]) + 1;				}			}//			System.err.println(l + " " + b);			long ans = n * m - (ar(rec1) + ar(rec2)) + l * b;			pw.println(ans);		}	} 	boolean inter(long rec1[], long rec2[]) {		if (rec1[0] < rec2[0]) {			if (rec2[0] <= rec1[2]) {				if (rec1[1] < rec2[1]) {//					System.err.println(rec2[1] + " " + rec1[3]);					if (rec2[1] <= rec1[3]) {						return true;					}				} else {					if (rec1[1] <= rec2[3]) {						return true;					}				}			}		} else {			if (rec1[0] <= rec2[2]) {//				System.err.println("hello");				if (rec1[1] < rec2[1]) {					if (rec2[1] <= rec1[3])						return true;				} else {					if (rec1[1] <= rec2[3])						return true;				} 			}		}		return false;	} 	long ar(long rec[]) {		long l = Math.abs(rec[0] - rec[2]) + 1;		long b = Math.abs(rec[1] - rec[3]) + 1;		return l * b; 	} 	long pow(int n, int m) {		if (m == 0)			return 1;		long ans = pow(n, m / 2);		ans = (ans * ans);		if (m % 2 == 1) {			ans = (ans * n);		}		return ans;	} 	double pow(double n, int m) {		if (m == 0)			return 1;		double ans = pow(n, m / 2);		ans = (ans * ans);		if (m % 2 == 1) {			ans = (ans * n);		}		return ans;	}} class InputReader {	BufferedReader br;	StringTokenizer st; 	public InputReader(InputStream in) {		br = new BufferedReader(new InputStreamReader(in));		st = null;	} 	public String next() {		while (st == null || !st.hasMoreTokens()) {			try {				st = new StringTokenizer(br.readLine());			} catch (IOException e) {				throw new RuntimeException(e);			}		}		return st.nextToken();	} 	public int nextInt() {		return Integer.parseInt(next());	} 	public long nextLong() {		return Long.parseLong(next());	} 	public double nextDouble() {		return Double.parseDouble(next());	}}