import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.Writer;import java.io.OutputStreamWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author El-Bishoy */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        D1A333_Secrets solver = new D1A333_Secrets();        solver.solve(1, in, out);        out.close();    }     static class D1A333_Secrets {        public void solve(int testNumber, InputReader in, OutputWriter out) {             long n = in.nextLong();            long p = 1;            long ans = 1;            while (p < n) {                //if n is divisable by some p then we cant have this type coins                // for example n=12 , we cannot have 3 because any combination of 3 will make the bayer with no need to change see ? 9+3=12                //so we have to find another type of coins                // save this number because we may find another available type but we need the max                if (n % p != 0) {                    ans = fastMax(n / p + 1, ans);                }                p *= 3;            }             out.println(ans);        }         long fastMax(long x, long y) {            return (((y - x) >> (64 - 1)) & (x ^ y)) ^ y;        }     }     static class InputReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private InputReader.SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public long nextLong() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            long res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public boolean isSpaceChar(int c) {            if (filter != null) {                return filter.isSpaceChar(c);            }            return isWhitespace(c);        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void close() {            writer.close();        }         public void println(long i) {            writer.println(i);        }     }} 
