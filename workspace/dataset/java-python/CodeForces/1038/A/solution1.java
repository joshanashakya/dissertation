//package graphs;import java.util.*;public class PW { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner s=new Scanner(System.in);		int n=s.nextInt();		int k=s.nextInt();				String str=s.next();				HashMap<Character,Integer> map=new HashMap<>();				for(int i=0;i<str.length();i++)		{			if(!map.containsKey(str.charAt(i)))				map.put(str.charAt(i), 1);			else				map.put(str.charAt(i),map.get(str.charAt(i))+1);		}				if(map.size()<k)			System.out.println(0);		else		{			int min=Integer.MAX_VALUE;			for(char c:map.keySet())			{				if(map.get(c)<min)				{					min=map.get(c);				}			}			System.out.println(min*map.size());		}			}				public static long solve(int n, int r)    {          long p = 1, k = 1;        if (n - r < r) {            r = n - r;        }         if (r != 0) {            while (r > 0) {                p *= n;                k *= r;                 long m = __gcd(p, k);                                 p /= m;                k /= m;                 n--;                r--;            }                    }        else {            p = 1;        }                 //System.out.println(p);        return p;    }		public static long __gcd(long n1, long n2)    {        long gcd = 1;         for (int i = 1; i <= n1 && i <= n2; ++i) {            // Checks if i is factor of both integers            if (n1 % i == 0 && n2 % i == 0) {                gcd = i;            }        }        return gcd;    }		public static boolean prime(long n)	{		if(n<=2)			return true;				for(int i=2;i<=Math.sqrt(n);i++)		{			if(n%i==0)				return false;		}				return true;			}}  	 	  	 				 		  	   			      	