import java.util.*;import java.io.*; public class Main {     public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static int mod = 1_000_000_007;     void run(FastScanner in, PrintWriter out) {         char[] ca = in.next().toCharArray();        int n = ca.length;         int[] c = new int[n];        for (int i = 0; i < n; i++) {            c[i] = ca[n-1-i]-'0';        }         long[] dp = new long[n];        dp[0] = c[0] == 0 ? 0 : 1;        int prevOnePos = c[0] == 0 ? -1 : 0;         // calculate all 2^i i<100        long[] kk = new long[101];        kk[0] = 1;        for (int i = 1; i < 101; i++) kk[i] = (kk[i-1] << 1) % mod;         for (int i = 1; i < n; i++) {            dp[i] = dp[i-1];             if (c[i] == 1) {                // number of combinations with                // c = 1xxx, a = 0xxx                // d = 0xxx, b = 1xxx                long add = (kk[i]*kk[i]) % mod;                dp[i] = (dp[i] + add) % mod;            }             // number of combinations with            // c = 1xxx a = 1xxx            // for intermediate zeroes, the numbers need to remain the same            // up to the first one            if (prevOnePos != -1) {                // number of zeroes between i and the previous one pos                int numZeroes = i - prevOnePos - 1;                long comb = kk[numZeroes];                comb = (comb * dp[prevOnePos]) % mod;                dp[i] = (dp[i] + comb) % mod;            }             if (c[i] == 1) {                prevOnePos = i;            }         }        out.println(dp[n-1]);    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}