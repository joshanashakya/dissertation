//package graphs;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class PW {			public static void main(String[] args) {		// TODO Auto-generated method stub		FastReader s = new FastReader();				//int a=s.nextInt();		//lon n=s.nextLong();					int t=1;		//int k=1;		//int j=s.nextInt();				while(t-- >0)		{		   		   		   		   long n=s.nextLong();		   long k=s.nextLong();		   if((n/k)%2==0)			   System.out.println("NO");		   else			   System.out.println("YES");//		   int a[][]=new int[n][n];//		   //		   for(int i=0;i<n;i++)//			   for(int j=0;j<n;j++)//			   {//				   a[i][j]=s.nextInt();//			   }//		   //		   long dp[][]=new long[n][n];//		   dp[0][0]=a[0][0];//		   for(int i=1;i<n;i++)//		   {//			   dp[0][i]=a[0][i]*dp[0][i-1];//			   dp[i][0]=a[i][0]*dp[i-1][0];//		   }//		   //		   //		   for(int i=1;i<n;i++)//		   {//			   for(int j=1;j<n;j++)//			   {//				   long op1=a[i][j]*dp[i-1][j];//				   long op2=a[i][j]*dp[i][j-1];//				   long temp=Math.min(chk(op1),chk(op2));//				   if(op1<op2)//					   dp[i][j]=a[i][j]*dp[i-1][j];//				   else//					   dp[i][j]=a[i][j]*dp[i][j-1];//			   }//		   }//		   //		   		}					}				public static long  solve(long n)	{		long sum=0;		while(true)		{			sum=0;			long t=n;			while(t!=0)			{				sum=sum+t%10;				t=t/10;			}			long ans=gcd(n,sum);			if(ans>1)				return n;			n++;		}		   	}		static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(                new InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() { return Integer.parseInt(next()); }         long nextLong() { return Long.parseLong(next()); }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try {                str = br.readLine();            }            catch (IOException e) {                e.printStackTrace();            }            return str;        }    } 		public static long solve(int n, int r)    {          long p = 1, k = 1;        if (n - r < r) {            r = n - r;        }         if (r != 0) {            while (r > 0) {                p *= n;                k *= r;                 long m = __gcd(p, k);                                 p /= m;                k /= m;                 n--;                r--;            }                    }        else {            p = 1;        }                 //System.out.println(p);        return p;    }			public static long gcd(long a,long b)	{		if(a==0||b==0)			return a+b;		return gcd(b,(a%b));	}		public static long __gcd(long n1, long n2)    {        long gcd = 1;         for (int i = 1; i <= n1 && i <= n2; ++i) {            // Checks if i is factor of both integers            if (n1 % i == 0 && n2 % i == 0) {                gcd = i;            }        }        return gcd;    }		public static boolean prime(int n)	{		if(n<=2)			return true;				for(int i=2;i<=Math.sqrt(n);i++)		{			if(n%i==0)				return false;		}				return true;			}	public static long fastExpo(long a,long n,long mod){        if (n == 0)            return 1;        else{            long x = fastExpo(a,n/2,mod);            if ((n&1) == 1){                return (((a*x)%mod)*x)%mod;            }            else{                return (((x%mod)*(x%mod))%mod)%mod;            }        }    }}class pair{	//public:		long f;		long s;		pair(long x,long y)		{			f=x;			s=y;		}        }   	 			     				   	  			 			 	