import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.io.FilterInputStream;import java.io.BufferedInputStream;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Jenish */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        ScanReader in = new ScanReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BFallingAnvils solver = new BFallingAnvils();        solver.solve(1, in, out);        out.close();    }     static class BFallingAnvils {        public void solve(int testNumber, ScanReader in, PrintWriter out) {            int t = in.scanInt();            loop:            while (t-- > 0) {                double a = in.scanInt();                double b = in.scanInt();                if (b == 0) {                    out.println(1);                    continue loop;                }                if (a == 0 && b == 0) {                    out.println(1);                    continue loop;                }                 if (a == 0 && b != 0) {                    out.println(0.5);                    continue loop;                 }                 if (4 * b >= a) {                    out.println(((a * b) + (0.5 * a * a / 4)) / (a * 2 * b));                } else {                    out.println(((a * b) + (a * b - (0.5 * b * 4 * b))) / (a * 2 * b));                }             }        }     }     static class ScanReader {        private byte[] buf = new byte[4 * 1024];        private int INDEX;        private BufferedInputStream in;        private int TOTAL;         public ScanReader(InputStream inputStream) {            in = new BufferedInputStream(inputStream);        }         private int scan() {            if (INDEX >= TOTAL) {                INDEX = 0;                try {                    TOTAL = in.read(buf);                } catch (Exception e) {                    e.printStackTrace();                }                if (TOTAL <= 0) return -1;            }            return buf[INDEX++];        }         public int scanInt() {            int I = 0;            int n = scan();            while (isWhiteSpace(n)) n = scan();            int neg = 1;            if (n == '-') {                neg = -1;                n = scan();            }            while (!isWhiteSpace(n)) {                if (n >= '0' && n <= '9') {                    I *= 10;                    I += n - '0';                    n = scan();                }            }            return neg * I;        }         private boolean isWhiteSpace(int n) {            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;            else return false;        }     }} 
