import java.io.OutputStream;import java.io.FileOutputStream;import java.io.IOException;import java.io.FileInputStream;import java.io.InputStream;import java.io.PrintWriter;import java.util.InputMismatchException;import java.io.IOException;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pranay2516 */public class Main {    public static void main(String[] args) {        InputStream inputStream;        try {            inputStream = new FileInputStream("input.txt");        } catch (IOException e) {            throw new RuntimeException(e);        }        OutputStream outputStream;        try {            outputStream = new FileOutputStream("output.txt");        } catch (IOException e) {            throw new RuntimeException(e);        }        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        AExtraTerrestrialIntelligence solver = new AExtraTerrestrialIntelligence();        solver.solve(1, in, out);        out.close();    }     static class AExtraTerrestrialIntelligence {        public void solve(int testNumber, FastReader in, PrintWriter out) {            int n = in.nextInt(), d = 0;            char[] c = in.next().toCharArray();            ArrayList<Integer> a = new ArrayList<>();            for (int i = 0; i < n; ++i) {                if (c[i] == '1') {                    a.add(i);                }            }            for (int i = 0; i < a.size() - 1; ++i) {                if (i == 0) {                    d = a.get(i + 1) - a.get(i);                    continue;                }                if (a.get(i + 1) - a.get(i) != d) {                    out.println("NO");                    return;                }            }            out.println("YES");        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) return -1;            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) c = read();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            }            while (!isSpaceChar(c));            return res * sgn;        }         public String next() {            int c = read();            while (isSpaceChar(c)) c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 
