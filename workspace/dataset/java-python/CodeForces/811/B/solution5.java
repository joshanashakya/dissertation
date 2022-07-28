import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Tarek */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BVladikAndComplicatedBook solver = new BVladikAndComplicatedBook();        solver.solve(1, in, out);        out.close();    }     static class BVladikAndComplicatedBook {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int m = in.nextInt();            int a[] = new int[n];            for (int i = 0; i < n; i++) a[i] = in.nextInt();            while (m-- > 0) {                int l = in.nextInt();                int r = in.nextInt();                int x = in.nextInt();                l--;                r--;                x--;                int c = 0;                for (int i = l; i <= r; i++) {                    if (a[i] < a[x]) c++;                }                 if (c == (x - l)) {                    out.println("Yes");                } else {                    out.println("No");                }            }        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
