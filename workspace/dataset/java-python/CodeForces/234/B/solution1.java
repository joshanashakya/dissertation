import java.io.OutputStream;import java.io.FileOutputStream;import java.io.IOException;import java.io.FileInputStream;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.BufferedReader;import java.util.Collections;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream;        try {            inputStream = new FileInputStream("input.txt");        } catch (IOException e) {            throw new RuntimeException(e);        }        OutputStream outputStream;        try {            outputStream = new FileOutputStream("output.txt");        } catch (IOException e) {            throw new RuntimeException(e);        }        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        BReading solver = new BReading();        solver.solve(1, in, out);        out.close();    }     static class BReading {        public void solve(int testNumber, InputReader in, OutputWriter out) {            int n = in.nextInt();            int k = in.nextInt();            ArrayList<BReading.Pair> list = new ArrayList<>();            for (int i = 0; i < n; i++) {                list.add(new BReading.Pair(in.nextInt(), i + 1));            }            Collections.sort(list);            out.println(list.get(k - 1).a);            for (int i = 0; i < k; i++) {                out.print(list.get(i).b + " ");            }        }         static class Pair implements Comparable<BReading.Pair> {            int a;            int b;             Pair(int a, int b) {                this.a = a;                this.b = b;            }             public int compareTo(BReading.Pair v) {                return -Integer.compare(a, v.a);            }         }     }     static class InputReader {        BufferedReader reader;        StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void print(Object... objects) {            for (int i = 0; i < objects.length; i++) {                if (i != 0) {                    writer.print(' ');                }                writer.print(objects[i]);            }        }         public void close() {            writer.close();        }         public void println(int i) {            writer.println(i);        }     }} 
