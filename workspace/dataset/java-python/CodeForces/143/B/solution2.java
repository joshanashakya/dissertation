import java.lang.reflect.Array;import java.text.DecimalFormat;import java.util.*;import java.io.*; public class Equal {      static class pair implements Comparable<pair> {        int x;        int y;         public pair(int u, int  v) {            this.x = u;            this.y = v;        }         @Override        public int compareTo(pair o) {            if(y==o.y)                return 0;            if(y<o.y)                return 1;            return -1;        }    }     static double dis(pair a, pair b) {        return Math.sqrt(((a.x - b.x) * (a.x - b.x)) + ((a.y - b.y) * (a.y - b.y)));    }     static int c;    static int d;    static int e;     static void extendedEuclid(int a, int b) {        if (b == 0) {            c = 1;            d = 0;            e = a;            return;        }        extendedEuclid(b, a % b);        int x1 = d;        int y1 = c - (a / b) * d;        c = x1;        d = y1;    }    static int[]rank;    static int[]p;    static int sets;    static int findSet(int i){        return (p[i]==i)?i:(p[i]=findSet(p[i]));    }    static boolean isSameSet(int i,int j){        return findSet(i)==findSet(j);    }    static void unionSet(int i,int j){        if(!isSameSet(i,j)){            sets--;            int x=findSet(i);            int y=findSet(j);            if(rank[x]>rank[y])                p[y]=x;            else {                p[x]=y;                if(rank[x]==rank[y])                    rank[y]++;            }        }    }    static class SegmentTree { // 1-based DS, OOP         int N; // the number of elements in the array as a power of 2 (i.e. after padding)        long[] array, sTree, lazy;         SegmentTree(long[] in) {            array = in;            N = in.length - 1;            sTree = new long[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero            lazy = new long[N << 1];            build(1, 1, N);        }         void build(int node, int b, int e) // O(n)        {            if (b == e)                sTree[node] = array[b];            else {                int mid = b + e >> 1;                build(node << 1, b, mid);                build(node << 1 | 1, mid + 1, e);                sTree[node] = Math.min(sTree[node << 1] , sTree[node << 1 | 1]);            }        }          long query(int i, int j) {            return query(1, 1, N, i, j);        }         long query(int node, int b, int e, int i, int j) // O(log n)        {            if (i > e || j < b)                return Long.MAX_VALUE;            if (b >= i && e <= j)                return sTree[node];            int mid = b + e >> 1;            long q1 = query(node << 1, b, mid, i, j);            long q2 = query(node << 1 | 1, mid + 1, e, i, j);            return Math.min(q1 , q2);         }    }     static int minIdx(long val,int idx,SegmentTree sg) {         int lo=idx+1;        int hi=sg.N;        int ans=-1;        while(lo<=hi) {            int mid=(lo+hi)>>1;            long x=sg.query(idx+1, mid);            if(x<=val) {                ans=mid-1;                hi=mid-1;            }            else {                lo=mid+1;            }        }        return ans;    }    static class tri implements Comparable<tri>{        int a;pair p;        public tri(int  aa,pair pp){            a=aa;p=pp;        }         @Override        public int compareTo(tri o) {           return o.a-a;        }    }    static long[]mem;    static pair[]in;    static int [][]vis;    static long max;    static int[]next;    static long[]a;    static long  dp(int i){       if(i<0||i>=mem.length)           return -1;       if(mem[i]!=-1)           return mem[i];       long x=dp(next[i]);        if(x==-1)          return mem[i]=a[i];        return mem[i]=gcd(a[i],x);     }    static long gcd(long a,long b){        if(b==0)            return a;        return gcd(b,a%b);    }//    static int firstLessThan(int i,long v){//        return 0;//    }    static long pow2(int e){        long res=1;        while(e-->0){            res*=2;        }        return res;    }     static long dis(String x,int i){        if(i==x.length())            return 0;        if(x.charAt(i)=='0')            return dis(x,i+1);        return pow2(x.length()-i)-1-dis(x,i+1);    }     public static void main(String[] args) throws IOException {        //BufferedReader br = new BufferedReader(new FileReader("name.in"));        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st;        PrintWriter out = new PrintWriter(System.out);        String s=br.readLine();        String before="";        String after="";        boolean negative=false;        if(s.charAt(0)=='-') {            negative = true;            s=s.substring(1);        }        for (int i = 0; i <s.length() ; i++) {            if(s.charAt(i)=='.'){                before=s.substring(0,i);                after=s.substring(i+1);                break;            }            if(i==s.length()-1)                before=s;        }        StringBuilder sb=new StringBuilder();        for (int i = before.length()-1; i >=0 ; i--) {            sb.append(before.charAt(i));            int x=before.length()-1-i;            if((x+1)%3==0&&x+1<before.length())                sb.append(',');        }        sb=sb.reverse();        if(after.length()>2)            after=after.substring(0,2);        else {            while (after.length()<2)                after+="0";        }        if(negative){            out.println("($"+sb.toString()+"."+after+")");        }        else out.println("$"+sb.toString()+"."+after);        out.flush();        out.close();     } }