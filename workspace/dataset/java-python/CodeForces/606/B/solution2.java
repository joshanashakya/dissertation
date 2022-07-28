import java.io.*;import java.util.StringTokenizer; public class Main {     public static void main(String[] args) throws Exception {        Reader in = new Reader(new InputStreamReader(System.in));        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));         int n, m;        int x, y;        char[] s;        n = in.nextInt();        m = in.nextInt();        x = in.nextInt();        y = in.nextInt();        s = in.next().toCharArray();         boolean[][] visit = new boolean[n + 1][m + 1];        out.print(1 + " ");        visit[x][y] = true;        for (int i = 0; i < s.length; i++) {            char now = s[i];            if (now == 'U' && x != 1) {                x--;            } else if (now == 'D' && x != n) {                x++;            } else if (now == 'L' && y != 1) {                y--;            } else if (now == 'R' && y != m) {                y++;            }            if (i != s.length - 1) {                if (visit[x][y]) {                    out.print(0 + " ");                } else {                    out.print(1 + " ");                }                visit[x][y] = true;            }        }         int last = 0;        for (int i = 1; i <= n; i++) {            for (int j = 1; j <= m; j++) {                if (!visit[i][j]) {                    last++;                }            }        }        out.println(last);         out.flush();        in.close();        out.close();    }     static class Reader {        BufferedReader reader;        StringTokenizer st;         Reader(InputStreamReader stream) {            reader = new BufferedReader(stream);            st = null;        }         void close() throws IOException {            reader.close();        }         String next() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         String nextLine() throws IOException {            return reader.readLine();        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }     }}
