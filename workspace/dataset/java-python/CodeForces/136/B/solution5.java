 import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Scanner;import java.util.StringTokenizer;  @SuppressWarnings("unused")public class A {	public  static  FastScannerA scan = new FastScannerA();	public static PrintWriter out = new PrintWriter(System.out);		public static void solve () {		int x=scan.nextInt();		int y=scan.nextInt();		ArrayList<Integer> a= new ArrayList<Integer>();		while(x>0) {			int d=x%3;			a.add(d);			x/=3;		}		ArrayList<Integer> c= new ArrayList<Integer>();		while(y>0) {			int d=y%3;			c.add(d);			y/=3;		}		while(a.size()<c.size()) {			a.add(0);		}		while(c.size()<a.size()) {			c.add(0);		}		Collections.reverse(a);		Collections.reverse(c);		ArrayList<Integer> b=new ArrayList<Integer>();		for(int i=0;i<a.size();i++) {			int n=(((c.get(i)-a.get(i))%3)+3)%3;			b.add(n);		}		int ans=0,base=1;		for(int i=(int)a.size()-1;i>=0;i--) {			ans+=(base*b.get(i));			base*=3;		}		System.out.println(ans);	}	public static void main(String[] args) {			solve();		out.close();	} }class FastScannerA {	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	StringTokenizer st= new StringTokenizer("");	String next() {		while (!st.hasMoreTokens())			try {				st=new StringTokenizer(br.readLine());			} catch (IOException e) {				e.printStackTrace();			}		return st.nextToken();	}	int nextInt() {		return Integer.parseInt(next());	}	int[] readArray(int n) {		int[] a=new int[n];		for (int i=0; i<n; i++) a[i]=nextInt();		return a;	}	long nextLong() {		return Long.parseLong(next());	}	}  
