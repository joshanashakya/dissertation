//package godiji; import java.util.Scanner;import java.util.Stack;import java.util.StringTokenizer;import java.util.TreeMap;import java.io.BufferedReader;import java.io.BufferedWriter;import java.io.FileWriter;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Comparator;import java.util.HashMap;import java.util.HashSet;import java.util.Iterator;import java.util.PriorityQueue; public class pac1 {	static Scanner scn = new Scanner(System.in);	static int mod = 1000000007;	 	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	static FastReader s = new FastReader(); 	public static void main(String[] args) {		int n=scn.nextInt();		String str[]=new String[n];		HashMap<String, Integer>map=new HashMap<String, Integer>();		for(int i=0;i<n;i++)		{			str[i]=scn.next();			if(map.containsKey(str[i]))				map.put(str[i],map.get(str[i])+1);			else				map.put(str[i], 1);		}		//System.out.println(map);		int ans=0;		for(String val:map.keySet())		{			if(map.get(val)>ans)				ans=map.get(val);		}		System.out.println(ans);	}		public static boolean strong(String str)	{			int n=str.length();					return true;	}		 	 	public static boolean[] sieveOfEratosthenes(int n) { 		boolean prime[] = new boolean[n + 1];		for (int i = 0; i < n; i++)			prime[i] = true; 		for (int p = 2; p * p <= n; p++) {			// If prime[p] is not changed, then it is a prime			if (prime[p] == true) {				// Update all multiples of p				for (int i = p * p; i <= n; i += p)					prime[i] = false;			}		} 		for (int i = 2; i <= n; i++) {			if (prime[i] == true) {				// list.add(i);			} 		}		return prime;	} 	public static long string(int n, String str, long memo[]) {		if (str.length() == n) {			boolean bl = true;			for (int i = 0; i < n - 1; i++) {				if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {					bl = false;					break;				}			}			if (bl)				return 1;			else				return 0;		} 		long a = (string(n, str + "0", memo)) % mod;		long b = (string(n, str + "1", memo)) % mod;		return (a + b) % mod;	} 	public static long gcd(long a, long n) { 		if (a == 0)			return n;		return gcd(n % a, a);	} 	public static long lcm(long a, long b) {		long s = (a * b) / gcd(a, b);		return s;	}} class pair{	int a;	int b;		pair(int fir,int sec)	{		this.a=fir;		this.b=sec;	}}class sorting implements Comparator<pair>{ 	@Override	public int compare(pair o1, pair o2) {		// TODO Auto-generated method stub		int diff=o1.a-o2.a;		if(diff>0)			return 1;		else			return -1;	}	}
