/* "Why do we fall? So we can learn to pick ourselves up." */ import java.util.*;import java.io.*;import java.math.*; public class Main { 	 static FastReader sc=new FastReader(); 	 static int dp[][];	 //static int mod=1000000007;		  public static void main(String[] args)     {			    //CHECK FOR N=1		       	//CHECK FOR N=1			    //CHECK FOR N=1		       	//CHECK FOR N=1			   PrintWriter out=new PrintWriter(System.out);			   //StringBuffer sb=new StringBuffer("");			  int ttt=1;			    //ttt =i(); 			 			    		        outer :while (ttt-- > 0) 				{		        	int n=i();		        	int A[]=input(n);		        	sort(A);		        	HashMap<Integer,Integer> map=hash(A);		        	if(A[0]==1 && map.size()==1) {		        		A[0]=2;		        		sort(A);		        		for(int i : A) {		        			out.print(i+" ");		        		}		        		continue;		        	}		        	out.print("1 ");		        	for(int i=1;i<n;i++) {		        		out.print(A[i-1]+" ");		        	}		        			        					}			     out.close();		    	//System.out.println(sb.toString());			     			     			    //CHECK FOR N=1                    //CHECK FOR M=0		        //CHECK FOR N=1                    //CHECK FOR M=0		       	//CHECK FOR N=1		       	//CHECK FOR N=1		       	//CHECK FOR N=1		        	    }		  		static int[] input(int n) {	int A[]=new int[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.nextInt();	   }	   return A;   }static long[] inputL(int n) {	long A[]=new long[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.nextLong();	   }	   return A;   }static String[] inputS(int n) {	String A[]=new String[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.next();	   }	   return A;   }static long sum(int A[]) {	long sum=0;	for(int i : A) {		sum+=i;	}	return sum;} static void input(int A[],int B[]) {	   for(int i=0;i<A.length;i++) {		   A[i]=sc.nextInt();		   B[i]=sc.nextInt();	   }}static int[][] input(int n,int m){	int A[][]=new int[n][m];	for(int i=0;i<n;i++) {		for(int j=0;j<m;j++) {			A[i][j]=i();		}	}	return A;}static int max(int A[]) {	int max=Integer.MIN_VALUE;	for(int i=0;i<A.length;i++) {		max=Math.max(max, A[i]);	}	return max;}static int min(int A[]) {	int min=Integer.MAX_VALUE;	for(int i=0;i<A.length;i++) {		min=Math.min(min, A[i]);	}	return min;}static long max(long A[]) {	long max=Long.MIN_VALUE;	for(int i=0;i<A.length;i++) {		max=Math.max(max, A[i]);	}	return max;}static long min(long A[]) {	long min=Long.MAX_VALUE;	for(int i=0;i<A.length;i++) {		min=Math.min(min, A[i]);	}	return min;}static long mod(long x) {	 int mod=1000000007;	  return ((x%mod + mod)%mod);}      static int i() {    	 return sc.nextInt();     }     static String s() {    	 return sc.next();     }     static long l() {    	 return sc.nextLong();     }       static void sort(int[] A){        int n = A.length;        Random rnd = new Random();        for(int i=0; i<n; ++i){            int tmp = A[i];            int randomPos = i + rnd.nextInt(n-i);            A[i] = A[randomPos];            A[randomPos] = tmp;        }        Arrays.sort(A);     }     static void sort(long[] A){	        int n = A.length;	        Random rnd = new Random();	        for(int i=0; i<n; ++i){	            long tmp = A[i];	            int randomPos = i + rnd.nextInt(n-i);	            A[i] = A[randomPos];	            A[randomPos] = tmp;	        }	        Arrays.sort(A);	     }  static String sort(String s) { 	 Character ch[]=new Character[s.length()]; 	 for(int i=0;i<s.length();i++) { 		 ch[i]=s.charAt(i); 	 } 	 Arrays.sort(ch); 	 StringBuffer st=new StringBuffer(""); 	 for(int i=0;i<s.length();i++) { 		 st.append(ch[i]); 	 } 	 return st.toString();  }  static HashMap<Integer,Integer> hash(int A[]){	  HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();	  for(int i : A) {		  if(map.containsKey(i)) {			  map.put(i, map.get(i)+1);		  }		  else {			  map.put(i, 1);		  }	  }	  return map;  }     static boolean prime(int n) 	    { 	        if (n <= 1) 	            return false; 	        if (n <= 3) 	            return true; 	        if (n % 2 == 0 || n % 3 == 0) 	            return false; 	        double sq=Math.sqrt(n);	  	        for (int i = 5; i <= sq; i = i + 6) 	            if (n % i == 0 || n % (i + 2) == 0) 	                return false; 	        return true; 	    }      static boolean prime(long n) 	    { 	        if (n <= 1) 	            return false; 	        if (n <= 3) 	            return true; 	        if (n % 2 == 0 || n % 3 == 0) 	            return false; 	        double sq=Math.sqrt(n);	  	        for (int i = 5; i <= sq; i = i + 6) 	            if (n % i == 0 || n % (i + 2) == 0) 	                return false; 	        return true; 	    }      static int gcd(int a, int b)      {          if (a == 0)              return b;          return gcd(b % a, a);      }      static long gcd(long a, long b)      {          if (a == 0)              return b;          return gcd(b % a, a);      }      static class Pair //implements Comparable<Pair>     {    	 int x;    	 int y;    	 Pair(int x,int y){    		 this.x=x;    		 this.y=y;    	 }     }            static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }    
