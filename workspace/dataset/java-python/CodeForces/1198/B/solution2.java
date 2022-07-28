import java.io.*;import java.util.*;  public class Main implements Runnable {    int n, m, k;    static boolean use_n_tests = false;     void solve(FastScanner in, PrintWriter out, int testNumber) {        n = in.nextInt();        int[] a = in.nextArray(n);        int q = in.nextInt();        int[] maxs = new int[q + 1];        int it = 0;        Map<Integer, Integer> sett = new HashMap<>();        Map<Integer, Integer> sett_maxid = new HashMap<>();        for (int i = 0; i < q; i++) {            int t = in.nextInt();            if (t == 2) {                int x = in.nextInt();                maxs[it++] = x;            } else {                int id = in.nextInt();                int v = in.nextInt();                sett.put(id, v);                sett_maxid.put(id, it);            }        }        for (int i = it - 2; i >= 0; i--) {            maxs[i] = Math.max(maxs[i], maxs[i + 1]);        }        for (int i = 0; i < n; i++) {            if (sett.containsKey(i + 1)) {                int v = sett.get(i + 1);                int id = sett_maxid.get(i + 1);                if (id != it) {                    out.print(Math.max(v, maxs[id]) + " ");                } else {                    out.print(v + " ");                }            } else {                if (it != 0) {                    out.print(Math.max(a[i], maxs[0]) + " ");                } else {                    out.print(a[i] + " ");                }            }        }    }     // ****************************** template code ***********    static int stack_size = 1 << 27;     void pre_solve() {    }     class Coeff {        long mod;        long[][] C;        long[] fact;        boolean cycleWay = false;         Coeff(int n, long mod) {            this.mod = mod;            fact = new long[n + 1];            fact[0] = 1;            for (int i = 1; i <= n; i++) {                fact[i] = i;                fact[i] %= mod;                fact[i] *= fact[i - 1];                fact[i] %= mod;            }        }         Coeff(int n, int m, long mod) {            // n > m            cycleWay = true;            this.mod = mod;            C = new long[n + 1][m + 1];            for (int i = 0; i <= n; i++) {                for (int j = 0; j <= Math.min(i, m); j++) {                    if (j == 0 || j == i) {                        C[i][j] = 1;                    } else {                        C[i][j] = C[i - 1][j - 1] + C[i - 1][j];                        C[i][j] %= mod;                    }                }            }        }         public long C(int n, int m) {            if (cycleWay) {                return C[n][m];            }            return fC(n, m);        }         private long fC(int n, int m) {            return (fact[n] * inv(fact[n - m] * fact[m] % mod)) % mod;        }         private long inv(long r) {            if (r == 1)                return 1;            return ((mod - mod / r) * inv(mod % r)) % mod;        }    }     class Pair {        int first;        int second;         public int getFirst() {            return first;        }         public int getSecond() {            return second;        }    }     class MultisetTree<T> {        int size = 0;         TreeMap<T, Integer> mp = new TreeMap<>();         void add(T x) {            mp.merge(x, 1, Integer::sum);            size++;        }         void remove(T x) {            if (mp.containsKey(x)) {                mp.merge(x, -1, Integer::sum);                if (mp.get(x) == 0) {                    mp.remove(x);                }                size--;            }        }         boolean contains(T x) {            return mp.containsKey(x);        }         T greatest() {            return mp.lastKey();        }         T smallest() {            return mp.firstKey();        }         int size() {            return size;        }         int diffSize() {            return mp.size();        }         void clear() {            mp.clear();            size = 0;        }    }     class Multiset<T> {        int size = 0;         Map<T, Integer> mp = new HashMap<>();         void add(T x) {            mp.merge(x, 1, Integer::sum);            size++;        }         boolean contains(T x) {            return mp.containsKey(x);        }         void remove(T x) {            if (mp.containsKey(x)) {                mp.merge(x, -1, Integer::sum);                if (mp.get(x) == 0) {                    mp.remove(x);                }                size--;            }        }         int size() {            return size;        }         int diffSize() {            return mp.size();        }    }     static class Range {        int l, r;        int id;         public int getL() {            return l;        }         public int getR() {            return r;        }         public Range(int l, int r, int id) {            this.l = l;            this.r = r;            this.id = id;        }    }     static class Array {        static Range[] readRanges(int n, FastScanner in) {            Range[] result = new Range[n];            for (int i = 0; i < n; i++) {                result[i] = new Range(in.nextInt(), in.nextInt(), i);            }            return result;        }         static boolean isSorted(Integer[] a) {            for (int i = 0; i < a.length - 1; i++) {                if (a[i] > a[i + 1]) {                    return false;                }            }            return true;        }         static public long sum(int[] a) {            long sum = 0;            for (int x : a) {                sum += x;            }            return sum;        }         static public long sum(long[] a) {            long sum = 0;            for (long x : a) {                sum += x;            }            return sum;        }         static public long sum(Integer[] a) {            long sum = 0;            for (int x : a) {                sum += x;            }            return sum;        }         static public int min(Integer[] a) {            int mn = Integer.MAX_VALUE;            for (int x : a) {                mn = Math.min(mn, x);            }            return mn;        }         static public int min(int[] a) {            int mn = Integer.MAX_VALUE;            for (int x : a) {                mn = Math.min(mn, x);            }            return mn;        }         static public int max(Integer[] a) {            int mx = Integer.MIN_VALUE;            for (int x : a) {                mx = Math.max(mx, x);            }            return mx;        }         static public int max(int[] a) {            int mx = Integer.MIN_VALUE;            for (int x : a) {                mx = Math.max(mx, x);            }            return mx;        }         static public int[] readint(int n, FastScanner in) {            int[] out = new int[n];            for (int i = 0; i < out.length; i++) {                out[i] = in.nextInt();            }            return out;        }    }     class Graph {        List<List<Integer>> graph;         Graph(int n) {            create(n);        }         void create(int n) {            List<List<Integer>> graph = new ArrayList<>();            for (int i = 0; i < n; i++) {                graph.add(new ArrayList<>());            }            this.graph = graph;        }         void readBi(int m, FastScanner in) {            for (int i = 0; i < m; i++) {                int v = in.nextInt() - 1;                int u = in.nextInt() - 1;                graph.get(v).add(u);                graph.get(u).add(v);            }        }    }     class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream io) {            br = new BufferedReader(new InputStreamReader(io));        }         public String line() {            String result = "";            try {                result = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return result;        }         public String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public int[] nextArray(int n) {            int[] res = new int[n];            for (int i = 0; i < n; i++) {                res[i] = in.nextInt();            }            return res;        }         public long[] nextArrayL(int n) {            long[] res = new long[n];            for (int i = 0; i < n; i++) {                res[i] = in.nextLong();            }            return res;        }         public Long[] nextArrayL2(int n) {            Long[] res = new Long[n];            for (int i = 0; i < n; i++) {                res[i] = in.nextLong();            }            return res;        }          public Integer[] nextArray2(int n) {            Integer[] res = new Integer[n];            for (int i = 0; i < n; i++) {                res[i] = in.nextInt();            }            return res;        }         public long nextLong() {            return Long.parseLong(next());        }     }     void run_t_tests() {        pre_solve();        int t = in.nextInt();        int i = 0;        while (t-- > 0) {            solve(in, out, i++);        }    }     void run_one() {        solve(in, out, -1);    }     @Override    public void run() {        in = new FastScanner(System.in);        out = new PrintWriter(System.out);        if (use_n_tests) {            run_t_tests();        } else {            run_one();        }        out.close();    }     static FastScanner in;    static PrintWriter out;     public static void main(String[] args) throws InterruptedException {        Thread thread = new Thread(null, new Main(), "", stack_size);        thread.start();        thread.join();    }}