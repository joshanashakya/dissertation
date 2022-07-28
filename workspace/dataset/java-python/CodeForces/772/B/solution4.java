import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int[] x = new int[n];            int[] y = new int[n];            for (int i = 0; i < n; i++) {                x[i] = in.nextInt();                y[i] = in.nextInt();            }            double[] h = new double[n];            h[0] = getH(x[n - 1], y[n - 1], x[n - 2], y[n - 2], x[0], y[0]);            h[1] = getH(x[0], y[0], x[n - 1], y[n - 1], x[1], y[1]);            double hMin = Math.min(h[0], h[1]);            for (int i = 2; i < n; i++) {                h[i] = getH(x[i - 1], y[i - 1], x[i - 2], y[i - 2], x[i], y[i]);                hMin = Math.min(hMin, h[i]);            }            out.println(hMin / 2);        }         double getH(long x, long y, long ax, long ay, long bx, long by) {            double t = (bx - ax) * (y - ay) - (by - ay) * (x - ax);            return Math.abs(t / fastHypot(ax - bx, ay - by));        }         double fastHypot(double x, double y) {            return Math.sqrt(x * x + y * y);        }     }     static class InputReader {        private BufferedReader reader;        private StringTokenizer stt;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream));        }         public String nextLine() {            try {                return reader.readLine();            } catch (IOException e) {                return null;            }        }         public String next() {            while (stt == null || !stt.hasMoreTokens()) {                stt = new StringTokenizer(nextLine());            }            return stt.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 