//package graphs;import java.util.*;public class PW { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner s=new Scanner(System.in);				//int a=s.nextInt();		//lon n=s.nextLong();		int n=s.nextInt();		int m=s.nextInt();		int a[]=new int [n];		int o1=0,e1=0,o2=0,e2=0;		for(int i=0;i<n;i++){			a[i]=s.nextInt();			if(a[i]%2==0)				e1++;			else				o1++;		}						int b[]=new int [m];						for(int i=0;i<m;i++)		{			b[i]=s.nextInt();			if(b[i]%2==0)				e2++;			else				o2++;		}				int ans=Math.min(o1,e2)+Math.min(o2,e1);		System.out.println(ans);					}				public static long solve(int n, int r)    {          long p = 1, k = 1;        if (n - r < r) {            r = n - r;        }         if (r != 0) {            while (r > 0) {                p *= n;                k *= r;                 long m = __gcd(p, k);                                 p /= m;                k /= m;                 n--;                r--;            }                    }        else {            p = 1;        }                 //System.out.println(p);        return p;    }			public static long gcd(long a,long b)	{		if(a==0||b==0)			return a+b;		return gcd(b,(a%b));	}		public static long __gcd(long n1, long n2)    {        long gcd = 1;         for (int i = 1; i <= n1 && i <= n2; ++i) {            // Checks if i is factor of both integers            if (n1 % i == 0 && n2 % i == 0) {                gcd = i;            }        }        return gcd;    }		public static boolean prime(int n)	{		if(n<=2)			return true;				for(int i=2;i<=Math.sqrt(n);i++)		{			if(n%i==0)				return false;		}				return true;			}} 	 		  		 	 	 		    	  	  	  	
