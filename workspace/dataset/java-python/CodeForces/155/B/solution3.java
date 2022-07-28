import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStreamReader;import java.util.AbstractMap;import java.util.TreeMap;import java.util.StringTokenizer;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        BCombination solver = new BCombination();        solver.solve(1, in, out);        out.close();    }     static class BCombination {        static TreeMap<BCombination.Pair, Integer> multiset = new TreeMap<BCombination.Pair, Integer>();         static void add(BCombination.Pair x) {            if (multiset.containsKey(x)) {                multiset.put(x, multiset.get(x) + 1);            } else {                multiset.put(x, 1);            }        }         static void remove(BCombination.Pair x) {            multiset.put(x, multiset.get(x) - 1);            if (multiset.get(x) == 0) {                multiset.remove(x);            }        }         public void solve(int testNumber, InputReader in, OutputWriter out) {            int n = in.nextInt();            for (int i = 0; i < n; i++) {                add(new BCombination.Pair(in.nextInt(), in.nextInt()));            }             long sum = 0;            while (!multiset.isEmpty()) {                BCombination.Pair p = multiset.lastKey();                if (p.b == 0) {                    p = multiset.firstKey();                }                 remove(p);                sum += p.a;                if (p.b == 0) break;                int c = 0;                while (!multiset.isEmpty() && c < p.b - 1) {                    BCombination.Pair t = multiset.firstKey();                    sum += t.a;                    remove(t);                    c++;                }            }            out.println(sum);        }         static class Pair implements Comparable<BCombination.Pair> {            int a;            int b;             Pair(int a, int b) {                this.a = a;                this.b = b;            }             public int compareTo(BCombination.Pair v) {                if (b == v.b) {                    return -Integer.compare(a, v.a);                }                return Integer.compare(b, v.b);            }         }     }     static class InputReader {        BufferedReader reader;        StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void close() {            writer.close();        }         public void println(long i) {            writer.println(i);        }     }} 
