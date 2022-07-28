import java.io.*;import java.util.*;import java.math.*;import java.math.BigInteger;  public final class A{    	static StringBuilder ans=new StringBuilder();	static FastReader in=new FastReader();	static ArrayList<ArrayList<Integer>> g,tg;	static long mod=(long)1e9+7;	static boolean set[],col[]; 	static int D[],par[];	static pair size[],size1[];	static char G[][];	static int dp[][];	//static Pair moves[]= {new Pair(-1,0),new Pair(1,0), new Pair(0,-1), new Pair(0,1)};	public static void main(String args[])throws IOException	{				int N=i();		long dp[]=new long[N+1];		long A[]=new long[N+2];		if(N<=3)		{			if(N==1)System.out.println(1);			if(N==2)System.out.println(3);			if(N==3)System.out.println(6);			return;		}		dp[1]=1; A[1]=1;				dp[2]=3;A[2]=2;				dp[3]=6;A[3]=4;		for(int i=4; i<=N; i++)		{         dp[i]=(dp[i-1]+dp[i-2]+2)%mod;		}		System.out.println(dp[N]);		 	} 	static HashMap<Integer,Integer> Hash(int A[])	{		HashMap<Integer,Integer> mp=new HashMap<>();		for(int a:A)		{			int f=mp.getOrDefault(a,0)+1;			mp.put(a, f);		}		return mp;	}	static long mul(long a, long b)	{		return ( a %mod * 1L * b%mod )%mod;	}	static void swap(int A[],int a,int b)	{		int t=A[a];		A[a]=A[b];		A[b]=t;	}  	static int find(int a)	{		if(par[a]<0)return a;		return par[a]=find(par[a]);	}	static void union(int a,int b)	{		a=find(a);		b=find(b);		int t=Math.min(a, b);		b=Math.max(a, b);		a=t;		if(a!=b)		{			g.get(a).add(b);			g.get(b).add(a);			par[a]+=par[b];			par[b]=a;		}	}	static boolean isSorted(int A[])	{		for(int i=1; i<A.length; i++)		{			if(A[i]<A[i-1])return false;		}		return true;	} 	static boolean isDivisible(StringBuilder X,int i,long num)	{		long r=0;		for(; i<X.length(); i++)		{			r=r*10+(X.charAt(i)-'0');			r=r%num;		}		return r==0;	}       	static int lower_Bound(int A[],int low,int high, int x) 	{ 		if (low > high) 			if (x >= A[high]) 				return A[high];  		int mid = (low + high) / 2;  		if (A[mid] == x) 			return A[mid];  		if (mid > 0 && A[mid - 1] <= x && x < A[mid]) 			return A[mid - 1];  		if (x < A[mid]) 			return lower_Bound( A, low, mid - 1, x);  		return lower_Bound(A, mid + 1, high, x); 	}  	static String f(String A)	{		String X="";		for(int i=A.length()-1; i>=0; i--)		{			int c=A.charAt(i)-'0';			X+=(c+1)%2;		}		return X;	} 	static void sort(long[] a) //check for long	{		ArrayList<Long> l=new ArrayList<>();		for (long i:a) l.add(i);		Collections.sort(l);		for (int i=0; i<a.length; i++) a[i]=l.get(i);	} 	static String swap(String X,int i,int j)	{		char ch[]=X.toCharArray();		char a=ch[i];		ch[i]=ch[j];		ch[j]=a;		return new String(ch);	} 	static int sD(long n)  	{   		if (n % 2 == 0 )  			return 2;   		for (int i = 3; i * i <= n; i += 2) {  			if (n % i == 0 )  				return i;  		}   		return (int)n;  	}   	static void setGraph(int N)	{		//		set=new boolean[N+1];		//		col=new boolean[N+1];		//		size=new pair[N+1];		//		size1=new pair[N+1];		//		g=new ArrayList<ArrayList<Integer>>();		//		tg=new ArrayList<ArrayList<Integer>>();		//		for(int i=0; i<=N; i++)		//		{		//			size[i]=new pair();		//			size1[i]=new pair();		//			g.add(new ArrayList<Integer>());		//			tg.add(new ArrayList<Integer>());		//		}	}   	static  long pow(long a,long b)	{		//long mod=1000000007;		long pow=1;		long x=a;		while(b!=0)		{			if((b&1)!=0)pow=(pow*x)%mod;			x=(x*x)%mod;			b/=2;		}		return pow;	} 	static long toggleBits(long x)//one's complement || Toggle bits	{		int n=(int)(Math.floor(Math.log(x)/Math.log(2)))+1; 		return ((1<<n)-1)^x;	} 	static int countBits(long a)	{		return (int)(Math.log(a)/Math.log(2)+1);	} 	static long fact(long N)	{ 		long n=2; 		if(N<=1)return 1;		else		{			for(int i=3; i<=N; i++)n=(n*i)%mod;		}		return n;	} 	static int kadane(int A[])	{		int lsum=A[0],gsum=A[0];		for(int i=1; i<A.length; i++)		{			lsum=Math.max(lsum+A[i],A[i]);			gsum=Math.max(gsum,lsum);		}		return gsum;	} 	static void sort(int[] a) {		ArrayList<Integer> l=new ArrayList<>();		for (int i:a) l.add(i);		Collections.sort(l);		for (int i=0; i<a.length; i++) a[i]=l.get(i);	} 	static boolean isPrime(long N)	{		if (N<=1)  return false; 		if (N<=3)  return true; 		if (N%2 == 0 || N%3 == 0) return false; 		for (int i=5; i*i<=N; i=i+6) 			if (N%i == 0 || N%(i+2) == 0) 				return false; 		return true; 	}	static void print(char A[])	{		for(char c:A)System.out.print(c+" ");		System.out.println();	}	static void print(boolean A[])	{		for(boolean c:A)System.out.print(c+" ");		System.out.println();	}	static void print(int A[])	{		for(int a:A)System.out.print(a+" ");		System.out.println();		}	static void print(long A[])	{		for(long i:A)System.out.print(i+ " ");		System.out.println(); 	}	static void print(ArrayList<Integer> A)	{		for(int a:A)System.out.print(a+" ");		System.out.println();	} 	static int i()	{		return in.nextInt();	} 	static long l()	{		return in.nextLong();	} 	static int[] input(int N){		int A[]=new int[N];		for(int i=0; i<N; i++)		{			A[i]=in.nextInt();		}		return A;	} 	static long[] inputLong(int N)     {		long A[]=new long[N];		for(int i=0; i<A.length; i++)A[i]=in.nextLong();		return A;	} 	static long GCD(long a,long b) 	{		if(b==0)		{			return a;		}		else return GCD(b,a%b );	} } class pair implements Comparable<pair>{	long a;	int index;	pair(long x,int i)	{		a=x;		index=i;	}	public int compareTo(pair X)	{		if(this.a>X.a)return 1;		else if(this.a==X.a)return 0;		else return -1;	}} //Code For FastReader//Code For FastReader//Code For FastReader//Code For FastReaderclass FastReader{	BufferedReader br;	StringTokenizer st;	public FastReader()	{		br=new BufferedReader(new InputStreamReader(System.in));	} 	String next()	{		while(st==null || !st.hasMoreElements())		{			try			{				st=new StringTokenizer(br.readLine());			}			catch(IOException e)			{				e.printStackTrace();			}		}		return st.nextToken();	} 	int nextInt()	{		return Integer.parseInt(next());	} 	long nextLong()	{		return Long.parseLong(next());	} 	double nextDouble()	{		return Double.parseDouble(next());	} 	String nextLine()	{		String str="";		try		{			str=br.readLine();		}		catch (IOException e)		{			e.printStackTrace();		}		return str;	} }
