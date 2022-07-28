import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;import java.util.*;  import java.io.*;  public class abc{ 	static PrintWriter pw;    static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }      public static int gcd(int a,int b)    {        return b==0?a:gcd(b,a%b);    }     public static boolean isPrime(long n)    {        if(n==2)return true;        int i=2;        while(i*i<=n)        {            if(n%i==0) return false;            i++;        }        return true;    }        public static long[] remove(long n)    {        long res[]=new long[1000000000];        long rese=0;        int i=0;        while(n>0)        {            long dig=n%10;            n=n/10;            if(dig>0)            {                rese=dig;                	res[i++]=rese;            }        }        return res;    }    static int ceil(int x, int y) {		return (x % y == 0 ? x / y : (x / y + 1));	} 	static long ceil(long x, long y) {		return (x % y == 0 ? x / y : (x / y + 1));	} 	static int max(int x, int y) {		return Math.max(x, y);	} 	static int min(int x, int y) {		return Math.min(x, y);	} 	static int abs(int x) {		return Math.abs(x);	} 	static long abs(long x) {		return Math.abs(x);	} 	static int log2(int N) {		int result = (int) (Math.log(N) / Math.log(2));		return result;	} 	static long max(long x, long y) {		return Math.max(x, y);	} 	static long min(long x, long y) {		return Math.min(x, y);	}	public static class pair{		int x;		int y;		public pair(int a,int b){		   x=a;		   y=b;		}	}		public static class Comp implements Comparator<pair>{		public int compare(pair a,pair b){		    if(a.x!=b.x){		        return a.x-b.x;		    }else{		        return a.y-b.y;		   }		}	}		    public static void main(String[] args)     {    	        FastReader ob=new FastReader();        pw = new PrintWriter(System.out);        int n = ob.nextInt();        int k = ob.nextInt();        int a[]=new int[n];        for(int i=0;i<n;i++)        	a[i] = ob.nextInt();        long ans = 0;        for(int i = 0 ; i < k ; i++){            ans += a[i];        }         long sum = ans;        for(int i = k ; i < n ; i++){            sum += a[i];            sum -= a[i-k];            ans += sum;        }                int div=n-k+1;                double result=(double)ans/(double)div;        pw.println(String.format("%.10f", result));               pw.flush();    }}
