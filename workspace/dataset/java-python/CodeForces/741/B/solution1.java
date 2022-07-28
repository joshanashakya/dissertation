import java.util.*;import java.io.*; public class b{    static int [] parent,rank, weight, beauty,wt,bt;    static List<Integer> [] al;     static void merge(int a,int b){        int u=find(a);        int v=find(b);        if(u==v)return;         if(rank[u]>=rank[v]){            parent[v]=u;            beauty[u]+=beauty[v];            weight[u]+=weight[v];        }        else{            parent[u]=v;            beauty[v]+=beauty[u];            weight[v]+=weight[u];        }           }     static int find(int k){        if(parent[k]!=k)            parent[k]=find(parent[k]);        return parent[k];    }     static long f(List<Integer> list, int n,int w,long [][] dp){        if(w<0)return Integer.MIN_VALUE;        if(n==0)return 0;        if(dp[n][w]!=-1)return dp[n][w];         long a=f(list,n-1,w,dp); //  not pick          // pick whole group        long b=beauty[list.get(n-1)]+f(list,n-1,w-weight[list.get(n-1)],dp);         // pick either one of them        long c=Integer.MIN_VALUE;        for(int v  :al[list.get(n-1)]){            long temp=f(list,n-1,w-wt[v],dp);            c=Math.max(c,temp+bt[v]);        }         return dp[n][w]=Math.max(a,Math.max(b,c));    }        public static void main(String  args[] ) throws IOException{        FastScanner sc=new FastScanner();        int n=sc.nextInt();        int m=sc.nextInt();        int w=sc.nextInt();         wt=sc.nextIntArray(n);        bt=sc.nextIntArray(n);         parent=new int[n+1];        rank=new int[n+1];        weight=new int[n+1];        beauty=new int[n+1];        al=new ArrayList[n+1];          for(int i=0;i<n;i++){            parent[i]=i;            rank[i]=0;            weight[i]=wt[i];            beauty[i]=bt[i];            al[i]=new ArrayList<>();        }        while(m-->0){            int u=sc.nextInt()-1;            int v=sc.nextInt()-1;            merge(u,v);        }         List<Integer> parent=new ArrayList<>();        for(int i=0;i<n;i++){            int k=find(i);            if(k==i)parent.add(i);            al[k].add(i);        }         long [][] dp=new long[parent.size()+1][w+1];        for(int i=0;i<=parent.size();i++)Arrays.fill(dp[i],-1);         long ans=f(parent,parent.size(),w,dp);        System.out.println(ans);                 }}                                                                  class FastScanner{	    private int BUFFER_SIZE = 1 << 16;      private  DataInputStream din;      private  byte[] buffer;      private int bufferPointer, bytesRead;      public FastScanner() {       din = new DataInputStream(System.in);       buffer = new byte[BUFFER_SIZE];       bufferPointer = bytesRead = 0;   }    public FastScanner( String file_name) throws IOException {       din = new DataInputStream(new FileInputStream(file_name));       buffer = new byte[BUFFER_SIZE];       bufferPointer = bytesRead = 0;   }      public String readLine() throws IOException {        byte[] buf = new byte[64];       int cnt = 0, c;       while ((c = read()) != -1) {           if (c == '\n')               break;           buf[cnt++] = (byte) c;       }       return new String(buf, 0, cnt);   }      public String next() throws IOException{        byte c = read();       while(Character.isWhitespace(c)){           c = read();       }              StringBuilder builder = new StringBuilder();       builder.append((char)c);       c = read();       while(!Character.isWhitespace(c)){           builder.append((char)c);           c = read();       }              return builder.toString();   }    public int nextInt() throws IOException {       int ret = 0;       byte c = read();       while (c <= ' ')           c = read();        boolean neg = (c == '-');       if (neg)           c = read();       do {           ret = ret * 10 + c - '0';       } while ((c = read()) >= '0' && c <= '9');        if (neg)           return -ret;       return ret;   }      public int[] nextIntArray( int n) throws IOException {        int arr[] = new int[n];       for(int i = 0; i < n; i++){           arr[i] = nextInt();       }       return arr;   }    public long nextLong() throws IOException {       long ret = 0;       byte c = read();       while (c <= ' ')           c = read();        boolean neg = (c == '-');       if (neg)           c = read();       do {           ret = ret * 10 + c - '0';       } while ((c = read()) >= '0' && c <= '9');       if (neg)           return -ret;       return ret;   }      public long[] nextLongArray( int n) throws IOException {        long arr[] = new long[n];       for(int i = 0; i < n; i++){           arr[i] = nextLong();       }       return arr;   }    public char nextChar() throws IOException{       byte c = read();       while(Character.isWhitespace(c)){           c = read();       }       return (char) c;	   }      public double nextDouble() throws IOException {       double ret = 0, div = 1;       byte c = read();       while (c <= ' ')           c = read();        boolean neg = (c == '-');       if (neg)           c = read();        do {           ret = ret * 10 + c - '0';       } while ((c = read()) >= '0' && c <= '9');        if (c == '.') {           while ((c = read()) >= '0' && c <= '9') {               ret += (c - '0') / (div *= 10);           }       }        if (neg)           return -ret;       return ret;   }      public double[] nextDoubleArray( int n) throws IOException {        double arr[] = new double[n];       for(int i = 0; i < n; i++){           arr[i] = nextDouble();       }       return arr;   }    private void fillBuffer() throws IOException {       bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);       if (bytesRead == -1)           buffer[0] = -1;   }    private byte read() throws IOException {       if (bufferPointer == bytesRead)           fillBuffer();       return buffer[bufferPointer++];   }    public void close() throws IOException {       if (din == null)           return;       din.close();   } }