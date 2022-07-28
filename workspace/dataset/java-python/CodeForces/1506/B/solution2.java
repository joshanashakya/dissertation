import java.util.Scanner;

/**
 * https://codeforces.com/contest/1506/problem/B
 */
public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();

            System.out.println(result(n, k, s));
        }
    }

    private static int result(int n, int k, String s) {
        int firstIndex = s.indexOf('*');
        int lastIndex = s.lastIndexOf('*');

        if (firstIndex == lastIndex) {
            return 1;
        }

        int res = 2;

        while (firstIndex != lastIndex) {

            int middleIndex = firstIndex + k;

            if (middleIndex >= lastIndex) {
                return res;
            }

            while (s.charAt(middleIndex) != '*') {
                middleIndex--;
            }

            res++;
            firstIndex = middleIndex;
        }

        return res;
    }

}

