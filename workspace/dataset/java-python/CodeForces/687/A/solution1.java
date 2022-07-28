import java.util.*;import java.io.*;import java.math.BigInteger;import java.text.*;public class Main {    static long mod = 1000_000_007;    static long mod1 = 998244353;    static boolean fileIO = true;    static boolean memory = true;    static FastScanner f;    static PrintWriter pw;    static double eps = (double)1e-6;    static int oo = (int)2e9;     // N = 1 or N = max ?    // longs vs. ints ?    // max / min ?     static int n , m , color[];    static ArrayList<Integer> adj[];    static boolean ok;     static void dfs(int u , int p) {        if (p == -1) color[u] = 0;        else color[u] = color[p] ^ 1;         for (Integer v : adj[u]) {            if (color[v] == color[u]) {                ok = false;                return;            }            if (color[v] == -1) {                dfs(v , u);            }        }    }     public static void solve() throws Exception {        n = f.ni(); m = f.ni();        adj = new ArrayList[n];        color = new int[n];        ok = true;        for (int i = 0; i < n; ++i) {            adj[i] = new ArrayList<>();            color[i] = -1;        }         for (int i = 0; i < m; ++i) {            int u = f.ni(); int v = f.ni();            adj[--u].add(--v);            adj[v].add(u);        }         for (int i = 0; i < n; ++i) {            if (color[i] == -1) dfs(i , -1);        }                if (!ok) {            pn("-1");            return;        }         StringBuffer z = new StringBuffer("");        StringBuffer o = new StringBuffer("");        int cnt0 = 0;        for (int i = 0; i < n; ++i) {            if (color[i] == 0) {                ++cnt0;                z.append((i + 1) + " ");            }            else o.append((i + 1) + " ");        }         pn(cnt0);        pn(z);        pn((n - cnt0));        pn(o);    }           public static void main(String[] args)throws Exception {        if(memory) new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();System.exit(1);}}}, "", 1 << 28).start();        else new Main().run();    }        /******************************END OF MAIN PROGRAM*******************************************/    void run()throws Exception {        if (System.getProperty("ONLINE_JUDGE") == null) {            f = new FastScanner("");            pw = new PrintWriter(System.out);        }        else {            f = new FastScanner();            pw = new PrintWriter(System.out);            //fw = new FileWriter("!out.txt");        }        //pre();        int t = 1;        int tt = 1;        while(t --> 0) {            //fw.write("Case #" + (tt++) + ": ");            //fw.write("\n");            solve();        }        pw.flush();         pw.close();     }     public static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(String str) throws Exception {            try {                br = new BufferedReader(new FileReader("!a.txt"));            }            catch (Exception e) {                e.printStackTrace();            }        }         public FastScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         public String next()throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int ni() throws IOException {return Integer.parseInt(next());}         public long nl() throws IOException {return Long.parseLong(next());}         public String nextLine() throws IOException {return br.readLine();}         public double nd() throws IOException {return Double.parseDouble(next());}     }     public static void pn(Object... o) {for(int i = 0; i < o.length; ++i) pw.print(o[i] + (i + 1 < o.length ? " ": "\n"));}    public static void p(Object... o) {for(int i = 0; i < o.length; ++i) pw.print(o[i] + (i + 1 < o.length ? " " : ""));}    public static void pni(Object... o) {for(Object obj : o) pw.print(obj + " "); pw.println(); pw.flush();}    public static int gcd(int a,int b){if(b==0)return a;else{return gcd(b,a%b);}}    public static long gcd(long a,long b){if(b==0l)return a;else{return gcd(b,a%b);}}    public static long lcm(long a,long b){return (a*b/gcd(a,b));}    public static long pow(long a,long b){long res=1;while(b>0){if((b&1)==1)res=res*a;b>>=1;a=a*a;}return res;}    public static int pow(int a,int b){int res=1;while(b>0){if((b&1)==1)res=res*a;b>>=1;a=a*a;}return res;}    public static long mpow(long a,long b, long m){long res=1;while(b>0){if((b&1)==1)res=((res%m)*(a%m))%m;b>>=1;a=((a%m)*(a%m))%m;}return res;}    public static long mul(long a , long b , long mod){return ((a%mod)*(b%mod)%mod);}    public static long adp(long a , long b){return ((a%mod)+(b%mod)%mod);}    public static int dig(long a){int cnt=0;while(a>0){a/=10;++cnt;}return Math.max(1,cnt);}    public static int dig(int a){int cnt=0;while(a>0){a/=10;++cnt;}return Math.max(1,cnt);}    public static boolean isPrime(long n){if(n<=1)return false;if(n<=3)return true;if(n%2==0||n%3==0)return false;for(long i=5;i*i<=n;i=i+6)if(n%i==0||n%(i+2)==0)return false;return true;}    public static boolean isPrime(int n){if(n<=1)return false;if(n<=3)return true;if(n%2==0||n%3==0)return false;for(int i=5;i*i<=n;i=i+6)if(n%i==0||n%(i+2)==0)return false;return true;}    public static HashSet<Long> factors(long n){HashSet<Long> hs=new HashSet<Long>();for(long i=1;i<=(long)Math.sqrt(n);i++){if(n%i==0){hs.add(i);hs.add(n/i);}}return hs;}    public static HashSet<Integer> factors(int n){HashSet<Integer> hs=new HashSet<Integer>();for(int i=1;i<=(int)Math.sqrt(n);i++){if(n%i==0){hs.add(i);hs.add(n/i);}}return hs;}    public static HashSet<Long> pf(long n){HashSet<Long> ff=factors(n);HashSet<Long> ans=new HashSet<Long>();for(Long i:ff)if(isPrime(i))ans.add(i);return ans;}    public static HashSet<Integer> pf(int n){HashSet<Integer> ff=factors(n);HashSet<Integer> ans=new HashSet<Integer>();for(Integer i:ff)if(isPrime(i))ans.add(i);return ans;}    public static int gnv(char c){return Character.getNumericValue(c);}    public static void sort(int[] a){ArrayList<Integer> l=new ArrayList<>();for(int i:a)l.add(i);Collections.sort(l);for(int i=0;i<a.length;++i)a[i]=l.get(i);}    public static void sort(long[] a){ArrayList<Long> l=new ArrayList<>();for(long i:a)l.add(i);Collections.sort(l);for(int i=0;i<a.length;++i)a[i]=l.get(i);}    public static void sort(ArrayList<Integer> a){Collections.sort(a);}}
