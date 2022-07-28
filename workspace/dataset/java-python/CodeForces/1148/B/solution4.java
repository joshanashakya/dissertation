import java.io.*;import java.lang.reflect.Array;import java.util.*; public class B {    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }     static FastReader s = new FastReader();    static PrintWriter out = new PrintWriter(System.out);     private static int[] rai(int n) {        int[] arr = new int[n];        for (int i = 0; i < n; i++) {            arr[i] = s.nextInt();        }        return arr;    }     private static int[][] rai(int n, int m) {        int[][] arr = new int[n][m];        for (int i = 0; i < n; i++) {            for (int j = 0; j < m; j++) {                arr[i][j] = s.nextInt();            }        }        return arr;    }     private static long[] ral(int n) {        long[] arr = new long[n];        for (int i = 0; i < n; i++) {            arr[i] = s.nextLong();        }        return arr;    }     private static long[][] ral(int n, int m) {        long[][] arr = new long[n][m];        for (int i = 0; i < n; i++) {            for (int j = 0; j < m; j++) {                arr[i][j] = s.nextLong();            }        }        return arr;    }     private static int ri() {        return s.nextInt();    }     private static long rl() {        return s.nextLong();    }     private static String rs() {        return s.next();    }     static int gcd(int a,int b)    {        if(b==0)        {            return a;        }        return gcd(b,a%b);    }     static boolean isPrime(int n) {        //check if n is a multiple of 2        if (n % 2 == 0) return false;        //if not, then just check the odds        for (int i = 3; i <= Math.sqrt(n); i += 2) {            if (n % i == 0)                return false;        }        return true;    }     static int[][] vis;    static boolean check(long[] dep,long[] arr,int t,int pos,int k,long l)    {//        System.out.println("\tpos="+pos);         if(vis[t][pos]!=-1)        {            if(vis[t][pos]==0)            {                return false;            }            else {                return true;            }        }        if(pos==dep.length)        {            vis[t][pos]=1;            return true;        }        long curr=dep[pos]+(long)arr[t%(2*k)];        if(curr>l)        {            vis[t][pos]=0;            return false;        }         boolean b=false;        for(int i=t;i<t+2*k;i++)        {            curr=dep[pos]+arr[i%(2*k)];            if(curr>l)            {                break;            }            boolean val=check(dep,arr,(i+1)%(2*k),pos+1,k,l);            vis[(i+1)%(2*k)][pos+1]=0;            b|=val;        }        vis[t][pos]=0;        if(b)        {            vis[t][pos]=1;        }         return b;//        return b2;    }    static int bsearch(long[] arr,long curr)    {        int l=0,r=arr.length-1;        int ind=-1;        while(l<=r)        {            int mid=(l+r)/2;            if(arr[mid]>=curr)            {                if(mid==0)                {                    return mid;                }                else if(arr[mid-1]<curr)                {                    return mid;                }                else                {                    r=mid-1;                }            }            else {                l=mid+1;            }        }        return -1;    }    public static void main(String[] args) {        StringBuilder ans = new StringBuilder();//        int t = ri();        int t=1;        while (t-- > 0)        {            int n=ri();            int m=ri();            long ta=rl();            long tb=rl();            int k=ri();            long[] a=ral(n);            long[] b=ral(m);             if(k>=n)            {                ans.append("-1\n");                continue;            }            int flag=0;            long res=Long.MIN_VALUE;            for(int i=0;i<=Math.min(n-1,k);i++)            {                int left=k-i;                long curr=a[i]+ta;                int ind=bsearch(b,curr);                if(ind==-1)                {                    flag=1;                    break;                }                 int sec=m-ind;//                System.out.println(i+" "+left+" "+ind);                if(sec<=left)                {                    flag=1;                    break;                }                else                {                    ind+=left;//                    System.out.println("ind="+ind);                    long total=b[ind]+tb;                    res=Math.max(total,res);                }            }            if(flag==1)            {                ans.append("-1\n");            }            else            {                ans.append(res).append("\n");            }        }        out.print(ans.toString());        out.flush();     } }  