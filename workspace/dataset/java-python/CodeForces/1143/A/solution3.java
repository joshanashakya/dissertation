//package testing;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*; public class Main {	static public class Pair{		int a,b;		public Pair(int a,int b) {			this.a = a;			this.b = b;		}	}	static class cmp implements Comparator<Pair>{		public int compare(Pair p,Pair q) {			if(p.a<q.a) {				return -1;			}			return 1;		}	}	public static void main(String[] args) {		FastScanner fs = new FastScanner();		PrintWriter out = new PrintWriter(System.out);		int test = 1;//		test = fs.nextInt();		outer:		while(test-->0) {	            int n = fs.nextInt();           int arr[] = new int[n];           int z = 0;           int o = 0;           for(int i=0;i<n;i++) {        	   arr[i] = fs.nextInt();        	   if(arr[i]==1) {        		   o++;        	   }        	   else {        		   z++;        	   }           }           for(int i=0;i<n;i++) {        	   if(arr[i]==0) {        		   z--;        	   }        	   else {        		   o--;        	   }        	   if(o==0||z==0) {        		   out.println(i+1);        		   continue outer;        	   }           }                        		}		out.close();	    		    	} 	static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer(""); 		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++)				a[i]=nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		}	} }