//package com.codeforces.Round664;

import java.util.Scanner;

public class Div2B {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();

        System.out.printf("%d %d\n", sx, sy);

        for (int y = 1; y <= m; y++) {
            if (y != sy) {
                System.out.printf("%d %d\n", sx, y);
            }
        }

        int parity = 0;

        for (int x = sx - 1; x >= 1; x--) {
            if (parity % 2 == 0) {
                for (int y = m; y >= 1; y--) {
                    System.out.printf("%d %d\n", x, y);
                }
            } else {
                for (int y = 1; y <= m; y++) {
                    System.out.printf("%d %d\n", x, y);
                }
            }
            parity++;
        }

        parity = ((sx - 1) % 2 == 0) ? 1 : 0;

        for (int x = sx + 1; x <= n; x++) {
            if (parity % 2 == 0) {
                for (int y = 1; y <= m; y++) {
                    System.out.printf("%d %d\n", x, y);
                }
            } else {
                for (int y = m; y >= 1; y--) {
                    System.out.printf("%d %d\n", x, y);
                }
            }
            parity++;
        }

        scanner.close();
    }
}

