import java.io.*;import java.math.BigInteger;import java.util.*; public class Main { 	public static class FastReader {		BufferedReader br;		StringTokenizer root;		 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (root == null || !root.hasMoreTokens()) {				try {					root = new StringTokenizer(br.readLine());				} catch (Exception addd) {					addd.printStackTrace();				}			}			return root.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (Exception addd) {				addd.printStackTrace();			}			return str;		}	}		public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));		public static FastReader sc = new FastReader(); 	static int mod = (int) (1e9+7),MAX=(int) (3e5);    static List<Pair>[] edges;    static int n,m;    static Boolean[][][][] dp;    	public static void main(String[] args) {			n = sc.nextInt();		m = sc.nextInt();		edges = new ArrayList[n+1];		for(int i=0;i<=n;++i) edges[i] = new ArrayList<>();		for(int i=1;i<=m;++i) {			int u = sc.nextInt();			int v = sc.nextInt();			int wt = sc.next().charAt(0)-'a';			edges[u].add(new Pair(v,wt));		}		dp = new Boolean[n+1][n+1][26][2];		for(int i=1;i<=n;++i) {			for(int j=1;j<=n;++j) {				boolean win = f(i,j,0,0);				if(win) out.print('A');				else out.print('B');			}			out.println();		}		out.close();   }   private static boolean f(int i, int j, int ch, int p) {		if(dp[i][j][ch][p] != null) return dp[i][j][ch][p];				boolean ans = false;		if(p == 0) {			for(Pair node : edges[i]) {				int v = node.v;				int c = node.wt;				if(c >= ch)					ans|=!f(v,j,c,p^1);  			}		}else {			for(Pair node : edges[j]) {				int v = node.v;				int c = node.wt;				if(c >= ch)					ans|=!f(i,v,c,p^1);  			}		}		return dp[i][j][ch][p] = ans;	}static class Pair{	   int v;	   int wt;	   Pair(int v,int wt){		   this.v = v;		   this.wt = wt;	   }   } }  
