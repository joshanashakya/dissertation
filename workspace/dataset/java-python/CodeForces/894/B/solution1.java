import java.io.*;import java.util.*;public class Main {    public static void main(String args[])    {        FastReader input=new FastReader();        PrintWriter out=new PrintWriter(System.out);        int T=1;        while(T-->0)        {            long n=input.nextLong();            long m=input.nextLong();            int k=input.nextInt();            if((n+m)%2==1 && k==-1)            {                out.println(0);            }            else            {                long mod=1000000007l;                long val=power(2l,m-1,mod);                val=power(val,n-1,mod);                out.println(val);            }        }        out.close();    }    public static long power(long a,long b,long m)    {        long res=1l;        while(b>0l)        {            if(b%2l!=0l)            {                res=(res%m*a%m)%m;            }            b=b/2l;            a=(a%m*a%m)%m;        }        return res;    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;        public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }        String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }        int nextInt()        {            return Integer.parseInt(next());        }        long nextLong()        {            return Long.parseLong(next());        }        double nextDouble()        {            return Double.parseDouble(next());        }        String nextLine()        {            String str="";            try            {                str=br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}
