import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.IOException;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            ATriangle solver = new ATriangle();            solver.solve(1, in, out);            out.close();        }    }     static class ATriangle {        public void solve(int testNumber, FastInput in, FastOutput out) {            int a = in.ri();            int b = in.ri();            int[] sqrt = new int[(int) 1e6 + 1];            for (int i = 0; i < sqrt.length; i++) {                sqrt[i] = IntMath.floorSqrt(i);                if (sqrt[i] * sqrt[i] != i) {                    sqrt[i] = -1;                }            }            for (int x = 1; x < a; x++) {                int z = sqrt[a * a - x * x];                if (z < 0) {                    continue;                }                if (x * b % a != 0) {                    continue;                }                if (z * b % a != 0) {                    continue;                }                int t = x * b / a;                int y = z * b / a;                if (x == y) {                    continue;                }                out.println("YES");                out.printf("%d %d", x, 0).println();                out.printf("%d %d", 0, z).println();                out.printf("%d %d", y, z + t).println();                return;            }            out.println("NO");        }     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int ri() {            return readInt();        }         public int readInt() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             int val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private static final int THRESHOLD = 32 << 10;        private final Writer os;        private StringBuilder cache = new StringBuilder(THRESHOLD * 2);         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         private void afterWrite() {            if (cache.length() < THRESHOLD) {                return;            }            flush();        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(String c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput printf(String format, Object... args) {            return append(String.format(format, args));        }         public FastOutput println(String c) {            return append(c).println();        }         public FastOutput println() {            return append('\n');        }         public FastOutput flush() {            try {//            boolean success = false;//            if (stringBuilderValueField != null) {//                try {//                    char[] value = (char[]) stringBuilderValueField.get(cache);//                    os.write(value, 0, cache.length());//                    success = true;//                } catch (Exception e) {//                }//            }//            if (!success) {                os.append(cache);//            }                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }     static class IntMath {        private IntMath() {        }         public static int floorSqrt(long x) {            int lo = 0;            int hi = (int) 2e9;             while (lo < hi) {                int mid = (lo + hi + 1) >> 1;                if ((long) mid * mid <= x) {                    lo = mid;                } else {                    hi = mid - 1;                }            }             return lo;        }     }} 
