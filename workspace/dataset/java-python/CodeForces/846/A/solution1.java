import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static long mod = 17352642619633L;     void run(FastScanner in, PrintWriter out) {        int N = in.nextInt();        int[] a = new int[N];         for (int i = 0; i < N; i++) {            a[i] = in.nextInt();        }         int[] zeroBefore = new int[N];        int[] oneAfter = new int[N];         for (int i = 0; i < N; i++) {            zeroBefore[i] = (i == 0 ? 0 : zeroBefore[i-1]) + (a[i]^1);        }         for (int i = N-1; i >= 0; i--) {            oneAfter[i] = (i == N-1 ? 0 : oneAfter[i+1]) + (a[i]);        }         int max = 0;        for (int i = 0; i < N; i++) {            max = Math.max(max, zeroBefore[i] + oneAfter[i]);        }        out.println(max);    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}
