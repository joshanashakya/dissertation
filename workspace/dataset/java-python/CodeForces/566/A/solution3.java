import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.util.Arrays;import java.io.BufferedWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.Writer;import java.io.OutputStreamWriter;import java.util.NoSuchElementException;import java.io.InputStream; /** * Built using CHelper plug-in Actual solution is at the top * * @author I and Bee */public class Main {     public static void main(String[] args) {        new Thread(null, new Runnable() {            @Override            public void run() {                InputStream inputStream = System.in;                OutputStream outputStream = System.out;                InputReader in = new InputReader(inputStream);                OutputWriter out = new OutputWriter(outputStream);                TaskA solver = new TaskA();                solver.solve(1, in, out);                out.close();            }        }, "MyLittlePony", 256 * 1024 * 1024).start();    }     static class TaskA {         int sz = 1;        final int maxSz = 800_100;        int[][] links = new int[maxSz][26];        IntArrayList[] name = new IntArrayList[maxSz];        IntArrayList[] hob = new IntArrayList[maxSz];        long ans = 0;        StringBuilder answer = new StringBuilder();        int depth;         {            ArrayUtils.fill(links, -1);        }         public void add(CharSequence word, boolean isName, int id) {            int current = 0;            int length = word.length();            for (int i = 0; i < length; i++) {                int letter = word.charAt(i) - 'a';                if (links[current][letter] == -1) {                    links[current][letter] = sz++;                }                current = links[current][letter];            }             if (name[current] == null) {                name[current] = new IntArrayList(1);            }            if (hob[current] == null) {                hob[current] = new IntArrayList(1);            }            if (isName) {                name[current].add(id);            } else {                hob[current].add(id);            }        }         void dfs(int v) {            for (int ch = 0; ch < 26; ++ch) {                int link = links[v][ch];                {                    if (link == -1) {                        continue;                    }                    ++depth;                }                dfs(link);                {                    --depth;                     name[v] = f(name[v], name[link]);                    hob[v] = f(hob[v], hob[link]);                }            }            {                while (0 < hob[v].size() && 0 < name[v].size()) {                    answer.append(name[v].popBack()).append(" ").append(hob[v].popBack()).append("\n");                    ans += depth;                }            }        }         private IntArrayList f(IntArrayList a, IntArrayList b) {            if (a == null) {                return b;            }            if (b == null) {                return a;            }            if (a.size() < b.size()) {                return f(b, a);            }            for (int i = 0; i < b.size(); i++) {                a.add(b.get(i));            }            return a;        }         public void solve(int testNumber, InputReader in, OutputWriter out) {            boolean oj = true;            long timeBegin = System.currentTimeMillis();            try {                oj = System.getProperty("MYLOCAL") == null;            } catch (Exception e) {            }             int n = in.readInt();            for (int i = 0; i < n; i++) {                add(in.readString(), true, i + 1);            }            for (int i = 0; i < n; i++) {                add(in.readString(), false, i + 1);            }             //add(f(400_000), true, 1);            //add(f(400_000), false, 1);//        add(f(800_000 - 1), true, 1);//        add(f(1), false, 1);            dfs(0);             out.printLine(ans);            out.printLine(answer);             if (oj) {                System.err.println("Time: " + (System.currentTimeMillis() - timeBegin) / 1e3);                System.err.printf("Mem: %d\n", (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 20);            }        }     }     static class InputReader {         private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private InputReader.SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public int readInt() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public String readString() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                if (Character.isValidCodePoint(c)) {                    res.appendCodePoint(c);                }                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) {                return filter.isSpaceChar(c);            }            return isWhitespace(c);        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {             public boolean isSpaceChar(int ch);         }     }     static interface IntIterator {         public int value();         public void advance();         public boolean isValid();     }     static class ArrayUtils {         public static void fill(int[][] array, int value) {            for (int[] row : array) {                Arrays.fill(row, value);            }        }     }     static class OutputWriter {         private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void print(Object... objects) {            for (int i = 0; i < objects.length; i++) {                if (i != 0) {                    writer.print(' ');                }                writer.print(objects[i]);            }        }         public void printLine(Object... objects) {            print(objects);            writer.println();        }         public void close() {            writer.close();        }         public void printLine(long i) {            writer.println(i);        }     }     static class IntArrayList extends IntList {         private int[] array;        private int size;         public IntArrayList() {            this(10);        }         public IntArrayList(int capacity) {            array = new int[capacity];        }         public IntArrayList(IntList list) {            this(list.size());            addAll(list);        }         public int get(int index) {            if (index >= size) {                throw new IndexOutOfBoundsException();            }            return array[index];        }         public int size() {            return size;        }         public void add(int value) {            ensureCapacity(size + 1);            array[size++] = value;        }         public void ensureCapacity(int newCapacity) {            if (newCapacity > array.length) {                int[] newArray = new int[Math.max(newCapacity, array.length << 1)];                System.arraycopy(array, 0, newArray, 0, size);                array = newArray;            }        }         public int popBack() {            return array[--size];        }     }     static abstract class IntCollection {         public abstract IntIterator iterator();         public abstract int size();         public abstract void add(int value);         public void addAll(IntCollection values) {            for (IntIterator it = values.iterator(); it.isValid(); it.advance()) {                add(it.value());            }        }     }     static abstract class IntList extends IntCollection implements Comparable<IntList> {         public abstract int get(int index);         public IntIterator iterator() {            return new IntIterator() {                private int size = size();                private int index = 0;                 public int value() throws NoSuchElementException {                    if (!isValid()) {                        throw new NoSuchElementException();                    }                    return get(index);                }                 public void advance() throws NoSuchElementException {                    if (!isValid()) {                        throw new NoSuchElementException();                    }                    index++;                }                 public boolean isValid() {                    return index < size;                }            };        }         public int hashCode() {            int hashCode = 1;            for (IntIterator i = iterator(); i.isValid(); i.advance()) {                hashCode = 31 * hashCode + i.value();            }            return hashCode;        }         public boolean equals(Object obj) {            if (!(obj instanceof IntList)) {                return false;            }            IntList list = (IntList) obj;            if (list.size() != size()) {                return false;            }            IntIterator i = iterator();            IntIterator j = list.iterator();            while (i.isValid()) {                if (i.value() != j.value()) {                    return false;                }                i.advance();                j.advance();            }            return true;        }         public int compareTo(IntList o) {            IntIterator i = iterator();            IntIterator j = o.iterator();            while (true) {                if (i.isValid()) {                    if (j.isValid()) {                        if (i.value() != j.value()) {                            if (i.value() < j.value()) {                                return -1;                            } else {                                return 1;                            }                        }                    } else {                        return 1;                    }                } else {                    if (j.isValid()) {                        return -1;                    } else {                        return 0;                    }                }                i.advance();                j.advance();            }        }     }}
