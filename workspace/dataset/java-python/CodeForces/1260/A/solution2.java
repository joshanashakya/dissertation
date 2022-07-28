import java.io.*;import java.util.*;import java.lang.*; public class A {	public static void solve(FastReader in,PrintWriter out,int nTestCase) {		int n = in.nextInt(), sum = in.nextInt();		if(n==1) out.println(sum*(long)sum);		else if(sum==1) out.println(1);		else {			if(sum%n==0) out.println(n*((sum/n)*(sum/n)));			else {				long ans = 0;				int mx = (sum/n);				int rem = (sum%n);				ans = rem*((mx+1)*(long)(mx+1))+ ((n-rem)*(mx)*(long)(mx));				out.println(ans);			}		}	}	public static void main(String[] args) {		FastReader in = new FastReader();		PrintWriter out = new PrintWriter(System.out);		int T = in.nextInt();		for(int tt=1;tt<=T;tt++) {			solve(in,out,tt);		}		out.close();	}	public static int findSqRt(int n) {		int i = 1;		while(i*i<n) i++;		return i;	}	static final Random random=new Random();	//	static void ruffleSort(Pair[] a) {	//		int n=a.length;//shuffle, then sort 	//		for (int i=0; i<n; i++) {	//			int oi=random.nextInt(n);	//			Pair temp=a[oi];	//			a[oi]=a[i]; a[i]=temp;	//		}	//		Arrays.sort(a);	//	}	static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}	static void fastSort(char[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n);			char temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}	static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException  e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		}  		int[] nextArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}	}} //class Pair implements Comparable<Pair>{//    int a;//    int b;//    public Pair(int a, int b) {//        this.a = a;//        this.b = b;//    }//    public int compareTo(Pair o) {//        if(this.a==o.a)//            return this.b - o.b;//        return this.a - o.a;//    }   //}