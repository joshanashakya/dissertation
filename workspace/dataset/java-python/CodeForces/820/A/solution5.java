import java.io.*;import java.util.*;public class C421A{    static PrintWriter out=new PrintWriter((System.out));    public static void main(String args[])throws IOException    {        Reader sc=new Reader();        int c=sc.nextInt();        int v0=sc.nextInt();        int v1=sc.nextInt();        int a=sc.nextInt();        int l=sc.nextInt();        int d=1;        int t=c;        c-=v0;        if(c>0)        {            c=Math.min(t,c+l);            int s=Math.min(v0+d*a,v1);            while(c>0)            {                c-=s;                d++;                if(c<=0)                {                    break;                }                s=Math.min(v0+d*a,v1);                c=Math.min(t,c+l);            }        }        out.println(d);        out.close();    }     static class Reader     {         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        public String next()        {            while(!st.hasMoreTokens())            {                try                {                    st=new StringTokenizer(br.readLine());                }                catch(Exception e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt()        {            return Integer.parseInt(next());        }         public long nextLong()        {            return Long.parseLong(next());        }         public double nextDouble()        {            return Double.parseDouble(next());        }         public String nextLine()        {            try            {                return br.readLine();            }            catch(Exception e)            {                e.printStackTrace();            }            return null;        }         public boolean hasNext()        {            String next=null;            try            {                next=br.readLine();            }            catch(Exception e)            {            }            if(next==null)            {                return false;            }            st=new StringTokenizer(next);            return true;        }    } }