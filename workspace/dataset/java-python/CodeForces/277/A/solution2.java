import java.io.*;import java.util.*;import java.math.*;import java.math.BigInteger; //import javafx.util.*; public final class B{    	static StringBuilder ans=new StringBuilder();	static FastReader in=new FastReader();	static ArrayList<ArrayList<Integer>> g,lang;		static long mod=1000000007;	static int D1[],D2[],par[];	static boolean set[];	public static void main(String args[])throws IOException	{  		int N=i(),M=i();		setGraph(Math.max(N, M));		par=new int[N+1];		Arrays.fill(par, -1);		boolean f=false;		for(int i=1; i<=N; i++)		{			int k=i();			if(k>0)f=true;			while(k-->0)				lang.get(i()).add(i);		}		if(!f)		{			System.out.println(N);			return;		}		int c=0;		for(int i=1; i<=M; i++)		{			for(int a:lang.get(i))			{				for(int b:lang.get(i))				{					if(a==b)continue;					union(a,b);				}			}		}		//print(par);		HashMap<Integer,Integer> mp=new HashMap<>();		for(int i=1; i<=N; i++)		{			int a=find(i);			if(mp.containsKey(a)==false)			{				mp.put(a, 1);			}		}		c=mp.size()-1;		System.out.println(c);	}	static void dfs(int n)	{		set[n]=true;		for(int c:g.get(n))		{			if(!set[c])dfs(c);		}	}	static void print(int a)	{		System.out.println("! "+a);	}	static int ask(int a,int b)	{		System.out.println("? "+a+" "+b);		return i();	}	static int find(int a)	{		if(par[a]<0)return a;		return par[a]=find(par[a]);	}	static void union(int a,int b)	{		a=find(a);		b=find(b);		if(a!=b)		{			par[a]+=par[b]; //transfers the size			par[b]=a;       //changes the parent		}	}	static ArrayList<Integer> IND(int B[],HashMap<Integer,Integer> mp)	{		ArrayList<Integer> A=new ArrayList<>();		for(int i:B)		{			if(mp.containsKey(i))			{				A.add(i);				int f=mp.get(i)-1;				if(f==0)					mp.remove(i);				else mp.put(i, f);					}		}		return A;	}	static HashMap<Integer,Integer> hash(int A[],int index)	{		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();		for(int i=index; i<A.length; i++)		{			int f=mp.getOrDefault(A[i], 0)+1;			mp.put(A[i], f);		}		return mp;	}	static void swap(char A[],int a,int b)	{		char ch=A[a];		A[a]=A[b];		A[b]=ch;	} 	static long lower_Bound(long A[],int low,int high, long x) 	{ 		if (low > high) 			if (x >= A[high]) 				return A[high];  		int mid = (low + high) / 2;  		if (A[mid] == x) 			return A[mid];  		if (mid > 0 && A[mid - 1] <= x && x < A[mid]) 			return A[mid - 1];  		if (x < A[mid]) 			return lower_Bound( A, low, mid - 1, x);  		return lower_Bound(A, mid + 1, high, x); 	} 	static void sort(long[] a) //check for long	{		ArrayList<Long> l=new ArrayList<>();		for (long i:a) l.add(i);		Collections.sort(l);		for (int i=0; i<a.length; i++) a[i]=l.get(i);	}	static void setGraph(int N)	{		set=new boolean[N+1];		//size=new int[N+1];		//par=new int[N+1];		g=new ArrayList<ArrayList<Integer>>();		lang=new ArrayList<ArrayList<Integer>>();		//tg=new ArrayList<ArrayList<Integer>>();		for(int i=0; i<=N; i++)		{			g.add(new ArrayList<Integer>());			lang.add(new ArrayList<Integer>());			//tg.add(new ArrayList<Integer>());		}	} 	static  long pow(long a,long b)	{		long mod=1000000007;		long pow=1;		long x=a;		while(b!=0)		{			if((b&1)!=0)pow=(pow*x)%mod;			x=(x*x)%mod;			b/=2;		}		return pow;	}	static long toggleBits(long x)//one's complement || Toggle bits	{		int n=(int)(Math.floor(Math.log(x)/Math.log(2)))+1; 		return ((1<<n)-1)^x;	}	static int countBits(long a)	{		return (int)(Math.log(a)/Math.log(2)+1);	}	static void sort(int[] a) {		ArrayList<Integer> l=new ArrayList<>();		for (int i:a) l.add(i);		Collections.sort(l);		for (int i=0; i<a.length; i++) a[i]=l.get(i);	}	static boolean isPrime(long N)	{		if (N<=1)  return false; 		if (N<=3)  return true; 		if (N%2 == 0 || N%3 == 0) return false; 		for (int i=5; i*i<=N; i=i+6) 			if (N%i == 0 || N%(i+2) == 0) 				return false; 		return true; 	}	static long GCD(long a,long b) 	{		if(b==0)		{			return a;		}		else return GCD(b,a%b );	} 	//Debugging Functions Starts 	static void print(char A[])	{		for(char c:A)System.out.print(c+" ");		System.out.println();	}	static void print(boolean A[])	{		for(boolean c:A)System.out.print(c+" ");		System.out.println();	}	static void print(int A[])	{		for(int a:A)System.out.print(a+" ");		System.out.println();		}	static void print(long A[])	{		for(long i:A)System.out.print(i+ " ");		System.out.println(); 	}	static void print(ArrayList<Integer> A)	{		for(int a:A)System.out.print(a+" ");		System.out.println();	} 	//Debugging Functions END	//----------------------	//IO FUNCTIONS STARTS	static HashMap<Integer,Integer> Hash(int A[])	{		HashMap<Integer,Integer> mp=new HashMap<>();		for(int a:A)		{			int f=mp.getOrDefault(a,0)+1;			mp.put(a, f);		}		return mp;	}	static int i()	{		return in.nextInt();	} 	static long l()	{		return in.nextLong();	} 	static int[] input(int N){		int A[]=new int[N];		for(int i=0; i<N; i++)		{			A[i]=in.nextInt();		}		return A;	} 	static long[] inputLong(int N)     {		long A[]=new long[N];		for(int i=0; i<A.length; i++)A[i]=in.nextLong();		return A;	} 	//IO FUNCTIONS END } class paint implements Comparable<paint>{	int color,index;	paint(int c,int i)	{		color=c;		index=i;	}	public int compareTo(paint X)	{		return this.color-X.color;	}}//Code For FastReader//Code For FastReader//Code For FastReader//Code For FastReaderclass FastReader{	BufferedReader br;	StringTokenizer st;	public FastReader()	{		br=new BufferedReader(new InputStreamReader(System.in));	} 	String next()	{		while(st==null || !st.hasMoreElements())		{			try			{				st=new StringTokenizer(br.readLine());			}			catch(IOException e)			{				e.printStackTrace();			}		}		return st.nextToken();	} 	int nextInt()	{		return Integer.parseInt(next());	} 	long nextLong()	{		return Long.parseLong(next());	} 	double nextDouble()	{		return Double.parseDouble(next());	} 	String nextLine()	{		String str="";		try		{			str=br.readLine();		}		catch (IOException e)		{			e.printStackTrace();		}		return str;	} }