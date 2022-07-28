import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Main {     private FastScanner scanner = new FastScanner();     public static void main(String[] args) {        new Main().solve();    }     private void solve() {        int n = scanner.nextInt(), k = scanner.nextInt();         int a[] = new int[n];         for (int i = 0; i < n; i++) {            a[i] = scanner.nextInt();        }         int t = a[0], j = 0, ans = 1;          for (int i = 1; i < n; i++ ) {            if (a[i] - t > k) {                if (i == j) {                    System.out.print(-1);                    return;                }                ans++;                j = i;                t = a[i - 1];                i--;            }        }         System.out.print(ans);    }       int diff(int a, int b) {        StringBuilder sa = new StringBuilder(String.valueOf(a));        for (int i = 0; i < 3 - sa.length() + 1; i++) {            sa.insert(0, '0');        }         StringBuilder sb = new StringBuilder(String.valueOf(b));        for (int i = 0; i < 3 - sb.length() + 1; i++) {            sb.insert(0, '0');        }        int ans = 0;         for (int i = 0; i < 3; i++) {            if (sa.charAt(i) != sb.charAt(i) ) {                ans ++;            }        }        return ans;    }      public static final <T> void swap(T[] a, int i, int j) {        T t = a[i];        a[i] = a[j];        a[j] = t;    }     class Pair implements Comparable<Pair> {        int a, i;         public Pair(int a, int i) {            this.a = a;            this.i = i;        }         @Override        public int compareTo(Pair o) {            return this.a - o.a;        }    }     long gcd(long a, long b) {        if (b != 0) {            return gcd(b, a % b);        }        return a;    }     long lcm(long a, long b) {        return (a * b) / gcd(a, b);    }     class FastScanner {        public BufferedReader reader;        public StringTokenizer tokenizer;         public FastScanner() {            reader = new BufferedReader(new InputStreamReader(System.in), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public double nextDouble() {            return Double.parseDouble(next());        }         public String nextLine() {            try {                return reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }    }}
