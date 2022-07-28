import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static long mod = 17352642619633L;     void run(FastScanner in, PrintWriter out) {        greedy(in, out);    }     int N;    int M;    void greedy(FastScanner in, PrintWriter out) {        // two choices        // don’t/can't kill all of his cards        // kill all of his cards         // if we don’t kill all of his cards, we never attack his DEF cards        // our highest atk goes to his min attack         // if we kill all of his cards        // his def card should be killed by our lowest card that his higher str        // than that def card        // then we proceed as before         int N = in.nextInt();        int M = in.nextInt();         int[] c = new int[M+1];        int[] def = new int[N+1];        int[] atk = new int[N+1];        int defn = 0, atkn = 0;         for (int i = 0; i < N; i++) {            String pos = in.next();            if (pos.equals("ATK")) {                atk[atkn++] = in.nextInt();            } else {                def[defn++] = in.nextInt();            }        }         for (int i = 0; i < M; i++) {            c[i] = in.nextInt();        }         Arrays.sort(c, 0, M);        Arrays.sort(def, 0, defn);        Arrays.sort(atk, 0, atkn);         // -----        // strat 1        // -----        int c1 = 0;        int i1 = M-1;        int i2 = 0;        while (i1 >= 0 && i2 < atkn && c[i1] >= atk[i2]) {            c1 += c[i1--] - atk[i2++];        }         // -----        // strat 2        // -----        int c2 = 0;        TreeSet<Integer> ts = new TreeSet<>((a, b) -> {            if (c[a] == c[b]) return a-b;            return c[a]-c[b];        });        for (int i = 0; i < M; i++) ts.add(i);         for (int i = defn-1; i >= 0; i--) {            c[M] = def[i];            Integer higher = ts.higher(M);            if (higher == null) {                c2 = -1;                break;            }            ts.remove(higher);        }         if (c2 != -1) {            int reverseOrder = 0;            i2 = 0;            for (Iterator<Integer> ii = ts.descendingIterator(); ii.hasNext();) {                i1 = ii.next();                if (i2 >= atkn) {                    reverseOrder += c[i1];                    continue;                }                if (c[i1] < atk[i2]) break;                reverseOrder += c[i1] - atk[i2];                i2++;            }             int inOrder = 0;            i2 = atkn-1;            boolean killall = true;            for (Iterator<Integer> ii = ts.descendingIterator(); ii.hasNext();) {                i1 = ii.next();                if (i2 < 0 && killall) {                    inOrder += c[i1];                    continue;                }                while (i2 >= 0 && c[i1] < atk[i2]) {                    i2--;                    killall = false;                }                 if (i2 >= 0 && c[i1] >= atk[i2]) {                    inOrder += c[i1] - atk[i2];                }                i2--;            }            c2 += Math.max(reverseOrder, inOrder);        }         out.println(Math.max(c1, c2));    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}