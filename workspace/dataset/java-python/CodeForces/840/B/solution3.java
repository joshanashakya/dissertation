import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.util.Arrays;import java.io.IOException;import java.util.ArrayList;import java.io.UncheckedIOException;import java.util.List;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) throws Exception {        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);        thread.start();        thread.join();    }     static class TaskAdapter implements Runnable {        @Override        public void run() {            InputStream inputStream = System.in;            OutputStream outputStream = System.out;            FastInput in = new FastInput(inputStream);            FastOutput out = new FastOutput(outputStream);            BLehaAndAnotherGameAboutGraph solver = new BLehaAndAnotherGameAboutGraph();            solver.solve(1, in, out);            out.close();        }    }     static class BLehaAndAnotherGameAboutGraph {        public void solve(int testNumber, FastInput in, FastOutput out) {            int n = in.readInt();            int m = in.readInt();             Node root = null;            Node[] nodes = new Node[n];            for (int i = 0; i < n; i++) {                nodes[i] = new Node();                nodes[i].d = in.readInt();                nodes[i].id = i;                 if (nodes[i].d == -1) {                    root = nodes[i];                } else {                    nodes[i].tag = nodes[i].d;                }            }            Edge[] edges = new Edge[m];            for (int i = 0; i < m; i++) {                edges[i] = new Edge();                Node a = nodes[in.readInt() - 1];                Node b = nodes[in.readInt() - 1];                edges[i].a = a;                edges[i].b = b;                edges[i].tag = 0;                a.next.add(edges[i]);                b.next.add(edges[i]);            }             if (root == null) {                root = nodes[0];            }             dfs(root, null);            if (root.d != -1 && root.tag != 0) {                out.println(-1);                return;            }             IntegerList ans = new IntegerList(m);            for (int i = 0; i < m; i++) {                if (edges[i].tag == 1) {                    ans.add(i);                }            }            out.println(ans.size());            for (int i = 0; i < ans.size(); i++) {                out.println(ans.get(i) + 1);            }        }         public void dfs(Node root, Edge p) {            if (root.visited) {                return;            }            root.visited = true;            for (Edge e : root.next) {                Node node = e.other(root);                if (e == p) {                    continue;                }                dfs(node, e);                root.tag ^= e.tag;            }            if (p != null) {                p.tag ^= root.tag;                root.tag = 0;            }        }     }     static class SequenceUtils {        public static boolean equal(int[] a, int al, int ar, int[] b, int bl, int br) {            if ((ar - al) != (br - bl)) {                return false;            }            for (int i = al, j = bl; i <= ar; i++, j++) {                if (a[i] != b[j]) {                    return false;                }            }            return true;        }     }     static class Node {        int d;        int tag;        boolean visited;        List<Edge> next = new ArrayList<>();        int id;         public String toString() {            return "" + id;        }     }     static class IntegerList implements Cloneable {        private int size;        private int cap;        private int[] data;        private static final int[] EMPTY = new int[0];         public IntegerList(int cap) {            this.cap = cap;            if (cap == 0) {                data = EMPTY;            } else {                data = new int[cap];            }        }         public IntegerList(IntegerList list) {            this.size = list.size;            this.cap = list.cap;            this.data = Arrays.copyOf(list.data, size);        }         public IntegerList() {            this(0);        }         public void ensureSpace(int req) {            if (req > cap) {                while (cap < req) {                    cap = Math.max(cap + 10, 2 * cap);                }                data = Arrays.copyOf(data, cap);            }        }         private void checkRange(int i) {            if (i < 0 || i >= size) {                throw new ArrayIndexOutOfBoundsException();            }        }         public int get(int i) {            checkRange(i);            return data[i];        }         public void add(int x) {            ensureSpace(size + 1);            data[size++] = x;        }         public void addAll(int[] x, int offset, int len) {            ensureSpace(size + len);            System.arraycopy(x, offset, data, size, len);            size += len;        }         public void addAll(IntegerList list) {            addAll(list.data, 0, list.size);        }         public int size() {            return size;        }         public int[] toArray() {            return Arrays.copyOf(data, size);        }         public String toString() {            return Arrays.toString(toArray());        }         public boolean equals(Object obj) {            if (!(obj instanceof IntegerList)) {                return false;            }            IntegerList other = (IntegerList) obj;            return SequenceUtils.equal(data, 0, size - 1, other.data, 0, other.size - 1);        }         public int hashCode() {            int h = 1;            for (int i = 0; i < size; i++) {                h = h * 31 + Integer.hashCode(data[i]);            }            return h;        }         public IntegerList clone() {            IntegerList ans = new IntegerList();            ans.addAll(this);            return ans;        }     }     static class FastInput {        private final InputStream is;        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;         public FastInput(InputStream is) {            this.is = is;        }         private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }         public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }         public int readInt() {            int sign = 1;             skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }             int val = 0;            if (sign == 1) {                while (next >= '0' && next <= '9') {                    val = val * 10 + next - '0';                    next = read();                }            } else {                while (next >= '0' && next <= '9') {                    val = val * 10 - next + '0';                    next = read();                }            }             return val;        }     }     static class Edge {        Node a;        Node b;        int tag;         Node other(Node x) {            return x == a ? b : a;        }     }     static class FastOutput implements AutoCloseable, Closeable, Appendable {        private StringBuilder cache = new StringBuilder(10 << 20);        private final Writer os;         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            return this;        }         public FastOutput append(int c) {            cache.append(c);            return this;        }         public FastOutput println(int c) {            return append(c).println();        }         public FastOutput println() {            cache.append(System.lineSeparator());            return this;        }         public FastOutput flush() {            try {                os.append(cache);                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }} 
