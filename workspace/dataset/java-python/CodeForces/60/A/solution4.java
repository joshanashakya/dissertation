import java.io.*;import java.util.*;import java.util.stream.IntStream; public class CodeForces {    public static void main(String[] args) {        FastIO io = FastIO.create();         int n = io.nextInt();        int hints = io.nextInt();         int left = 0;        int right = n + 1;         for (int i = 0; i < hints; i++) {            String s = io.nextLine();            boolean isRight = s.contains("right");            int reference = Integer.parseInt(s.substring(s.lastIndexOf(" ") + 1));             if (isRight) {                if (reference + 1 >= right) {                    io.println(-1);                    io.close();                    return;                }                left = Math.max(left, reference);            } else {                if (reference - 1 <= left) {                    io.println(-1);                    io.close();                    return;                }                right = Math.min(right, reference);            }        }         io.println(right - left - 1);         io.close();    }     static class FastIO extends PrintWriter {        BufferedReader br;        StringTokenizer st;         public FastIO(InputStream is, OutputStream os) {            super(new BufferedOutputStream(os));            br = new BufferedReader(new InputStreamReader(is));        }         public static FastIO create() {            return new FastIO(System.in, System.out);        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextToken() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         String nextLine() {            try {                return br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return "";        }    }}