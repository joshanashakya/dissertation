import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.IOException;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            AShortProgram solver = new AShortProgram();            solver.solve(1, in, out);            out.close();        }    }     static class AShortProgram {        public void solve(int testNumber, FastInput in, FastOutput out) {            int n = in.readInt();            char[] cmd = new char[n];            int[] operands = new int[n];            for (int i = 0; i < n; i++) {                cmd[i] = in.readChar();                operands[i] = in.readInt();            }             int[] output = new int[2];            output[0] = 0;            output[1] = 1023;            for (int j = 0; j < 2; j++) {                for (int i = 0; i < n; i++) {                    if (cmd[i] == '&') {                        output[j] = output[j] & operands[i];                    }                    if (cmd[i] == '|') {                        output[j] = output[j] | operands[i];                    }                    if (cmd[i] == '^') {                        output[j] = output[j] ^ operands[i];                    }                }            }             char[] ansCmd = new char[]{'&', '|', '^'};            int[] ansOperand = new int[]{1023, 0, 0};            for (int i = 0; i < 10; i++) {                int zero = Bits.bitAt(output[0], i);                int one = Bits.bitAt(output[1], i);                 if (zero == one) {                    if (zero == 0) {                        ansOperand[0] = Bits.setBit(ansOperand[0], i, false);                    } else {                        ansOperand[1] = Bits.setBit(ansOperand[1], i, true);                    }                } else {                    if (zero == 1) {                        ansOperand[2] = Bits.setBit(ansOperand[2], i, true);                    }                }            }             out.println(3);            for (int i = 0; i < 3; i++) {                out.append(ansCmd[i]).append(' ').append(ansOperand[i]).println();            }        }     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 20];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int readInt() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             int val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }         public char readChar() {            skipBlank();            char c = (char) next;            next = read();            return c;        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private StringBuilder cache = new StringBuilder(10 << 20);        private final Writer os;         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            return this;        }         public FastOutput append(int c) {            cache.append(c);            return this;        }         public FastOutput println(int c) {            return append(c).println();        }         public FastOutput println() {            cache.append(System.lineSeparator());            return this;        }         public FastOutput flush() {            try {                os.append(cache);                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }     static class Bits {        private Bits() {        }         public static int bitAt(int x, int i) {            return (x >>> i) & 1;        }         public static int setBit(int x, int i, boolean v) {            if (v) {                x |= 1 << i;            } else {                x &= ~(1 << i);            }            return x;        }     }} 
