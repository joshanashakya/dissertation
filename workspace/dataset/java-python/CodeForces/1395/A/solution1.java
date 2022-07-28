import java.io.*;
import java.util.StringTokenizer;
// نورت الكود يا كبير اتفضل

// يا رب Accepted
public class BoboniuLikesToColorBalls {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int t = in.nextInt();
        while (t-- > 0) {
            int odds = 0;
            int zero = 0;
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = in.nextInt();
                if (arr[i] % 2 != 0)
                    odds++;
                if (arr[i] == 0 && i != 3)
                    zero++;
            }
            if (odds <= 1)
                out.println("Yes");
            else if (zero != 0)
                out.println("No");
            else {
                odds = 0;
                zero = 0;
                for (int i = 0; i < 3; i++)
                    arr[i] -= 1;
                arr[3] += 3;
                for (int i = 0; i < 4; i++) {
                    if (arr[i] % 2 != 0)
                        odds++;
                    if (arr[i] == 0 && i != 3)
                        zero++;
                }
                if (odds <= 1)
                    out.println("Yes");
                else
                    out.println("No");
            }
        }

        out.close();
    }

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
    }
}
