//package a2oj_ladder_C; import java.io.ByteArrayInputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.Comparator;import java.util.HashMap;import java.util.HashSet;import java.util.InputMismatchException;import java.util.LinkedList;import java.util.Queue;import java.util.TreeMap;import java.util.TreeSet; @SuppressWarnings("unused")public class Purification329A { 	InputStream is;	PrintWriter out;	String INPUT = "";	int mod = (int)(Math.pow(10,9)+7);	void solve()	{			int n = ni();		char a[][] = nm(n,n);		boolean row = false, col = false;		for (int i=0;i<n;i++) {			row = true;			for (int j=0;j<n;j++)				if (a[i][j] != 'E') row = false;			if (row) break;		}		for (int j=0;j<n;j++) {			col = true;			for (int i=0;i<n;i++)				if (a[i][j] != 'E') col = false;			if (col) break;		}		if (row && col) out.print("-1\n"); 		else			if (!row) {				for (int i=0;i<n;i++)					for (int j=0;j<n;j++)						if (a[i][j] != 'E') {							out.println( (i+1) + " "+(j+1));							break;						}			} else {				for (int j=0;j<n;j++)					for (int i=0;i<n;i++)						if (a[i][j] != 'E') {							out.println( (i+1) + " "+(j+1));							break;						}			}			}  	void run() throws Exception	{		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());		out = new PrintWriter(System.out); 		long s = System.currentTimeMillis();		solve();		out.flush();		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");	} 	public static void main(String[] args) throws Exception { new Purification329A().run(); } 	private byte[] inbuf = new byte[1024];	public int lenbuf = 0, ptrbuf = 0; 	private int readByte()	{		if(lenbuf == -1)throw new InputMismatchException();		if(ptrbuf >= lenbuf){			ptrbuf = 0;			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }			if(lenbuf <= 0)return -1;		}		return inbuf[ptrbuf++];	} 	private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }	private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; } 	private double nd() { return Double.parseDouble(ns()); }	private char nc() { return (char)skip(); } 	private String ns()	{		int b = skip();		StringBuilder sb = new StringBuilder();		while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')			sb.appendCodePoint(b);			b = readByte();		}		return sb.toString();	} 	private char[] ns(int n)	{		char[] buf = new char[n];		int b = skip(), p = 0;		while(p < n && !(isSpaceChar(b))){			buf[p++] = (char)b;			b = readByte();		}		return n == p ? buf : Arrays.copyOf(buf, p);	} 	private char[][] nm(int n, int m)	{		char[][] map = new char[n][];		for(int i = 0;i < n;i++)map[i] = ns(m);		return map;	} 	private int[] na(int n)	{		int[] a = new int[n];		for(int i = 0;i < n;i++)a[i] = ni();		return a;	} 	private int[][] na(int n , int m)	{		int[][] a = new int[n][m];		for(int i = 0;i < n;i++) 			for(int j = 0 ; j<m ; j++) a[i][j] = ni();		return a;	} 	private int ni()	{		int num = 0, b;		boolean minus = false;		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));		if(b == '-'){			minus = true;			b = readByte();		} 		while(true){			if(b >= '0' && b <= '9'){				num = num * 10 + (b - '0');			}else{				return minus ? -num : num;			}			b = readByte();		}	} 	private long nl()	{		long num = 0;		int b;		boolean minus = false;		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));		if(b == '-'){			minus = true;			b = readByte();		} 		while(true){			if(b >= '0' && b <= '9'){				num = num * 10 + (b - '0');			}else{				return minus ? -num : num;			}			b = readByte();		}	} 	void display2D(boolean a[][]) {		for(boolean i[] : a) {			for(boolean j : i) {				out.print(j+" ");			}			out.println();		}	} 	int[][] creategraph(int n , int m) {		int g[][] = new int[n+1][]; 		int from[] = new int[m];		int to[] = new int[m];		int ct[] = new int[n+1]; 		for(int i = 0 ; i<m; i++) {			from[i] = ni();			to[i] = ni();			ct[from[i]]++;			ct[to[i]]++;		} 		int parent[] = new int[n+1]; 		for(int i = 0 ; i<n+1 ; i++) g[i] = new int[ct[i]]; 		for(int i = 0 ; i<m ; i++) {			g[from[i]][--ct[from[i]]] = to[i];			g[to[i]][--ct[to[i]]] = from[i];		} 		return g;	} 	static long __gcd(long a, long b)	{ 		if(b == 0) 		{			return a;		}		else		{			return __gcd(b, a % b);		}	} 	// To compute x^y under modulo m	static long power(long x, long y, long p)	{ 		// Initialize result		long res = 1; 		// Update x if it is more than or		// equal to p		x = x % p; 		while (y > 0)		{ 			// If y is odd, multiply x			// with result			if (y % 2 == 1)				res = (res * x) % p; 			// y must be even now			y = y >> 1; // y = y/2		x = (x * x) % p;		} 		return res;	} 	// Function to find modular 	// inverse of a under modulo m	// Assumption: m is prime	static long modInverse(long a, int m)	{		if (__gcd(a, m) != 1) {			//System.out.print("Inverse doesn't exist");			return -1;		} 		else { 			// If a and m are relatively prime, then			// modulo inverse is a^(m-2) mode m			//			System.out.println("Modular multiplicative inverse is "			//											+power(a, m - 2, m));			return power(a, m - 2, m);		}	} 	static long nCrModPFermat(int n, int r,			int p , long fac[])	{ 		// Base case		if (r == 0)			return 1; 		// Fill factorial array so that we		// can find all factorial of r, n		// and n-r		long t = (fac[n]* modInverse(fac[r], p))%p; 		return ( (t* modInverse(fac[n-r], p))% p);	}  	private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }}