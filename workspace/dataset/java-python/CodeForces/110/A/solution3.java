import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class A_Nearly_Lucky_Number {    public static void main(String[] args) {        FastScanner fs = new FastScanner();        char[] s = fs.next().toCharArray();         int lucky = 0;        for (char c : s) {            if (c == '4' || c == '7') {                lucky++;            }        }         System.out.println((lucky == 4 || lucky == 7) ? "YES" : "NO");    }     static int min(int a, int b) {        return Math.min(a, b);    }     static int max(int a, int b) {        return Math.max(a, b);    }     static long min(long a, long b) {        return Math.min(a, b);    }     static long max(long a, long b) {        return Math.max(a, b);    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() { return Integer.parseInt(next()); }        long nextLong() { return Long.parseLong(next()); }        double nextDouble() { return Double.parseDouble(next()); }        char nextChar() { return next().charAt(0); }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}
