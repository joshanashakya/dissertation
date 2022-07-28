import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.List;import java.util.Iterator;import java.util.Collection;import java.util.InputMismatchException;import java.io.IOException;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pradyumn */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, FastReader in, PrintWriter out) {            int x = in.nextInt();            int y = in.nextInt();            int x0 = in.nextInt();            int y0 = in.nextInt();            char[] s = in.nextString().toCharArray();            boolean[][] marked = new boolean[x + 1][y + 1];            int n = s.length;            List<Integer> ans = new ArrayList<>();            ans.add(1);            marked[x0][y0] = true;            for (int i = 0; i < n; ++i) {                int val = 0;                if (s[i] == 'L') {                    if (y0 != 1) --y0;                } else if (s[i] == 'R') {                    if (y0 != y) ++y0;                } else if (s[i] == 'U') {                    if (x0 != 1) --x0;                } else if (s[i] == 'D') {                    if (x0 != x) ++x0;                }                if (!marked[x0][y0]) {                    val = 1;                    marked[x0][y0] = true;                }                if (i == n - 1) {                    for (int p = 1; p <= x; ++p) {                        for (int q = 1; q <= y; ++q) {                            if (!marked[p][q]) ++val;                        }                    }                }                ans.add(val);            }            ArrayUtils.printArray(out, ans);        }     }     static class ArrayUtils {        public static <T> void printArray(PrintWriter out, Collection<T> array) {            if (array.size() == 0) return;            int size = array.size();            Iterator<T> iterator = array.iterator();            int ct = 0;            for (; ct < size && iterator.hasNext(); ct++) {                if (ct != 0) out.print(" ");                out.print(iterator.next());            }            out.println();        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[8192];        private int curChar;        private int pnumChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         private int pread() {            if (pnumChars == -1) {                throw new InputMismatchException();            }            if (curChar >= pnumChars) {                curChar = 0;                try {                    pnumChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (pnumChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public int nextInt() {            int c = pread();            while (isSpaceChar(c))                c = pread();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = pread();            }            int res = 0;            do {                if (c == ',') {                    c = pread();                }                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = pread();            } while (!isSpaceChar(c));            return res * sgn;        }         public String nextString() {            int c = pread();            while (isSpaceChar(c))                c = pread();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = pread();            } while (!isSpaceChar(c));            return res.toString();        }         private boolean isSpaceChar(int c) {            if (filter != null) {                return filter.isSpaceChar(c);            }            return isWhitespace(c);        }         private static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         private interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }}
