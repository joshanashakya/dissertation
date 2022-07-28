import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BFoxAndMinimalPath solver = new BFoxAndMinimalPath();        solver.solve(1, in, out);        out.close();    }     static class BFoxAndMinimalPath {        int[][] ans;        int cur;        int max = 1001;        int low = 900;        int high = 950;         public void solve(int testNumber, InputReader in, PrintWriter out) {            long k = in.readInt();            ans = new int[max][max];            for (int i = low; i < high; i++) {                ans[i][i + 1] = 1;            }            ans[high][2] = 1;             cur = 3;            for (int i = 0; i <= 30; i++) {                if (((k >> i) & 1) == 1) {                    make(1 << i);                }            }            out.println(max - 1);            for (int i = 1; i < ans.length; i++) {                for (int j = 1; j < ans.length; j++) {                    out.print(Math.max(ans[i][j], ans[j][i]) == 1 ? 'Y' : 'N');                }                out.println();            }        }         void make(int val) {            if (val == 1) {                ans[1][cur] = 1;                ans[cur][low + 1] = 1;                cur++;            } else {                ans[1][cur] = 1;                ans[1][cur + 1] = 1;                cur += 2;                int layers = 1;                for (int i = val; i > 2; i /= 2) {                    ans[cur][cur - 2] = 1;                    ans[cur][cur - 1] = 1;                    ans[cur + 1][cur - 2] = 1;                    ans[cur + 1][cur - 1] = 1;                    cur += 2;                    layers++;                }                ans[cur - 2][low + layers] = 1;                ans[cur - 1][low + layers] = 1;            }        }     }     static class InputReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private InputReader.SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1)                throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0)                    return -1;            }            return buf[curChar++];        }         public int readInt() {            int c = read();            while (isSpaceChar(c))                c = read();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9')                    throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public boolean isSpaceChar(int c) {            if (filter != null)                return filter.isSpaceChar(c);            return isWhitespace(c);        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 
