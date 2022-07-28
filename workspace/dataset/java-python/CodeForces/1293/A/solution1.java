import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.InputMismatchException;import java.io.IOException;import java.util.Collections;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pranay2516 */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        AConneRAndTheARCMarklandN solver = new AConneRAndTheARCMarklandN();        int testCount = Integer.parseInt(in.next());        for (int i = 1; i <= testCount; i++)            solver.solve(i, in, out);        out.close();    }     static class AConneRAndTheARCMarklandN {        public void solve(int testNumber, FastReader in, PrintWriter out) {            int n = in.nextInt(), s = in.nextInt(), k = in.nextInt();            ArrayList<Integer> l = new ArrayList<>();            ArrayList<Integer> r = new ArrayList<>();            for (int i = 0; i < k; ++i) {                int x = in.nextInt();                if (x <= s) l.add(x);                else r.add(x);            }            Collections.sort(l);            Collections.sort(r);            Collections.reverse(l);            int min = (int) 1e9 + 5;            for (int i = 0; i < l.size(); ++i) {                if (l.get(i) != s - i) {                    min = i;                    break;                }            }            for (int i = 0; i < r.size(); ++i) {                if (r.get(i) != s + i + 1) {                    min = Math.min(i + 1, min);                    break;                }            }            if (s + r.size() + 1 <= n) min = Math.min(min, r.size() + 1);            if (s - l.size() >= 1) min = Math.min(min, l.size());            out.println(min);        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) return -1;            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) c = read();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            }            while (!isSpaceChar(c));            return res * sgn;        }         public String next() {            int c = read();            while (isSpaceChar(c)) c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 