import java.util.Arrays;import java.util.Scanner; public class solution {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int m = sc.nextInt();        if (n == m) {            System.out.println(0);            return;        }        if (n > m) {            System.out.print(n - m);            return;        }        int step = 0;        while (n < m) {            step++;            m = m % 2 == 0 ? m / 2 : m + 1;        }        System.out.println(step + n - m);    }}