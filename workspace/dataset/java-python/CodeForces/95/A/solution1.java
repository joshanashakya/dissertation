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
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.next().toLowerCase();
            }
            String w = in.next();
            String wLow = w.toLowerCase();
            String letter = in.next();
            char letterLow = letter.toLowerCase().charAt(0);
            char letterUp = letter.toUpperCase().charAt(0);
            boolean[] change = new boolean[w.length()];
            for (int i = 0; i < n; i++) {
                int st = 0;
                while ((st = wLow.indexOf(s[i], st)) != -1) {
                    for (int j = 0; j < s[i].length(); j++) {
                        change[st + j] = true;
                    }
                    st++;
                }
            }
            char[] ans = w.toCharArray();
            for (int i = 0; i < ans.length; i++) {
                if (change[i]) {
                    if ('a' <= ans[i] && ans[i] <= 'z') {
                        if (ans[i] == letterLow) {
                            if (letterLow == 'a') {
                                ans[i] = 'b';
                            } else {
                                ans[i] = 'a';
                            }
                        } else {
                            ans[i] = letterLow;
                        }
                    } else {
                        if (ans[i] == letterUp) {
                            if (letterUp == 'A') {
                                ans[i] = 'B';
                            } else {
                                ans[i] = 'A';
                            }
                        } else {
                            ans[i] = letterUp;
                        }
                    }
                }
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


