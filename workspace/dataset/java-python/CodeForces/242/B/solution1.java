import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.BufferedReader;import java.util.Collections;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        BBigSegment solver = new BBigSegment();        solver.solve(1, in, out);        out.close();    }     static class BBigSegment {        public void solve(int testNumber, InputReader in, OutputWriter out) {            int n = in.nextInt();            ArrayList<BBigSegment.Pair> list = new ArrayList<>();            int minl = Integer.MAX_VALUE;            for (int i = 0; i < n; i++) {                list.add(new BBigSegment.Pair(i + 1, in.nextInt(), in.nextInt()));                minl = Math.min(minl, list.get(i).a);            }            Collections.sort(list);            int r = list.get(0).b;            int ind = -1;            int i = 0;            while (i < list.size() && list.get(i).b == r) {                if (list.get(i).a <= minl) {                    ind = list.get(i).ind;                    break;                }                i++;            }            out.println(ind);        }         static class Pair implements Comparable<BBigSegment.Pair> {            int ind;            int a;            int b;             Pair(int ind, int a, int b) {                this.ind = ind;                this.a = a;                this.b = b;            }             public int compareTo(BBigSegment.Pair v) {                return -Integer.compare(b, v.b);            }         }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void close() {            writer.close();        }         public void println(int i) {            writer.println(i);        }     }     static class InputReader {        BufferedReader reader;        StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
