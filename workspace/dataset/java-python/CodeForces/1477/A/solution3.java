import java.io.*;import java.util.*;public class Main {    public static void main(String args[])    {        FastReader input=new FastReader();        PrintWriter out=new PrintWriter(System.out);        int T=input.nextInt();        while(T-->0)        {            int n=input.nextInt();            long k=input.nextLong();            long x[]=new long[n];            int flag=0;            for(int i=0;i<n;i++)            {                x[i]=input.nextLong();                if(x[i]==k)                {                    flag=1;                }            }            if(flag==1)            {                out.println("YES");            }            else            {                mergeSort(x,0,n-1);                long p=x[0];                for(int i=0;i<n;i++)                {                    x[i]-=p;                }                k-=p;                long g=x[1];                for(int i=2;i<n;i++)                {                    g=gcd(g,x[i]);                }                if(k%g==0)                {                    out.println("YES");                }                else                {                    out.println("NO");                }            }        }        out.close();    }    public static long gcd(long a, long b)    {        if(a==0)        {            return b;        }        else        {            return gcd(b%a,a);        }    }    public static void mergeSort(long a[],int p,int r)    {        if(p<r)        {            int q=(p+r)/2;            mergeSort(a,p,q);            mergeSort(a,q+1,r);            merge(a,p,q,r);        }    }    public static void merge(long a[],int p,int q,int r)    {        int n1=q-p+2;        long L[]=new long[n1];        int n2=r-q+1;        long R[]=new long[n2];        for(int i=p;i<=q;i++)        {            L[i-p]=a[i];        }        L[n1-1]=Long.MAX_VALUE;        for(int i=q+1;i<=r;i++)        {            R[i-q-1]=a[i];        }        R[n2-1]=Long.MAX_VALUE;        int x=0,y=0;        for(int i=p;i<=r;i++)        {            if(L[x]<=R[y])            {                a[i]=L[x];                x++;            }            else            {                a[i]=R[y];                y++;            }        }    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;        public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }        String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }        int nextInt()        {            return Integer.parseInt(next());        }        long nextLong()        {            return Long.parseLong(next());        }        double nextDouble()        {            return Double.parseDouble(next());        }        String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}
