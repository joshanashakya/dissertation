import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;import java.util.concurrent.ThreadLocalRandom;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            long N = in.nextLong();            int K = in.nextInt();            long low = 1;            long high = N;            while (true) {                while (high - low + 1 > 4 * K + 1) {                    long mid = (high + low) / 2;                    if (System.currentTimeMillis() % 2 == 0) {                        out.println(low + " " + mid);                        out.flush();                        int id = readInput(in);                        if (id == -1) {                            return;                        }                        if (id == 1) {                            low = Math.max(1, low - K);                            high = Math.min(N, mid + K);                        } else {                            low = Math.max(mid + 1 - K, 1);                            high = Math.min(high + K, N);                        }                    } else {                        out.println(mid + " " + high);                        out.flush();                        int id = readInput(in);                        if (id == -1) {                            return;                        }                        if (id == 1) {                            low = Math.max(mid - K, 1);                            high = Math.min(high + K, N);                        } else {                            high = Math.min(mid - 1 + K, N);                            low = Math.max(low - K, 1);                        }                    }                }                long guess;                if (low != high) {                    guess = ThreadLocalRandom.current().nextLong(low, high + 1);                } else {                    guess = low;                }                out.println(guess + " " + guess);                out.flush();                int id = readInput(in);                if (id == -1) {                    return;                }                if (id == 1) {                    return;                } else {                    low = Math.max(1, low - K);                    high = Math.min(N, high + K);                }            }        }         int readInput(InputReader in) {            String s = "";            try {                s = in.next();            } catch (NullPointerException e) {             }            if (s.equals("Bad")) {                return -1;            }            if (s.equals("Yes")) {                return 1;            } else if (s.equals("No")) {                return 0;            }            return 1;        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }     }} 
