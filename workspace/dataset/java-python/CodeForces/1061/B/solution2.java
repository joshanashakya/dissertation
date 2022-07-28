import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Arrays;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int m = in.nextInt();            Integer[] h = new Integer[n];            long sum = 0;            for (int i = 0; i < n; i++) {                int cur = in.nextInt();                h[i] = cur;                sum += cur;            }            Arrays.sort(h);            long used = 0;            if (n >= 2) {                int curH;                curH = h[n - 1] + 1;                for (int i = n - 2; i >= 0; i--) {                    h[i] = Math.min(h[i], curH - 1);                    int dif = curH - (h[i] + 1);                    dif = Math.max(dif, 1);                    curH -= dif;                    curH = Math.max(curH, 1);                    used += dif;                }                used += Math.max(1, Math.min(h[0], curH - 1));            } else {                used = h[0];            }            out.println(sum - used);        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
