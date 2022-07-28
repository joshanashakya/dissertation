import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.InputMismatchException;import java.io.IOException;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Pranay2516 */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BKillEmAll solver = new BKillEmAll();        int testCount = Integer.parseInt(in.next());        for (int i = 1; i <= testCount; i++)            solver.solve(i, in, out);        out.close();    }     static class BKillEmAll {        public void solve(int testNumber, FastReader in, PrintWriter out) {            int n = in.nextInt(), r = in.nextInt(), a[] = in.readArray(n);            int ans = 0;            func.sort(a);            ArrayList<Integer> ar = new ArrayList<>();            for (int i = 0; i < n; ++i) {                if (i == 0 || a[i] != a[i - 1]) {                    ar.add(a[i]);                }            }            for (int i = ar.size() - 1; i >= 0; --i) {                if (ar.get(i) <= ans * r) break;                ans++;            }            out.println(ans);        }     }     static class FastReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private FastReader.SpaceCharFilter filter;         public FastReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) throw new InputMismatchException();            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) return -1;            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) c = read();            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            }            while (!isSpaceChar(c));            return res * sgn;        }         public String next() {            int c = read();            while (isSpaceChar(c)) c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public int[] readArray(int size) {            int[] array = new int[size];            for (int i = 0; i < size; i++) array[i] = nextInt();            return array;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }     static class func {        public static void sort(int[] arr) {            //Taken from @KharYusuf            int n = arr.length, mid, h, s, l, i, j, k;            int[] res = new int[n];            n--;            for (s = 1; s <= n; s <<= 1) {                for (l = 0; l < n; l += (s << 1)) {                    h = Math.min(l + (s << 1) - 1, n);                    mid = Math.min(l + s - 1, n);                    i = l;                    j = mid + 1;                    k = l;                    while (i <= mid && j <= h) res[k++] = (arr[i] <= arr[j] ? arr[i++] : arr[j++]);                    while (i <= mid) res[k++] = arr[i++];                    while (j <= h) res[k++] = arr[j++];                    for (k = l; k <= h; k++) arr[k] = res[k];                }            }        }     }} 