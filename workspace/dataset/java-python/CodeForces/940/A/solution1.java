import java.io.*;import java.util.Arrays;import java.util.StringTokenizer; public class Solution {    static final int INF = (int) 1e9;     public static void main(String[] args) throws IOException {        Scanner sc = new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out);        int n = sc.nextInt();        int d = sc.nextInt();        int[] a = sc.nextIntArray(n);        Arrays.sort(a);        int ans = n;        for (int start = 0; start < n; start++) {            int remove = start;            for (int end = start; end < n; end++) {                int rem = remove + (n - 1 - end);                if (a[end] - a[start] <= d) ans = Math.min(ans, rem);            }        }        out.println(ans);        out.close();        out.flush();    }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream system) {            br = new BufferedReader(new InputStreamReader(system));        }         public Scanner(String file) throws Exception {            br = new BufferedReader(new FileReader(file));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public String nextLine() throws IOException {            return br.readLine();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public double nextDouble() throws IOException {            return Double.parseDouble(next());        }         public char nextChar() throws IOException {            return next().charAt(0);        }         public Long nextLong() throws IOException {            return Long.parseLong(next());        }         public boolean ready() throws IOException {            return br.ready();        }         public void waitForInput() throws InterruptedException {            Thread.sleep(3000);        }         public int[] nextIntArray(int n) throws IOException {            int[] a = new int[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         public long[] nextLongArray(int n) throws IOException {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }          public Integer[] nextIntegerArray(int n) throws IOException {            Integer[] a = new Integer[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         public double[] nextDoubleArray(int n) throws IOException {            double[] ans = new double[n];            for (int i = 0; i < n; i++)                ans[i] = nextDouble();            return ans;        }         public short nextShort() throws IOException {            return Short.parseShort(next());        }     } }