import java.util.*; public class Codeforces {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int n = in.nextInt();        if (n >= 0) {            System.out.println(n);        } else {            int max = Math.max(n / 10, n / 100 * 10 + n % 10);            System.out.println(max);        }        System.out.println();     } }
