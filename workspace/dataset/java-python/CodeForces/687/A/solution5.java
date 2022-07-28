import java.awt.Point;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigDecimal;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashSet;import java.util.Hashtable;import java.util.LinkedList;import java.util.Queue;import java.util.Stack;import java.util.StringTokenizer;  public class N687A {	static PrintWriter out;	static Scanner sc;	static ArrayList<Integer>q,w;	static ArrayList<Integer>adj[];	static HashSet<Integer>primesH;	static boolean can;	//static ArrayList<Integer>a;	static HashSet<Long>h,tmp;	static boolean[]vis;	static int[]a,b,c,d,col,dist;	static int[][]g;	static long[]l,dp;	static char[][]mp;	public static void main(String[]args) throws IOException {		sc=new Scanner(System.in);		out=new PrintWriter(System.out);		int n=ni(),m=ni();		int x,y,w;		adj=new ArrayList[n];		vis=new boolean[n];		col=new int[n];		Arrays.fill(col, -1);		for(int i=0;i<n;i++)adj[i]=new ArrayList<Integer>();	//	g=new int[n][n];		for(int i=0;i<m;i++) {			x=sc.nextInt()-1;			y=sc.nextInt()-1;			adj[y].add(x);			adj[x].add(y);		}		can=true;		for(int i=0;i<n;i++) {			if(!vis[i])dfs(i,0);		}	//	dfs(0,0);		if(!can)out.println(-1);		else {			ArrayList<Integer>a=new ArrayList<Integer>();			ArrayList<Integer>b=new ArrayList<Integer>();			for(int i=0;i<n;i++) {				if(col[i]==0)a.add(i+1);				else if(col[i]==1) b.add(i+1);			}			out.println(a.size());			for(int aa:a) {				out.print(aa+" ");			}			out.println();			out.println(b.size());			for(int aa:b) {				out.print(aa+" ");			}			out.println();		}		out.close();	} 	private static void dfs(int u,int c) {				vis[u]=true;		col[u]=c;		for(int v:adj[u]) {			if(!vis[v]) {				dfs(v,1-c);			}else {				if(col[v]==c) {					can=false;				}			}			}					} 	private static void disp(int[] revl) {		for(int i=0;i<revl.length;i++) {			out.print(revl[i]+" ");		}		out.println();	}	static class Pair implements Comparable<Pair>{		int a,b;		Pair(int a,int b){			this.a=a;			this.b=b;		}		@Override		public int compareTo(Pair p) {			return a-p.a;		}		public String toString() {			return "("+a+" "+b+")";		}	}	static int ni() throws IOException {		return sc.nextInt();	}	static double nd() throws IOException {		return sc.nextDouble();	}	static long nl() throws IOException {		return  sc.nextLong();	}	static String ns() throws IOException {		return sc.next();	}	static int[] nai(int n) throws IOException {		int[] a = new int[n];		for (int i = 0; i < n; i++)			a[i] = sc.nextInt();		return a;	}	static long[] nal(int n) throws IOException {		long[] a = new long[n];		for (int i = 0; i < n; i++)			a[i] = sc.nextLong();		return a;	}	static int[][] nmi(int n,int m) throws IOException{		int[][]a=new int[n][m];		for(int i=0;i<n;i++) {			for(int j=0;j<m;j++) {				a[i][j]=sc.nextInt();			}		}		return a;	} 	static long[][] nml(int n,int m) throws IOException{		long[][]a=new long[n][m];		for(int i=0;i<n;i++) {			for(int j=0;j<m;j++) {				a[i][j]=sc.nextLong();			}		}		return a;	}	static void o(String x) {		out.print(x);	}	static void ol(String x) {		out.println(x);	}	static void ol(int x) {		out.println(x);	}	static class Scanner 	{		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));} 		public String next() throws IOException 		{			while (st == null || !st.hasMoreTokens()) 				st = new StringTokenizer(br.readLine());			return st.nextToken();		}		public boolean hasNext() {return st.hasMoreTokens();}		public int nextInt() throws IOException {return Integer.parseInt(next());}				public double nextDouble() throws IOException {return Double.parseDouble(next());}				public long nextLong() throws IOException {return Long.parseLong(next());} 		public String nextLine() throws IOException {return br.readLine();}					public boolean ready() throws IOException {return br.ready(); }		 	}}
