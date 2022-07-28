import java.io.*;import java.util.*; public class CFJava3 {	static final PrintWriter out = new PrintWriter(System.out);		static class FIO {		StringTokenizer st;		BufferedReader in;		FIO() {			st = null;			in = new BufferedReader(new InputStreamReader(System.in));		}		String next() {			while (st == null || !st.hasMoreTokens()) { 				try {					st = new StringTokenizer(in.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		}		int nextInt() {			return Integer.parseInt(next());		}		long nextLong() {			return Long.parseLong(next());		}		double nextDouble() {			return Double.parseDouble(next());		}	}	static final FIO in = new FIO();		public static void main(String[] args) {		int tc = 1;		while (tc-- > 0) {			new solver();		}		out.close();	}	static class solver {		static class ed {			int a, b;			boolean det;			ed(int a, int b, boolean det) {				this.a = a;				this.b = b;				this.det = det;			}		}		int N, M;		ed[] edges;		final int MAXN = (int) 1e5 + 5;		int res1 = MAXN, res2 = MAXN;				List<Integer> l1, l2;				int nt(int x) {			return (x + N)%(2*N);		}						boolean poss(boolean det) {			// construct the implication graph.			List<Integer>[] adj = new ArrayList[2*N];			for (int i = 0; i < 2*N; ++i)				adj[i] = new ArrayList<>();			for (ed x : edges) {				if (x.det != det) {					adj[nt(x.a)].add(x.b);					adj[nt(x.b)].add(x.a);					adj[x.b].add(nt(x.a));					adj[x.a].add(nt(x.b));				}				else {					adj[nt(x.a)].add(nt(x.b));					adj[nt(x.b)].add(nt(x.a));					adj[x.a].add(x.b);					adj[x.b].add(x.a);				}			}			int[] vst = new int[2*N];			int[] numpos = new int[2*N];			int reg = 1;									for (int i = 0; i < 2*N; ++i) {				if (vst[i] == 0) {					// run a stack-based dfs;					ArrayList<Integer> vis = new ArrayList<>();					int on = 0;					Stack<Integer> st = new Stack<>();					st.add(i);					while (!st.isEmpty()) {						int cur = st.peek();						st.pop();						vis.add(cur);						if (cur < N) on++;						vst[cur] = reg;						for (int next : adj[cur]) {							if (vst[next] != 0) continue;							st.add(next);						}					}					for (int x : vis) {						numpos[x] = on;					}					reg++;				}			}			for (int i = 0; i < N; ++i) {				if (vst[i] == vst[N + i])					return false;			}			if (det) res1 = 0; else res2 = 0;			boolean[] vcomp = new boolean[reg];			boolean[] ton = new boolean[reg];						for (int i = 0; i < 2*N; ++i) {				if (vcomp[vst[i]]) continue;				vcomp[vst[i]] = true; vcomp[vst[nt(i)]] = true;								if (numpos[i] < numpos[nt(i)]) {					ton[vst[i]] = true;				}				else {					ton[vst[nt(i)]] = true;				}				if (det) {					res1 += Math.min(numpos[i], numpos[nt(i)]);				}				else {					res2 += Math.min(numpos[i], numpos[nt(i)]);				}			}			if (det)				l1 = new ArrayList<Integer>();			else				l2 = new ArrayList<Integer>();			for (int i = 0; i < N; ++i) {				if (ton[vst[i]]) {					if (det)						l1.add(i + 1);					else						l2.add(i + 1);				}			}						return true;		}		void pr(List<Integer> a) {			out.println(a.size());			for (int x : a)				out.print(x + " ");		}		solver() {			N = in.nextInt(); M = in.nextInt();			edges = new ed[M];			for (int i = 0; i < M; ++i) {				int a = in.nextInt(), b = in.nextInt();				boolean c = in.next().equals("B");				--a; --b;				//out.println(a + " " + b + " " + c);				edges[i] = new ed(a, b, c);			}			boolean a = poss(true), b = poss(false);			if (!a && !b) {				out.println(-1);				return;			}			if (a && !b) {				pr(l1);				return;			}			if (b && !a) {				pr(l2);				return;			}			if (l1.size() > l2.size()) {				pr(l2);			}			else {				pr(l1);			}					}	}}/*119 2587575696 945418070762247361 719309487*/    