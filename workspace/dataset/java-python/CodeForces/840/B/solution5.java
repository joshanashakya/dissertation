import java.util.*;import java.io.*; public class Main {	public static void main(String args[]) {new Main().run();} 	FastReader in = new FastReader();	PrintWriter out = new PrintWriter(System.out);	void run(){		work();		out.flush();	}	long mod=998244353;	long gcd(long a,long b) {		return a==0?b:b>=a?gcd(b%a,a):gcd(b,a);	}	ArrayList<int[]>[] graph;	ArrayList<Integer> ret;	int[] W;	int n,m;	void work() {		n=ni();		m=ni();		W=nia(n);		ret=new ArrayList<>();		int sum=0;		for(int i=0;i<n;i++) {			if(W[i]>=0) {				sum+=W[i];			}		}		for(int i=0;i<n;i++) {			if(W[i]==-1&&sum%2==1) {				sum++;				W[i]=1;			}else if(W[i]==-1) {				W[i]=0;			}		}		if(sum%2==1) {			out.println(-1);			return;		}		graph=(ArrayList<int[]>[])new ArrayList[n];		for(int i=0;i<n;i++)graph[i]=new ArrayList<>();		for(int i=0;i<m;i++) {			int s=in.nextInt()-1;			int e=in.nextInt()-1;			graph[s].add(new int[] {e,i});			graph[e].add(new int[] {s,i});		}		dfs(0,new boolean[n]);		out.println(ret.size());		for(int r:ret) {			out.println(r+1);		}	} 	private int dfs(int node, boolean[] vis) {		vis[node]=true;		int r=W[node];		for(int[] g:graph[node]) {			if(!vis[g[0]]) {				int v=dfs(g[0],vis);				if(v%2==1) {					ret.add(g[1]);				}				r+=v;			}		}		return r;	}  	//input	private ArrayList<Integer>[] ng(int n, int m) {		ArrayList<Integer>[] graph=(ArrayList<Integer>[])new ArrayList[n];		for(int i=0;i<n;i++) {			graph[i]=new ArrayList<>();		}		for(int i=1;i<=m;i++) {			int s=in.nextInt()-1,e=in.nextInt()-1;			graph[s].add(e);			graph[e].add(s);		}		return graph;	} 	private int ni() {		return in.nextInt();	} 	private long nl() {		return in.nextLong();	} 	private long[] na(int n) {		long[] A=new long[n];		for(int i=0;i<n;i++) {			A[i]=in.nextLong();		}		return A;	}	private int[] nia(int n) {		int[] A=new int[n];		for(int i=0;i<n;i++) {			A[i]=in.nextInt();		}		return A;	}}	 class FastReader{	BufferedReader br;	StringTokenizer st; 	public FastReader()	{		br=new BufferedReader(new InputStreamReader(System.in));	}  	public String next() 	{		while(st==null || !st.hasMoreElements())//回车，空行情况		{			try {				st = new StringTokenizer(br.readLine());			} catch (IOException e) {				e.printStackTrace();			}		}		return st.nextToken();	} 	public int nextInt() 	{		return Integer.parseInt(next());	} 	public long nextLong()	{		return Long.parseLong(next());	}}
