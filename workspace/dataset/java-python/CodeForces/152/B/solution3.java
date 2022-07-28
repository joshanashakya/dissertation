import java.util.*;import java.io.*;   public class A { 	public static void main(String[]args)throws IOException {		FastReader sc = new FastReader();		PrintWriter out = new PrintWriter(System.out); 		int n = sc.nextInt(), m = sc.nextInt();		int x = sc.nextInt(), y = sc.nextInt();		int k = sc.nextInt();		int r = Math.max(n, m);		long count = 0;		while (k-- > 0) {			int dx = sc.nextInt(), dy = sc.nextInt();			int movx = Integer.MAX_VALUE;			int movy = Integer.MAX_VALUE;			if (dx < 0)				movx = (1 - x) / dx; 			else if (dx > 0)				movx = (n - x) / dx; 			if (dy < 0)				movy = (1 - y) / dy; 			else if (dy > 0)				movy = (m - y) / dy; 			int min = Math.min(movx, movy);			count += min;			x += dx * min;			y += dy * min;		} 		out.println(count);		out.close();	}}  // public static int  gcd(int a, int b) {// 	if (a == 0)// 		return b; // 	return gcd(b % a, a);// } class FastReader { 	BufferedReader br;	StringTokenizer st; 	public FastReader() {		br = new BufferedReader(new InputStreamReader(System.in));	} 	String next() {		while (st == null || !st.hasMoreElements()) {			try {				st = new StringTokenizer(br.readLine());			} catch (IOException  e) {				e.printStackTrace();			}		}		return st.nextToken();	} 	int nextInt() {		return Integer.parseInt(next());	} 	int [] nextIntArray(int n) {		int [] arr = new int[n];		for (int i = 0; i < n; i++)			arr[i] = nextInt(); 		return arr; 	}  	long nextLong() {		return Long.parseLong(next());	} 	long [] nextLongArray(int n) {		long [] arr = new long[n];		for (int i = 0; i < n; i++)			arr[i] = nextLong(); 		return arr; 	} 	double nextDouble() {		return Double.parseDouble(next());	} 	String nextLine() {		String str = "";		try {			str = br.readLine();		} catch (IOException e) {			e.printStackTrace();		}		return str;	} }
