//package com.codeforces.Round657; import java.util.Scanner; public class Div2B {     public static void main(String[] args) {         Scanner scanner = new Scanner(System.in);         int t = Integer.parseInt(scanner.nextLine());         long l;        long r;        long m;         long n;        long d;        long lo;        long hi;         for (int i = 0; i < t; i++) {             l = scanner.nextLong();            r = scanner.nextLong();            m = scanner.nextLong();             scanner.nextLine();             for (long a = l; a <= r; a++) {                n = (m + r - l) / a;                lo = m - r + l;                hi = m + r - l;                if (n > 0 && n * a >= lo && n * a <= hi) {                    d = m - (n * a);                    if (d > 0) {                        System.out.printf("%d %d %d\n", a, l + d, l);                    } else if (d < 0) {                        System.out.printf("%d %d %d\n", a, l, l - d);                    } else {                        System.out.printf("%d %d %d\n", a, l, l);                    }                    break;                }            }        }         scanner.close();    }}
