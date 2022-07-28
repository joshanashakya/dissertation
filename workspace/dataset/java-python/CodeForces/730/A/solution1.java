import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static long mod = 17352642619633L;     void run(FastScanner in, PrintWriter out) {         int N = in.nextInt();        TreeSet<int[]> ts = new TreeSet<>((a,b) -> {            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];        });        int sum = 0;        for (int i = 0; i < N; i++) {            int[] r = new int[2];            r[0] = in.nextInt();            r[1] = i;            ts.add(r);             sum += r[0];        }         List<List<Integer>> ans = new ArrayList<>();        for (int i = 0; i < 10000 && ts.first()[0] != ts.last()[0]; i++) {             int diff = sum - N*ts.first()[0];             int numPick = diff%2 == 0 ? 2 : 3;            numPick = Math.min(numPick, N);             // pick two            int[][] pick = new int[numPick][];            for (int j = 0; j < numPick; j++) pick[j] = ts.pollLast();            ArrayList<Integer> add = new ArrayList<>();            for (int j = 0; j < numPick; j++) {                if (pick[j][0] > 0) {                    pick[j][0]--;                    sum--;                }                add.add(pick[j][1]);            }            Collections.sort(add);            ans.add(add);             for (int j = 0; j < numPick; j++) {                ts.add(pick[j]);            }        }         out.println(ts.first()[0]);        out.println(ans.size());        for (List<Integer> a : ans) {            int j = 0;            for (int i = 0; i < N; i++) {                if (j < a.size() && i == a.get(j)) {                    out.print(1);                    j++;                } else {                    out.print(0);                }            }            out.println();        }     }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}