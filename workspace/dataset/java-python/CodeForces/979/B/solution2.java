import java.io.*;import java.util.*;public class Main {    public static void main(String args[]){        FastReader input=new FastReader();        PrintWriter out=new PrintWriter(System.out);        int T=1;        while(T-->0)        {            int n=input.nextInt();            String a=input.next();            String b=input.next();            String c=input.next();            int x=fun(a,n);            int y=fun(b,n);            int z=fun(c,n);            if(x>=y && x>=z)            {                if(x==y || x==z)                {                    out.println("Draw");                }                else                {                    out.println("Kuro");                }            }            else if(y>=x && y>=z)            {                if(y==x || y==z)                {                    out.println("Draw");                }                else                {                    out.println("Shiro");                }            }            else if(z>=x && z>=y)            {                if(z==x || z==y)                {                    out.println("Draw");                }                else                {                    out.println("Katie");                }            }        }        out.close();    }    static int fun(String a,int n)    {        HashMap<Character,Integer> map1=new HashMap<>();        for(int i=0;i<a.length();i++)        {            char ch=a.charAt(i);            if(map1.containsKey(ch))            {                map1.put(ch,map1.get(ch)+1);            }            else            {                map1.put(ch,1);            }        }        int max=0;        Iterator it=map1.entrySet().iterator();        while(it.hasNext())        {            int n1=n;            Map.Entry e=(Map.Entry)it.next();            int r1=(int)e.getValue();            if(r1+n1>a.length())            {                if(n1==1)                {                    max=Math.max(max,a.length()-1);                }                else                {                    max=Math.max(max,a.length());                }            }            else            {                max=Math.max(max,r1+n1);            }        }        return max;    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;        public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }        String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }        int nextInt()        {            return Integer.parseInt(next());        }        long nextLong()        {            return Long.parseLong(next());        }        double nextDouble()        {            return Double.parseDouble(next());        }        String nextLine()        {            String str="";            try            {                str=br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}
