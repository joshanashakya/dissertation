import java.io.*;import java.util.*;public class Main {    public static void main(String args[])    {        FastReader input=new FastReader();        PrintWriter out=new PrintWriter(System.out);        int T=input.nextInt();        while(T-->0)        {            int n=input.nextInt();            int r=input.nextInt();            int p=input.nextInt();            int s=input.nextInt();            String str=input.next();            int r1=0,p1=0,s1=0;            for(int i=0;i<str.length();i++)            {                if(str.charAt(i)=='R')                {                    r1++;                }                else if(str.charAt(i)=='P')                {                    p1++;                }                else                {                    s1++;                }            }            int count=0;            count+=Math.min(r1,p);            count+=Math.min(p1,s);            count+=Math.min(s1,r);            int req=(int)Math.ceil((double)n/(double)2);            if(count<req)            {                out.println("NO");            }            else            {                out.println("YES");                char ch[]=new char[n];                for(int i=0;i<n;i++)                {                    if(str.charAt(i)=='R')                    {                        if(p>0)                        {                            ch[i]='P';                            p--;                        }                    }                    else if(str.charAt(i)=='P')                    {                        if(s>0)                        {                            ch[i]='S';                            s--;                        }                    }                    else                    {                        if(r>0)                        {                            ch[i]='R';                            r--;                        }                    }                }                for(int i=0;i<n;i++)                {                    if((int)ch[i]==0)                    {                        if(r>0)                        {                            ch[i]='R';                            r--;                        }                        else if(p>0)                        {                            ch[i]='P';                            p--;                        }                        else if(s>0)                        {                            ch[i]='S';                            s--;                        }                    }                }                out.println(ch);            }        }        out.close();    }    public static int gcd(int a, int b)    {        if(a==0)        {            return b;        }        else        {            return gcd(b%a,a);        }    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;        public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }        String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }        int nextInt()        {            return Integer.parseInt(next());        }        long nextLong()        {            return Long.parseLong(next());        }        double nextDouble()        {            return Double.parseDouble(next());        }        String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}