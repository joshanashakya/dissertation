import java.io.*;import java.math.BigDecimal;import java.util.*;public class Main {    public static void main(String args[])    {        FastReader input=new FastReader();        PrintWriter out=new PrintWriter(System.out);        int T=1;        while(T-->0)        {            int l=input.nextInt();            String s=input.next();            if(l%2==0)            {                int in=l/2;                if(s.charAt(in)=='0')                {                    int x=-1;                    for(int i=in;i<l;i++)                    {                        if(s.charAt(i)!='0')                        {                            x=i;                            break;                        }                    }                    int y=-1;                    for(int i=in;i>=0;i--)                    {                        if(s.charAt(i)!='0')                        {                            y=i;                            break;                        }                    }                    if(x==-1)                    {                        String s1=s.substring(0,y);                        String s2=s.substring(y,l);                        BigDecimal b=new BigDecimal(s1);                        b=b.add(new BigDecimal(s2));                        out.println(b.toString());                    }                    else                    {                        String s1=s.substring(0,y);                        String s2=s.substring(y,l);                        String s3=s.substring(0,x);                        String s4=s.substring(x,l);                        BigDecimal b1=new BigDecimal(s1);                        b1=b1.add(new BigDecimal(s2));                        BigDecimal b2=new BigDecimal(s3);                        b2=b2.add(new BigDecimal(s4));                        if(b1.compareTo(b2)<=0)                        {                            out.println(b1.toString());                        }                        else                        {                            out.println(b2.toString());                        }                    }                }                else                {                    String s1=s.substring(0,l/2);                    String s2=s.substring(l/2,l);                    BigDecimal b=new BigDecimal(s1);                    b=b.add(new BigDecimal(s2));                    out.println(b.toString());                }            }            else            {                int in1=l/2;                int in2=in1+1;                if(s.charAt(in1)!='0' && s.charAt(in2)!='0')                {                    String s1=s.substring(0,in1);                    String s2=s.substring(in1,l);                    String s3=s.substring(0,in2);                    String s4=s.substring(in2,l);                    BigDecimal b1=new BigDecimal(s1);                    b1=b1.add(new BigDecimal(s2));                    BigDecimal b2=new BigDecimal(s3);                    b2=b2.add(new BigDecimal(s4));                    if(b1.compareTo(b2)<=0)                    {                        out.println(b1.toString());                    }                    else                    {                        out.println(b2.toString());                    }                }                else if(s.charAt(in1)!='0' && s.charAt(in2)=='0')                {                    String s1=s.substring(0,in1);                    String s2=s.substring(in1,l);                    BigDecimal b=new BigDecimal(s1);                    b=b.add(new BigDecimal(s2));                    out.println(b.toString());                }                else if(s.charAt(in1)=='0' && s.charAt(in2)!='0')                {                    String s1=s.substring(0,in2);                    String s2=s.substring(in2,l);                    BigDecimal b=new BigDecimal(s1);                    b=b.add(new BigDecimal(s2));                    out.println(b.toString());                }                else                {                    int x=-1;                    for(int i=in2;i<l;i++)                    {                        if(s.charAt(i)!='0')                        {                            x=i;                            break;                        }                    }                    int y=-1;                    for(int i=in1;i>=0;i--)                    {                        if(s.charAt(i)!='0')                        {                            y=i;                            break;                        }                    }                    if(x==-1)                    {                        String s1=s.substring(0,y);                        String s2=s.substring(y,l);                        BigDecimal b=new BigDecimal(s1);                        b=b.add(new BigDecimal(s2));                        out.println(b.toString());                    }                    else                    {                        String s1=s.substring(0,y);                        String s2=s.substring(y,l);                        String s3=s.substring(0,x);                        String s4=s.substring(x,l);                        BigDecimal b1=new BigDecimal(s1);                        b1=b1.add(new BigDecimal(s2));                        BigDecimal b2=new BigDecimal(s3);                        b2=b2.add(new BigDecimal(s4));                        if(b1.compareTo(b2)<=0)                        {                            out.println(b1.toString());                        }                        else                        {                            out.println(b2.toString());                        }                    }                }            }        }        out.close();    }    public static String fun(String a,String b)    {        if(b.length()>a.length())        {            String temp=a;            a=b;            b=temp;        }        int i=a.length()-1;        int j=b.length()-1;        int c=0;        char ch[]=new char[a.length()+1];        int k=ch.length-1;        while(j>=0)        {            int x=a.charAt(i)-48;            int y=b.charAt(j)-48;            int s=x+y+c;            if(s>9)            {                s-=10;                c=1;            }            else            {                c=0;            }            ch[k]=(char)(s+48);            k--;j--;i--;        }        while(i>=0)        {            int x=a.charAt(i)-48;            int s=x+c;            if(s>9)            {                s-=10;                c=1;            }            else            {                c=0;            }            ch[k]=(char)(s+48);            i--;            k--;        }        ch[k]=(char)(c+48);        return String.copyValueOf(ch);    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {             return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}