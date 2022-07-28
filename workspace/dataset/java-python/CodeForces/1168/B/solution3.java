import java.io.*;import java.util.ArrayList;import java.util.Arrays;import java.util.List;import java.util.StringTokenizer; import java.util.*;public  class realfast implements Runnable   {    private static final int INF = (int) 1e9;    long in= (long)Math.pow(10,9)+7;    long fac[]= new long[3000];    public  void solve() throws IOException     {     String s = readString();      int n=s.length();     int last[]= new int[s.length()];     Arrays.fill(last,n);     for(int j=1;j<=9;j++)     {      for(int i =0;i<n-2*j;i++)      {       if(s.charAt(i)==s.charAt(i+j)&&s.charAt(i+j)==s.charAt(i+2*j))        {            last[i]=Math.min(last[i],i+2*j);        }      }     }     for(int i =n-2;i>=0;i--)     {        last[i]=Math.min(last[i],last[i+1]);     }     long count=0;     for(int i=0;i<n;i++)        count = count+n-last[i];      out.println(count);    }      public long pow(long n , long p,long m)    {         if(p==0)            return 1;        long val = pow(n,p/2,m);;        val= (val*val)%m;        if(p%2==0)            return val;        else            return (val*n)%m;    }            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////    public static void main(String[] args) {        new Thread(null, new realfast(), "", 128 * (1L << 20)).start();    }     private static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;    private BufferedReader reader;    private StringTokenizer tokenizer;    private PrintWriter out;     @Override    public void run() {        try {            if (ONLINE_JUDGE || !new File("input.txt").exists()) {                reader = new BufferedReader(new InputStreamReader(System.in));                out = new PrintWriter(System.out);            } else {                reader = new BufferedReader(new FileReader("input.txt"));                out = new PrintWriter("output.txt");            }            solve();        } catch (IOException e) {            throw new RuntimeException(e);        } finally {            try {                reader.close();            } catch (IOException e) {                // nothing            }            out.close();        }    }     private String readString() throws IOException {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(reader.readLine());        }        return tokenizer.nextToken();    }     @SuppressWarnings("unused")    private int readInt() throws IOException {        return Integer.parseInt(readString());    }     @SuppressWarnings("unused")    private long readLong() throws IOException {        return Long.parseLong(readString());    }     @SuppressWarnings("unused")    private double readDouble() throws IOException {        return Double.parseDouble(readString());    }}class edge implements Comparable<edge>{    int u ;    int v ;    int val;    edge(int u1, int v1 , int val1)    {       this.u=u1;       this.v=v1;       this.val=val1;    }    public int compareTo(edge e)    {        return this.val-e.val;    }}
