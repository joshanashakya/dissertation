import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Arrays;import java.util.Vector;import java.util.TreeMap;import java.util.Map.Entry;import java.util.InputMismatchException;import java.io.IOException;import java.util.Stack;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Sparsh Sanchorawala */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        ALaIS solver = new ALaIS();        solver.solve(1, in, out);        out.close();    }     static class ALaIS {        public void solve(int testNumber, InputReader s, PrintWriter w) {            int t = s.nextInt();            while (t-- > 0) {                int n = s.nextInt();                int[] a = new int[n];                for (int i = 0; i < n; i++)                    a[i] = s.nextInt();                int[] gr = new int[n];                Arrays.fill(gr, -1);                ArrayList<Integer>[] pro = new ArrayList[n];                for (int i = 0; i < n; i++)                    pro[i] = new ArrayList<>();                Stack<Integer> stk = new Stack<>();                for (int i = 0; i < n; i++) {                    while (!stk.isEmpty() && a[stk.peek()] <= a[i])                        stk.pop();                    if (!stk.isEmpty()) {                        gr[i] = stk.peek();                        pro[gr[i]].add(i);                    }                    stk.push(i);                }                TreeMap<Integer, Integer> tm = new TreeMap<>();                tm.put(0, 0);                int[] res = new int[n];                for (int i = 0; i < n; i++) {                    for (int j : pro[i]) {                        res[j] = Math.max(res[j], tm.floorEntry(a[j]).getValue() + 2);                    }                    res[i] = Math.max(res[i], tm.floorEntry(a[i]).getValue() + 1);                    while (tm.ceilingEntry(a[i]) != null && tm.ceilingEntry(a[i]).getValue() < res[i])                        tm.remove(tm.ceilingKey(a[i]));                    if (!tm.containsKey(a[i]))                        tm.put(a[i], res[i]);                }                int ans = 0;                for (int i = 0; i < n; i++)                    ans = Math.max(res[i], ans);                w.println(ans);            }        }     }     static class InputReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private InputReader.SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public boolean isSpaceChar(int c) {            if (filter != null) {                return filter.isSpaceChar(c);            }            return isWhitespace(c);        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }} 