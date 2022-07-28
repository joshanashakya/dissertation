import java.util.*;import java.io.*; public class Main {    public static void main(String args[]) {new Main().run();}     FastReader in = new FastReader();    PrintWriter out = new PrintWriter(System.out);    void run(){        work();        out.flush();    }    long mod=1000000007;    long gcd(long a,long b) {        return a==0?b:gcd(b%a,a);    }    void work() {        long n=nl(),k=nl();        int offset=65;        long[] A=new long[130];        long cnt=0;        for(int i=0;i<63;i++){            if((1L<<i&n)>0){                A[offset+i]=1;                cnt++;            }        }        if(cnt>k){            out.println("No");            return;        }        k-=cnt;        for(int i=127;;i--){            long c=A[i];            if(c>k){                break;            }else{                A[i-1]+=A[i]*2;                A[i]=0;                k-=c;            }        }        int idx=0;        for(int i=1;;i++){            if(A[i]>0){               idx=i;               break;            }        }        if(k>0){            A[idx]--;        }        List<Integer> ret=new ArrayList<>();        for(int i=127;i>=0;i--){            long c=A[i];            for(int j=0;j<c;j++){                ret.add(i-65);            }        }        if(k>0){            idx--;            while(k>0){                ret.add(idx-65);                k--;                idx--;            }            ret.add(idx+1-65);        }        out.println("Yes");        for(int r:ret){            out.print(r+" ");        }    }     //input    @SuppressWarnings("unused")    private ArrayList<Integer>[] ng(int n, int m) {        ArrayList<Integer>[] graph=(ArrayList<Integer>[])new ArrayList[n];        for(int i=0;i<n;i++) {            graph[i]=new ArrayList<>();        }        for(int i=1;i<=m;i++) {            int s=in.nextInt()-1,e=in.nextInt()-1;            graph[s].add(e);            graph[e].add(s);        }        return graph;    }     private ArrayList<long[]>[] ngw(int n, int m) {        ArrayList<long[]>[] graph=(ArrayList<long[]>[])new ArrayList[n];        for(int i=0;i<n;i++) {            graph[i]=new ArrayList<>();        }        for(int i=1;i<=m;i++) {            long s=in.nextLong()-1,e=in.nextLong()-1,w=in.nextLong();            graph[(int)s].add(new long[] {e,w,i});            graph[(int)e].add(new long[] {s,w});        }        return graph;    }     private int ni() {        return in.nextInt();    }     private long nl() {        return in.nextLong();    }     private String ns() {        return in.next();    }     private long[] na(int n) {        long[] A=new long[n];        for(int i=0;i<n;i++) {            A[i]=in.nextLong();        }        return A;    }    private int[] nia(int n) {        int[] A=new int[n];        for(int i=0;i<n;i++) {            A[i]=in.nextInt();        }        return A;    }} class FastReader{    BufferedReader br;    StringTokenizer st;     public FastReader()    {        br=new BufferedReader(new InputStreamReader(System.in));    }      public String next()    {        while(st==null || !st.hasMoreElements())//回车，空行情况        {            try {                st = new StringTokenizer(br.readLine());            } catch (IOException e) {                e.printStackTrace();            }        }        return st.nextToken();    }     public int nextInt()    {        return Integer.parseInt(next());    }     public long nextLong()    {        return Long.parseLong(next());    }}