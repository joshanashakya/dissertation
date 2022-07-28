import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.Stream;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        LuckyNumbers solver = new LuckyNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class LuckyNumbers {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String nr = in.next();

            if (nr.length() % 2 == 1) {
                nr = "1" + nr;
            }

            BiFunction<String, Integer, String> f =
                    (p, r) -> Stream.generate(() -> p).limit(r).collect(Collectors.joining());
            String s = f.apply("7", nr.length() / 2).concat(f.apply("4", nr.length() / 2));
            if (s.compareTo(nr) < 0) {
                nr = "1" + "1" + nr;
            }

            Stack<Character> ans = new Stack<>();
            int left[] = {nr.length() / 2, nr.length() / 2};
            boolean bigger = false;
            int idx = 0;
            while (Arrays.stream(left).anyMatch(x -> x > 0)) {
                if (bigger || nr.charAt(idx) < '4') {
                    ans.push(try4(left));
                    bigger = true;
                } else if (nr.charAt(idx) == '4') {
                    ans.push(try4(left));
                    if (ans.peek() == '7') {
                        bigger = true;
                    }
                } else if (nr.charAt(idx) <= '7' && left[1] > 0) {
                    ans.push('7');
                    --left[1];
                    if (nr.charAt(idx) < '7') {
                        bigger = true;
                    }
                } else if (nr.charAt(idx) > '7') {
                    while (ans.pop() == '7') {
                        --idx;
                        ++left[1];
                    }
                    --idx;
                    ++left[0];

                    ans.push('7');
                    --left[1];
                    bigger = true;
                } else {
                    while (ans.pop() == '4') {
                        --idx;
                        ++left[0];
                    }
                    --idx;
                    ++left[1];
                    while (ans.pop() == '7') {
                        --idx;
                        ++left[1];
                    }
                    --idx;
                    ++left[0];

                    ans.push('7');
                    --left[1];
                    bigger = true;
                }

                ++idx;
            }

            Character ansp[] = new Character[nr.length()];
            ansp = ans.toArray(ansp);
            for (int i = 0; i < nr.length(); ++i) {
                out.print(ansp[i]);
            }
            out.println();
        }

        public static char try4(int left[]) {
            if (left[0] > 0) {
                left[0] -= 1;
                return '4';
            } else {
                left[1] -= 1;
                return '7';
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }
}


