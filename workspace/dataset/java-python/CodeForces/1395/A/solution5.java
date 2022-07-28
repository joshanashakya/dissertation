//package com.codeforces.Round664;

import java.util.Scanner;

public class Div2A {

    private static boolean areValid(int a, int b, int c, int d) {
        int paritySum = (a % 2) + (b % 2) + (c % 2) + (d % 2);
        return
            a >= 0 &&
            b >= 0 &&
            c >= 0 &&
            d >= 0 &&
            paritySum <= 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        int r;
        int g;
        int b;
        int w;

        for (int i = 0; i < t; i++) {

            r = scanner.nextInt();
            g = scanner.nextInt();
            b = scanner.nextInt();
            w = scanner.nextInt();

            scanner.nextLine();

            if (areValid(r, g, b, w) || areValid(r - 1, g - 1, b - 1, w + 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}

