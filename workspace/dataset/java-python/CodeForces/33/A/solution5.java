import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Scanner;import java.util.StringTokenizer;import java.util.*; public class whatIsForDinner {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	public static void main(String[] args) {		FastReader sc = new FastReader();		int n=sc.nextInt();		int m=sc.nextInt();		int k=sc.nextInt();		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();		ArrayList<Integer> l=new ArrayList<Integer>();		while(n-->0)		{			int r=sc.nextInt();			int c=sc.nextInt();			if(!l.contains(r))			{				l.add(r);			}						if(!h.containsKey(r))			{				h.put(r,c);			}			else			{				h.put(r,Math.min(h.get(r),c));			}		}		long sum=0;		for(int i=0;i<l.size();i++)		{			sum=sum+h.get(l.get(i));		}		System.out.println(Math.min(k,sum));	}}