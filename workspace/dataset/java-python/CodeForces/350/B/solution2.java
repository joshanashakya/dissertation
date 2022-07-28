import java.io.*;import java.util.*;import java.math.*; public class Hello {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	public static void main(String[] args) {		FastReader in = new FastReader(); 		// start code here		int n = in.nextInt();		int type[] = new int[n];		for (int i = 0; i < n; ++i)			type[i] = in.nextInt();		int a[] = new int[n];		int deg[] = new int[n];		for (int i = 0; i < n; ++i) {			a[i] = in.nextInt() - 1;			if (a[i] != -1)				++deg[a[i]];		}		LinkedList<Integer> ll = new LinkedList<Integer>();		for (int i = 0; i < n; ++i) {			if (type[i] == 1) {				LinkedList<Integer> nl = new LinkedList<Integer>();				nl.addFirst(i);// using addFirst to avoid reversing LinkedList at the end				int temp = i;				while (a[temp] >= 0 && type[a[temp]] == 0 && deg[a[temp]] == 1) {					nl.addFirst(a[temp]);					temp = a[temp];				}				if (nl.size() > ll.size())					ll = nl;			}		}		System.out.println(ll.size());		for (int i : ll) {			System.out.print((i + 1) + " ");		}	}}