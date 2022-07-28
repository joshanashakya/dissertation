import java.io.*;import java.util.ArrayList;import java.util.Arrays;import java.util.StringTokenizer;import java.util.List; import java.util.*;  public class realfast implements Runnable   {    private static final int INF = (int) 1e9;    long in= 1000000007;    long fac[]= new long[1000001];    long inv[]=new long[1000001];    public  void solve() throws IOException     {         //int t = readInt();          int t = readInt();         for(int f =0;f<t;f++)        {             int n = readInt();              ArrayList<edge> e = new ArrayList<edge>();              int arr[]=new int [n];              for(int i =0;i<n;i++)             {                 arr[i]= readInt();                 e.add(new edge(arr[i],i));             }                          int stack[]=new int[n+10];             int top=-1;             int prev[]=new int[n];             for(int i =0;i<n;i++)             {                 prev[i]=-1;             }              Collections.sort(e);             for(int i=n-1;i>=0;i--)             {                 while(top!=-1)                 {                         if(arr[i]>arr[stack[top]])                         {                            prev[stack[top]]=i;                            top--;                         }                         else                            break;                 }                 top++;                 stack[top]= i;             }              int seg[]=new int [4*n+4];             int dp[]=new int[n];             for(int i=0;i<n;i++)             {                 int u = e.get(i).u;                 int v = e.get(i).v;                // out.println(prev[v]);                // out.println(v+"  v");                 if(prev[v]+1<v)                 {                        int value = find(seg,0,n-1,prev[v]+1,v-1,0);                                            dp[v]= 1+ Math.max(0,value);                  }                  if(prev[v]>=1)                 {                      int value = find(seg,0,n-1,0,prev[v]-1,0);                      dp[v]=  Math.max(2+value,dp[v]);                 }                  if(v==0)                    dp[v]=1;                 else                    dp[v]= Math.max(dp[v],2);                  add(seg,0,n-1,v,dp[v],0);              }              int max =0;              for(int i=0;i<n;i++)             {               // out.print(dp[i]+" ");                 max= Math.max(max,dp[i]);             }              out.println(max);          }                  }    public void add(int seg[] , int left , int right, int i , int val, int index)    {               if(left==right)               {                seg[index]= Math.max(val,seg[index]);                return ;               }               seg[index]= Math.max(seg[index],val);               int mid = left+(right-left)/2;               if(i<=mid)                add(seg,left,mid,i,val,2*index+1);               else                add(seg,mid+1,right,i,val,2*index+2);    }    public int find(int seg[], int left , int right , int l , int r , int index)    {           if(left>r||right<l)            return 0;           if(left>=l&&right<=r)            return seg[index];            int mid = left+(right-left)/2;            int val1 = find(seg,left,mid,l,r,2*index+1);           int val2 = find(seg,mid+1,right,l,r,2*index+2);           return Math.max(val1,val2);     }    public boolean intersect(long s1 , long e1 , long s2, long e2)    {        if(e2<s1)            return false;        if(e1<s2)            return false;        return true;    }        public int value (int seg[], int left , int right ,int index, int l, int r)    {                        if(left>right)            {              return -100000000;            }            if(right<l||left>r)                return -100000000;            if(left>=l&&right<=r)                return seg[index];            int mid = left+(right-left)/2;            int val = value(seg,left,mid,2*index+1,l,r);            int val2 = value(seg,mid+1,right,2*index+2,l,r);            return Math.max(val,val2);     }       public int gcd(int a , int b )    {      if(a<b)      {        int t =a;        a=b;        b=t;      }      if(a%b==0)        return b ;      return gcd(b,a%b);    }    public long pow(long n , long p,long m)    {         if(p==0)            return 1;        long val = pow(n,p/2,m);;        val= (val*val)%m;        if(p%2==0)            return val;        else            return (val*n)%m;    }            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////    public static void main(String[] args) {        new Thread(null, new realfast(), "", 128 * (1L << 20)).start();    }     private static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;    private BufferedReader reader;    private StringTokenizer tokenizer;    private PrintWriter out;     @Override    public void run() {        try {            if (ONLINE_JUDGE || !new File("input.txt").exists()) {                reader = new BufferedReader(new InputStreamReader(System.in));                out = new PrintWriter(System.out);            } else {                reader = new BufferedReader(new FileReader("input.txt"));                out = new PrintWriter("output.txt");            }            solve();        } catch (IOException e) {            throw new RuntimeException(e);        } finally {            try {                reader.close();            } catch (IOException e) {                // nothing            }            out.close();        }    }     private String readString() throws IOException {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(reader.readLine());        }        return tokenizer.nextToken();    }     @SuppressWarnings("unused")    private int readInt() throws IOException {        return Integer.parseInt(readString());    }     @SuppressWarnings("unused")    private long readLong() throws IOException {        return Long.parseLong(readString());    }     @SuppressWarnings("unused")    private double readDouble() throws IOException {        return Double.parseDouble(readString());    }}class edge implements Comparable<edge>{    int u ;    int v;        edge(int u, int v)    {       this.u=u;       this.v=v;    }    public int compareTo(edge e)    {        if(this.u!=e.u)        return this.u-e.u;         return this.v-e.v;    }}
