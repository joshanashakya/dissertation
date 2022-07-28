import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Set;import java.util.HashMap;import java.io.IOException;import java.io.InputStreamReader;import java.util.HashSet;import java.util.StringTokenizer;import java.util.Map;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Tarek */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        ACottageVillage solver = new ACottageVillage();        solver.solve(1, in, out);        out.close();    }     static class ACottageVillage {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int t = in.nextInt();            int center[] = new int[n];            int length[] = new int[n];            Map<Integer, Integer> m = new HashMap<>();            for (int i = 0; i < n; i++) {                center[i] = in.nextInt() * 2;                length[i] = in.nextInt();            }            Set<Integer> res = new HashSet<Integer>();            for (int i = 0; i < n; i++) {                if (valid(n, t, center, length, center[i] + length[i] + t)) {                    res.add((center[i] + length[i] + t));                }                if (valid(n, t, center, length, center[i] - length[i] - t)) {                    res.add(center[i] - length[i] - t);                }            }            out.println(res.size());        }         public static boolean valid(int n, int t, int[] x, int[] a, int pos) {            for (int i = 0; i < n; i++) {                if (Math.abs(pos - x[i]) < (a[i] + t)) {                    return false;                }            }            return true;        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
