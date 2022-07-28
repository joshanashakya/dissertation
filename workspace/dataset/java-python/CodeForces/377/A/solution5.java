import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pranay2516 */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        AMaze solver = new AMaze();        solver.solve(1, in, out);        out.close();    }     static class AMaze {        int n;        int m;        int k;        char[][] a;        boolean[][] v;        int[] dx = {1, -1, 0, 0};        int[] dy = {0, 0, 1, -1};         public void solve(int testNumber, FastReader in, PrintWriter out) {            n = in.nextInt();            m = in.nextInt();            k = in.nextInt();            a = new char[n][m];            v = new boolean[n][m];            in.readArray(a);            for (int i = 0; i < n; ++i) {                for (int j = 0; j < m; ++j) {                    if (a[i][j] == '#') {                        v[i][j] = true;                    }                }            }            for (int i = 0; i < n; ++i) {                for (int j = 0; j < m; ++j) {                    if (!v[i][j]) {                        dfs(i, j);                    }                }            }            for (int i = 0; i < n; ++i) {                out.println(a[i]);            }        }         void dfs(int i, int j) {            if (invalid(i, j)) return;            v[i][j] = true;            for (int l = 0; l < 4; ++l) {                dfs(i + dx[l], j + dy[l]);            }            for (int l = 0; l < 4; ++l) {                if (invalid(i + dx[l], j + dy[l])) {                    if (k > 0 && a[i][j] == '.') {                        a[i][j] = 'X';                        k--;                    }                }            }        }         boolean invalid(int i, int j) {            return (i < 0 || j < 0 || i >= n || j >= m || v[i][j]);        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) return -1;            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) c = read();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            }            while (!isSpaceChar(c));            return res * sgn;        }         public String next() {            int c = read();            while (isSpaceChar(c)) c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public void readArray(char[][] a) {            for (int i = 0; i < a.length; i++)                a[i] = next().toCharArray();        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 