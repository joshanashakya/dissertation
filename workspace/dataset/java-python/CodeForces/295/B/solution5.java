import java.io.*;import java.math.*;import java.util.*; public class Main {     static FastReader in;    static PrintWriter o;     public static void solve() {       int n = in.nextInt();       int[][] graph = new int[n][n];       for (int i = 0; i < n; i++) {           for (int j = 0; j < n; j++) {               graph[i][j] = in.nextInt();           }       }       int[] x = new int[n];       for (int i = 0; i < n; i++) {           x[i] = in.nextInt() - 1;       }       List<Integer> vals = new ArrayList<>();       long[] ans = new long[n];       for (int k = n - 1; k >= 0; k--) {           int z = x[k];           long temp = 0;           for (int i = 0; i < n; i++) {               for (int j = 0; j < n; j++) {                   graph[i][j] = Math.min(graph[i][j], graph[i][z] + graph[z][j]);               }           }           vals.add(z);           for (int i : vals) {               for (int j : vals) {                   temp += graph[i][j];               }           }           ans[k] = temp;       }       for (int i = 0; i < n; i++) {           o.print(ans[i] + " ");       }       o.close();       return;    }     public static void main(String[] args) {        in = new FastReader();        o = new PrintWriter(System.out);        solve();        return;    }      static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }         long[] readLongArray(int n) {            long[] a = new long[n];            for (int i = 0; i < n; i++) a[i] = nextLong();            return a;        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    } }