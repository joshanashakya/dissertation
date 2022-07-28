//package albert.codeforces.arraywalk1389b;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int z = scan.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            System.out.println(solve(n, k, z, array));
        }
        /*int n = 6;
        int k = 4;
        int z = 3;
        int[] array = {8, 4, 6, 5, 8, 8};
        System.out.println(solve(n, k, z, array));*/
    }

    static int solve(int n, int k, int z, int[] a) {
        int[] array = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        int max = 0;
        int[][] dp = new int[n][z + 1];
        int p = 0;
        for (int i = 0; i <= k; i++) {
            int c = p + array[i];
            dp[i][0] = c;
            p = c;
        }
        for (int i = k + 1; i <= n; i++) {
            array[i] = 0;
        }
        max = dp[k][0];
        if (z == 0) {
            return max;
        }
        for (int i = 1; i <= z; i++) {
            dp[0][i] = dp[1][i - 1] + array[0];
            if (elig(0, i, k)) {
                max = Math.max(dp[0][i], max);
            }
            for (int j = 1; j <= k; j++) {
                dp[j][i] = Math.max(dp[j - 1][i] + array[j], dp[j][0] + i * (array[j] + array[j + 1]));
                if (elig(j, i, k)) {
                    max = Math.max(dp[j][i], max);
                }
            }
        }
        return max;
    }

    private static boolean elig(int j, int i, int k) {
        return j + (i * 2) == k;
    }
}

