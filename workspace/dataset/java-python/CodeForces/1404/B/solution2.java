import java.io.*;import java.util.*; public class C { 	static ArrayList<Integer> adj[]; 	static int dist, b, max, q; 	static void dfs(int u, int p, int h) { 		if (max <= h) {			max = h;			q = u;		}		for (int v : adj[u]) {			if (v != p) {				dfs(v, u, h + 1);				if (v == b)					dist = h + 1;			}		}	} 	public static void main(String args[]) throws Exception {		Scanner sc = new Scanner(System.in);		PrintWriter pw = new PrintWriter(System.out); 		int t = sc.nextInt();		while (t-- > 0) {			int n = sc.nextInt();			int a = sc.nextInt() - 1;			b = sc.nextInt() - 1;			int da = sc.nextInt();			int db = sc.nextInt();			adj = new ArrayList[n];			for (int i = 0; i < n; i++) {				adj[i] = new ArrayList<>();			}			for (int i = 0; i < n - 1; i++) {				int u = sc.nextInt() - 1;				int v = sc.nextInt() - 1;				adj[u].add(v);				adj[v].add(u);			}			max = 0;			q = 0;			dist = 0;			dfs(a, -1, 0);			int y=dist;			dfs(q, -1, 0);			dist=y;			if (dist <= da) {				pw.println("Alice");			} else if (2 * da >= max) {				pw.println("Alice"); 			} else {				if (db > 2 * da) {					pw.println("Bob"); 				} else {					pw.println("Alice"); 				}			}		}		pw.flush();	} 	/////////////////////////////////////////////////////////////////////////////////////////// 	static class tri {		int x, y, z; 		public tri(int x, int y, int z) {			this.x = x;			this.y = y;			this.z = z;		} 	} 	static class pair implements Comparable<pair> {		int x, y;		boolean w, l; 		public pair(boolean a, boolean b) {			w = a;			l = b;		} 		pair(int s, int d) {			x = s;			y = d;		} 		@Override		public int compareTo(pair p) {			if (x == p.x)				return y - p.y;			return x - p.x;		} 		@Override		public String toString() {			return x + " " + y; 		} 	} 	static long mod(long ans, int mod) {		return (ans % mod + mod) % mod;	} 	static long gcd(long a, long b) {		if (a == 0)			return b;		return gcd(b % a, a);	} 	static long lcm(long a, long b) {		return (a * b) / gcd(a, b);	} 	public static int log(int n, int base) {		int ans = 0;		while (n + 1 > base) {			ans++;			n /= base;		}		return ans;	} 	static long pow(long b, long e) {		long ans = 1;		while (e > 0) {			if ((e & 1) == 1)				ans = ((ans * 1l * b));			e >>= 1;			{ 			}			b = ((b * 1l * b));		}		return ans;	} 	static long powmod(long r, long e, int mod) {		long ans = 1;		r %= mod;		while (e > 0) {			if ((e & 1) == 1)				ans = (int) ((ans * 1l * r) % mod);			e >>= 1;			r = (int) ((r * 1l * r) % mod);		}		return ans;	} 	static int ceil(int a, int b) {		int ans = a / b;		return a % b == 0 ? ans : ans + 1;	} 	static long ceil(long a, long b) {		long ans = a / b;		return a % b == 0 ? ans : ans + 1;	} 	static HashMap<Integer, Integer> compress(int a[]) {		TreeSet<Integer> ts = new TreeSet<>();		HashMap<Integer, Integer> hm = new HashMap<>();		for (int x : a)			ts.add(x);		for (int x : ts) {			hm.put(x, hm.size() + 1);		}		return hm;	} 	// Returns nCr % p	static int C[]; 	static int nCrModp(int n, int r, int p) {		if (r > n - r)			r = n - r;		if (C[r] != 0)			return C[r];		// The array C is going to store last		// row of pascal triangle at the end.		// And last entry of last row is nCr 		C[0] = 1; // Top row of Pascal Triangle 		// One by constructs remaining rows of Pascal		// Triangle from top to bottom		for (int i = 1; i <= n; i++) { 			// Fill entries of current row using previous			// row values			for (int j = Math.min(i, r); j > 0; j--) 				// nCj = (n-1)Cj + (n-1)C(j-1);				C[j] = (C[j] + C[j - 1]) % p;		}		return C[r];	} 	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public Scanner(String file) throws Exception {			br = new BufferedReader(new FileReader(file));		} 		public int[] intArr(int n) throws IOException {			int a[] = new int[n];			for (int i = 0; i < a.length; i++) {				a[i] = nextInt();			}			return a;		} 		public long[] longArr(int n) throws IOException {			long a[] = new long[n];			for (int i = 0; i < a.length; i++) {				a[i] = nextLong();			}			return a;		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		} 		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		} 		public double nextDouble() throws IOException {			String x = next();			StringBuilder sb = new StringBuilder("0");			double res = 0, f = 1;			boolean dec = false, neg = false;			int start = 0;			if (x.charAt(0) == '-') {				neg = true;				start++;			}			for (int i = start; i < x.length(); i++)				if (x.charAt(i) == '.') {					res = Long.parseLong(sb.toString());					sb = new StringBuilder("0");					dec = true;				} else {					sb.append(x.charAt(i));					if (dec)						f *= 10;				}			res += Long.parseLong(sb.toString()) / f;			return res * (neg ? -1 : 1);		} 		public boolean ready() throws IOException {			return br.ready();		} 	} 	public static void shuffle(int[] times2) {		int n = times2.length;		for (int i = 0; i < n; i++) {			int r = i + (int) (Math.random() * (n - i));			int tmp = times2[i];			times2[i] = times2[r];			times2[r] = tmp;		}	} }