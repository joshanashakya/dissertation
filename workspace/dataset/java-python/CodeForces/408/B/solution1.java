import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        BGarland solver = new BGarland();        solver.solve(1, in, out);        out.close();    }     static class BGarland {        public void solve(int testNumber, InputReader in, OutputWriter out) {            String s = in.next();            String t = in.next();            int[] a = new int[26];            int[] b = new int[26];            for (int i = 0; i < s.length(); i++) {                a[s.charAt(i) - 'a']++;            }            for (int i = 0; i < t.length(); i++) {                b[t.charAt(i) - 'a']++;            }            int count = 0;            for (int i = 0; i < 26; i++) {                if (b[i] == 0) continue;                if (b[i] != 0 && a[i] == 0) {                    out.println(-1);                    return;                }                count += Math.min(b[i], a[i]);            }            out.println(count);        }     }     static class InputReader {        BufferedReader reader;        StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void close() {            writer.close();        }         public void println(int i) {            writer.println(i);        }     }} 
