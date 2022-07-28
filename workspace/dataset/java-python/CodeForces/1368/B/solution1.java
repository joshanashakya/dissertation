import java.io.*;import java.util.*;import java.math.*;                       /* Noah            date : 7-03-2021  */public class Main {     static FastReader in;    static PrintWriter o;     public static void solve() {        long k = in.nextLong();        char[] ch = "codeforces".toCharArray();        int[] a = new int[ch.length];        Arrays.fill(a, 1);        for (int i = 0; ; i++) {            long prod = 1;            for (int x : a) {                prod *= (long) x;            }            if (prod >= k) {                break;            }            ++a[i % ch.length];        }        for (int i = 0; i < ch.length; i++) {            for (int j = 0; j < a[i]; j++) {                o.print(ch[i]);            }        }        o.println();        o.close();        return;    }     public static void main(String[] args) {        in = new FastReader();        o = new PrintWriter(System.out);        solve();        return;    }     static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }         long[] readLongArray(int n) {            long[] a = new long[n];            for (int i = 0; i < n; i++) a[i] = nextLong();            return a;        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }         boolean isReady() throws Throwable{            return br.ready();        }     } }
