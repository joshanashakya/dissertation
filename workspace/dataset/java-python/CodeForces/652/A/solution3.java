import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Main {      public static void main(String[] args) throws IOException {        Scanner s = new Scanner(System.in);        long h1 = s.nextLong(),h2=s.nextLong(),a=s.nextLong(),b=s.nextLong();         h1+=(8*a);         if(h1>=h2) {            System.out.println(0);        }         else {            long inc = (12*a)-(12*b);            if(inc<=0) System.out.println(-1);            else{                System.out.println((long)(Math.ceil((h2-h1)*1.0/inc)));            }        }        } }  class Scanner{    StringTokenizer st;    BufferedReader br;     public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}     public String next() throws IOException    {        while (st == null || !st.hasMoreTokens())            st = new StringTokenizer(br.readLine());        return st.nextToken();    }     public int nextInt() throws IOException {return Integer.parseInt(next());}     public long nextLong() throws IOException {return Long.parseLong(next());}     public String nextLine() throws IOException {return br.readLine();}     public double nextDouble() throws IOException    {        String x = next();        StringBuilder sb = new StringBuilder("0");        double res = 0, f = 1;        boolean dec = false, neg = false;        int start = 0;        if(x.charAt(0) == '-')        {            neg = true;            start++;        }        for(int i = start; i < x.length(); i++)            if(x.charAt(i) == '.')            {                res = Long.parseLong(sb.toString());                sb = new StringBuilder("0");                dec = true;            }            else            {                sb.append(x.charAt(i));                if(dec)                    f *= 10;            }        res += Long.parseLong(sb.toString()) / f;        return res * (neg?-1:1);    }     public boolean ready() throws IOException {return br.ready();}  } 		 	   			  		 	 		  		 		 	
