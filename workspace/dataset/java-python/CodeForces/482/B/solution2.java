import java.util.*;import java.io.*;import java.text.*; public class B482 { 	static class SegmentTree { // 1-based DS, OOP 		int N; // the number of elements in the array as a power of 2 (i.e. after padding)		int[] array, sTree, lazy; 		SegmentTree(int[] in) {			array = in;			N = in.length - 1;			sTree = new int[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero			lazy = new int[N << 1];			build(1, 1, N);		} 		void build(int node, int b, int e) // O(n)		{			if (b == e)				sTree[node] = array[b];			else {				int mid = b + e >> 1;				build(node << 1, b, mid);				build(node << 1 | 1, mid + 1, e);				sTree[node] = sTree[node << 1] & sTree[node << 1 | 1];			}		} 		void update_point(int index, int val) // O(log n)		{			index += N - 1;			sTree[index] = val;			while (index > 1) {				index >>= 1;				sTree[index] = sTree[index << 1] & sTree[index << 1 | 1];			}		} 		void update_range(int i, int j, int val) // O(log n)		{			update_range(1, 1, N, i, j, val);		} 		void update_range(int node, int b, int e, int i, int j, int val) {			if (i > e || j < b)				return;			if (b >= i && e <= j) {				sTree[node] |= val;				lazy[node] |= val;			} else {				int mid = b + e >> 1;				update_range(node << 1, b, mid, i, j, val);				update_range(node << 1 | 1, mid + 1, e, i, j, val);				sTree[node] = sTree[node << 1] & sTree[node << 1 | 1];			} 		} 		int query(int i, int j) {			return query(1, 1, N, i, j);		} 		int query(int node, int b, int e, int i, int j) // O(log n)		{			if (i > e || j < b)				return (1 << 30) - 1;			if (b >= i && e <= j)				return sTree[node] | lazy[node];			int mid = b + e >> 1;			int q1 = query(node << 1, b, mid, i, j);			int q2 = query(node << 1 | 1, mid + 1, e, i, j);			return (q1 & q2) | lazy[node]; 		} 	} 	public static void main(String[] args) throws IOException {		Scanner sc = new Scanner(System.in);		PrintWriter pw = new PrintWriter(System.out);		int n = sc.nextInt();		int m = sc.nextInt();		int N = 1;		while (N < n)			N *= 2;		int[] arr = new int[N + 1];		SegmentTree st = new SegmentTree(arr);		int[] l = new int[m];		int[] r = new int[m];		int[] q = new int[m];		for (int i = 0; i < m; i++) {			l[i] = sc.nextInt();			r[i] = sc.nextInt();			q[i] = sc.nextInt();			st.update_range(l[i], r[i], q[i]);		}		for (int i = 0; i < m; i++) {			if (st.query(l[i], r[i]) != q[i]) {				pw.println("NO");				pw.flush();				pw.close();				return;			}		}		pw.println("YES");		for (int i = 1; i <= n; i++) {			pw.print(st.query(i, i) + " ");		}		pw.flush(); 	} 	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public Scanner(FileReader r) {			br = new BufferedReader(r);		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		} 		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		} 		public double nextDouble() throws IOException {			String x = next();			StringBuilder sb = new StringBuilder("0");			double res = 0, f = 1;			boolean dec = false, neg = false;			int start = 0;			if (x.charAt(0) == '-') {				neg = true;				start++;			}			for (int i = start; i < x.length(); i++)				if (x.charAt(i) == '.') {					res = Long.parseLong(sb.toString());					sb = new StringBuilder("0");					dec = true;				} else {					sb.append(x.charAt(i));					if (dec)						f *= 10;				}			res += Long.parseLong(sb.toString()) / f;			return res * (neg ? -1 : 1);		} 		public boolean ready() throws IOException {			return br.ready();		} 	}}
