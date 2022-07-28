import java.io.*;import java.util.ArrayList;import java.util.Arrays;import java.util.List;import java.util.StringTokenizer;  public class realfast implements Runnable   {    private static final int INF = (int) 1e9;    long in= (long)Math.pow(10,9)+7;    public  void solve() throws IOException     {        int n = readInt();       int k = readInt();       String a = readString();       String b = readString();               int i=0;       for(i=0;i<n;i++)       {        if(a.charAt(i)!=b.charAt(i))            break;       }        long count =i;       long match[]= new long[n];       long val=0;       if(i<n)       match[i]++;        for(int j=i+1;j<n;j++)       {        val=2*val;         if(a.charAt(j)=='a')            val++;        val=Math.min(val,k);        match[j]=match[j]+val+1;       }       if(i<n)       match[i]++;       val=0;        for(int j=i+1;j<n;j++)       {         val=2*val;          if(b.charAt(j)=='b')            val++;          val=Math.min(val,k);          match[j]=match[j]+val+1;       }        for(int j=i;j<n;j++)        count= count+Math.min(k,match[j]);        out.println(count);            }    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////    public static void main(String[] args) {        new Thread(null, new realfast(), "", 128 * (1L << 20)).start();    }     private static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;    private BufferedReader reader;    private StringTokenizer tokenizer;    private PrintWriter out;     @Override    public void run() {        try {            if (ONLINE_JUDGE || !new File("input.txt").exists()) {                reader = new BufferedReader(new InputStreamReader(System.in));                out = new PrintWriter(System.out);            } else {                reader = new BufferedReader(new FileReader("input.txt"));                out = new PrintWriter("output.txt");            }            solve();        } catch (IOException e) {            throw new RuntimeException(e);        } finally {            try {                reader.close();            } catch (IOException e) {                // nothing            }            out.close();        }    }     private String readString() throws IOException {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(reader.readLine());        }        return tokenizer.nextToken();    }     @SuppressWarnings("unused")    private int readInt() throws IOException {        return Integer.parseInt(readString());    }     @SuppressWarnings("unused")    private long readLong() throws IOException {        return Long.parseLong(readString());    }     @SuppressWarnings("unused")    private double readDouble() throws IOException {        return Double.parseDouble(readString());    }}class edge implements Comparable<edge>{    int u ;    int v ;    int val;    edge(int u1, int v1 , int val1)    {       this.u=u1;       this.v=v1;       this.val=val1;    }    public int compareTo(edge e)    {        return this.val-e.val;    }}
