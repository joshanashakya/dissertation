import java.io.*;import java.util.*; public class E implements Runnable {	public static void main (String[] args) {new Thread(null, new E(), "_cf", 1 << 28).start();} 	long oo = (long)1e18;	boolean[] finished, used;	int edit;		public void run() {		FastScanner fs = new FastScanner();		PrintWriter out = new PrintWriter(System.out);		System.err.println(""); 		int n = fs.nextInt();		int m = fs.nextInt();		int L = fs.nextInt();		int s = fs.nextInt(), t = fs.nextInt();		int[] deg = new int[n];		Edge[] list = new Edge[m];		for(int i = 0; i < m; i++) {			int u = fs.nextInt();			int v = fs.nextInt();			int we = fs.nextInt();			deg[u]++; deg[v]++;			list[i] = new Edge(u, v, we, i);			if(we == 0) list[i].isSpecial = true;		}		Edge[][] adj = new Edge[n][];		for(int i = 0; i < n; i++) {			adj[i] = new Edge[deg[i]];			deg[i] = 0;		}		for(int i = 0; i < m; i++) {			int u = list[i].u, v = list[i].v, we = list[i].we;			adj[u][deg[u]++] = new Edge(u, v, we, i);			adj[v][deg[v]++] = new Edge(v, u, we, i);		}				finished = new boolean[m];		used = new boolean[m];		if(sp(list, adj, s, t) < L) {			System.out.println("NO");			return;		}		for(int i = 0; i < m; i++) {			if(list[i].we == 0) list[i].we++;		}		if(sp(list, adj, s, t) > L) {			System.out.println("NO");			return;		}		for(int i = 0; i < m; i++) if(list[i].isSpecial && !used[i]) {			list[i].we = L+1;		}				long cur;		while((cur = sp(list, adj, s, t)) != L) {			if(edit == -1) throw new RuntimeException();			list[edit].we += L-cur;		}				System.err.println(sp(list, adj, s, t));				out.println("YES");		for(int i = 0; i < m; i++) {			out.printf("%d %d %d\n", list[i].u, list[i].v, list[i].we);		}				out.close();	}		long sp(Edge[] list,Edge[][] adj, int s, int t) {		int n = adj.length;		int[] edgeTo = new int[n];		long[] dist = new long[n];		Arrays.fill(dist, oo);		dist[s] = 0;		PriorityQueue<Node> pq = new PriorityQueue<E.Node>();		pq.add(new Node(s, 0, 0));		while(!pq.isEmpty()) {			Node now = pq.poll();			if(now.dist != dist[now.idx]) continue;			for(Edge e : adj[now.idx]) { 				int to = e.v;				if(list[e.id].we == 0) continue;				long nwe = now.dist + list[e.id].we;				if(nwe < dist[to]) {					edgeTo[to] = e.id;					dist[to] = nwe;					pq.add(new Node(to, 0, nwe));				}			}		}		if(dist[t] == oo) return dist[t];		edit = -1;		int curNode = t;		while(curNode != s) {//			System.out.println("! " + curNode);			int id = edgeTo[curNode];			used[id] = true;			if(!finished[id] && list[id].isSpecial) {				if(edit == -1) edit = id;//				break;			}			int who = list[id].u;			if(who == curNode) who = list[id].v;			curNode = who;			if(curNode == s) break;		}		return dist[t];	}		class Node implements Comparable<Node> {		int idx, used;		long dist;		Node(int a, int b, long d) {			dist = d;			idx = a;			used = b;		}		public int compareTo(Node n) {			return Long.compare(dist, n.dist);		}		public String toString() {			return String.format("%d %d - %d", idx, used, dist);		}	} 	class Edge {		int u, v, we, id;		boolean isSpecial;		Edge(int a, int b, int c, int i) {			u = a; v = b; we = c;			id = i;		}	}		class FastScanner {		public int BS = 1<<16;		public char NC = (char)0;		byte[] buf = new byte[BS];		int bId = 0, size = 0;		char c = NC;		double num = 1;		BufferedInputStream in; 		public FastScanner() {			in = new BufferedInputStream(System.in, BS);		} 		public FastScanner(String s) {			try {				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);			}			catch (Exception e) {				in = new BufferedInputStream(System.in, BS);			}		} 		public char nextChar(){			while(bId==size) {				try {					size = in.read(buf);				}catch(Exception e) {					return NC;				}                				if(size==-1)return NC;				bId=0;			}			return (char)buf[bId++];		} 		public int nextInt() {			return (int)nextLong();		} 		public long nextLong() {			num=1;			boolean neg = false;			if(c==NC)c=nextChar();			for(;(c<'0' || c>'9'); c = nextChar()) {				if(c=='-')neg=true;			}			long res = 0;			for(; c>='0' && c <='9'; c=nextChar()) {				res = (res<<3)+(res<<1)+c-'0';				num*=10;			}			return neg?-res:res;		} 		public double nextDouble() {			double cur = nextLong();			return c!='.' ? cur:cur+nextLong()/num;		} 		public String next() {			StringBuilder res = new StringBuilder();			while(c<=32)c=nextChar();			while(c>32) {				res.append(c);				c=nextChar();			}			return res.toString();		} 		public String nextLine() {			StringBuilder res = new StringBuilder();			while(c<=32)c=nextChar();			while(c!='\n') {				res.append(c);				c=nextChar();			}			return res.toString();		} 		public boolean hasNext() {			if(c>32)return true;			while(true) {				c=nextChar();				if(c==NC)return false;				else if(c>32)return true;			}		}				public int[] nextIntArray(int n) {			int[] res = new int[n];			for(int i = 0; i < n; i++) res[i] = nextInt();			return res;		}			} }