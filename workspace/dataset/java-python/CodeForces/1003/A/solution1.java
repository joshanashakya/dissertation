import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.Collections;import java.util.HashMap;import java.util.StringTokenizer; public class A { 	public static void main(String[] args) {		FastScanner fs=new FastScanner();			int n = fs.nextInt();			HashMap<Integer,Integer> map = new HashMap<>();			int ans = 0;			for (int i=0; i<n; i++)			{				int b =fs.nextInt();				map.put(b, map.getOrDefault(b, 0)+1);				ans = Math.max(ans, map.get(b));			}			System.out.println(ans);  	} 	static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		}		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++)				a[i]=nextInt();			return a;		}		long nextLong() {			return Long.parseLong(next());		}	} }