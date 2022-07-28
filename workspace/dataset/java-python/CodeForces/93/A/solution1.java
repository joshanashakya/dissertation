import java.io.*;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int r1 = a / m, c1 = a % m, r2 = b / m, c2 = b % m;
        int ans = 3;
        if (r1 == r2) ans = 1;
        else if (r1 + 1 == r2) {
            ans = 2;
            if (c1 == 0 && (c2 == m - 1 || b == n - 1)) ans--;
        } else if (c2 + 1 == c1) {
            ans = 2;
        } else {
            if (c1 == 0) ans--;
            if (c2 == m - 1 || b == n - 1) ans--;
        }
        out.println(ans);
        out.flush();
        out.close();

    }


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }


        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }


        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }


        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public double[] nextDoubleArray(int n) throws IOException {
            double[] ans = new double[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextDouble();
            return ans;
        }

        public short nextShort() throws IOException {
            return Short.parseShort(next());
        }

    }

}
