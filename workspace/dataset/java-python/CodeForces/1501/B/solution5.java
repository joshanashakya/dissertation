import java.util.Scanner;

import static java.lang.System.in;

public class Round707B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int[] ans = new int[n];
            int cream = 0;
            for (int j = n - 1; j >= 0; j--) {
                cream = Math.max(cream - 1, a[j]);
                if (cream > 0) ans[j] = 1;
            }
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

