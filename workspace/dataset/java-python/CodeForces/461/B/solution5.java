import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static int mod = 1_000_000_007;    long[][] dp;    List<Integer>[] adj;    int[] x;    void run(FastScanner in, PrintWriter out) {         int n = in.nextInt();        adj = new List[n];        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();        for (int v = 1; v < n; v++) {            int u = in.nextInt();            adj[u].add(v);            adj[v].add(u);        }        x = new int[n];        for (int i = 0; i < n; i++) x[i] = in.nextInt();         // dp[i][0] = ways to go from node i with 0 black nodes        // dp[i][1] = ways to go from node i with 1 black node        dp = new long[n][2];        go(0, -1);         out.println(dp[0][1]);    }     void go(int u, int p) {         dp[u][0] = 1;        dp[u][1] = 0;         // ways to have 0 black nodes up to u ->        // no black nodes up to child1 * no black nodes up to child2 * ...        // + ways to have 1 black node up to u (and cut the edge above u)         // ways to have 1 black node up to u        // = ways to have 1 black node from child1 * no black node from child2 * ...        // + ways to have 0 black nodes from child1 * one black node from child2 * ...        // = dp[v1][1]*dp[v2][0]*dp[v3][0]*...        //   + dp[v1][0]*dp[v2][1]*dp[v3][0]*...        //   + dp[v1][0]*dp[v2][0]*dp[v3][1]*...          for (int v : adj[u]) {            if (v == p) continue;            go(v, u);             dp[u][1] = (dp[u][1] * dp[v][0]);            dp[u][1] = (dp[u][1] + dp[v][1] * dp[u][0]) % mod;            dp[u][0] = (dp[u][0] * dp[v][0]) % mod;        }         if (x[u] == 1) {            // black node            dp[u][1] = dp[u][0];            // the one black node we propagate will be itself        } else {            // number of ways to prop 0 node increases by cutting parent edge            dp[u][0] = (dp[u][0] + dp[u][1]) % mod;        }    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}
