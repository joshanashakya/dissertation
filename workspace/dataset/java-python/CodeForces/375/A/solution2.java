import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.HashSet;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pranay2516 */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        ADivisibleBySeven solver = new ADivisibleBySeven();        solver.solve(1, in, out);        out.close();    }     static class ADivisibleBySeven {        public void solve(int testNumber, FastReader in, PrintWriter out) {            char[] n = in.next().toCharArray();            HashSet<Character> h = new HashSet<>();            StringBuilder s = new StringBuilder();            int zeroes = 0, x = 0;            for (int i = 0; i < n.length; ++i) {                if (n[i] == '1' && !h.contains('1')) {                    h.add('1');                } else if (n[i] == '6' && !h.contains('6')) {                    h.add('6');                } else if (n[i] == '8' && !h.contains('8')) {                    h.add('8');                } else if (n[i] == '9' && !h.contains('9')) {                    h.add('9');                } else if (n[i] == '0') {                    zeroes++;                } else {                    s.append(n[i]);                    x = x * 10 + (n[i] - '0');                    x %= 7;                }            }            if (x == 0) {                s.append("1869");            } else if (x == 1) {                s.append("6198");            } else if (x == 2) {                s.append("1896");            } else if (x == 3) {                s.append("6918");            } else if (x == 4) {                s.append("1986");            } else if (x == 5) {                s.append("1968");            } else {                s.append("8691");            }            out.print(s.toString());            for (int i = 0; i < zeroes; ++i) {                out.print(0);            }        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) return -1;            }            return buf[curChar++];        }         public String next() {            int c = read();            while (isSpaceChar(c)) c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 