import java.util.*;
import java.io.*;

public class A_Football {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        String str = scan.nextLine();
        int countOne = 0;
        int countZero = 0;
        int i = 0;
        String output = "NO";
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == '1') {
                countOne++;
                countZero = 0;
                if (countOne == 7) {
                    output = "YES";
                }
            } else {
                countZero++;
                countOne = 0;
                if (countZero == 7) {
                    output = "YES";
                }
            }
            i++;
        }
        System.out.println(output);
    }
}
