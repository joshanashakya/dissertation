/* https://fb.watch/2_f8UL2Jev/   watch this if you are facing rejections ***********************************************Don't Copy template it might lead to palagarism***********************************************I only Believe on will of fire. *******************************Work so hard, be so good that luck doesn't get a chance to decide the fate of your dreams.*****************************************************************************************************If you want to aim high, aim high Don't let that studying and grades consume you Just live life young.*****************************************************************If I'm the sun, you're the moon Because when I go up, you go down*****************************************I'm working for the day I will surpass you**************************************** */   import java.util.*;import java.awt.Point;import java.lang.Math; import java.util.Arrays;import java.util.Scanner;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.io.OutputStream;import java.util.Comparator;import java.math.BigInteger;import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.stream.IntStream;import java.io.IOException;import java.util.ArrayList;import java.math.BigInteger;import java.util.Collections;import java.util.StringTokenizer;  public class S {    public static void main(String[] args) throws java.lang.Exception {        		FastScanner in=new FastScanner();	        int t = in.ni();  outer:for(int tt=0;tt<t;tt++){           int n = in.ni();           long k = in.nl();           long a[]= new long[n];                      for(int i=0;i<n;i++)              a[i]=in.nl();                       long gcd=0;            for(int i=1;i<n;i++){                gcd = gcd(gcd,Math.abs(a[i]-a[i-1]));            }             for(long l:a){                 if((l-k)%gcd==0){                     System.out.println("YES");                     continue outer;                 }            }           System.out.println("NO");        }    }         static class sortByFirst implements Comparator<Pair>{         public int compare(Pair a, Pair b){            return a.x - b.x;        }    }        static class Pair {        int x;        int y;         public Pair(int a, int b){            this.x=a;            this.y=b;        }    }         // static File input = new File("./input0.txt"); 	static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();        }        String nL() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }				int ni() {			return Integer.parseInt(next());        }        long nl() {			return Long.parseLong(next());		}		void print(int a){		     System.out.println(a);        }        void print(long a){            System.out.println(a);       }		String n(){		     return next();        }        		void ps(String a) {		        System.out.print(a);		}		void pls(String a) {		        System.out.println(a);		}		int[] ria(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=ni();			return a;		}		void pa(int [] a) {			for (int i=0; i<a.length; i++)		        System.out.print(a[i]+" ");		}				     void pla(int [] a) {			for (int i=0; i<a.length; i++)		        System.out.println(a[i]);		}			} 	     	     public int factorial(int n) {            int fact = 1;            int i = 1;           while(i <= n) {             fact *= i;             i++;           }            return fact;    }        static int max= 1000000;    static boolean prime[] = new boolean[max+1];     static void sieveOfEratosthenes(int n) {                  for(int i=0;i<n;i++)             prime[i] = true;         for(int p = 2; p*p <=n; p++) {             if(prime[p] == true) {                 for(int i = p*p; i <= n; i += p)                     prime[i] = false;             }         }          return ;    }          public static long gcd(long x,long y)    {    	if(x%y==0)    		return y;    	else    		return gcd(y,x%y);    }    public static int gcd(int x,int y)    {    	if(x%y==0)    		return y;    	else     		return gcd(y,x%y);    }    public static int abs(int a,int b)    {    	return (int)Math.abs(a-b);    }    public static long abs(long a,long b)    {    	return (long)Math.abs(a-b);    }    public static int max(int a,int b)    {    	if(a>b)    		return a;    	else    		return b;    }    public static int min(int a,int b)    {    	if(a>b)    		return b;    	else     		return a;    }    public static long max(long a,long b)    {    	if(a>b)    		return a;    	else    		return b;    }    public static long min(long a,long b)    {    	if(a>b)    		return b;    	else     		return a;    }              public static long pow(long n,long p,long m)    {    	 long  result = 1;    	  if(p==0)    	    return 1;    	if (p==1)    	    return n;    	while(p!=0)    	{    	    if(p%2==1)    	        result *= n;    	    if(result>=m)    	    result%=m;    	    p >>=1;    	    n*=n;    	    if(n>=m)    	    n%=m;    	}    	return result;    }    public static long pow(long n,long p)    {    	long  result = 1;    	  if(p==0)    	    return 1;    	if (p==1)    	    return n;    	while(p!=0)    	{    	    if(p%2==1)    	        result *= n;	        	    p >>=1;    	    n*=n;	        	}    	return result;         }         static long sort(int a[]){           int n=a.length;    	int b[]=new int[n];	    	return mergeSort(a,b,0,n-1);             }         static long mergeSort(int a[],int b[],long left,long right){         long c=0;         if(left<right){             long mid=left+(right-left)/2;    	 c= mergeSort(a,b,left,mid);    	 c+=mergeSort(a,b,mid+1,right);    	 c+=merge(a,b,left,mid+1,right);          }	    	return c;	     }    static long merge(int a[],int  b[],long left,long mid,long right){         long c=0;int i=(int)left;int j=(int)mid; int k=(int)left;         while(i<=(int)mid-1&&j<=(int)right){               if(a[i]<=a[j]){                   b[k++]=a[i++];               }              else{                    b[k++]=a[j++];c+=mid-i;              }         }                  while (i <= (int)mid - 1)                    b[k++] = a[i++];          while (j <= (int)right)                 b[k++] = a[j++];         for (i=(int)left; i <= (int)right; i++)     	        a[i] = b[i];    	        return c;          }               static class InputReader extends BufferedReader {        public InputReader(InputStream st) {            super(new InputStreamReader(st));        }         public String readLine() {            try {                return super.readLine();            } catch (IOException e) {                return null;            }        }         private int readByte() {            try {                return read();            } catch (IOException e) {                throw new RuntimeException();            }        }         public int ni() {            int num = 0, b;            boolean minus = false;            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;            if (b == '-') {                minus = true;                b = readByte();            }             while (true) {                if (b >= '0' && b <= '9') {                    num = num * 10 + (b - '0');                } else {                    return minus ? -num : num;                }                b = readByte();            }        }                     }        } 
