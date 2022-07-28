/** * Created by Aminul on 11/22/2018. */ import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Arrays;import java.util.HashMap;import java.util.InputMismatchException; import static java.lang.Math.cbrt; public class CF679B_2 {    public static void main(String[] args)throws Exception {        FastReader in = new FastReader(System.in);        PrintWriter pw = new PrintWriter(System.out);        long m = in.nextLong();        long ans[] = solve(m);        pw.println(ans[0]+ " " +ans[1]);        pw.close();    }     static HashMap<Long, long[]> map = new HashMap<>();    static final long ZERO[] = {0, 0};        static long[] solve(long n) {        if(n == 0) {            return ZERO;        }        if(map.containsKey(n)) return map.get(n);        long x = (long) cbrt(n);        x = x * x * x;        long a[] = solve(n - x).clone();        long b[] = solve(x - 1);        a[0] += 1;  a[1] += x;        long ans[] = a;        if(a[0] < b[0] || (a[0] == b[0] && a[1] < b[1]) ) {            ans = b;        }        map.put(n, ans);        return ans;    }     static void debug(Object...obj) {        System.err.println(Arrays.deepToString(obj));    }     static class FastReader {        InputStream is;        private byte[] inbuf = new byte[1024];        private int lenbuf = 0, ptrbuf = 0;         public FastReader(InputStream is) {            this.is = is;        }         public int readByte() {            if (lenbuf == -1) throw new InputMismatchException();            if (ptrbuf >= lenbuf) {                ptrbuf = 0;                try {                    lenbuf = is.read(inbuf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (lenbuf <= 0) return -1;            }            return inbuf[ptrbuf++];        }         public boolean isSpaceChar(int c) {            return !(c >= 33 && c <= 126);        }        private boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }         public int skip() {            int b;            while ((b = readByte()) != -1 && isSpaceChar(b)) ;            return b;        }         public String next() {            int b = skip();            StringBuilder sb = new StringBuilder();            while (!(isSpaceChar(b))) {                sb.appendCodePoint(b);                b = readByte();            }            return sb.toString();        }           public String nextLine() {            int c = skip();            StringBuilder sb = new StringBuilder();            while (!isEndOfLine(c)){                sb.appendCodePoint(c);                c = readByte();            }            return sb.toString();        }         public int nextInt() {            int num = 0, b;            boolean minus = false;            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;            if (b == '-') {                minus = true;                b = readByte();            }            while (true) {                if (b >= '0' && b <= '9') {                    num = (num << 3) + (num << 1) + (b - '0');                } else {                    return minus ? -num : num;                }                b = readByte();            }        }         public long nextLong() {            long num = 0;            int b;            boolean minus = false;            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;            if (b == '-') {                minus = true;                b = readByte();            }             while (true) {                if (b >= '0' && b <= '9') {                    num = (num << 3) + (num << 1) + (b - '0');                } else {                    return minus ? -num : num;                }                b = readByte();            }        }         public double nextDouble() {            return Double.parseDouble(next());        }         public char[] next(int n) {            char[] buf = new char[n];            int b = skip(), p = 0;            while (p < n && !(isSpaceChar(b))) {                buf[p++] = (char) b;                b = readByte();            }            return n == p ? buf : Arrays.copyOf(buf, p);        }         public char readChar() {            return (char) skip();        }    }}