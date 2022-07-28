import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.IOException;import java.util.TreeSet;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            AStringReconstruction solver = new AStringReconstruction();            solver.solve(1, in, out);            out.close();        }    }     static class AStringReconstruction {        public void solve(int testNumber, FastInput in, FastOutput out) {            int n = in.readInt();            TreeSet<Integer> set = new TreeSet<>();            char[] ans = new char[2000001];            for (int i = 1; i < ans.length; i++) {                set.add(i);            }             char[] s = new char[1000000];            for (int i = 1; i <= n; i++) {                int len = in.readString(s, 0);                int k = in.readInt();                while (k-- > 0) {                    int index = in.readInt();                    while (true) {                        Integer next = set.ceiling(index);                        if (next == null || next - index + 1 > len) {                            break;                        }                        ans[next] = s[next - index];                        set.remove(next);                    }                }            }             int len = ans.length - 1;            while (ans[len] == 0) {                len--;            }            for (int i = 1; i <= len; i++) {                if (ans[i] == 0) {                    ans[i] = 'a';                }            }             for (int i = 1; i <= len; i++) {                out.append(ans[i]);            }        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private StringBuilder cache = new StringBuilder(10 << 20);        private final Writer os;         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            return this;        }         public FastOutput flush() {            try {                os.append(cache);                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int readInt() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             int val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }         public int readString(char[] data, int offset) {            skipBlank();             int originalOffset = offset;            while (next > 32) {                data[offset++] = (char) next;                next = read();            }             return offset - originalOffset;        }     }} 
