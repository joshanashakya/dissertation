import java.io.*;import java.util.*;import java.util.stream.IntStream; public class CodeForces {    public static void main(String[] args) {        FastIO io = FastIO.create();         String prefix = io.nextLine();         String bestMatch = null;         int n = io.nextInt();         for (int i = 0; i < n; i++) {            String candidate = io.nextLine();            if (candidate.startsWith(prefix)) {                if (bestMatch == null || candidate.compareTo(bestMatch) < 1) {                    bestMatch = candidate;                }            }        }         if (bestMatch == null) {            bestMatch = prefix;        }         io.println(bestMatch);         io.close();    }     static class FastIO extends PrintWriter {        BufferedReader br;        StringTokenizer st;         public FastIO(InputStream is, OutputStream os) {            super(new BufferedOutputStream(os));            br = new BufferedReader(new InputStreamReader(is));        }         public static FastIO create() {            return new FastIO(System.in, System.out);        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextToken() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         String nextLine() {            try {                return br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return "";        }    }}
