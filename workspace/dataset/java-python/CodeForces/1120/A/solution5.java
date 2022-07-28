import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        solver.solve(1, in, out);        out.close();    }     static class TaskA {        int total = 500000;         public void solve(int testNumber, InputReader in, PrintWriter out) {            int M = in.nextInt();            int K = in.nextInt();            int N = in.nextInt();            int S = in.nextInt();            int[] liana = new int[M];            for (int i = 0; i < M; i++) {                liana[i] = in.nextInt() - 1;            }            int canRemove = M - N * K;            int[] need = new int[500000];            int[] has = new int[500000];            for (int i = 0; i < S; i++) {                need[in.nextInt() - 1]++;            }            int curHas = 0;            for (int i = 0; i < 500000; i++) {                if (need[i] == 0) {                    curHas++;                }            }            int low = 0;            int high = 0;            has[liana[0]]++;            if (has[liana[0]] == need[liana[0]]) {                curHas++;            }            while (high <= M) {                if (curHas == total) {                    if ((low) % K + (Math.max(K, high - low + 1) - K) <= canRemove) {                        int removed = 0;                        int index = low;                        out.println(Math.max(K, high - low + 1) - K + (low) % K);                        int[] dup = has.clone();                        while (removed < high - low + 1 - K) {                            if (dup[liana[index]] - 1 >= need[liana[index]]) {                                dup[liana[index]]--;                                out.println(index + 1);                                removed++;                            }                            index++;                        }                        for (int i = 0; i < (low) % K; i++) {                            out.println((i + 1));                        }                        return;                    }                    if (has[liana[low]] == need[liana[low]]) {                        curHas--;                    }                    has[liana[low]]--;                    low++;                } else {                    high++;                    if (high == M) {                        break;                    }                    has[liana[high]]++;                    if (need[liana[high]] == has[liana[high]]) {                        curHas++;                    }                }            }            out.println(-1);        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
