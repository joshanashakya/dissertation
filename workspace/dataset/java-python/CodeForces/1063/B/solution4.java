import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Deque;import java.util.LinkedList;import java.util.StringTokenizer; public class CF1063B {    static final int[] dx = { +1, -1, 0, 0 };    static final int[] dy = { 0, 0, +1, -1 };     public static void main(String[] args) throws IOException {        FastScanner sc = new FastScanner();        PrintWriter pw = new PrintWriter(System.out);        int n = sc.nextInt(), m = sc.nextInt();        int xS = sc.nextInt() - 1, yS = sc.nextInt() - 1;        int l = sc.nextInt(), r = sc.nextInt();        boolean[][] grid = new boolean[n][m];        for (int i = 0; i < n; i++) {            char[] line = sc.nextToken().toCharArray();            for (int j = 0; j < m; j++)                if (line[j] == '.')                    grid[i][j] = true;        }         // BFS        Deque<Integer> q = new LinkedList<Integer>();        boolean[][] vis = new boolean[n][m];        int[][] dist = new int[n][m];        for (int i = 0; i < n; i++)            for (int j = 0; j < m; j++)                dist[i][j] = Integer.MAX_VALUE;        dist[xS][yS] = 0;        q.add(xS * m + yS);        int cells = 0;        while (!q.isEmpty()) {            int z = q.remove(), x = z / m, y = z % m;            if (vis[x][y])                continue;            vis[x][y] = true;            if (dist[x][y] > r)                break;            if (dist[x][y] - (y - yS) <= l)                cells++;            for (int i = 0; i < 4; i++) {                int x1 = x + dx[i], y1 = y + dy[i], z1 = x1 * m + y1;                if (x1 >= 0 && x1 < n && y1 >= 0 && y1 < m && grid[x1][y1]) {                    int w;                    int d = dist[x][y] + (w = (dy[i] == 1 ? 1 : 0));                    if (d < dist[x1][y1]) {                        dist[x1][y1] = d;                        if (w == 1)                            q.addLast(z1);                        else                            q.addFirst(z1);                    }                }            }        }        pw.println(cells);        pw.flush();    }     static class FastScanner {        BufferedReader in;        StringTokenizer st;         public FastScanner() {            this.in = new BufferedReader(new InputStreamReader(System.in));        }         public String nextToken() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(in.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(nextToken());        }         public long nextLong() {            return Long.parseLong(nextToken());        }         public double nextDouble() {            return Double.parseDouble(nextToken());        }         public void close() throws IOException {            in.close();        }    }}