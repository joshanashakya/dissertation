import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static long mod = 17352642619633L;     void run(FastScanner in, PrintWriter out) {         int n1 = in.nextInt();        int n2 = in.nextInt();         int[][] a1 = new int[n1][2];        int[][] a2 = new int[n2][2];         List<Integer>[] idx1 = new List[12];        List<Integer>[] idx2 = new List[12];        for (int i = 0; i < idx1.length; i++) {            idx1[i] = new ArrayList<>();            idx2[i] = new ArrayList<>();        }         for (int i = 0; i < n1; i++) {            a1[i][0] = in.nextInt();            a1[i][1] = in.nextInt();            Arrays.sort(a1[i]);             idx1[a1[i][0]].add(i);            idx1[a1[i][1]].add(i);        }         for (int i = 0; i < n2; i++) {            a2[i][0] = in.nextInt();            a2[i][1] = in.nextInt();            Arrays.sort(a2[i]);             idx2[a2[i][0]].add(i);            idx2[a2[i][1]].add(i);        }         Set<Integer> choices = new HashSet<>();        for (int rep = 0; rep < 2; rep++) {             for (int i = 0; i < n1; i++) {                 boolean good1 = false;                boolean good2 = false;                for (int j = 0; j < n2 && !good1; j++) {                    if (!eq(a1[i], a2[j]) && (a1[i][0] == a2[j][0] || a1[i][0] == a2[j][1])) {                        good1 = true;                    }                }                 for (int j = 0; j < n2 && !good2; j++) {                    if (!eq(a1[i], a2[j]) && (a1[i][1] == a2[j][0] || a1[i][1] == a2[j][1])) {                        good2 = true;                    }                }                 if (good1 && good2) {                    out.println(-1);                    return;                }                 if (good1)  choices.add(a1[i][0]);                if (good2)  choices.add(a1[i][1]);            }             int temp = n1;            n1 = n2;            n2 = temp;             int[][] tempa = a1;            a1 = a2;            a2 = tempa;        }         if (choices.size() > 1) {            out.println(0);        } else out.println(choices.stream().findFirst().get());     }     boolean eq(int[] a, int[] b) {        return a[0]==b[0] && a[1]==b[1];    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}
