   import java.io.*;import java.util.*;import java.math.BigInteger; import java.lang.Object;  public class Main {                   static class sort implements Comparator<int[]>   {        public int compare(int[] a,int[] b)        {                        //if(a[0] == b[0]) return a[1]-b[1];           /*if(a[1] < b[1]) return -1;           else if(a[1] > b[1]) return 1;           return a[0]-b[0];*/           int l1,l2;           l1=(a[1]-a[0]);           l2=(b[1]-b[0]);           if(l1>l2)           {                return -1;           }           else if(l2>l1)           {                return 1;           }           else            {               if(a[1]<=b[0])               {                    return -1;               }               return 1;           }        }   }   static class sort1 implements Comparator<double[]>   {        public int compare(double[] a,double[] b)        {            //if(a[0] == b[0]) return a[1]-b[1];           if(a[1] < b[1]) return -1;           else if(a[1] > b[1]) return 1;           return 0;        }   }   public static String[] F(BufferedReader bf) throws Exception    {        return (bf.readLine().split(" "));    }       public static void pr(PrintWriter out,Object o)   {          out.println(o.toString());//out.flush();       }   public static void prW(PrintWriter out,Object o)   {          out.print(o.toString());//out.flush();       }   public static int intIn(String st)   {      return Integer.parseInt(st);   }              public static void pr(Object o)    {        System.out.println(o.toString());    }    public static void prW(Object o)    {        System.out.print(o.toString());    }           public static int inInt(String s)    {        return Integer.parseInt(s);    }    public static long in(String s)    {        return Long.parseLong(s);    }      static int[] toIntArray(String[] m)     {         int[] p=new int[m.length];        for(int o=0;o<m.length;o++)        {            p[o]= inInt(m[o]);        }        return p;    }    static double[] toDArray(String[] m)     {         double[] p=new double[m.length];        for(int o=0;o<m.length;o++)        {            p[o]= Double.parseDouble(m[o]);        }        return p;    }    static long[] toLArray(String[] m)     {        long[] p=new long[m.length];        for(int o=0;o<m.length;o++)        {            p[o]= in(m[o]);        }        return p;    }        static int[][] di={{0,1},{1,0},{0,-1},{-1,0}};    static int[] dir = {4,3,2,-4,-3,-2};    public static void F(int i,int c,int[] vis,List<Integer> res,int n)    {        vis[i]=1;        res.add(i);        for(int x : dir)        {            int v = i+x;            if(v<=0 || v>n) continue;             if(vis[v] == 0)            {                F(v,c,vis,res,n);            }        }    }     static long gcd(long a, long b)        {          if (b == 0)            return a;          return gcd(b, a % b);         }        static long Gp(long l,long b,long lcm)        {            long c1,c2;                c1 = (l/lcm);                long sum=0l;                sum += (c1-1l)*(b);                long las = (l/lcm)*lcm;                sum += Math.min(l-las+1l,b);                return sum;        }    public static boolean ok(int mid,int[] arr,int[][] mat,int q)    {        int tot=0;        for(int[] a : mat)        {            int p=a[0];            int l = a[1];            int ans=q+1;            int g = Math.abs(p);            if(p==0) continue;            for(int o=0;o<arr.length;o++)            {                if((arr[o]*p) < 0)                {                    int sp = Math.abs(arr[o]);                    int v = (g/sp);                    if((g%sp) != 0) v++;                    if(v<=mid)                    {                        ans=Math.min(ans,Math.abs(l-o));                    }                }            }             if(ans > q ) return false;            tot += ans;        }         return tot<=q;    }    public static long F(int a,int b)    {         return 462161773423l*(a+0l) + 4549834777463l*(b+0l);    }    public static void update(int[] diff,int i,long k)    {        int j=(int)(k);        if(j<i) return;        diff[i] +=1;        diff[j+1] -=1;    }    public static void main (String[] args) throws Exception {                BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));        PrintWriter out = new PrintWriter(System.out);;;                //int[] map=new int[1000001];             int yy=1;//Integer.parseInt(bf.readLine());        for(int w=0;w<yy;w++)        {            // String str = bf.readLine();            out.flush();            String[] xlp = bf.readLine().split(" ");;;;;;            //String st = bf.readLine();           int n,t;//boolean bol=false;           int m;//long a,b,c;           int k;         n=inInt(xlp[0]);//m=inInt(xlp[1]);//k=inInt(xlp[2]);//t=inInt(xlp[3]);       // m = Integer.parseInt(xlp[1]);            long[] arr=toLArray(F(bf));            long pow=1;            List<Long> list=new ArrayList<>();            while(pow < 30000000000l)            {                list.add(pow);                pow = (pow<<(1));            }            Map<Long,Long> map=new HashMap<>();            long res=0l;            //pr(out,list);             for(long x : arr)            {                long d=0l;                 for(long v : list)                 {                    res += (map.getOrDefault(v-x,0l));                 }                 map.put(x,map.getOrDefault(x,0l)+1);             }             pr(out,res);                          }    out.close();    bf.close();}}  /*  101 2 3 4 5 6 7 8 9 10102 12 22 32 42 52 62 72 82 92 10 100663319,201326611,402653189,805306457,1610612741Kickstart String rp;            rp = "Case #"+(w+1)+": "+(n-ans)+" ";static int[][] dir={{0,1},{1,0},{-1,0},{0,-1}}; static class SegmentTreeRMQ     {     int st[];     int minVal(int x, int y) {         return (x > y) ? x : y;     }           int getMid(int s, int e) {         return s + (e - s) / 2;     }           int RMQUtil(int ss, int se, int qs, int qe, int index)     {                 if (qs <= ss && qe >= se)             return st[index];           // If segment of this node is outside the given range         if (se < qs || ss > qe)             return Integer.MIN_VALUE;           // If a part of this segment overlaps with the given range         int mid = getMid(ss, se);         return minVal(RMQUtil(ss, mid, qs, qe, 2 * index + 1),                 RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));     }       // Return minimum of elements in range from index qs (query     // start) to qe (query end).  It mainly uses RMQUtil()     int RMQ(int n, int qs, int qe)     {         // Check for erroneous input values                   return RMQUtil(0, n - 1, qs, qe, 0);     }       // A recursive function that constructs Segment Tree for     // array[ss..se]. si is index of current node in segment tree st     int constructSTUtil(int arr[], int ss, int se, int si)     {         // If there is one element in array, store it in current         //  node of segment tree and return         if (ss == se) {             st[si] = arr[ss];             return arr[ss];         }           // If there are more than one elements, then recur for left and         // right subtrees and store the minimum of two values in this node         int mid = getMid(ss, se);         st[si] = minVal(constructSTUtil(arr, ss, mid, si * 2 + 1),                 constructSTUtil(arr, mid + 1, se, si * 2 + 2));         return st[si];     }           void con(int arr[])     {         // Allocate memory for segment tree           //Height of segment tree         int n = (arr.length);        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));           //Maximum size of segment tree         int max_size = 2 * (int) Math.pow(2, x) - 1;         st = new int[max_size]; // allocate memory           // Fill the allocated memory st         constructSTUtil(arr, 0, n - 1, 0);     }    }     static class DSU {        int[] p;int[] sz;int op;int c;;    int[] last;    public void G(int n)    {        last=new int[n];        p=new int[n];        sz=new int[n];c=n;        op=n;        for(int h=0;h<n;h++)        {            sz[h]=1;p[h]=h;            last[h]=h;        }    }    public int find(int x)    {        int y=x;        while(x!=p[x]) x=p[x];        while(y!=p[y])        {            int tem=p[y];            p[y]=x;y=tem;        }        return p[y];    }    public void union(int a,int b)    {        int x,y;        x=find(a);y=find(b);        if(x==y) return;        if(sz[x]>sz[y])        {            p[y] = x;            sz[x]+=sz[y];            last[x]=Math.max(last[x],last[y]);        }        else        {            p[x]=y;sz[y]+=sz[x];            last[y]=Math.max(last[y],last[x]);        }        c--;            }}     static long pow(long x, long y, long p)      {        long res = 1; // Initialize result             x = x % p; // Update x if it is more than or        // equal to p             if (x == 0)          return 0l; // In case x is divisible by p;             while (y > 0)        {               // If y is odd, multiply x with result          if ((y & 1) != 0)            res = (res * x) % p;               // y must be even now          y = y >> 1; // y = y/2          x = (x * x) % p;        }        return res;      }      static long gcd(long a, long b)        {          if (b == 0)            return a;          return gcd(b, a % b);         }        static int gcd(int a, int b,int o)        {          if (b == 0)            return a;          return gcd(b, a % b,o);         } Geometric median public static double F(double[] x,double[] w)    {        double d1,d2;        double S=0.00;        for(double dp : w) S += dp;        int k = 0;        double sum = S - w[0]; // sum is the total weight of all `x[i] > x[k]`         while(sum > S/2)        {            ++k;            sum -= w[k];        }        d1=x[k];        return d1;        k = w.length-1;       sum = S - w[k]; // sum is the total weight of all `x[i] > x[k]`         while(sum > S/2)        {            --k;            sum -= w[k];        }        d2=x[k];        return new double[]{d1,d2};    }*/