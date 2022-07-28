import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.util.HashMap;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastI in = new FastI(inputStream);        PrintWriter out = new PrintWriter(outputStream);        ACommonSubsequence solver = new ACommonSubsequence();        solver.solve(1, in, out);        out.close();    }     static class ACommonSubsequence {        public void solve(int testNumber, FastI sc, PrintWriter out) {            int t = sc.nextInt();            while (t > 0) {                t--;                int n = sc.nextInt();                int m = sc.nextInt();                HashMap<Integer, Integer> map = new HashMap<>();                for (int i = 0; i < n; i++) {                    int x = sc.nextInt();                    map.put(x, 1);                }                int ans = -1;                for (int i = 0; i < m; i++) {                    int x = sc.nextInt();                    if (map.get(x) != null) {                        ans = x;                    }                }                if (ans != -1) {                    out.println("YES");                    out.println("1 " + ans);                } else {                    out.println("NO");                }            }        }     }     static class FastI {        BufferedReader br;        StringTokenizer st;         public FastI(InputStream inputStream) {            br = new BufferedReader(new                    InputStreamReader(inputStream));         }         public String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
