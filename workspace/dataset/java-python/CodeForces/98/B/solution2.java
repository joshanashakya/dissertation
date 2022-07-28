import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int head = n, L = 0;
            while ((head & 1) == 0) {
                head >>= 1;
                L++;
            }
            if (head == 1) {
                out.println(L + "/1");

            } else {
                BigInteger headBig = new BigInteger(String.valueOf(head));
                BigInteger s = BigInteger.ONE, t = BigInteger.ONE, two = new BigInteger("2");
                int m = 0;
                for (int i = 0; i < head; i++) {
                    s = s.multiply(two);
                    t = t.multiply(two).mod(headBig);
                    if (t.equals(BigInteger.ONE)) {
                        m = i + 1;
                        break;
                    }
                }
                t = s.multiply(headBig);
                BigInteger r = s, ans = BigInteger.ZERO;
                int i = L;
                while (r.compareTo(BigInteger.ONE) > 0) {
                    i++;
                    t = t.divide(two);
                    if (r.compareTo(t) > 0) {
                        r = r.subtract(t);
                        ans = ans.add(t.multiply(new BigInteger(String.valueOf(i))));
                    }
                }
                ans = ans.add(new BigInteger(String.valueOf(m)));
                s = s.subtract(BigInteger.ONE);
                BigInteger d = ans.gcd(s);
                out.println(ans.divide(d) + "/" + s.divide(d));
            }
        }

    }

    static class InputReader {
        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        private void fillTokenizer() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            fillTokenizer();
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


