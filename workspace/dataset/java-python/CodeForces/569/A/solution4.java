import java.util.*;import java.io.*;import java.math.*;public class Main{	static int mod = (int)1e9+7;	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));	public static void main(String sp[])throws IOException{		Scanner sc = new Scanner(System.in);		long n = sc.nextLong();		long t = sc.nextLong();		long q = sc.nextLong();		long downloaded = t;		long timer = 0;		long round = 1;		long pos = 0;		boolean f = false;				while(downloaded<n){			timer+=q;			downloaded += (q-1);			if(downloaded>=n)				continue;						if(timer==downloaded){				timer= 0 ;				round++;			}																					//System.out.println(timer+" "+pos+" "+downloaded+" "+round);		}		System.out.println(round);	} 	public static class FastReader {		BufferedReader br;		StringTokenizer st;	 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreTokens()) {				try {					st = new StringTokenizer(br.readLine());				} catch (Exception r) {					r.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());//converts string to integer		} 		double nextDouble() {			return Double.parseDouble(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (Exception r) {				r.printStackTrace();			}			return str;		}	}	}   	   			      	 	  		  			 					