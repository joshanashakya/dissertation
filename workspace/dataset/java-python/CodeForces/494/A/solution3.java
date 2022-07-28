import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.IOException;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            ATreasure solver = new ATreasure();            solver.solve(1, in, out);            out.close();        }    }     static class ATreasure {        public void solve(int testNumber, FastInput in, FastOutput out) {            char[] s = new char[(int) 1e5];            int n = in.rs(s);            int l = 0;            int r = 0;            for (int i = 0; i < n; i++) {                if (s[i] == '(') {                    l++;                    r++;                } else if (s[i] == ')') {                    l--;                    r--;                } else {                    l = 0;                    r--;                }                l = Math.max(0, l);                if (r < 0) {                    out.println(-1);                    return;                }            }            if (l > 0) {                out.println(-1);                return;            }            int leftTotal = 0;            int rightTotal = 0;            int total = 0;            for (int i = 0; i < n; i++) {                if (s[i] == '#') {                    total++;                } else if (s[i] == '(') {                    leftTotal++;                } else {                    rightTotal++;                }            }            for (int i = 0; i < total - 1; i++) {                out.println(1);            }            out.println(leftTotal - rightTotal - (total - 1));        }     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int rs(char[] data, int offset) {            return readString(data, offset);        }         public int rs(char[] data) {            return rs(data, 0);        }         public int readString(char[] data, int offset) {            skipBlank();             int originalOffset = offset;            while (next > 32) {                data[offset++] = (char) next;                next = read();            }             return offset - originalOffset;        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private static final int THRESHOLD = 32 << 10;        private final Writer os;        private StringBuilder cache = new StringBuilder(THRESHOLD * 2);         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         private void afterWrite() {            if (cache.length() < THRESHOLD) {                return;            }            flush();        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(int c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(String c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput println(int c) {            return append(c).println();        }         public FastOutput println() {            return append(System.lineSeparator());        }         public FastOutput flush() {            try {//            boolean success = false;//            if (stringBuilderValueField != null) {//                try {//                    char[] value = (char[]) stringBuilderValueField.get(cache);//                    os.write(value, 0, cache.length());//                    success = true;//                } catch (Exception e) {//                }//            }//            if (!success) {                os.append(cache);//            }                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }} 