import java.io.*;import java.util.ArrayList;import java.util.Arrays;import java.util.List;import java.util.StringTokenizer;public class realfast implements Runnable {    private static final int INF = (int) 1e9;        public  void solve() throws IOException     {              int n = readInt();       int m = readInt();       if(n>m)       {        int val = n;        n=m;        m=val;       }       if(n!=2&&n%2==0)       {        out.println((n/2)*(m));       }       else if(n!=1&&n%2==1)       {        long val = n/2;        long val1 = (m);        val = val*val1;        val = val+ (m+1)/2;        out.println(val);       }       else{        if(n==1)         out.println(m);        else if(n==2)        {            if(m%2==0)            {               if(m%4==0)                out.println(m);               else               out.println(m+2);            }            else                out.println(m+1);        }       }     }               ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////    public static void main(String[] args) {        new Thread(null, new realfast(), "", 128 * (1L << 20)).start();    }     private static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;    private BufferedReader reader;    private StringTokenizer tokenizer;    private PrintWriter out;     @Override    public void run() {        try {            if (ONLINE_JUDGE || !new File("input.txt").exists()) {                reader = new BufferedReader(new InputStreamReader(System.in));                out = new PrintWriter(System.out);            } else {                reader = new BufferedReader(new FileReader("input.txt"));                out = new PrintWriter("output.txt");            }            solve();        } catch (IOException e) {            throw new RuntimeException(e);        } finally {            try {                reader.close();            } catch (IOException e) {                // nothing            }            out.close();        }    }     private String readString() throws IOException {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(reader.readLine());        }        return tokenizer.nextToken();    }     @SuppressWarnings("unused")    private int readInt() throws IOException {        return Integer.parseInt(readString());    }     @SuppressWarnings("unused")    private long readLong() throws IOException {        return Long.parseLong(readString());    }     @SuppressWarnings("unused")    private double readDouble() throws IOException {        return Double.parseDouble(readString());    }}class edge implements Comparable<edge>{    int u ;    int v ;    int val;    edge(int u1, int v1 , int val1)    {       this.u=u1;       this.v=v1;       this.val=val1;    }    public int compareTo(edge e)    {        return this.val-e.val;    }}