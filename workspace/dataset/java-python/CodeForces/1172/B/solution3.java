import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer; public class B { 	static long mod = 998_244_353;		static int N;	static ArrayList<Integer> adj[];		static long fact[];	static int subSz[];		public static void main(String[] args) {		FS in = new FS();		N = in.nextInt();		adj = new ArrayList[N];		for(int i = 0; i < N; i++) adj[i] = new ArrayList<>();		for(int i = 0; i < N-1; i++) {			int a = in.nextInt()-1, b = in.nextInt()-1;			adj[a].add(b);			adj[b].add(a);		}						fact = new long[N+3];		fact[0] = 1;		for(int i = 1; i < fact.length; i++) fact[i] = mult(i, fact[i-1]);				subSz = new int[N];		sdfs(0, -1);				long res = mult(N, dfs(0, -1));		System.out.println(res);	}		static void sdfs(int n, int p) {		subSz[n] = 1;		for(int ii : adj[n]) {			if(ii != p) {				sdfs(ii, n);				subSz[n] += subSz[ii];			}		}	}		static long dfs(int n, int p) {		int children = adj[n].size();		if(p != -1) children--;				long res = fact[children + (n == 0 ? 0 : 1)];		for(int ii : adj[n]) {			if(ii != p) res = mult(res, dfs(ii, n));		}				return res;	}		static long add(long a, long b) {		a += b;		return a >= mod ? a-mod : a;	}	static long mult(long a, long b) {		a *= b;		return a >= mod ? a%mod : a;	}		static class FS{		BufferedReader br;		StringTokenizer st;		public FS() {			br = new BufferedReader(new InputStreamReader(System.in));		}		String next() {			while(st == null || !st.hasMoreElements()) {				try {st = new StringTokenizer(br.readLine());}				catch(Exception e) {}			}			return st.nextToken();		}		int nextInt() {			return Integer.parseInt(next());		}	} }