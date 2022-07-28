import java.util.*; import javax.swing.RowFilter.Entry;import javax.swing.text.AbstractDocument.BranchElement;import javax.swing.text.html.parser.Entity; import java.io.*; public class C {	static PrintWriter pw;	static BufferedReader br;	static int inf = (int) 1e9;	static long mod = (long) 1e9 + 7;	static int[][] memo;	static boolean[] vis;	static boolean[][] ok;	static int[] a;	static int n, m;	static ArrayList<Integer>[] adj;	static ArrayList<Integer> primes;	static int[] isComposite; 	static void sieve(int N) // O(N log log N)	{		isComposite = new int[N + 1];		isComposite[0] = isComposite[1] = 1; // 0 indicates a prime number		primes = new ArrayList<Integer>(); 		for (int i = 2; i <= N; ++i) // can loop till i*i <= N if primes array is not needed O(N log log sqrt(N))			if (isComposite[i] == 0) // can loop in 2 and odd integers for slightly better performance			{				primes.add(i);				if (1l * i * i <= N)					for (int j = i * i; j <= N; j += i) // j = i * 2 will not affect performance too much, may alter in														// modified sieve						isComposite[j] = 1;			}	} 	static ArrayList<Integer> primeFactors(int N) // O(sqrt(N) / ln sqrt(N))	{		ArrayList<Integer> factors = new ArrayList<Integer>(); // take abs(N) in case of -ve integers		int idx = 0, p = primes.get(idx); 		while (p * p <= N) {			while (N % p == 0) {				factors.add(p);				N /= p;			}			p = primes.get(++idx);		} 		if (N != 1) // last prime factor may be > sqrt(N)			factors.add(N); // for integers whose largest prime factor has a power of 1		return factors;	} 	static int maxFactor(int N) // O(sqrt(N) / ln sqrt(N))	{ // take abs(N) in case of -ve integers		int idx = 0, p = primes.get(idx);		int ans = -1;		while (p * p <= N) {			while (N % p == 0) {				N /= p;				ans = p;			}			p = primes.get(++idx);		} 		if (N != 1) // last prime factor may be > sqrt(N)			return N; // for integers whose largest prime factor has a power of 1		return ans;	} 	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {		Scanner sc = new Scanner(System.in);		br = new BufferedReader(new InputStreamReader(System.in));		pw = new PrintWriter(System.out);		int n = sc.nextInt();		int m = sc.nextInt(); 		Integer[] a = new Integer[m];		TreeMap<Integer, Integer> tm = new TreeMap<>();		ArrayList<Integer> atk = new ArrayList<>();		ArrayList<Integer> def = new ArrayList<>();		for (int i = 0; i < n; i++) {			String s = sc.next();			if (s.equals("ATK")) {				atk.add(sc.nextInt());			} else				def.add(sc.nextInt());		}		for (int i = 0; i < m; i++) {			int x = sc.nextInt();			a[i] = x;			tm.put(x, tm.getOrDefault(x, 0) + 1);		}		Arrays.sort(a, Collections.reverseOrder());		Collections.sort(atk);		long max = 0;		boolean f = true;		for (int i = 0; i < def.size(); i++) {			if (tm.higherKey(def.get(i)) == null) {				f = false;				break;			}			int key = tm.higherKey(def.get(i));			int c = tm.get(key);			if (c == 1) {				tm.remove(key);			} else				tm.put(key, c - 1);		} 		long sum = 0;		for (int i = 0; i < atk.size(); i++) {			if (tm.higherKey(atk.get(i) - 1) == null) {				f = false;				break;			}			int key = tm.higherKey(atk.get(i) - 1);			int c = tm.get(key);			if (c == 1) {				tm.remove(key);			} else				tm.put(key, c - 1);			sum += key - atk.get(i);		} 		if (f) {			int idx = 0;			for (Map.Entry<Integer, Integer> e : tm.entrySet()) {				int times = e.getValue();				sum += times * 1l * e.getKey();			}			max = Math.max(max, sum);		} 		sum = 0;		for (int i = 0; i < atk.size() && i < a.length; i++) {			if (a[i] < atk.get(i))				break;			sum += a[i] - atk.get(i);		}		max = Math.max(max, sum);		pw.println(max); 		pw.flush();	} 	static final int INF = (int) 1e9;	static int V, s, t, res[][]; // input	static ArrayList<Integer>[] adjList; // input	static int[] ptr, dist; 	static int dinic() // O(V^2E)	{		int mf = 0;		while (bfs()) {			ptr = new int[V];			int f;			while ((f = dfs(s, INF)) != 0)				mf += f;		}		return mf;	} 	static boolean bfs() {		dist = new int[V];		Arrays.fill(dist, -1);		dist[s] = 0;		Queue<Integer> q = new LinkedList<Integer>();		q.add(s);		while (!q.isEmpty()) {			int u = q.remove();			if (u == t)				return true;			for (int v : adjList[u])				if (dist[v] == -1 && res[u][v] > 0) {					dist[v] = dist[u] + 1;					q.add(v);				}		}		return false;	} 	static int dfs(int u, int flow) {		if (u == t)			return flow;		for (int i = ptr[u]; i < adjList[u].size(); i = ++ptr[u]) {			int v = adjList[u].get(i);			if (dist[v] == dist[u] + 1 && res[u][v] > 0) {				int f = dfs(v, Math.min(flow, res[u][v]));				if (f > 0) {					res[u][v] -= f;					res[v][u] += f;					return f;				}			}		}		return 0; 	} 	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		} 		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		} 		public boolean nxtEmpty() throws IOException {			String line = br.readLine();			if (line.isEmpty())				return true;			st = new StringTokenizer(line);			return false;		} 		public double nextDouble() throws IOException {			String x = next();			StringBuilder sb = new StringBuilder("0");			double res = 0, f = 1;			boolean dec = false, neg = false;			int start = 0;			if (x.charAt(0) == '-') {				neg = true;				start++;			}			for (int i = start; i < x.length(); i++)				if (x.charAt(i) == '.') {					res = Long.parseLong(sb.toString());					sb = new StringBuilder("0");					dec = true;				} else {					sb.append(x.charAt(i));					if (dec)						f *= 10;				}			res += Long.parseLong(sb.toString()) / f;			return res * (neg ? -1 : 1);		} 		public boolean ready() throws IOException {			return br.ready();		} 	} 	static class pair implements Comparable<pair> {		int x;		int y; 		public pair(int d, int u) {			x = d;			y = u;		} 		public int compareTo(pair o) {			if (x == o.x)				return y - o.y;			return x - o.x;		} 	} 	static class pair2 implements Comparable<pair2> {		int x;		int y; 		public pair2(int d, int u) {			x = d;			y = u;		} 		public int compareTo(pair2 o) {			return y - o.y;		} 	} 	static int[] nxtarr() throws IOException {		StringTokenizer st = new StringTokenizer(br.readLine());		int[] a = new int[st.countTokens()];		for (int i = 0; i < a.length; i++) {			a[i] = Integer.parseInt(st.nextToken());		}		return a;	} 	static long pow(long a, long e) // O(log e)	{		long res = 1;		while (e > 0) {			if ((e & 1) == 1)				res *= a;			a *= a;			e >>= 1;		}		return res;	} 	static int gcd(int a, int b) {		if (a == 0)			return b;		return gcd(b % a, a);	}}