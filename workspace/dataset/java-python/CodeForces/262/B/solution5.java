import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;import java.util.*;  import java.io.*;  public class abc{     static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }      public static int gcd(int a,int b)    {        return b==0?a:gcd(b,a%b);    }     public static boolean isPrime(long n)    {        if(n==2)return true;        int i=2;        while(i*i<=n)        {            if(n%i==0) return false;            i++;        }        return true;    }        public static long[] remove(long n)    {        long res[]=new long[1000000000];        long rese=0;        int i=0;        while(n>0)        {            long dig=n%10;            n=n/10;            if(dig>0)            {                rese=dig;                	res[i++]=rese;            }        }        return res;    }       public static void main(String[] args)     {    	        FastReader ob=new FastReader();        int n=ob.nextInt();        int t=ob.nextInt();        int a[]=new int[n];        int sum=0,k=0;        for(int i=0;i<n;i++)        	{        		a[i]=ob.nextInt();        	}        for(int i=0;i<n;i++)        {        	if(t>0)        	{        		if(a[i]<0 && i!=n-1)        		{        			a[i]*=-1;        			t--;        		}        		else        		{        			Arrays.sort(a);        			if(t%2==1)        				a[0]*=-1;        			break;        		}        	}        	else        		break;        }        for(int i=0;i<n;i++)        	sum+=a[i];        System.out.println(sum);    }}
