import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.text.DecimalFormat;import java.io.IOException;import java.io.InputStreamReader;import java.text.NumberFormat;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        AsFast solver = new AsFast();        solver.solve(1, in, out);        out.close();    }     static class AsFast {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int N = in.nextInt();            int l = in.nextInt();            long v1 = in.nextInt();            long v2 = in.nextInt();            int k = in.nextInt();            double low = 0;            double high = l;            if (k >= N) {                out.println((double) (l) / v2);            } else {                double diff = Double.MAX_VALUE;                N -= k;                double res = Double.MAX_VALUE;                DecimalFormat df = new DecimalFormat("#.000000000");                int kiter = 2000;                while (kiter-- > 0) {                    double start = (low + high) / 2;                    double pos = start;                    double cur = ((pos) / v2) * v1;                    boolean at = false;                    double tot = (pos) / v2;                    for (int i = N; i > 0; ) {                        if (!at) {                            double time = (pos - cur) / (v1 + v2);                            cur += time * v1;                            pos += time * v1;                            tot += time;                            at = true;                        } else {                            double time = (pos - cur) / (v2 - v1);                            pos += v1 * time;                            cur += v1 * time;                            tot += time;                            i -= k;                            at = false;                        }                    }                    if (Math.abs(pos - l) < diff && pos >= l) {                        diff = Math.abs(pos - l);                        res = tot;                    }                    if (pos >= l) {                        high = start;                    } else {                        low = start;                    }                }                if (Math.abs(res - Math.round(res)) <= 1e-5) {                    res = Math.round(res);                }                out.println(df.format(res));            }        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
