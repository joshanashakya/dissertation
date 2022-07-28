import java.io.*;import java.util.*; import static java.math.BigDecimal.valueOf; public class Solution {    static MyScanner sc;    private static PrintWriter out;    static long M2 = 1_000_000_000L + 7;     public static void main(String[] s) throws Exception {        StringBuilder stringBuilder = new StringBuilder(); //        stringBuilder.append("10 1 10 100 1000 10000 100000 1000000 10000000 100000000 1000000000 10000000000 100000000000 1000000000000");        if (stringBuilder.length() == 0) {            sc = new MyScanner(System.in);        } else {            sc = new MyScanner(new BufferedReader(new StringReader(stringBuilder.toString())));        }          out = new PrintWriter(new OutputStreamWriter(System.out));        initData();        solve();//        out.println(time);        out.flush();    }      private static void initData() {     }     static long[] fact;    static long[] ifact;     static {        fact = new long[200000];        ifact = new long[200000];        fact[0] = ifact[0] = 1;        for (int i = 1; i < fact.length; i++) {            fact[i] = fact[i - 1] * i;            fact[i] %= M2;            ifact[i] = pow(fact[i], M2 - 2, M2);        }    }      private static void solve() throws IOException {        int n = sc.nextInt();        long[] res = new long[n];         for (int i = 0; i < n; i++) {            res[i] = sc.nextLong();        }         int type = n % 4;        int diff = 0;        while ((type - diff - 1) % 4 != 0) {            diff++;        }         long[] rt = new long[diff + 1];        int mmm = (n - diff - 1) / 2;        for (int i = 0; i < rt.length; i++) {            long cur = 0;            for (int s = 0; s <= mmm; s++) {                cur += (res[i + s * 2] * c(s, mmm)) % M2;                cur %= M2;            }            rt[i] = cur;        }        long count = n * (n - 1) / 2 - (diff + 1) * (diff) / 2;        count %= 2;          out.println(calc(rt, count == 0 ? 1 : -1));      }     private static long c(int s, int mmm) {        long v = ifact[s] * ifact[mmm - s];        v %= M2;        return (v * fact[mmm]) % M2;    }     static long calc(long[] c, int ct) {        if (c.length == 1) return c[0];        long[] nn = new long[c.length - 1];        for (int i = 0; i < nn.length; i++) {            nn[i] = (c[i] + ct * c[i + 1] + M2) % M2;            ct = -ct;        }        return calc(nn, ct);    }      private static void solveT() throws IOException {        int t = sc.nextInt();        while (t-- > 0) {            solve();        }    }     private static long gcd(long l, long l1) {        if (l > l1) return gcd(l1, l);        if (l == 0) return l1;        return gcd(l1 % l, l);    }     private static long pow(long a, long b, long m) {        if (b == 0) return 1;        if (b == 1) return a;        long pp = pow(a, b / 2, m);        pp *= pp;        pp %= m;        return (pp * (b % 2 == 0 ? 1 : a)) % m;    }      static class MyScanner {        BufferedReader br;        StringTokenizer st;         MyScanner(BufferedReader br) {            this.br = br;        }         public MyScanner(InputStream in) {            this(new BufferedReader(new InputStreamReader(in)));        }         void findToken() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }        }         String next() {            findToken();            return st.nextToken();        }         Integer[] nab(int n) {            Integer[] k = new Integer[n];            for (int i = 0; i < n; i++) {                k[i] = sc.fi();            }            return k;        }         int[] na(int n) {            int[] k = new int[n];            for (int i = 0; i < n; i++) {                k[i] = sc.fi();            }            return k;        }         long[] nl(int n) {            long[] k = new long[n];            for (int i = 0; i < n; i++) {                k[i] = sc.nextLong();            }            return k;        }         int nextInt() {            return Integer.parseInt(next());        }         int fi() {            String t = next();            int cur = 0;            boolean n = t.charAt(0) == '-';            for (int a = n ? 1 : 0; a < t.length(); a++) {                cur = cur * 10 + t.charAt(a) - '0';            }            return n ? -cur : cur;        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }    }  }
