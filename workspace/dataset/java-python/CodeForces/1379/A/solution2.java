import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Arrays;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pranay2516 */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        AAcaciusAndString solver = new AAcaciusAndString();        int testCount = Integer.parseInt(in.next());        for (int i = 1; i <= testCount; i++)            solver.solve(i, in, out);        out.close();    }     static class AAcaciusAndString {        char[] f = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};         public void solve(int testNumber, FastReader in, PrintWriter out) {            int n = in.nextInt();            char[] c = in.next().toCharArray();            char[] tmp = new char[n];            tmp = Arrays.copyOf(c, n);            for (int i = 0; i < n; ++i) {                if (tmp[i] == '?') {                    tmp[i] = 'f';                }            }            if (check(tmp)) {                out.println("Yes");                out.println(tmp);                return;            }            for (int i = 0; i < n - 6; ++i) {                tmp = Arrays.copyOf(c, n);                for (int j = 0; j < 7; ++j) {                    if (tmp[i + j] == '?') {                        tmp[i + j] = f[j];                    }                }                for (int j = 0; j < n; ++j) {                    if (tmp[j] == '?') {                        tmp[j] = 'f';                    }                }                if (check(tmp)) {                    out.println("Yes");                    out.println(tmp);                    return;                }            }            out.println("No");        }         boolean check(char[] s) {            int cnt = 0;            int n = s.length;            for (int i = 0; i < n; ++i) {                if (s[i] == 'a' && i + 6 < n) {                    boolean ok = true;                    for (int j = 0; j < 7; ++j) {                        if (s[i + j] != f[j]) ok = false;                    }                    if (ok) cnt++;                }            }            return cnt == 1;        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) return -1;            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) c = read();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            }            while (!isSpaceChar(c));            return res * sgn;        }         public String next() {            int c = read();            while (isSpaceChar(c)) c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 
