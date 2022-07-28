import java.io.*;import java.util.StringTokenizer; public class A {     public void solve() {         int t = in.nextInt();         while (t-- > 0) {            int n = in.nextInt();            int a[] = in.readIntArray(n);             int cnt[] = new int[101];            int max = 0;            for (int i=0; i<n; i++) {                cnt[a[i]]++;                max = Math.max(max, cnt[a[i]]);            }             out.println(max);        }    }     String input = "";    String output = "";    FastScanner in;    PrintWriter out;     void run() throws Exception {        if (input.length() == 0) {            in = new FastScanner(System.in);        } else {            in = new FastScanner(new File(input));        }        if (output.length() == 0) {            out = new PrintWriter(System.out);        } else {            out = new PrintWriter(new File(output));        }         solve();         out.close();     }     public static void main(String[] args) throws Exception {        new A().run();    }     class FastScanner {         BufferedReader bf;        StringTokenizer st;         public FastScanner(InputStream is) {            bf = new BufferedReader(new InputStreamReader(is));        }         public FastScanner(File fr) throws FileNotFoundException {            bf = new BufferedReader(new FileReader(fr));        }         public String next() {            try {                while (st == null || !st.hasMoreTokens()) {                    st = new StringTokenizer(bf.readLine());                }            } catch (IOException ex) {                ex.printStackTrace();            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public double nextDouble() {            return Double.parseDouble(next());        }         public int[] readIntArray(int length) {            int arr[] = new int[length];            for (int i = 0; i<length; i++)                arr[i] = nextInt();            return arr;        }    }}