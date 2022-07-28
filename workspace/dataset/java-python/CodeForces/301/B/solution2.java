import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.*; public class TestClass {      static final class InputReader {        private final InputStream stream;        private final byte[] buf = new byte[1024];        private int curChar;        private int numChars;         public InputReader(InputStream stream) {            this.stream = stream;        }         private int read() throws IOException {            if (curChar >= numChars) {                curChar = 0;                numChars = stream.read(buf);                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public final int readInt() throws IOException {            return (int) readLong();        }         public final long readLong() throws IOException {            int c = read();            while (isSpaceChar(c)) {                c = read();                if (c == -1) throw new IOException();            }            boolean negative = false;            if (c == '-') {                negative = true;                c = read();            }            long res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return negative ? -res : res;        }         public final int[] readIntArray(int size) throws IOException {            int[] array = new int[size];            for (int i = 0; i < size; i++) {                array[i] = readInt();            }            return array;        }         public final long[] readLongArray(int size) throws IOException {            long[] array = new long[size];            for (int i = 0; i < size; i++) {                array[i] = readLong();            }            return array;        }         public final String readString() throws IOException {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.append((char) c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         private boolean isSpaceChar(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }    }     static long mulmod(long a, long b,                       long mod) {        long res = 0; // Initialize result        a = a % mod;        while (b > 0) {            // If b is odd, add 'a' to result            if (b % 2 == 1) {                res = (res + a) % mod;            }             // Multiply 'a' with 2            a = (a * 2) % mod;             // Divide b by 2            b /= 2;        }         // Return result        return res % mod;    }     static long pow(long a, long b, long MOD) {        long x = 1, y = a;        while (b > 0) {            if (b % 2 == 1) {                x = (x * y);                if (x > MOD) x %= MOD;            }            y = (y * y);            if (y > MOD) y %= MOD;            b /= 2;        }        return x;    }     static long[] f = new long[100001];     static long InverseEuler(long n, long MOD) {        return pow(n, MOD - 2, MOD);    }     static long C(int n, int r, long MOD) {         return (f[n] * ((InverseEuler(f[r], MOD) * InverseEuler(f[n - r], MOD)) % MOD)) % MOD;    }     public static class SegmentTree {        long[] tree;        long[] lazy;        int n;         public SegmentTree(long[] arr) {            n = arr.length;            tree = new long[arr.length * 5];            lazy = new long[arr.length * 5];            build(arr, 0, arr.length - 1, 0);        }         private void build(long[] arr, int s, int e, int pos) {            if (s == e) {                tree[pos] = arr[s];                return;            }            int m = (s + e) / 2;             build(arr, s, m, 2 * pos + 1);            build(arr, m + 1, e, 2 * pos + 2);             tree[pos] = Math.max(tree[2 * pos + 1], tree[2 * pos + 2]);        }         public void update(int s, int e, long val) {            updateUtil(s, e, val, 0, n - 1, 0);        }         public long get(int s, int e) {            return getUtil(s, e, 0, n - 1, 0);        }         private long getUtil(int gs, int ge, int s, int e, int pos) {            if (s > e || s > ge || e < gs) return Long.MIN_VALUE;            if (lazy[pos] != 0) {                tree[pos] += lazy[pos];                if (s != e) {                    lazy[2 * pos + 1] += lazy[pos];                    lazy[2 * pos + 2] += lazy[pos];                }                lazy[pos] = 0;            }            if (s >= gs && e <= ge) {                return tree[pos];            }            int m = (s + e) / 2;            return Math.max(getUtil(gs, ge, s, m, 2 * pos + 1), getUtil(gs, ge, m + 1, e, 2 * pos + 2));        }         private void updateUtil(int us, int ue, long val, int s, int e, int pos) {            if (s > e || s > ue || e < us) return;             if (lazy[pos] != 0) {                tree[pos] += lazy[pos];                if (s != e) {                    lazy[2 * pos + 1] += lazy[pos];                    lazy[2 * pos + 2] += lazy[pos];                }                lazy[pos] = 0;            }             if (s >= us && e <= ue) {                tree[pos] += val;                if (s != e) {                    lazy[2 * pos + 1] += val;                    lazy[2 * pos + 2] += val;                }                return;            }             int m = (s + e) / 2;            updateUtil(us, ue, val, s, m, 2 * pos + 1);            updateUtil(us, ue, val, m + 1, e, 2 * pos + 2);             tree[pos] = Math.max(tree[2 * pos + 1], tree[2 * pos + 2]);        }      }      static int[] h = {0, 0, -1, 1};    static int[] v = {1, -1, 0, 0};      public static class Pair {        public int d, w;         public Pair(int d, int w) {            this.d = d;            this.w = w;        }      }     public static void main(String[] args) throws Exception {        //https://i...content-available-to-author-only...e.com/ebRGa6        InputReader in = new InputReader(System.in);        int n = in.readInt();        int d = in.readInt();         int[] a = new int[n];         for (int i = 1; i < n-1; ++i) {            a[i] = in.readInt();        }         List<Pair> nodes = new ArrayList<>();         for (int i = 0; i < n; ++i) {            int f = in.readInt();            int t = in.readInt();            nodes.add(new Pair(f, t));        }         boolean[] vis = new boolean[n];        int[] dis = new int[n];        Arrays.fill(dis, Integer.MAX_VALUE);        dis[0] = 0;         for (int i = 0; i < n; ++i) {            int least = -1;            for (int j = 0; j < n; ++j) {                if (!vis[j]) {                    if (least == -1) {                        least = j;                    } else if (dis[j] < dis[least]) {                        least = j;                    }                }            }             vis[least] = true;             for (int j = 0; j < n; ++j) {                if (j != least) {                    dis[j] = Math.min(dis[j], dis[least] + d*(Math.abs(nodes.get(least).d - nodes.get(j).d) + Math.abs(nodes.get(least).w - nodes.get(j).w)) - a[least]);                     // System.out.println(j + " " + dis[j]);                 }            }        }        System.out.println(dis[n-1]);       }     private static long solve(long[][] dp, int n, int r) {        if (n == 0) {            if (r == 0) return 1;            else  return 0;        }        if (r <= 0) return 0;        if (dp[n][r] != -1) return dp[n][r];        long answer = 0;        for (int i = 1; i < n; ++i) {            answer += solve(dp, n-1, r-i);        }        dp[n][r] = answer;        return answer;    }     static int gcd(int a, int b) {         while (b != 0) {            int t = a;            a = b;            b = t % b;        }        return a;    }   }                                 