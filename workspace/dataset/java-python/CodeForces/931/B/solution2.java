import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Scanner;import java.util.StringTokenizer; public class worldCup1 {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	public static void main(String[] args) {		FastReader sc = new FastReader();		int n=sc.nextInt();		int a=sc.nextInt();		int b=sc.nextInt();				int i=0;		while(a!=b)		{			a=(int)Math.ceil(a/2.0);			b=(int)Math.ceil(b/2.0);			i++;		}				if(Math.pow(2,i)==n)		{			System.out.println("Final!");		}		else		{			System.out.println(i);		}	}}
