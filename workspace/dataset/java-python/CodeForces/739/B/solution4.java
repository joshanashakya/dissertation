import java.util.*;import java.io.*; public class Main {	public static void main(String args[]) {new Main().run();} 	FastReader in = new FastReader();	PrintWriter out = new PrintWriter(System.out);	void run(){		work();		out.flush();	}	long mod=1000000007;	long gcd(long a,long b) {		return a==0?b:b>=a?gcd(b%a,a):gcd(b,a);	}	long[] W;	int[] ret;	ArrayList<int[]>[] graph;	void work() {		int n=in.nextInt();		W=new long[n];		ret=new int[n];		graph=(ArrayList<int[]>[])new ArrayList[n];		for(int i=0;i<n;i++) {			graph[i]=new ArrayList<>();		}		for(int i=0;i<n;i++) {			W[i]=in.nextLong();		}		for(int i=1;i<n;i++) {			int s=in.nextInt()-1,w=in.nextInt();			graph[s].add(new int[] {i,w});		}		dfs(0,new int[n],new long[n],0);		for(int i=0;i<n;i++) {			out.print(ret[i]+" ");		}	}	private void dfs(int node, int[] count, long[] sum,int p) {		sum[p]+=p==0?0:sum[p-1];		long v=sum[p]-W[node];		int l=0,r=p;		while(l<r) {			int m=(l+r)/2;			if(sum[m]<v) {				l=m+1;			}else {				r=m;			}		}		if(p-1>=0)count[p-1]++;		if(l-1>=0)count[l-1]--;		for(int[] g:graph[node]) {			int nn=g[0],w=g[1];			sum[p+1]+=w;			dfs(nn,count,sum,p+1);		}		ret[node]=count[p];		if(p-1>=0)count[p-1]+=count[p];		count[p]=0;		sum[p]=0;	}}	   class FastReader{	BufferedReader br;	StringTokenizer st; 	public FastReader()	{		br=new BufferedReader(new InputStreamReader(System.in));	}  	public String next() 	{		while(st==null || !st.hasMoreElements())//回车，空行情况		{			try {				st = new StringTokenizer(br.readLine());			} catch (IOException e) {				e.printStackTrace();			}		}		return st.nextToken();	} 	public int nextInt() 	{		return Integer.parseInt(next());	} 	public long nextLong()	{		return Long.parseLong(next());	}}