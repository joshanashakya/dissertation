//package com.codeforces.Round660;

import java.util.Scanner;

public class Div2B {

    private static int ceiling(int a, int b) {
        return (a % b == 0) ? (a / b) : (a / b) + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        int n;

        int ceil;

        StringBuilder sb;

        for (int i = 0; i < t; i++) {

            n = Integer.parseInt(scanner.nextLine());

            ceil = ceiling(n, 4);

            sb = new StringBuilder(n);

            for (int j = 0; j < n - ceil; j++) {
                sb.append(9);
            }

            for (int j = 0; j < ceil; j++) {
                sb.append(8);
            }

            System.out.println(sb.toString());
        }

        scanner.close();
    }
}

