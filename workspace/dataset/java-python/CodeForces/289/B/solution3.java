import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.util.Arrays;import java.io.BufferedWriter;import java.util.Random;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        BPoloThePenguinAndMatrix solver = new BPoloThePenguinAndMatrix();        solver.solve(1, in, out);        out.close();    }     static class BPoloThePenguinAndMatrix {        public void solve(int testNumber, InputReader in, OutputWriter out) {            int n = in.nextInt();            int m = in.nextInt();            int d = in.nextInt();            int[] arr = new int[n * m];            int min = Integer.MAX_VALUE;            for (int i = 0; i < n * m; i++) {                arr[i] = in.nextInt();                min = Math.min(min, arr[i]);            }            for (int i = 0; i < n * m; i++) {                arr[i] -= min;                if (arr[i] % d != 0) {                    out.println(-1);                    return;                }            }            sort(arr);            long count = Integer.MAX_VALUE;            for (int i = 0; i < n * m; i++) {                long temp = 0;                for (int j = 0; j < n * m; j++) {                    temp += Math.abs(arr[i] - arr[j]) / d;                }                count = Math.min(count, temp);            }            out.println(count);        }         static void sort(int[] a) {            int n = a.length;            Random r = new Random();            for (int i = 0; i < a.length; i++) {                int oi = r.nextInt(n), temp = a[i];                a[i] = a[oi];                a[oi] = temp;            }            Arrays.sort(a);        }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void close() {            writer.close();        }         public void println(long i) {            writer.println(i);        }         public void println(int i) {            writer.println(i);        }     }     static class InputReader {        BufferedReader reader;        StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
