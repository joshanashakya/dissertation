import java.util.*;import java.io.*;import java.math.*; public class Practice { 	 static FastReader sc=new FastReader(); 	 static int mod=(int)Math.pow(10, 9)+7;	 static int dp[][];	 static ArrayList<Integer> l=new ArrayList<Integer>();	 		  public static void main(String[] args)     {			   PrintWriter out=new PrintWriter(System.out);			  //StringBuffer sb=new StringBuffer("");			  			  int ttt=1;			     //ttt =i(); 		        outer :while (ttt-- > 0) 				{			        int n=i()+1;		        	int m=n-2;		        	ArrayList<Integer> A[]=new ArrayList[n];		        	for(int i=0;i<A.length;i++) {		        		A[i]=new ArrayList<Integer>();		        	}		        	int d[]=new int[n];		        	for(int i=0;i<m;i++) {		        		int a=i();		        		int b=i();		        		A[a].add(b);		        		A[b].add(a);		        		d[a]++;		        		d[b]++;		        				        	}		        	int B[]=input(n-1);		        	int C[]=input(n-1);		        	boolean v[]=new boolean[n];		        	dfs(A, 1, v, d, 0);		        	Arrays.fill(v, false);		        	dfs(A, 1, v, B, C,d,0,0);		        	out.println(l.size());		        	for(int i : l)		        		out.println(i+" ");		        			        			        			        					}			     out.close();		    	//System.out.println(sb.toString());		        	    }		  private static void dfs(ArrayList<Integer> [] A, int s, boolean[] v,int B[],int C[],int level[],int even,int odd) {				v[s]=true;				if(level[s]%2==0) {					if(even==1) {						B[s-1]^=1;						if(B[s-1]!=C[s-1]) {							B[s-1]=C[s-1];							even=0;							l.add(s);						}					}					else {						if(B[s-1]!=C[s-1]) {							B[s-1]=C[s-1];							even=1;							l.add(s);						}					}				}				else {					if(odd==1) {						B[s-1]^=1;						if(B[s-1]!=C[s-1]) {							B[s-1]=C[s-1];							odd=0;														l.add(s);													}					}					else {						if(B[s-1]!=C[s-1]) {							B[s-1]=C[s-1];							odd=1;							l.add(s);						}					}				}				for(int i=0;i<A[s].size();i++) {					int child=A[s].get(i);					if(!v[child]) {						dfs(A, child, v,B,C,level,even,odd);					}				}							}		  private static void dfs(ArrayList<Integer> [] A, int s, boolean[] v,int dis[],int d) {				v[s]=true;				dis[s]=d;				for(int i=0;i<A[s].size();i++) {					int child=A[s].get(i);					if(!v[child]) {						dfs(A, child, v,dis,d+1);					}				}							}      static int[] input(int n) {	int A[]=new int[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.nextInt();	   }	   return A;   }static long[] inputL(int n) {	long A[]=new long[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.nextLong();	   }	   return A;   }static String[] inputS(int n) {	String A[]=new String[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.next();	   }	   return A;   }static long sum(int A[]) {	long sum=0;	for(int i : A) {		sum+=i;	}	return sum;} static void input(int A[],int B[]) {	   for(int i=0;i<A.length;i++) {		   A[i]=sc.nextInt();		   B[i]=sc.nextInt();	   }}static int[][] input(int n,int m){	int A[][]=new int[n][m];	for(int i=0;i<n;i++) {		for(int j=0;j<m;j++) {			A[i][j]=i();		}	}	return A;}static int max(int A[]) {	int max=Integer.MIN_VALUE;	for(int i=0;i<A.length;i++) {		max=Math.max(max, A[i]);	}	return max;}static int min(int A[]) {	int min=Integer.MAX_VALUE;	for(int i=0;i<A.length;i++) {		min=Math.min(min, A[i]);	}	return min;}static long max(long A[]) {	long max=Long.MIN_VALUE;	for(int i=0;i<A.length;i++) {		max=Math.max(max, A[i]);	}	return max;}static long min(long A[]) {	long min=Long.MAX_VALUE;	for(int i=0;i<A.length;i++) {		min=Math.min(min, A[i]);	}	return min;}static long mod(long x) {	 int mod=1000000007;	  return ((x%mod + mod)%mod);}      static int i() {    	 return sc.nextInt();     }     static String s() {    	 return sc.next();     }     static long l() {    	 return sc.nextLong();     }       static void sort(int[] A){        int n = A.length;        Random rnd = new Random();        for(int i=0; i<n; ++i){            int tmp = A[i];            int randomPos = i + rnd.nextInt(n-i);            A[i] = A[randomPos];            A[randomPos] = tmp;        }        Arrays.sort(A);     }     static void sort(long[] A){	        int n = A.length;	        Random rnd = new Random();	        for(int i=0; i<n; ++i){	            long tmp = A[i];	            int randomPos = i + rnd.nextInt(n-i);	            A[i] = A[randomPos];	            A[randomPos] = tmp;	        }	        Arrays.sort(A);	     }     static HashMap<Integer,Integer> hash(int A[]){   	  HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();   	  for(int i : A) {   		  if(map.containsKey(i)) {   			  map.put(i, map.get(i)+1);   		  }   		  else {   			  map.put(i, 1);   		  }   	  }   	  return map;     }  static String sort(String s) { 	 Character ch[]=new Character[s.length()]; 	 for(int i=0;i<s.length();i++) { 		 ch[i]=s.charAt(i); 	 } 	 Arrays.sort(ch); 	 StringBuffer st=new StringBuffer(""); 	 for(int i=0;i<s.length();i++) { 		 st.append(ch[i]); 	 } 	 return st.toString();  }     static boolean prime(int n) 	    { 	        if (n <= 1) 	            return false; 	        if (n <= 3) 	            return true; 	        if (n % 2 == 0 || n % 3 == 0) 	            return false; 	        double sq=Math.sqrt(n);	  	        for (int i = 5; i <= sq; i = i + 6) 	            if (n % i == 0 || n % (i + 2) == 0) 	                return false; 	        return true; 	    }      static boolean prime(long n) 	    { 	        if (n <= 1) 	            return false; 	        if (n <= 3) 	            return true; 	        if (n % 2 == 0 || n % 3 == 0) 	            return false; 	        double sq=Math.sqrt(n);	  	        for (int i = 5; i <= sq; i = i + 6) 	            if (n % i == 0 || n % (i + 2) == 0) 	                return false; 	        return true; 	    }      static int gcd(int a, int b)      {          if (a == 0)              return b;          return gcd(b % a, a);      }      static long gcd(long a, long b)      {          if (a == 0)              return b;          return gcd(b % a, a);      }      static class Pair implements Comparable<Pair>     {    	 int x;    	 int y;    	 Pair(int x,int y){    		 this.x=x;    		 this.y=y;    	 }		@Override		public int compareTo(Pair o) {			if(this.x>o.x)				return -1;			else if(this.x<o.x)				return 1;			else				return this.y-o.y;		}     }            static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }    
