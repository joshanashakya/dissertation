import java.io.*;import java.util.*;public class Main {    public static void main(String args[])    {        FastReader input=new FastReader();        PrintWriter out=new PrintWriter(System.out);        int T=1;        while(T-->0)        {            int a=input.nextInt();            int b=input.nextInt();            int x=input.nextInt();            String s="";            if(a>=b)            {                for(int i=0;i<x;i++)                {                    if(i%2==0)                    {                        s+='0';                        a--;                    }                    else                    {                        s+='1';                        b--;                    }                }            }            else            {                for(int i=0;i<x;i++)                {                    if(i%2==0)                    {                        s+='1';                        b--;                    }                    else                    {                        s+='0';                        a--;                    }                }            }            if(s.charAt(s.length()-1)=='1')            {                while(b>0)                {                    s+='1';                    b--;                }                while(a>0)                {                    s+='0';                    a--;                }            }            else            {                while(a>0)                {                    s+='0';                    a--;                }                while(b>0)                {                    s+='1';                    b--;                }            }            out.println(s);        }        out.close();    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;        public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }        String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }        int nextInt()        {            return Integer.parseInt(next());        }        long nextLong()        {            return Long.parseLong(next());        }        double nextDouble()        {            return Double.parseDouble(next());        }        String nextLine()        {            String str="";            try            {                str=br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}