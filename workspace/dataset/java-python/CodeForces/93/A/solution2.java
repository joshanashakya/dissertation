import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            boolean twoLayers = false;
            int ans = 3;
            if ((a - 1) % m == 0) {
                ans--;
            }
            if (b / m - ((a - 1) / m + ((a - 1) % m > 0 ? 1 : 0)) == 0) {
                ans--;
                twoLayers = true;
            }
            if ((b % m == 0 || b == n) && !twoLayers) {
                ans--;
            }
            if (b / m - ((a - 1) / m + ((a - 1) % m > 0 ? 1 : 0)) < 0) {
                ans = 1;
            }
            if ((b / m + (b % m > 0 ? 1 : 0)) == ((a - 1) / m + ((a - 1) % m > 0 ? 1 : 0))) {
                ans = 1;
            }
            if ((a - 1) % m == b % m) {
                ans = Math.min(ans, 2);
            }
            out.println(ans);
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


