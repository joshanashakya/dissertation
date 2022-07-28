import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.IOException;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            BLongPath solver = new BLongPath();            solver.solve(1, in, out);            out.close();        }    }     static class BLongPath {        int mod = (int) 1e9 + 7;         public long interval(long[] ps, int l, int r) {            if (l > r) {                return 0;            }            long ans = ps[r];            if (l > 0) {                ans -= ps[l - 1];            }            if (ans < 0) {                ans += mod;            }            return ans;        }         public void solve(int testNumber, FastInput in, FastOutput out) {            int n = in.ri();            int[] p = in.ri(n);            for (int i = 0; i < n; i++) {                p[i]--;            }            long[] dp = new long[n];            long[] ps = new long[n];            for (int i = 0; i < n; i++) {                int l = p[i];                int r = i - 1;                dp[i] = interval(ps, l, r) + r - l + 1 + 1;                ps[i] = dp[i];                if (i > 0) {                    ps[i] += ps[i - 1];                    if (ps[i] >= mod) {                        ps[i] -= mod;                    }                }            }            long ans = n + ps[n - 1];            ans %= mod;            out.println(ans);        }     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         public void populate(int[] data) {            for (int i = 0; i < data.length; i++) {                data[i] = readInt();            }        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int ri() {            return readInt();        }         public int[] ri(int n) {            int[] ans = new int[n];            populate(ans);            return ans;        }         public int readInt() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             int val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private static final int THRESHOLD = 32 << 10;        private final Writer os;        private StringBuilder cache = new StringBuilder(THRESHOLD * 2);         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         private void afterWrite() {            if (cache.length() < THRESHOLD) {                return;            }            flush();        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(long c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput println(long c) {            return append(c).println();        }         public FastOutput println() {            return append('\n');        }         public FastOutput flush() {            try {//            boolean success = false;//            if (stringBuilderValueField != null) {//                try {//                    char[] value = (char[]) stringBuilderValueField.get(cache);//                    os.write(value, 0, cache.length());//                    success = true;//                } catch (Exception e) {//                }//            }//            if (!success) {                os.append(cache);//            }                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }} 
