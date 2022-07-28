import java.io.*;
import java.util.*;

/*
polyakoff
*/

public class Main {

    static FastReader in;
    static PrintWriter out;
    static Random rand = new Random();
    static final int oo = (int) 1e9 + 10;
    static final long OO = (long) 2e18 + 10;
    static final int MOD = (int) 1e9 + 7;
    static final int N = 2_500_005;

    static class Pair {
        int a, b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static void solve() {
        int n = in.nextInt();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(in.nextInt(), i + 1);
        }
        Arrays.sort(arr, (p1, p2) -> p1.a - p2.a);

        ArrayList<Integer>[] adj = new ArrayList[N];
        for (int i = 1; i < n; i++) {
            int d = arr[i].a - arr[i - 1].a;
            if (adj[d] == null)
                adj[d] = new ArrayList<>();
            adj[d].add(i);
            if (adj[d].size() >= 3 || (adj[d].size() == 2 && adj[d].get(0) != i - 1)) {
                int i1 = arr[adj[d].get(0) - 1].b;
                int i2 = arr[adj[d].get(0)].b;
                int i3 = arr[i - 1].b;
                int i4 = arr[i].b;
                out.println("YES");
                out.println(i1 + " " + i4 + " " + i2 + " " + i3);
                return;
            }
        }

        // n <= √N

        ArrayList<Pair>[] lol = new ArrayList[N * 2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i - 1 >= 0 && arr[i].a == arr[i - 1].a && arr[i].a == arr[i + 1].a)
                    continue;
                if (arr[j].a == arr[j - 1].a && j + 1 < n && arr[j].a == arr[j + 1].a)
                    continue;
                if (arr[j].a == arr[j - 1].a && i != j - 1)
                    continue;
                if (arr[i].a == arr[i + 1].a && j != i + 1)
                    continue;
                int s = arr[i].a + arr[j].a;
                if (lol[s] == null)
                    lol[s] = new ArrayList<>();
                lol[s].add(new Pair(i, j));
                if (lol[s].size() == 2) {
                    int i1 = arr[lol[s].get(0).a].b;
                    int i2 = arr[lol[s].get(0).b].b;
                    int i3 = arr[i].b;
                    int i4 = arr[j].b;
                    out.println("YES");
                    out.println(i1 + " " + i2 + " " + i3 + " " + i4);
                    return;
                }
            }
        }

        out.println("NO");


    }

    public static void main(String[] args) {
        in = new FastReader();
        out = new PrintWriter(System.out);

        int t = 1;
//        t = in.nextInt();
        while (t-- > 0)
            solve();

        out.flush();
        out.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            this(System.in);
        }
        FastReader(String file) throws FileNotFoundException {
            this(new FileInputStream(file));
        }
        FastReader(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(nextLine());
            }
            return st.nextToken();
        }
        String nextLine() {
            String line;
            try {
                line = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return line;
        }
    }
}
