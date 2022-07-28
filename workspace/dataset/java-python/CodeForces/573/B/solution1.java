import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.util.stream.IntStream;import java.io.OutputStream;import java.util.Arrays;import java.io.IOException;import java.util.OptionalInt;import java.util.TreeSet;import java.util.ArrayList;import java.io.UncheckedIOException;import java.util.List;import java.util.stream.Stream;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.util.Comparator;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            BBearAndBlocks solver = new BBearAndBlocks();            solver.solve(1, in, out);            out.close();        }    }     static class BBearAndBlocks {        public void solve(int testNumber, FastInput in, FastOutput out) {            int n = in.ri();            Node[] nodes = new Node[n];            for (int i = 0; i < n; i++) {                nodes[i] = new Node();                nodes[i].id = i;            }            for (int i = 0; i < n; i++) {                if (i > 0) {                    nodes[i].adj.add(nodes[i - 1]);                }                if (i + 1 < n) {                    nodes[i].adj.add(nodes[i + 1]);                }                nodes[i].dist = in.ri();            }            nodes[0].dist = nodes[n - 1].dist = 1;            TreeSet<Node> set = new TreeSet<>(Comparator.<Node>comparingInt(x -> x.dist).thenComparingInt(x -> x.id));            set.addAll(Arrays.asList(nodes));            while (!set.isEmpty()) {                Node head = set.pollFirst();                for (Node node : head.adj) {                    if (node.dist > head.dist + 1) {                        set.remove(node);                        node.dist = head.dist + 1;                        set.add(node);                    }                }            }            int max = Arrays.stream(nodes).mapToInt(x -> x.dist).max().orElse(-1);            out.println(max);        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private static final int THRESHOLD = 32 << 10;        private final Writer os;        private StringBuilder cache = new StringBuilder(THRESHOLD * 2);         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         private void afterWrite() {            if (cache.length() < THRESHOLD) {                return;            }            flush();        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(int c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput append(String c) {            cache.append(c);            afterWrite();            return this;        }         public FastOutput println(int c) {            return append(c).println();        }         public FastOutput println() {            return append(System.lineSeparator());        }         public FastOutput flush() {            try {//            boolean success = false;//            if (stringBuilderValueField != null) {//                try {//                    char[] value = (char[]) stringBuilderValueField.get(cache);//                    os.write(value, 0, cache.length());//                    success = true;//                } catch (Exception e) {//                }//            }//            if (!success) {                os.append(cache);//            }                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }     static class Node {        List<Node> adj = new ArrayList<>(2);        int dist;        int id;     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int ri() {            return readInt();        }         public int readInt() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             int val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }     }} 
