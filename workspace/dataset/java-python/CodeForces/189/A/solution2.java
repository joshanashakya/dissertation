import java.util.*; public class solution {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int a = sc.nextInt();        int b = sc.nextInt();        int c = sc.nextInt();        int res = -1;        for (int i = 0; i <= n / a; i++) {            for (int j = 0; j * b + i * a <= n; j++) {                if ((n - (j * b + i * a)) % c == 0) {                    res = Math.max(res, (i + j + (n - (j * b + i * a)) / c));                }            }        }        System.out.println(res);    }}