//package testing;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*; public class Main {	static public class Pair{		int a,b;		public Pair(int a,int b) {			this.a = a;			this.b = b;		}	}	static class cmp implements Comparator<Pair>{		public int compare(Pair p,Pair q) {			if(p.a<q.a) {				return -1;			}			return 1;		}	}	static long dp[][] = new long[100][2];	static ArrayList<Integer>v = new ArrayList<>();	static int N;	static Long solve(int ind,int f) {		if(ind < 0) {			return (long) 1;		}		if(dp[ind][f]!=-1) {			return dp[ind][f];		}		long res = 1;		if(f==1) {			res =  (long)(9*solve(ind-1,f));		}		else {			if(ind==N-1) {				if(v.get(ind)==1) {					res = solve(ind-1,1);				}			}			res = Math.max(res,v.get(ind)*solve(ind-1,f));			for(int i=0;i<v.get(ind);i++) {				res = Math.max(res, (long)(i * solve(ind-1,1)));			}		}		return dp[ind][f] = res;			}	public static void main(String[] args) {		FastScanner fs = new FastScanner();		PrintWriter out = new PrintWriter(System.out);		int test = 1;//		test = fs.nextInt();		outer:		while(test-->0) {	           int n = fs.nextInt();                 while(n>0) {        	  v.add(n%10);        	  n/=10;          }          for(int i=0;i<v.size();i++) {        	  for(int j=0;j<2;j++) {        		  dp[i][j] = -1;        	  }          }          N = v.size();          long ans = solve(N-1,0);          out.println(ans);             		}		out.close();	} 	static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer(""); 		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++)				a[i]=nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		}	} }