
	
	
	import java.io.File;
	
	import java.io.FileNotFoundException;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Calendar;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Map;
import java.util.Random;
import java.util.Scanner;
	import java.util.Set;
	import java.util.StringTokenizer;
import java.util.TreeSet;
	
	
	public class D {
		 static final Random random=new Random();
		    
		    static void ruffleSort(int[] a) {
		        int n = a.length; 
		        for (int i=0; i<n; i++) {
		            int oi=random.nextInt(n), temp=a[oi];
		            a[oi]=a[i]; a[i]=temp;
		        }
		        ArrayList<Integer> lst = new ArrayList<>();
		        for(int i : a)
		            lst.add(i);
		        Collections.sort(lst);
		        for(int i = 0; i < n; i++)
		            a[i] = lst.get(i);
		    }
		 
		    static void ruffleSort(long[] a) {
		        int n = a.length; 
		        for (int i=0; i<n; i++) {
		            int oi=random.nextInt(n);
		            long temp=a[oi];
		            a[oi]=a[i]; a[i]=temp;
		        }
		        ArrayList<Long> lst = new ArrayList<>();
		        for(long i : a)
		            lst.add(i);
		        Collections.sort(lst);
		        for(int i = 0; i < n; i++)
		            a[i] = lst.get(i);
		    }
		    static int[] ans=new int[(int)101];
		    public static void process()throws IOException
		    {
		    	int n = ii();
		    	if(n%2!=0)System.out.println((n+1)/2);
		    	else System.out.println((n+1)/2+1);
		    }
		    static void check(int[]a,int i,int j,int d) {
		    	if(i>j)return;
		    	int v=Integer.MIN_VALUE;
		    	int index=-1;
		    	for(int k=i;k<=j;++k) {
		    		if(a[k]>v) {
		    			v=a[k];
		    			index=k;
		    		}
		    	}
		    	ans[index]=d;
		    	check(a,i,index-1,d+1);
		    	check(a,index+1,j,d+1);
		    	
		    }
		    static AnotherReader sc;
		    static PrintWriter out;
		    public static void main(String[]args)throws IOException
		    {
		        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}
		        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}
		        long s = System.currentTimeMillis();
		        int t=1;
		        t=ii();
		        //int k = t;
		        while(t-->0) {/*p("Case #"+ (k-t) + ": ")*/;process();}
		        out.flush();
		        System.err.println(System.currentTimeMillis()-s+"ms");
		        out.close();
		    }
		 
		    static long power(long k, long c, long mod){
		        long y = 1;
		        while(c > 0){
		            if(c%2 == 1)
		                y = y * k % mod;
		            c = c/2;
		            k = k * k % mod;
		        }
		        return y;
		    }
		 
		 
		    static void pn(Object o){out.println(o);}
		    static void p(Object o){out.print(o);}
		    static void pni(Object o){out.println(o);out.flush();}
		    static int ii()throws IOException{return sc.nextInt();}
		    static long il()throws IOException{return sc.nextLong();}
		    static double id()throws IOException{return sc.nextDouble();}
		    static String iln()throws IOException{return sc.nextLine();}
		    static int[] iai(int N)throws IOException{int[]A=new int[N];for(int i=0;i!=N;i++){A[i]=ii();}return A;}
		    static long[] ial(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=il();}return A;}
		    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
		    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
		    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
		    
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		    static class AnotherReader{BufferedReader br; StringTokenizer st;
		    AnotherReader()throws FileNotFoundException{
		    br=new BufferedReader(new InputStreamReader(System.in));}
		    AnotherReader(int a)throws FileNotFoundException{
		    br = new BufferedReader(new FileReader("C:\\Users\\Utkarsh\\OneDrive\\Desktop\\input1.txt"));}
		    String next()throws IOException{
		    while (st == null || !st.hasMoreElements()) {try{
		    st = new StringTokenizer(br.readLine());}
		    catch (IOException  e){ e.printStackTrace(); }}
		    return st.nextToken(); } int nextInt() throws IOException{
		    return Integer.parseInt(next());}
		    long nextLong() throws IOException
		    {return Long.parseLong(next());}
		    double nextDouble()throws IOException { return Double.parseDouble(next()); }
		    String nextLine() throws IOException{ String str = ""; try{
		    str = br.readLine();} catch (IOException e){
		    e.printStackTrace();} return str;}}
		 
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		}

