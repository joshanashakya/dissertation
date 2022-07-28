import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.HashSet;import java.util.Scanner;import java.util.StringTokenizer;//all pair shortest path n power 3,weight and pathpublic class N179B {	static long d[][],p[][];	static ArrayList<int[]>adj[];public static void main(String[]args) throws IOException {	Scanner sc=new Scanner(System.in);	PrintWriter out=new PrintWriter(System.out);	int n=sc.nextInt();	d=new long[n][n];	int[]x=new int[n];	for(int i=0;i<n;i++) {	for(int j=0;j<n;j++) {		long w=sc.nextLong();		d[i][j]=w;	}	}	for(int j=n-1;j>=0;j--) {		int w=sc.nextInt();		x[j]=w-1;	}	//algo	ArrayList<Long>ans=new ArrayList<Long>();	for(int k=0;k<n;k++) {		for(int i=0;i<n;i++) {			for(int j=0;j<n;j++) {				//if(hs.contains(i)&&hs.contains(j))					d[i][j]=Math.min(d[i][j], d[i][x[k]]+d[x[k]][j]);			}			}		long sum=0;		for(int i=0;i<=k;i++) {			for(int j=0;j<=k;j++) {				sum+=d[x[i]][x[j]];			}		}		ans.add(sum);	}		//ans.add(sum);	for(int i=n-1;i>=0;i--) {		out.print(ans.get(i)+" ");	}	out.println();	out.close();}static class Scanner {	StringTokenizer st;	BufferedReader br; 	public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));} 	public String next() throws IOException 	{		while (st == null || !st.hasMoreTokens()) 			st = new StringTokenizer(br.readLine());		return st.nextToken();	}	public boolean hasNext() {return st.hasMoreTokens();}	public int nextInt() throws IOException {return Integer.parseInt(next());}		public double nextDouble() throws IOException {return Double.parseDouble(next());}		public long nextLong() throws IOException {return Long.parseLong(next());} 	public String nextLine() throws IOException {return br.readLine();}			public boolean ready() throws IOException {return br.ready(); }	 }}
