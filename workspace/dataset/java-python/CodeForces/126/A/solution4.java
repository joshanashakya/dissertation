import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        solver.solve(1, in, out);        out.close();    }     static class TaskA {        public void solve(int testNumber, InputReader in, PrintWriter out) {            long t1 = in.nextInt(), t2 = in.nextInt(), x1 = in.nextInt(), x2 = in.nextInt(), t0 = in.nextInt();            if (t1 == t0 && t2 == t0) {                out.println(x1 + " " + x2);                return;            }            if (t1 == t0) {                out.println(x1 + " 0");                return;            }            if (t2 == t0) {                out.println("0 " + x2);                return;            }            double tMin = Double.MAX_VALUE;            long y1min = 0;            long y2min = 0;            double tDiff = t2 - t0;            if (tDiff > 0 && tMin > tDiff) {                tMin = tDiff;            }            if (tMin == tDiff) {                y1min = 0;                y2min = 1;            }            tDiff = (t1 + t2) / 2.0 - t0;            if (tDiff > 0 && tMin > tDiff) {                tMin = tDiff;            }            if (tMin == tDiff) {                y1min = 1;                y2min = 1;            }            tDiff = t1 - t0;            if (tDiff > 0 && tMin > tDiff) {                tMin = tDiff;            }            if (tMin == tDiff) {                y1min = 1;                y2min = 0;            }            for (long y2 = 1; y2 <= x2; y2++) {                double yFloor = Math.floor((double) (t2 - t0) * y2 / (t0 - t1));                double yCeil = Math.ceil((double) (t2 - t0) * y2 / (t0 - t1));                if (yFloor > x1) break;                double tFloor = (t1 * yFloor + t2 * y2) / (yFloor + y2);                double tCeil = (t1 * yCeil + t2 * y2) / (yCeil + y2);                long y1;                if (tFloor < t0 && tCeil < t0) continue;                if (tFloor < t0) {                    tDiff = tCeil - t0;                    y1 = (long) yCeil;                    if (yCeil > x1) continue;                } else if (tCeil < t0) {                    tDiff = tFloor - t0;                    y1 = (long) yFloor;                } else if (tFloor - t0 < tCeil - t0) {                    tDiff = Math.abs(tFloor - t0);                    y1 = (long) yFloor;                } else if (tCeil <= x1) {                    tDiff = Math.abs(tCeil - t0);                    y1 = (long) yCeil;                } else continue;                if (tMin > tDiff) {                    tMin = tDiff;                }                if (tMin == tDiff) {                    y1min = y1;                    y2min = y2;                }            }            for (long y1 = 1; y1 <= x1; y1++) {                double yFloor = Math.floor(((double) (t0 - t1) * y1) / (t2 - t0));                double yCeil = Math.ceil(((double) (t0 - t1) * y1) / (t2 - t0));                if (yFloor > x2) break;                double tFloor = (t2 * yFloor + t1 * y1) / (yFloor + y1);                double tCeil = (t2 * yCeil + t1 * y1) / (yCeil + y1);                long y2;                if (tFloor < t0 && tCeil < t0) continue;                if (tFloor < t0) {                    tDiff = tCeil - t0;                    y2 = (long) yCeil;                    if (yCeil > x2) continue;                } else if (tCeil < t0) {                    tDiff = tFloor - t0;                    y2 = (long) yFloor;                } else if (tFloor - t0 < tCeil - t0) {                    tDiff = Math.abs(tFloor - t0);                    y2 = (long) yFloor;                } else if (yFloor <= x2) {                    tDiff = Math.abs(tCeil - t0);                    y2 = (long) yCeil;                } else continue;                if (tMin > tDiff) {                    tMin = tDiff;                }                if (tMin == tDiff) {                    y1min = y1;                    y2min = y2;                }            }            out.println(y1min + " " + y2min);        }     }     static class InputReader {        private StringTokenizer tokenizer;        private BufferedReader reader;         public InputReader(InputStream inputStream) {            reader = new BufferedReader(new InputStreamReader(inputStream));        }         private void fillTokenizer() {            if (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (Exception e) {                    throw new RuntimeException(e);                }            }        }         public String next() {            fillTokenizer();            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
