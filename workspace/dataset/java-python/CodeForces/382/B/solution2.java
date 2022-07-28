import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.util.Arrays;import java.io.BufferedWriter;import java.io.Writer;import java.io.OutputStreamWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author prakharjain */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        _382B solver = new _382B();        solver.solve(1, in, out);        out.close();    }     static class _382B {        public void solve(int testNumber, InputReader in, OutputWriter out) {            int a = in.nextInt();            int b = in.nextInt();            int w = in.nextInt();            int x = in.nextInt();             int c = in.nextInt();             if (c <= a) {                out.println(0);                return;            }             int[] step = new int[w];            int[] ad = new int[w];             Arrays.fill(step, -1);            step[b] = 0;             int cp = -1;            int cl = -1;            int fad = -1;            int t = 1;            while (true) {                if (b >= x) {                    b = b - x;                    if (step[b] != -1) {                        cp = b;                        cl = t - step[b];                        fad = ad[b + x] - ad[b];                        break;                    } else {                        step[b] = t;                        ad[b] = ad[b + x];                    }                } else {                    int nb = w - (x - b);                     if (step[nb] != -1) {                        cp = nb;                        cl = t - step[nb];                        fad = ad[b] + 1 - ad[nb];                        break;                    } else {                        step[nb] = t;                        ad[nb] = ad[b] + 1;                    }                     b = nb;                }                t++;            }             long ct = 0;            if (cp != b) {                if (c - step[cp] <= a) {                    out.println(simul(a, b, w, x, c));                    return;                }                a -= ad[cp];                ct += step[cp];                c -= step[cp];                b = cp;            }             if (a + cl + 1 >= c) {                out.println(ct + simul(a, b, w, x, c));                return;            }             long tot = (c - (a + cl + 1)) / (cl - fad);             ct += tot * cl;            a -= tot * fad;            c -= tot * cl;             out.println(ct + simul(a, b, w, x, c));        }         int simul(int a, int b, int w, int x, int c) {            int ct = 0;            while (c > a) {                if (b >= x) {                    b = b - x;                } else {                    b = w - (x - b);                    a = a - 1;                }                ct++;                c--;            }             return ct;        }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void close() {            writer.close();        }         public void println(long i) {            writer.println(i);        }         public void println(int i) {            writer.println(i);        }     }     static class InputReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private InputReader.SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public boolean isSpaceChar(int c) {            if (filter != null) {                return filter.isSpaceChar(c);            }            return isWhitespace(c);        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 
