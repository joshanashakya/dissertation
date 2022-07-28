// Don't place your source in a packageimport java.util.*;import java.lang.*;import java.io.*;import java.math.*;       // Please name your class Mainpublic class Main {		//static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));     /*static int read() throws IOException {        in.nextToken();        return (int) in.nval;    }    static String readString() throws IOException {        in.nextToken();        return in.sval;	}*/			static Scanner in = new Scanner(System.in);		public static void main (String[] args) throws java.lang.Exception {	    		//InputReader in = new InputReader(System.in);		PrintWriter out = new PrintWriter(System.out);		 		int T=1;				for(int t=0;t<T;t++){			int n=Int();			long A[][]=new long[n][2];						for(int i=0;i<n;i++){				A[i][0]=Int();				A[i][1]=Int();			}						Solution sol=new Solution();			sol.solution(A);		} 		out.flush();	}				public static long Long(){		return in.nextLong();	}	public static int Int(){		return in.nextInt();	}	public static String Str(){		return in.next();	}} class Solution{	//constant variable	final int MAX=Integer.MAX_VALUE;	final int MIN=Integer.MIN_VALUE;	//Set<Integer>adjecent[];	////////////////////////////// 	public void fastprint(PrintWriter out,String s){		out.print(s);	}		public void fastprintln(PrintWriter out,String s){		out.println(s);	} 			long dp[][];	int n;	public void solution(long A[][]){		n=A.length;		dp=new long[n+1][2*n+2];				for(int i=0;i<dp.length;i++){			Arrays.fill(dp[i],-1);		}				long res=dfs(A,0,0);				msg(res+"");	}			public long dfs(long A[][],int i,int t){		if(i>=n){			if(t<0){				return 10000000000000l;			}			return 0;		}		if(dp[i][t+n]!=-1)return dp[i][t+n];		long res=Long.MAX_VALUE;				res=Math.min(res,dfs(A,i+1,t-1));//pay		res=Math.min(res,A[i][1]+dfs(A,i+1,Math.min(n,(int)(t+A[i][0]))));//not pay				dp[i][t+n]=res;		return res;	}	  										/*public void delete(Dnode node){		Dnode pre=node.pre;		Dnode next=node.next;		pre.next=next;		next.pre=pre;		map.remove(node.v);	}		public void add(int v){		Dnode node=new Dnode(v);		Dnode pre=tail.pre;		pre.next=node;		node.pre=pre;		node.next=tail;		tail.pre=node;		map.put(v,node);	}		class Dnode{		Dnode next=null;		Dnode pre=null;		int v;		public Dnode(int v){			this.v=v;		}			}*/ 	public void reverse(int A[]){		List<Integer>l=new ArrayList<>();		for(int i:A)l.add(i);		Collections.reverse(l);		for(int i=0;i<A.length;i++){			A[i]=l.get(i);		}	} 	public void sort(int A[]){		Arrays.sort(A);	}		public void swap(int A[],int l,int r){		int t=A[l];		A[l]=A[r];		A[r]=t;	}	 			public long C(long fact[],int i,int j){ // C(20,3)=20!/(17!*3!)		// take   a/b     where a=20!  b=17!*3!		if(j>i)return 1;		if(j<=0)return 1;		long mod=998244353;		long a=fact[i];		long b=((fact[i-j]%mod)*(fact[j]%mod))%mod;		BigInteger B= BigInteger.valueOf(b);		long binverse=B.modInverse(BigInteger.valueOf(mod)).longValue();		return ((a)*(binverse%mod))%mod;	}		public long gcd(long a, long b)     {         if (a == 0)             return b;         return gcd(b%a, a);     } 		 		//map operation	public void put(Map<Integer,Integer>map,int i){		if(!map.containsKey(i))map.put(i,0);		map.put(i,map.get(i)+1);	}		public void delete(Map<Integer,Integer>map,int i){		map.put(i,map.get(i)-1);		if(map.get(i)==0)map.remove(i);	}     	  	/*public void tarjan(int p,int r){		if(cut)return;		List<Integer>childs=adjecent[r];		dis[r]=low[r]=time;		time++;				//core for tarjan		int son=0;		for(int c:childs){			if(ban==c||c==p)continue;			if(dis[c]==-1){				son++;				tarjan(r,c);				low[r]=Math.min(low[r],low[c]);				if((r==root&&son>1)||(low[c]>=dis[r]&&r!=root)){					cut=true;					return;				}			}else{				if(c!=p){					low[r]=Math.min(low[r],dis[c]);				}			}		}			}*/		 		//helper function I would use	public void remove(Map<Integer,Integer>map,int i){		map.put(i,map.get(i)-1);		if(map.get(i)==0)map.remove(i);	}				public void ascii(String s){		for(char c:s.toCharArray()){			System.out.print((c-'a')+"  ");		}		msg("");	}		public int flip(int i){		if(i==0)return 1;		else return 0;	}		public boolean[] primes(int n){		boolean A[]=new boolean[n+1];		for(int i=2;i<=n;i++){			if(A[i]==false){				for(int j=i+i;j<=n;j+=i){					A[j]=true;				}			}		}		return A;	}		public void msg(String s){		System.out.println(s);	}		public void msg1(String s){		System.out.print(s);	}		public int[] kmpPre(String p){		int pre[]=new int[p.length()];		int l=0,r=1;		while(r<p.length()){			if(p.charAt(l)==p.charAt(r)){				pre[r]=l+1;				l++;r++;			}else{				if(l==0)r++;				else l=pre[l-1];			}		}		return pre;	}		public boolean isP(String s){		int l=0,r=s.length()-1;		while(l<r){			if(s.charAt(l)!=s.charAt(r))return false;			l++;r--;		}		return true;	}		public int find(int nums[],int x){//union find => find method		if(nums[x]==x)return x;		int root=find(nums,nums[x]);		nums[x]=root;		return root;	}	 			public int[] copy1(int A[]){		int a[]=new int[A.length];		for(int i=0;i<a.length;i++)a[i]=A[i];		return a;	}			public void print1(int A[]){		for(long i:A)System.out.print(i+"  ");		System.out.println();	}	public void print2(int A[][]){		for(int i=0;i<A.length;i++){			for(int j=0;j<A[0].length;j++){				System.out.print(A[i][j]+"   ");			}System.out.println();		}	}		public int min(int a,int b){		return Math.min(a,b);	}			public int[][] matrixdp(int[][] grid) {        if(grid.length==0)return new int[][]{};        int res[][]=new int[grid.length][grid[0].length];        for(int i=0;i<grid.length;i++){            for(int j=0;j<grid[0].length;j++){                res[i][j]=grid[i][j]+get(res,i-1,j)+get(res,i,j-1)-get(res,i-1,j-1);            }        }        return res;    }        public int get(int grid[][],int i,int j){        if(i<0||j<0||i>=grid.length||j>=grid[0].length)return 0;        return grid[i][j];    }		public int[] suffixArray(String s){		int n=s.length();		Suffix A[]=new Suffix[n];				for(int i=0;i<n;i++){			A[i]=new Suffix(i,s.charAt(i)-'a',0);		}				for(int i=0;i<n;i++){			if(i==n-1){				A[i].next=-1;			}else{				A[i].next=A[i+1].rank;			}		}		Arrays.sort(A);				for(int len=4;len<A.length*2;len<<=1){			int in[]=new int[A.length];			int rank=0;			int pre=A[0].rank;			A[0].rank=rank;			in[A[0].index]=0;			for(int i=1;i<A.length;i++){//rank for the first two letter				if(A[i].rank==pre&&A[i].next==A[i-1].next){					pre=A[i].rank;					A[i].rank=rank;				}else{					pre=A[i].rank;					A[i].rank=++rank;				}				in[A[i].index]=i;			}						for(int i=0;i<A.length;i++){				int next=A[i].index+len/2;				if(next>=A.length){					A[i].next=-1;				}else{					A[i].next=A[in[next]].rank;				}			}									Arrays.sort(A);		}						int su[]=new int[A.length];		for(int i=0;i<su.length;i++){			su[i]=A[i].index;		}		return su;	}	} //suffix array Structclass Suffix implements Comparable<Suffix>{	int index;	int rank;	int next;	public Suffix(int i,int rank,int next){		this.index=i;		this.rank=rank;		this.next=next;	}		@Override	public int compareTo(Suffix other) {		if(this.rank==other.rank){			return this.next-other.next;		}		return this.rank-other.rank;	}		public String toString(){		return this.index+"   "+this.rank+"   "+this.next+"  ";	}}   class Wrapper implements Comparable<Wrapper>{	int spf;int cnt;	public Wrapper(int spf,int cnt){		this.spf=spf;		this.cnt=cnt;	}			@Override	public int compareTo(Wrapper other) {		return this.spf-other.spf;	}}       class Node{//what the range would be for that particular node		boolean state=false;        int l=0,r=0;		int ll=0,rr=0;        public Node(boolean state){            this.state=state;        }    }					class Seg1{			int A[];			public Seg1(int A[]){				this.A=A;			}						public void update(int left,int right,int val,int s,int e,int id){				if(left<0||right<0||left>right)return;				if(left==s&&right==e){										A[id]+=val;					return;				}				int mid=s+(e-s)/2; //[s,mid] [mid+1,e]								if(left>=mid+1){					update(left,right,val,mid+1,e,id*2+2);				}else if(right<=mid){					update(left,right,val,s,mid,id*2+1);				}else{					update(left,mid,val,s,mid,id*2+1);					update(mid+1,right,val,mid+1,e,id*2+2);				}			}						public int query(int i,int add,int s,int e,int id){								if(s==e&&i==s){					return A[id]+add;				}								int mid=s+(e-s)/2; //[s,mid] [mid+1,e]								if(i>=mid+1){					return query(i,A[id]+add,mid+1,e,id*2+2);				}else{					return query(i,A[id]+add,s,mid,id*2+1);				}			}	}  	 class MaxFlow{		 		  public static List<Edge>[] createGraph(int nodes) {			List<Edge>[] graph = new List[nodes];			for (int i = 0; i < nodes; i++)			  graph[i] = new ArrayList<>();			return graph;		  } 		  public static void addEdge(List<Edge>[] graph, int s, int t, int cap) {			graph[s].add(new Edge(t, graph[t].size(), cap));			graph[t].add(new Edge(s, graph[s].size() - 1, 0));		  } 		  static boolean dinicBfs(List<Edge>[] graph, int src, int dest, int[] dist) {			Arrays.fill(dist, -1);			dist[src] = 0;			int[] Q = new int[graph.length];			int sizeQ = 0;			Q[sizeQ++] = src;			for (int i = 0; i < sizeQ; i++) {			  int u = Q[i];			  for (Edge e : graph[u]) {				if (dist[e.t] < 0 && e.f < e.cap) {				  dist[e.t] = dist[u] + 1;				  Q[sizeQ++] = e.t;				}			  }			}			return dist[dest] >= 0;		  } 		  static int dinicDfs(List<Edge>[] graph, int[] ptr, int[] dist, int dest, int u, int f) {			if (u == dest)			  return f;			for (; ptr[u] < graph[u].size(); ++ptr[u]) {			  Edge e = graph[u].get(ptr[u]);			  if (dist[e.t] == dist[u] + 1 && e.f < e.cap) {				int df = dinicDfs(graph, ptr, dist, dest, e.t, Math.min(f, e.cap - e.f));				if (df > 0) {				  e.f += df;				  graph[e.t].get(e.rev).f -= df;				  return df;				}			  }			}			return 0;		  } 		  public static int maxFlow(List<Edge>[] graph, int src, int dest) {			int flow = 0;			int[] dist = new int[graph.length];			while (dinicBfs(graph, src, dest, dist)) {			  int[] ptr = new int[graph.length];			  while (true) {				int df = dinicDfs(graph, ptr, dist, dest, src, Integer.MAX_VALUE);				if (df == 0)				  break;				flow += df;			  }			}			return flow;		  }		 	 }	 	 	 class Edge {			int t, rev, cap, f; 			public Edge(int t, int rev, int cap) {			  this.t = t;			  this.rev = rev;			  this.cap = cap;			}		  }		  	   class Seg{        int l,r;        int min=Integer.MAX_VALUE;        Seg left=null,right=null;		int tree[];        public Seg(int l,int r){            this.l=l;            this.r=r;            if(l!=r){                int mid=l+(r-l)/2;                if(l<=mid)left=new Seg(l,mid);                if(r>=mid+1)right=new Seg(mid+1,r);                if(left!=null)min=Math.min(left.min,min);                if(right!=null)min=Math.min(right.min,min);            }else{                min=tree[l];            }        }        public int query(int s,int e){            if(l==s&&r==e){                return min;            }            int mid=l+(r-l)/2; //left :  to mid-1,            if(e<=mid){                return left.query(s,e);            }            else if(s>=mid+1){                return right.query(s,e);            }else{                return Math.min(left.query(s,mid),right.query(mid+1,e));            }        }         public void update(int index){            if(l==r){                min=tree[l];                return;            }            int mid=l+(r-l)/2;            if(index<=mid){                left.update(index);            }else{                right.update(index);            }            this.min=Math.min(left.min,right.min);        }    }		class Fenwick {        int tree[];//1-index based        int A[];        int arr[];        public Fenwick(int[] A) {            this.A=A;            arr=new int[A.length];            tree=new int[A.length+1];            int sum=0;            for(int i=0;i<A.length;i++){                update(i,A[i]);            }        }         public void update(int i, int val) {            arr[i]+=val;            i++;            while(i<tree.length){                tree[i]+=val;                i+=(i&-i);            }                    }         public int sumRange(int i, int j) {                        return pre(j+1)-pre(i);        }         public int pre(int i){            int sum=0;            while(i>0){                sum+=tree[i];                i-=(i&-i);            }            return sum;        }    }	    		  		  
