 import java.math.*;import java.util.*;import java.io.*;  public class gr13b{     //By shwetank_verma	static void addEdge(ArrayList<ArrayList<Integer>> l,int u,int v) {		l.get(u).add(v);		l.get(v).add(u);	}		public static void main(String[] args)     {         FastReader sc=new FastReader(); PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));                                   int t=1;                //t=sc.nextInt();                while(t-->0){                int n=sc.nextInt();                int a[]=new int[n+1];                int b[]=new int[n+1];                boolean is[]=new boolean[n+1];                for(int i=1;i<n;i++) {                	a[i+1]=sc.nextInt();                	is[a[i+1]]=true;                	b[a[i+1]]++;                }                for(int i=2;i<=n;i++) {                	if(is[i]) {                		b[a[i]]--;                	}                }                boolean f=true;                for(int i=1;i<=n;i++) {                	if(is[i]&&b[i]<3) {                		pr.println("No");                		f=false;                		break;                	}                }                if(f)                pr.println("Yes");                                }                               pr.flush();    }    static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }     static int mod=1000000007;    static boolean primes[]=new boolean[1000007];    static ArrayList<Integer> b=new ArrayList<>();    static boolean seive(int n){        Arrays.fill(primes,true);        primes[0]=primes[1]=false;        for(int i=2;i*i<=n;i++){            if(primes[i]==true){                for(int p=i*i;p<=n;p+=i){                    primes[p]=false;                }            }        }        if(n<1000007){        	for(int i=2;i<=n;i++) {        		if(primes[i])        			b.add(i);        	}            return primes[n];        }        return false;            }    static int gcd(int a,int b){        if(b==0)        return a;        return gcd(b,a%b);    }    static long GCD(long a,long b){        if(b==0)        return a;        return GCD(b,a%b);    }    static ArrayList<Integer> segseive(int l,int r){    	    	ArrayList<Integer> isprime=new ArrayList<Integer>();    	boolean p[]=new boolean[r-l+1];    	Arrays.fill(p, true);            	for(int i=0;b.get(i)*b.get(i)<=r;i++) {    		int currprime=b.get(i);    		int base=(l/currprime)*currprime;    		if(base<l) {    			base+=currprime;    		}    		for(int j=base;j<=r;j+=currprime) {    			p[j-l]=false;    		}    		    		    		if(base==currprime) {    			p[base-l]=true;    		}    		    	}    	for(int i=0;i<=r-l;i++) {    		if(p[i])    			isprime.add(i+l);    	}    	return isprime;    }      static int LowerBound(int a[], int x) { // x is the target value or key  int l=-1,r=a.length;  while(l+1<r) {    int m=(l+r)>>>1;    if(a[m]>=x) r=m;    else l=m;  }  return r;}static int UpperBound(int a[], int x) {// x is the key or target value    int l=-1,r=a.length;    while(l+1<r) {       int m=(l+r)>>>1;       if(a[m]<=x) l=m;       else r=m;    }    return l+1; }        }
