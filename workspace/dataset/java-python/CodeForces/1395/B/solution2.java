import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class BoboniuPlaysChess { // Template for CF
    public static class ListComparator implements Comparator<List<Integer>> {

        @Override
        public int compare(List<Integer> l1, List<Integer> l2) {
            for (int i = 0; i < l1.size(); ++i) {
                if (l1.get(i).compareTo(l2.get(i)) != 0) {
                    return l1.get(i).compareTo(l2.get(i));
                }
            }
            return 0;
        }
    }

    public static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return first + " " + second;
        }
    }

    public static void main(String[] args) throws IOException {
        // Check for int overflow!!!!
        // Should you use a long to store the sum or smthn?
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        for (int i = y; i <= m; i++) {
            out.println(x + " " + i);
        }
        for (int i = 2; i < y; i++) {
            out.println(x + " " + i);
        }
        out.println(x + " " + 1);
        int end = 0;
        for (int i = x + 1; i <= n; i++) {
            if (i % 2 == (x + 1) % 2) {
                for (int j = 1; j <= m; j++) {
                    out.println(i + " " + j);
                    end = j;
                }
            } else {
                for (int j = m; j >= 1; j--) {
                    out.println(i + " " + j);
                    end = j;
                }
            }
        }
        for (int i = 1; i < x; i++) {
            if ((end == 1 && n % 2 == 0) || (end == m && n % 2 != 0)) {
                if (i % 2 == n % 2) {
                    for (int j = m; j >= 1; j--) {
                        out.println(i + " " + j);

                    }
                } else {
                    for (int j = 1; j <= m; j++) {
                        out.println(i + " " + j);

                    }
                }
            } else {
                if (i % 2 == n % 2) {
                    for (int j = 1; j <= m; j++) {
                        out.println(i + " " + j);

                    }
                } else {
                    for (int j = m; j >= 1; j--) {
                        out.println(i + " " + j);

                    }
                }
            }
        }
        out.close();
    }

}
