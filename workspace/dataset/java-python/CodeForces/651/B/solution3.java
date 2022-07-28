 import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.HashSet;import java.util.Map.Entry;import java.util.Scanner;import java.util.Set;import java.util.StringTokenizer;  @SuppressWarnings("unused")public class A {	public  static  FastScannerA scan = new FastScannerA();	public static PrintWriter out = new PrintWriter(System.out);	static void sort(int[] a) {		ArrayList<Integer> l=new ArrayList<>();		for (int i:a) l.add(i);		Collections.sort(l);		for (int i=0; i<a.length; i++) a[i]=l.get(i);	}	public static void solve () {		int n=scan.nextInt();		int[]a =scan.readArray(n);		int[] last=new int[1010];		int cnt=0;		sort(a);		for(int i=0;i<n;i++) {			for(int j=0;j<=1000;j++) {				if(a[i]>last[j]) {					if(last[j]>0) {						cnt++;					}					last[j]=a[i];					break;				}			}		}		//System.out.println(Arrays.toString(last));		System.out.println(cnt);	}	public static void main(String[] args) {				solve();		out.close();	} }class FastScannerA {	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	StringTokenizer st= new StringTokenizer("");	String next() {		while (!st.hasMoreTokens())			try {				st=new StringTokenizer(br.readLine());			} catch (IOException e) {				e.printStackTrace();			}		return st.nextToken();	}	int nextInt() {		return Integer.parseInt(next());	}	int[] readArray(int n) {		int[] a=new int[n];		for (int i=0; i<n; i++) a[i]=nextInt();		return a;	}	long nextLong() {		return Long.parseLong(next());	}	void sort(long[] a) {		ArrayList<Long> l=new ArrayList<>();		for (long i:a) l.add(i);		Collections.sort(l);		for (int i=0; i<a.length; i++) a[i]=l.get(i);	}	 	}  