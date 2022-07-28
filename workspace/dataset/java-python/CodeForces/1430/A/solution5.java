import java.util.*;import java.io.*;import java.util.Arrays;public class codeforces {		public static void main(String[] args) throws Exception {		int t=sc.nextInt();		while(t-->0) {			int n=sc.nextInt();			boolean flag=false;			int i=0,j=0,j2=0;			for (i = 0; i <= n/3; i++) {				for (j = 0; j <= n/5; j++) {					for ( j2 = 0; j2 <= n/7; j2++) {						if(3*i+5*j+7*j2==n) {							flag=true;						}						if(flag)break;					}					if(flag)break;				}				if(flag)break;			}			pw.println(flag?i+" "+j+" "+j2+" ":-1);		}		pw.close();	} 	public static long evaln(String x,int n) {		long res=0;		for (int i = 0; i < x.length(); i++) {			res+=Long.parseLong(x.charAt(x.length()-1-i)+"")*Math.pow(n, i);		}		return res;	}	static void merge(int[] arr,int b,int m,int e) {		int len1=m-b+1,len2=e-m;		int[] l=new int[len1];		int[] r=new int[len2];		for(int i=0;i<len1;i++)l[i]=arr[b+i];		for(int i=0;i<len2;i++)r[i]=arr[m+1+i];		int i=0,j=0,k=b;		while(i<len1 && j<len2) {			if(l[i]<r[j])arr[k++]=l[i++];			else arr[k++]=r[j++];		}		while(i<len1)arr[k++]=l[i++];		while(j<len2)arr[k++]=r[j++];		return;	}	static void mergesort(int[] arr,int b,int e) {		if(b<e) {			int m=(b+e)/2;			mergesort(arr,b,m);			mergesort(arr,m+1,e);			merge(arr,b,m,e);		}		return;			}	static long mergen(int[] arr,int b,int m,int e) {		int len1=m-b+1,len2=e-m;		int[] l=new int[len1];		int[] r=new int[len2];		for(int i=0;i<len1;i++)l[i]=arr[b+i];		for(int i=0;i<len2;i++)r[i]=arr[m+1+i];		int i=0,j=0,k=b;		long c=0;		while(i<len1 && j<len2) {			if(l[i]<r[j])arr[k++]=l[i++];			else {				arr[k++]=r[j++];				c=c+(long)(len1-i);			}		}		while(i<len1)arr[k++]=l[i++];		while(j<len2)arr[k++]=r[j++];		return c;	}	static long mergesortn(int[] arr,int b,int e) {		long c=0;		if(b<e) {			int m=(b+e)/2;			c=c+(long)mergesortn(arr,b,m);			c=c+(long)mergesortn(arr,m+1,e);			c=c+(long)mergen(arr,b,m,e);		}		return c;			}	public static long fac(int n) {		if(n==0)return 1;		return n*fac(n-1);	}	public static long summ(long x) {		long sum=0;		while(x!=0) {			sum+=x%10;			x=x/10;		}		return sum;					}		public static void sort2darray(Integer[][]a){		Arrays.sort(a,Comparator.<Integer[]>comparingInt(x -> x[0]).thenComparingInt(x -> x[1])); 	}	static class Scanner {		StringTokenizer st;		BufferedReader br;		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		}		public Scanner(String file) throws FileNotFoundException {			br = new BufferedReader(new FileReader(file));		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		}				public int nextInt() throws IOException {			return Integer.parseInt(next());		}		public long nextLong() throws IOException {			return Long.parseLong(next());		}		public String nextLine() throws IOException {			return br.readLine();		}		public double nextDouble() throws IOException {			return Double.parseDouble(next());		}		public boolean ready() throws IOException {			return br.ready();		}		public int[] nextArrint(int size) throws IOException {			int[] a=new int[size];			for (int i = 0; i < a.length; i++) {				a[i]=sc.nextInt();			}			return a;		}		public long[] nextArrlong(int size) throws IOException {			long[] a=new long[size];			for (int i = 0; i < a.length; i++) {				a[i]=sc.nextLong();			}			return a;		}		public int[][] next2dArrint(int rows,int columns) throws IOException{			int[][]a=new int[rows][columns];			for (int i = 0; i < rows; i++) {				for (int j = 0; j < columns; j++) {					a[i][j]=sc.nextInt();				}			}			return a;		}		public long[][] next2dArrlong(int rows,int columns) throws IOException{			long[][]a=new long[rows][columns];			for (int i = 0; i < rows; i++) {				for (int j = 0; j < columns; j++) {					a[i][j]=sc.nextLong();				}			}			return a;		}	}	static Scanner sc=new Scanner(System.in);	static PrintWriter pw=new PrintWriter(System.out);} 
