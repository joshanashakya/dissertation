import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.util.Arrays;import java.io.IOException;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            ABits solver = new ABits();            int testCount = Integer.parseInt(in.next());            for (int i = 1; i <= testCount; i++)                solver.solve(i, in, out);            out.close();        }    }     static class ABits {        long low;        long high;        long[][][] dp = new long[60][2][2];         public void solve(int testNumber, FastInput in, FastOutput out) {            low = in.rl();            high = in.rl();            SequenceUtils.deepFill(dp, -1L);            long ans = dp(60 - 1, 1, 1);            out.println(ans);        }         public long dp(int i, int ceil, int floor) {            if (i < 0) {                return 0;            }            if (dp[i][ceil][floor] == -1) {                int lowBit = Bits.get(low, i);                int highBit = Bits.get(high, i);                dp[i][ceil][floor] = 0;                for (int k = 0; k < 2; k++) {                    if (k < lowBit && floor == 1) {                        continue;                    }                    if (k > highBit && ceil == 1) {                        continue;                    }                    long ans = dp(i - 1, ceil == 1 && k == highBit ? 1 : 0,                            floor == 1 && k == lowBit ? 1 : 0);                    if (k == 1) {                        ans = Bits.set(ans, i);                    }                    int comp = Long.bitCount(dp[i][ceil][floor]) - Long.bitCount(ans);                    if (comp == 0) {                        comp = Long.compare(ans, dp[i][ceil][floor]);                    }                    if (comp < 0) {                        dp[i][ceil][floor] = ans;                    }                }            }            return dp[i][ceil][floor];        }     }     static class Bits {        private Bits() {        }         public static int get(long x, int i) {            return (int) ((x >>> i) & 1);        }         public static long set(long x, int i) {            return x | (1L << i);        }     }     static class FastInput {        private final InputStream is;        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public String next() {            return readString();        }         public long rl() {            return readLong();        }         public long readLong() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             long val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }         public String readString(StringBuilder builder) {            skipBlank();             while (next > 32) {                builder.append((char) next);                next = read();            }             return builder.toString();        }         public String readString() {            defaultStringBuf.setLength(0);            return readString(defaultStringBuf);        }     }     static class SequenceUtils {        public static void deepFill(Object array, long val) {            if (!array.getClass().isArray()) {                throw new IllegalArgumentException();            }            if (array instanceof long[]) {                long[] longArray = (long[]) array;                Arrays.fill(longArray, val);            } else {                Object[] objArray = (Object[]) array;                for (Object obj : objArray) {                    deepFill(obj, val);                }            }        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private static final int THRESHOLD = 32 << 10;        private final Writer os;        private StringBuilder cache = new StringBuilder(THRESHOLD * 2);         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         private void afterWrite() {            if (cache.length() < THRESHOLD) {                return;            }            flush();        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(long c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(String c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput println(long c) {            return append(c).println();        }         public FastOutput println() {            return append(System.lineSeparator());        }         public FastOutput flush() {            try {//            boolean success = false;//            if (stringBuilderValueField != null) {//                try {//                    char[] value = (char[]) stringBuilderValueField.get(cache);//                    os.write(value, 0, cache.length());//                    success = true;//                } catch (Exception e) {//                }//            }//            if (!success) {                os.append(cache);//            }                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }} 