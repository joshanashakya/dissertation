import java.util.Scanner; public class A1206 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt(), max1 = Integer.MIN_VALUE;        for (int i = 0; i < n; i++) {            int a = scanner.nextInt();            if (a > max1) {                max1 = a;            }        }        int m = scanner.nextInt(), max2 = Integer.MIN_VALUE;        for (int i = 0; i < m; i++) {            int b = scanner.nextInt();            if (b > max2) {                max2 = b;            }        }        System.out.print(max1 + " " + max2);    }}