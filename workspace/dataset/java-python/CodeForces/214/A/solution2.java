// 214A - System of Equations// https://codeforces.com/problemset/problem/214/A import java.util.Scanner; public class CF214A {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int m = sc.nextInt();        int ans = 0;        for (int a = 0; a * a <= n && a <= m; ++a) {            int b = n - a * a;            if (a + b * b == m) {                ans += 1;            }        }        System.out.println(ans);        sc.close();    }}