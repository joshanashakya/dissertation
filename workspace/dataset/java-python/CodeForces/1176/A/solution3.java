//package testing;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*; public class A {	static public class Pair{		int a,b;		public Pair(int a,int b) {			this.a = a;			this.b = b;		}	}	static class cmp implements Comparator<Pair>{		public int compare(Pair p,Pair q) {			if(p.a<q.a) {				return -1;			}			return 1;		}	}	static class comp implements Comparator<Pair>{		public int compare(Pair p,Pair q) {			if(p.a<q.a) {				return -1;			}			return 1;		}	}	public static void main(String[] args) {		FastScanner fs = new FastScanner();		PrintWriter out = new PrintWriter(System.out);		int t = 1;		t = fs.nextInt();		outer:		while(t-->0) {	 	       long n = fs.nextLong();	       Long ans = (long)0;	       while(n%5==0) {	    	   n/=5;	    	   n=n*4;	    	   ans++;	       }	       while(n%3==0) {	    	   n/=3;	    	   n=n*2;	    	   ans++;	       }	       while(n%2==0) {	    	   n/=2;	    	   ans++;	       }	       if(n>1) {	    	   out.println(-1);	    	   continue outer;	       }	       out.println(ans);	       	      	       		}		out.close();	    		    	} 	static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer(""); 		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++)				a[i]=nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		}	} }