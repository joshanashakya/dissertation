import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        for (int imnewhere = -1; imnewhere < 0; imnewhere++) {
            int n = nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            Arrays.sort(a);
            long max = 1;
            for (; ; max++) {
                boolean good = true;
                long v = max;
                for (int i = 0; i < n; i++) {
                    if(Long.MAX_VALUE/max<v){
                        good = false;
                        break;
                    }
                    v*=max;
                }
                if(!good)break;
            }
            long maxx = 1000000000000000000L;
            for (long j = 1; j <= max-1; j++) {
                long now = 1;
                long know = 0;
                for (int k = 0; k < n; k++) {
                    know += Math.abs(a[k] - now);
                    if (Long.MAX_VALUE / j < now) break;
                    now *= j;
                }
                maxx = Math.min(maxx, know);
            }
            out.println(maxx);
        }
        out.close();
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer in = new StringTokenizer("");

    public static boolean hasNext() throws IOException {
        if (in.hasMoreTokens()) return true;
        String s;
        while ((s = br.readLine()) != null) {
            in = new StringTokenizer(s);
            if (in.hasMoreTokens()) return true;
        }
        return false;
    }

    public static String nextToken() throws IOException {
        while (!in.hasMoreTokens()) {
            in = new StringTokenizer(br.readLine());
        }
        return in.nextToken();
    }

    public static int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    public static long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}
