import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main { 
    
    static boolean FROM_FILE = false;
    
    static boolean LOCAL = System.getProperty("ONLINE_JUDGE") == null;

    static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
        public FastReader() { 
            if (FROM_FILE) {
                try {
                    br = new BufferedReader(new FileReader("input.txt")); 
                } catch (IOException error) {
                }   
            } else {
                br = new BufferedReader(new InputStreamReader(System.in));    
            }
        }
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }
        int nextInt() { 
            return Integer.parseInt(next()); 
        }
        long nextLong() { 
            return Long.parseLong(next()); 
        }
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    static int max(int... nums) {
        int res = Integer.MIN_VALUE;
        for (int num: nums) res = Math.max(res, num);
        return res;
    }
    static int min(int... nums) {
        int res = Integer.MAX_VALUE;
        for (int num: nums) res = Math.min(res, num);
        return res;
    }
    static long max(long... nums) {
        long res = Long.MIN_VALUE;
        for (long num: nums) res = Math.max(res, num);
        return res;
    }
    static long min(long... nums) {
        long res = Long.MAX_VALUE;
        for (long num: nums) res = Math.min(res, num);
        return res;
    }
    
    static FastReader fr = new FastReader();
    static PrintWriter out;
    
    public static void main(String[] args) { 
        if (FROM_FILE) {
            try {
                out = new PrintWriter(new FileWriter("output.txt"));
            } catch (IOException error) {
                
            }
        } else {
            out = new PrintWriter(new OutputStreamWriter(System.out));
        }
        new Main().run();
        out.flush();
        out.close();
    } 
    
    class Graph {
        int n, k;
        ArrayList<int[]>[] adj;
        Graph(int n, int k) { 
            this.n = n; this.k = k;
            adj = new ArrayList[n + 1];
            for (int i = 1; i <= n; i += 1) adj[i] = new ArrayList<int[]>();
        }
        void addEdge(int u, int v, int w) {
            adj[u].add(new int[] {v, w});
        }
        void sortEdge() {
            for (int i = 1; i <= n; i += 1) {
                Collections.sort(adj[i], (e1, e2) -> Integer.compare(e1[1], e2[1]));
            }
        }
        ArrayList<Integer>[] degreeCache;
        void setDegreeCache() {
            degreeCache = new ArrayList[k + 1];
            for (int i = 1; i <= k; i += 1) degreeCache[i] = new ArrayList<Integer>();
            for (int i = 1; i <= n; i += 1) degreeCache[adj[i].size()].add(i);
        }
    }
    Graph g;
    int[] hashKey;
    long[][] cache;
    long target, res;
    
    void dfs(int idx, long val) {
        if (idx > g.k) {
            if (val == target) res += 1;
            return;
        }
        for (int c = 1; c <= idx; c += 1) {
            dfs(idx + 1, val + cache[idx][c]);
        }
    }
    
    
    void run() {
        int n = fr.nextInt(), m = fr.nextInt(), k = fr.nextInt();
        g = new Graph(n, k);
        for (int i = 0; i < m; i += 1) {
            int u = fr.nextInt(), v = fr.nextInt(), w = fr.nextInt();
            g.addEdge(u, v, w);
        }
        g.sortEdge();
        g.setDegreeCache();
        hashKey = new int[n + 1]; cache = new long[k + 1][k + 1];
        target = 0;
        for (int i = 1; i <= n; i += 1) {
            hashKey[i] = (int)(10000000 * Math.random());
            target += hashKey[i];
        }
        // out.println(Arrays.toString(hashKey));
        for (int idx = 1; idx <= k; idx += 1) {
            for (int c = 1; c <= idx; c += 1) {
                long item = 0;
                for (int u : g.degreeCache[idx]) {
                    int v = g.adj[u].get(c - 1)[0];
                    item += hashKey[v];
                }
                cache[idx][c] = item;
                // out.println(idx + " " + c + " " + item);
            }
        }
        res = 0;
        dfs(1, 0);
        out.println(res);
    }
}
