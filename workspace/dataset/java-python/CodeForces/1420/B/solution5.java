import java.util.*;import java.io.*;public class A  {    static FastReader in=new FastReader();    static final Random random=new Random();    static long mod=1000000007L;    static HashMap<Integer,Integer>map=new HashMap<>();     public static void main(String args[]) throws IOException {        int t=in.nextInt();        StringBuilder res=new StringBuilder();        loop:        while(t-->0)        {        	int n=in.nextInt();        	        	long freq[]=new long[100];        	for(int i=0;i<n;i++)        	{        		long x=in.nextLong();        		int cnt=-1;        		while(x>0)        		{        			x/=2;        			cnt++;        		}        		freq[cnt]++;        	}        	long total=0;        	for(int i=0;i<100;i++)        	{        		if(freq[i]>0)        		{        			//print(i+" ");        			total=total+(freq[i])*(freq[i]-1)/2L;        		}        	}        	res.append(total+"\n");        }        print(res);                   }                    static long min(long a, long b)    {        if(a<b)        	return a;        return b;    }                     static void ruffleSort(int[] a) {        int n=a.length;        for (int i=0; i<n; i++) {            int oi=random.nextInt(n), temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }     static < E > void print(E res)    {        System.out.println(res);    }      static  int gcd(int a,int b)    {        if(b==0)        {            return a;        }        return gcd(b,a%b);    }        static int lcm(int a, int b)    {        return (a / gcd(a, b)) * b;    }         static int abs(int a)    {        if(a<0)            return -1*a;        return a;    }     static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }        int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }        String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }         int [] readintarray(int n) {            int res [] = new int [n];            for(int i = 0; i<n; i++)res[i] = nextInt();            return res;        }        long [] readlongarray(int n) {            long res [] = new long [n];            for(int i = 0; i<n; i++)res[i] = nextLong();            return res;        }    } }    
