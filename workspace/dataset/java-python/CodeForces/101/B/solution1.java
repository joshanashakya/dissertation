import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.TreeMap;import java.util.StringTokenizer;import java.util.Map;import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int m = in.nextInt();            int[] s = new int[m];            int[] t = new int[m];            TreeMap<Integer, ArrayList<Integer>> stationByLast = new TreeMap<>();            for (int i = 0; i < m; i++) {                s[i] = in.nextInt();                t[i] = in.nextInt();                if (!stationByLast.containsKey(t[i])) {                    stationByLast.put(t[i], new ArrayList<>());                }                stationByLast.get(t[i]).add(s[i]);            }            TreeMap<Integer, Integer> prefixSum = new TreeMap<>();            prefixSum.put(0, 1);            TreeMap<Integer, Integer> comb = new TreeMap<>();            for (int lastStation : stationByLast.keySet()) {                int posMoves = 0;                Integer prefix1key = prefixSum.lowerKey(lastStation);                if (prefix1key == null) prefix1key = -1;                long prefix1 = prefixSum.getOrDefault(prefix1key, 0);                for (int firstStation : stationByLast.get(lastStation)) {                    Integer prefix2key = prefixSum.lowerKey(firstStation);                    if (prefix2key == null) prefix2key = -1;                    long prefix2 = prefixSum.getOrDefault(prefix2key, 0);                    posMoves = (int) ((posMoves + prefix1 - prefix2 + 1_000_000_007) % 1_000_000_007);                }                comb.put(lastStation, posMoves);                int lastPrefix = prefixSum.get(prefixSum.lowerKey(lastStation));                prefixSum.put(lastStation, (posMoves + lastPrefix) % 1_000_000_007);            }            out.println(comb.getOrDefault(n, 0));        }     }     static class InputReader {        private StringTokenizer tokenizer;        private BufferedReader reader;         public InputReader(InputStream inputStream) {            reader = new BufferedReader(new InputStreamReader(inputStream));        }         private void fillTokenizer() {            if (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (Exception e) {                    throw new RuntimeException(e);                }            }        }         public String next() {            fillTokenizer();            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 