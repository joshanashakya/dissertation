import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        BJeffAndPeriods solver = new BJeffAndPeriods();        solver.solve(1, in, out);        out.close();    }     static class BJeffAndPeriods {        public void solve(int testNumber, InputReader in, OutputWriter out) {            int n = in.nextInt();            int[] arr = in.nextIntArray(n);            int size = 0;            for (int i = 0; i < n; i++) {                if (arr[i] > size) size = arr[i];            }            ArrayList<Integer>[] index = new ArrayList[size + 1];            for (int i = 0; i <= size; i++) {                index[i] = new ArrayList<>();            }            for (int i = 0; i < n; i++) {                index[arr[i]].add(i);            }            int count = 0;            ArrayList<BJeffAndPeriods.Pair> ans = new ArrayList<>();            outer:            for (int i = 1; i <= size; i++) {                if (index[i].size() == 0) continue;                if (index[i].size() == 1) {                    count++;                    ans.add(new BJeffAndPeriods.Pair(i, 0));                    continue;                }                int d = index[i].get(1) - index[i].get(0);                for (int j = 1; j < index[i].size(); j++) {                    if (index[i].get(j) - index[i].get(j - 1) != d) continue outer;                }                count++;                ans.add(new BJeffAndPeriods.Pair(i, d));            }            out.println(count);            for (BJeffAndPeriods.Pair p : ans) {                out.println(p.a + " " + p.b);            }        }         static class Pair {            int a;            int b;             Pair(int a, int b) {                this.a = a;                this.b = b;            }         }     }     static class InputReader {        BufferedReader reader;        StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int[] nextIntArray(int n) {            int[] array = new int[n];            for (int i = 0; i < n; ++i) array[i] = nextInt();            return array;        }         public int nextInt() {            return Integer.parseInt(next());        }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void print(Object... objects) {            for (int i = 0; i < objects.length; i++) {                if (i != 0) {                    writer.print(' ');                }                writer.print(objects[i]);            }        }         public void println(Object... objects) {            print(objects);            writer.println();        }         public void close() {            writer.close();        }         public void println(int i) {            writer.println(i);        }     }} 