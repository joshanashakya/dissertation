import java.io.*;
import java.util.*;

public class B {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextLong();
        pw.println(solve(arr, n));
        pw.close();
    }

    static long solve(Long[] arr, int n) {
        Arrays.sort(arr);
        long reng = (long) 1e15;
        long ans = (long) 1e15;
        boolean finished = false;
        for (long C = 1; ; C++) {
            long res = 0;
            for (long i = 0, pw = 1; i < n; i++, pw *= C) {
                if (pw >= reng) {
                    finished = true;
                    break;
                }
                res += Math.abs((arr[(int) i] - pw));
               // debug(res);
            }
            if (finished) break;
            ans = Math.min(ans, res);
        }
        return ans;

    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
