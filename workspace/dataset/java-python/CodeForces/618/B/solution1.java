import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.IOException;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            BGuessThePermutation solver = new BGuessThePermutation();            solver.solve(1, in, out);            out.close();        }    }     static class BGuessThePermutation {        public void solve(int testNumber, FastInput in, FastOutput out) {            int n = in.ri();            int[][] mat = new int[n][];            for (int i = 0; i < n; i++) {                mat[i] = in.ri(n);            }            boolean[] handled = new boolean[n];            int[] perm = new int[n];            for (int i = 1; i <= n; i++) {                for (int j = 0; j < n; j++) {                    if (handled[j]) {                        continue;                    }                    int max = 0;                    for (int k = 0; k < n; k++) {                        if (handled[k]) {                            continue;                        }                        max = Math.max(max, mat[j][k]);                    }                    if (max == i) {                        handled[j] = true;                        perm[j] = i;                        break;                    }                }            }             for (int x : perm) {                out.append(x == 0 ? n : x).append(' ');            }        }     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         public void populate(int[] data) {            for (int i = 0; i < data.length; i++) {                data[i] = readInt();            }        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int ri() {            return readInt();        }         public int[] ri(int n) {            int[] ans = new int[n];            populate(ans);            return ans;        }         public int readInt() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             int val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private static final int THRESHOLD = 1 << 13;        private final Writer os;        private StringBuilder cache = new StringBuilder(THRESHOLD * 2);         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         private void afterWrite() {            if (cache.length() < THRESHOLD) {                return;            }            flush();        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(int c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput flush() {            try {                os.append(cache);                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }} 