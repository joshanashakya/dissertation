import java.io.*;import java.util.*; public class Main {    private static InputReader in;    private static PrintWriter out;     public static void main(String[] args) {        in = new InputReader();        out = new PrintWriter(System.out);        int t = 1;//        t = in.nextInt();        for (int i = 0; i < t; ++i) {            solve();        }        out.close();    }     private static void solve() throws RuntimeException {        int n = in.nextInt();        int ans = 0;        int[][] dp = new int[26][26];        for (int i = 0; i < n; ++i) {            String s = in.next();            int first = s.charAt(0) - 'a', last = s.charAt((int) s.length() - 1) - 'a';            for (int j = 0; j < 26; ++j) {                if (dp[j][first] != 0)                    dp[j][last] = Math.max(dp[j][last], dp[j][first] + (int) s.length());            }             dp[first][last] = Math.max(dp[first][last], (int) s.length());        }//        out.println(Arrays.deepToString(dp));//        for (int i = 0; i < 26; ++i) {//            out.println((char) (i + 97));//            out.println(Arrays.toString(dp[i]));//        }        for (int i = 0; i < 26; ++i) ans = Math.max(ans, dp[i][i]);        out.println(ans);    }     static class InputReader {        BufferedReader br;        StringTokenizer st;         public InputReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}
