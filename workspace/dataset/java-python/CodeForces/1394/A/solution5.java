import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.min;

public class Main {

    void solve() throws Throwable {
        /*gen();
        if (true) {
            return;
        }/**/
        int n = readInt(), d = readInt(), m = readInt();
        long[] a = readLongArray(n);
        List<Long> small = Arrays.stream(a).filter(x -> x <= m).sorted().boxed().collect(Collectors.toList());
        List<Long> big = Arrays.stream(a).filter(x -> x > m).sorted().boxed().collect(Collectors.toList());
        long maxTotal = small.stream().mapToLong(x -> x).sum();
        long[] smallPrefixSum = getPrefixSum(small);
        long[] bigPrefixSum = getPrefixSum(big);
        for (int bigTaken = 1; bigTaken <= big.size(); bigTaken++) {
            long removedCnt = (long) (bigTaken - 1) * (long) d;
            if (bigTaken + removedCnt > n) {
                continue;
            }
            int bigRemoved = min((int) removedCnt, big.size() - bigTaken);
            int smallRemoved = (int) removedCnt - bigRemoved;
            long totalBig = bigPrefixSum[big.size()] - bigPrefixSum[big.size() - bigTaken];
            long totalSmall = smallPrefixSum[small.size()] - smallPrefixSum[smallRemoved];
            maxTotal = Math.max(maxTotal, totalBig + totalSmall);
        }
        System.out.println(maxTotal);
    }

    private void gen() {
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.print(rnd.nextInt(1000000) + " ");
        }
    }

    private long[] getPrefixSum(List<Long> list) {
        long[] prefixSum = new long[list.size() + 1];
        for (int i = 0; i < list.size(); i++) {
            prefixSum[i + 1] = prefixSum[i] + list.get(i);
        }
        return prefixSum;
    }

    //-------------------------------------------------

    final boolean ONLINE_JUDGE = !new File("input.txt").exists();

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok;

    public void run() {
        Runnable run = () -> {
            try {
                long startTime = System.currentTimeMillis();
                Locale.setDefault(Locale.US);
                if (ONLINE_JUDGE) {
                    in = new BufferedReader(new InputStreamReader(System.in));
                    out = new PrintWriter(System.out);
                } else {
                    in = new BufferedReader(new FileReader("input.txt"));
                    out = new PrintWriter("output.txt");
                }
                tok = new StringTokenizer("");
                solve();
                in.close();
                out.close();
                long endTime = System.currentTimeMillis();
                long totalMemory = Runtime.getRuntime().totalMemory();
                long freeMemory = Runtime.getRuntime().freeMemory();
                System.err.println();
                System.err.println("Time = " + (endTime - startTime) + " ms");
                //System.err.println("Memory = " + ((totalMemory - freeMemory) / 1024) + " KB");
            } catch (Throwable e) {
                e.printStackTrace(System.err);
                System.exit(-1);
            }
        };
        new Thread(null, run, "run", 256 * 1024 * 1024).start();
        min(0, 0);
    }

    String readString() {
        while (!tok.hasMoreTokens()) {
            String line;
            try {
                line = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (line == null) return null;
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    int readInt() {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void debug(Object... o) {
        if (!ONLINE_JUDGE) {
            System.err.println(Arrays.deepToString(o));
        }
    }
 
    /*long binpow(long a, long n) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r *= a;
            }
            a *= a;
            n /= 2;
        }
        return r;
    }/**/

    long binpow(long a, long n, long mod) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n /= 2;
        }
        return r;
    }/**/

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    private long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = readLong();
        }
        return a;
    }

    private int[] readIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
        }
        return a;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
