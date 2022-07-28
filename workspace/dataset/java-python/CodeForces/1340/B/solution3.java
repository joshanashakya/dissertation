import java.io.*;import java.util.*; public class glowingdigits {    static String[] digits = {"1110111", "0010010", "1011101", "1011011", "0111010", "1101011", "1101111", "1010010", "1111111", "1111011"};    static int infinity = 1 << 29;     public static void main(String[] args) throws Exception {        Scanner in = new Scanner(System.in);         int n = in.nextInt(), k = in.nextInt();        String[] a = new String[n];        for (int i = 0; i < n; i++) {            a[i] = in.next();        }         int[][] diff = new int[n][10];        for (int i = 0; i < n; i++) {            for (int d = 0; d < 10; d++) {                for (int b = 0; b < 7; b++) {                    if (a[i].charAt(b) == '0' && digits[d].charAt(b) == '1') {                        diff[i][d]++;                    } else if (a[i].charAt(b) == '1' && digits[d].charAt(b) == '0') {                        diff[i][d] = infinity;                        break;                    }                }            }        }         boolean[][] dp = new boolean[n + 1][k + 1];        dp[n][0] = true;        for (int i = n - 1; i > -1; i--) {            for (int sum = 0; sum <= k; sum++) {                for (int d = 0; d < 10; d++) {                    if (sum - diff[i][d] >= 0) {                        dp[i][sum] |= dp[i + 1][sum - diff[i][d]];                    }                }            }        }         if (!dp[0][k]) {            System.out.println(-1);        } else {            for (int i = 0; i < n; i++) {                for (int d = 9; d > -1; d--) {                    if (k - diff[i][d] >= 0 && dp[i + 1][k - diff[i][d]]) {                        k -= diff[i][d];                        System.out.print(d);                        break;                    }                }            }             System.out.println();        }    }}
