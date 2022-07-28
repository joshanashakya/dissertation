//package com.codeforces.Round662;

import java.util.Scanner;

public class Div2A {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        int n;

        for (int i = 0; i < t; i++) {

            n = Integer.parseInt(scanner.nextLine());

            System.out.println((n / 2) + 1);
        }

        scanner.close();
    }
}

