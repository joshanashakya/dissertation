 import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.StringTokenizer; import java.util.*;  public class er10a{     //By shwetank_verma    static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }     static int mod=1000000007;    static boolean primes[]=new boolean[1000007];    static ArrayList<Integer> b=new ArrayList<>();    static void seive(int n){        Arrays.fill(primes,true);        primes[0]=primes[1]=false;        for(int i=2;i*i<=n;i++){            if(primes[i]==true){                for(int p=i*i;p<=n;p+=i){                    primes[p]=false;                }            }        }        if(n<1000007){        	for(int i=2;i<=n;i++) {        		if(primes[i])        			b.add(i);        	}        	                 }                    }    static int gcd(int a,int b){        if(b==0)        return a;        return gcd(b,a%b);    }    static long GCD(long a,long b){        if(b==0)        return a;        return GCD(b,a%b);    }    static ArrayList<Integer> segseive(int l,int r){    	    	ArrayList<Integer> isprime=new ArrayList<Integer>();    	boolean p[]=new boolean[r-l+1];    	Arrays.fill(p, true);            	for(int i=0;b.get(i)*b.get(i)<=r;i++) {    		int currprime=b.get(i);    		int base=(l/currprime)*currprime;    		if(base<l) {    			base+=currprime;    		}    		for(int j=base;j<=r;j+=currprime) {    			p[j-l]=false;    		}    		    		    		if(base==currprime) {    			p[base-l]=true;    		}    		    	}    	for(int i=0;i<=r-l;i++) {    		if(p[i])    			isprime.add(i+l);    	}    	return isprime;    }      static int LowerBound(int a[], int x) { // x is the target value or key  int l=-1,r=a.length;  while(l+1<r) {    int m=(l+r)>>>1;    if(a[m]>=x) r=m;    else l=m;  }  return r;}static int UpperBound(int a[], int x) {// x is the key or target value    int l=-1,r=a.length;    while(l+1<r) {       int m=(l+r)>>>1;       if(a[m]<=x) l=m;       else r=m;    }    return l+1; } static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {	 adj.get(u).add(v);	 adj.get(v).add(u); } static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[]) {	 Queue<Integer> q=new LinkedList<>();	 q.add(s);	 visited[s]=true;	 while(!q.isEmpty()) {		 int u=q.poll();		 for(int v:adj.get(u)) {			 if(!visited[v]) {				 visited[v]=!visited[v];				 q.add(v);			 }		 }	 } } static int BFSconnectedcount(ArrayList<ArrayList<Integer>> adj,int v) {	 boolean visited[]=new boolean[v+1];	 int count=0;	 for(int i=0;i<v;i++) {		 if(!visited[i]) {			 BFS(adj,i,visited);			 count++;		 }	 }	 return count; } public static long power(long x, long y, long p) {     long res = 1;     x = x % p;     while (y>0) {        if ((y&1)==1) {           res = (res*x) % p;        }        y = y >> 1;        x = ( x * x ) % p;     }     return res;  } public static long monInverse( long n, long p) {     return power(n, p-2, p);  }  public static long nCrModPFermat( int n, int r, int p) {     long[] fac = new long[n+1];     fac[0] = 1;     for (int i = 0; i < n; i++) {        fac[i+1] = (fac[i]*(i+1))%p;     }long x = monInverse(fac[r], p);long y = monInverse(fac[n-r], p);//System.out.println(fac[n]);     return (((fac[n]*x)% p) * ( y%p) ) % p;  }      public static void main(String[] args)     {         FastReader sc=new FastReader();         //int t=sc.nextInt();        int n=sc.nextInt();        long a[][]=new long[n][2];        long g=0;        long g1=0,g2=0,g3=0,g4=0;        for(int i=0;i<n;i++) {        	a[i][0]=sc.nextLong();        	a[i][1]=sc.nextLong();        	        }        TreeSet<Long> ts=new TreeSet<>();        long val=a[0][0];		if(val%2==0)		{			ts.add(2L);			while(val%2==0)val/=2;					}		for(long i=3;i*i<=val;i+=2)		{			if(val%i==0)			{				ts.add(i);				while(val%i==0)val/=i;			}		}		if(val>2)			ts.add(val);				val=a[0][1];				if(val%2==0)		{			ts.add(2L);			while(val%2==0)val/=2;					}		for(long i=3;i*i<=val;i+=2)		{			if(val%i==0)			{				ts.add(i);				while(val%i==0)val/=i;			}		}		if(val>2)			ts.add(val);													ts.remove(1L);        long res=-1;        for(long i:ts) {        	boolean f=false;        	for(int j=1;j<n;j++) {        		if(a[j][0]%i!=0&&a[j][1]%i!=0) {        			f=true;        			break;        		}        	}        	if(!f) {        	   System.out.println(i);        		return;        	}        }        System.out.println(res);    }     } 
