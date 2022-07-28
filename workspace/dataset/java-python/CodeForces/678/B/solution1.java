 import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.StringTokenizer; import java.util.*;import java.math.*;  public class er10a{     //By shwetank_verma    static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }     static int mod=(int)(1e9+7);    static boolean primes[]=new boolean[1000007];    static ArrayList<Integer> b=new ArrayList<>();    static void seive(int n){        Arrays.fill(primes,true);        primes[0]=primes[1]=false;        for(int i=2;i*i<=n;i++){            if(primes[i]==true){                for(int p=i*i;p<=n;p+=i){                    primes[p]=false;                }            }        }        if(n<1000007){        	for(int i=2;i<=n;i++) {        		if(primes[i])        			b.add(i);        	}        	                 }                    }    static int gcd(int a,int b){        if(b==0)        return a;        return gcd(b,a%b);    }    static long GCD(long a,long b){        if(b==0)        return a;        return GCD(b,a%b);    }    static ArrayList<Integer> segseive(int l,int r){    	    	ArrayList<Integer> isprime=new ArrayList<Integer>();    	boolean p[]=new boolean[r-l+1];    	Arrays.fill(p, true);            	for(int i=0;b.get(i)*b.get(i)<=r;i++) {    		int currprime=b.get(i);    		int base=(l/currprime)*currprime;    		if(base<l) {    			base+=currprime;    		}    		for(int j=base;j<=r;j+=currprime) {    			p[j-l]=false;    		}    		    		    		if(base==currprime) {    			p[base-l]=true;    		}    		    	}    	for(int i=0;i<=r-l;i++) {    		if(p[i])    			isprime.add(i+l);    	}    	return isprime;    }      static int LowerBound(int a[], int x) { // x is the target value or key  int l=-1,r=a.length;  while(l+1<r) {    int m=(l+r)>>>1;    if(a[m]>=x) r=m;    else l=m;  }  return r;}static int UpperBound(int a[], int x) {// x is the key or target value    int l=-1,r=a.length;    while(l+1<r) {       int m=(l+r)>>>1;       if(a[m]<=x) l=m;       else r=m;    }    return l+1; } static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {	 adj.get(u).add(v);	 adj.get(v).add(u); } static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[]) {	 Queue<Integer> q=new LinkedList<>();	 q.add(s);	 visited[s]=true;	 while(!q.isEmpty()) {		 int u=q.poll();		 for(int v:adj.get(u)) {			 if(!visited[v]) {				 visited[v]=!visited[v];				 q.add(v);			 }		 }	 } } static int BFSconnectedcount(ArrayList<ArrayList<Integer>> adj,int v) {	 boolean visited[]=new boolean[v+1];	 int count=0;	 for(int i=0;i<v;i++) {		 if(!visited[i]) {			 BFS(adj,i,visited);			 count++;		 }	 }	 return count; } public static long power(long x, long y, long p) {     long res = 1;     x = x % p;     while (y>0) {        if ((y&1)==1) {           res = (res*x) % p;        }        y = y >> 1;        x = ( x * x ) % p;     }     return res;  } public static long monInverse( long n, long p) {     return power(n, p-2, p);  }  public static long nCrModPFermat( int n, int r, int p) {     long[] fac = new long[n+1];     fac[0] = 1;     for (int i = 0; i < n; i++) {        fac[i+1] = (fac[i]*(i+1))%p;     }long x = monInverse(fac[r], p);long y = monInverse(fac[n-r], p);//System.out.println(fac[n]);     return (((fac[n]*x)% p) * ( y%p) ) % p;  } static class Point  {      int x, y;      Point(int x, int y)      {          this.x = x;          this.y = y;      }  }   // This class implements   // Comparator interface  static class MyCmp implements Comparator<Point>  {      // Sorts the Point objects according      // to x-coordinates in natural order      public int compare(Point p1, Point p2)      {          return p1.x - p2.x;      }  }  static int maxSubArraySum(int a[], int size)   {   int max_so_far = a[0];   int curr_max = a[0];    for (int i = 1; i < size; i++)   {          curr_max = Math.max(a[i], curr_max+a[i]);       max_so_far = Math.max(max_so_far, curr_max);   }   return max_so_far;   }   static int maxsum(int a[],int n) {	  int s=0;	  int res=0;	  int sum[]=new int[n];	  sum[0]=a[0];	  for(int i=1;i<n;i++) {	     sum[i]=sum[i-1]+a[i];	  }	  for(int i=0;i<n;i++) {		  s=Math.max(s, sum[i]);	  }	  return s;  } static void leftRotate(int arr[],           int d, int n) { for (int i = 0; i < d; i++)   leftRotatebyOne(arr, n); }  static void leftRotatebyOne(int arr[], int n) { int i, temp; temp = arr[0]; for (i = 0; i < n - 1; i++)   arr[i] = arr[i + 1]; arr[i] = temp; }  static boolean checkleapyear(long n) {	if(((n%4==0&&n%100!=0)||n%400==0)) {		return true;	}	return false;}    public static void main(String[] args)     {         FastReader sc=new FastReader();         int t=1;        //t=sc.nextInt();                while(t-->0) {        	long n=sc.nextLong();        	long x=n+1;        	int c=0;        	while(true) {        		if(checkleapyear(x-1))        			c+=2;        		else        			c++;        		c=c%7;        		if(c==0&&checkleapyear(x)==checkleapyear(n)) {        	        			break;        		}        		x++;        	}        	        	System.out.println(x);        }    }     } 
