import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class A_Team {    public static void main(String[] args) {        FastScanner fs = new FastScanner();        int n = fs.nextInt(), ans = 0;        int[] a = new int[3];        for (int i = 0; i < n; i++) {            int t = 0;            for (int j = 0; j < 3; j++) {                a[j] = fs.nextInt();                if (a[j] == 1) {                    t++;                }            }            if (t >= 2) {                ans++;            }        }        System.out.println(ans);    }     static int min(int a, int b) {        return Math.min(a, b);    }     static int max(int a, int b) {        return Math.max(a, b);    }     static long min(long a, long b) {        return Math.min(a, b);    }     static long max(long a, long b) {        return Math.max(a, b);    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() { return Integer.parseInt(next()); }        long nextLong() { return Long.parseLong(next()); }        double nextDouble() { return Double.parseDouble(next()); }        char nextChar() { return next().charAt(0); }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}
