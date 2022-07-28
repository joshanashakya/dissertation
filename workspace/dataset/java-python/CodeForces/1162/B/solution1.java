import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pranay2516 */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BDoubleMatrix solver = new BDoubleMatrix();        solver.solve(1, in, out);        out.close();    }     static class BDoubleMatrix {        public void solve(int testNumber, FastReader in, PrintWriter out) {            int n = in.nextInt(), m = in.nextInt();            int[][] a = new int[n][m];            int[][] b = new int[n][m];            int[][] min = new int[n][m];            int[][] max = new int[n][m];            in.readArray(a);            in.readArray(b);            for (int i = 0; i < n; ++i) {                for (int j = 0; j < m; ++j) {                    min[i][j] = Math.min(a[i][j], b[i][j]);                    max[i][j] = Math.max(a[i][j], b[i][j]);                }            }//        for (int i = 0; i < n; ++i) {//            for (int j = 0; j < m; ++j) {//                out.print(min[i][j]+" ");//            }//            out.println();//        }//        for (int i = 0; i < n; ++i) {//            for (int j = 0; j < m; ++j) {//                out.print(max[i][j]+" ");//            }//            out.println();//        }            for (int i = 0; i < n; ++i) {                for (int j = 0; j < m - 1; ++j) {                    if (min[i][j] >= min[i][j + 1]) {                        out.println("Impossible");                        return;                    }                }            }            for (int i = 0; i < m; ++i) {                for (int j = 0; j < n - 1; ++j) {                    if (min[j][i] >= min[j + 1][i]) {                        out.println("Impossible");                        return;                    }                }            }            for (int i = 0; i < n; ++i) {                for (int j = 0; j < m - 1; ++j) {                    if (max[i][j] >= max[i][j + 1]) {                        out.println("Impossible");                        return;                    }                }            }            for (int i = 0; i < m; ++i) {                for (int j = 0; j < n - 1; ++j) {                    if (max[j][i] >= max[j + 1][i]) {                        out.println("Impossible");                        return;                    }                }            }            out.println("Possible");        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) return -1;            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) c = read();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            }            while (!isSpaceChar(c));            return res * sgn;        }         public boolean isSpaceChar(int c) {            if (filter != null) return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public void readArray(int[][] a) {            for (int i = 0; i < a.length; i++)                for (int j = 0; j < a[0].length; ++j)                    a[i][j] = nextInt();        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 
