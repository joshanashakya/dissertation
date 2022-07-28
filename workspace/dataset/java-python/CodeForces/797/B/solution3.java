import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static long mod = 17352642619633L;     void run(FastScanner in, PrintWriter out) {        // ss with odd sum        int N = in.nextInt();        int[] a = new int[N];        for (int i = 0; i < N; i++) a[i] = in.nextInt();          // numbers are negative too        int o = Integer.MIN_VALUE;        int e = 0;         for (int i = 0; i < N; i++) {             if (isOdd(a[i])) {                int prevo = o;                 o = Math.max(o, e+a[i]);                 if (prevo != Integer.MIN_VALUE) {                    e = Math.max(e, prevo + a[i]);                }            } else {                e = Math.max(e, e+a[i]);                 if (o != Integer.MIN_VALUE) {                    o = Math.max(o, o + a[i]);                }            }            // System.out.println(a[i] + " " + e + " " + o);        }        out.println(o);     }     boolean isOdd(int a) {        return (((a%2)+2)%2) == 1;    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}
