import java.util.Scanner; public class Balanced_Matrix {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);         int t = in.nextInt();        int n;        while (t-- != 0) {            n = in.nextInt();            if (n % 4 != 0) {                System.out.println("NO");            } else {                System.out.println("YES");                for (int i = 2; i <= n; i += 2) {                    System.out.print(i + " ");                }                 for (int i = 1; i < n-1; i += 2) {                    System.out.print(i + " ");                }                System.out.println(n + n / 2 - 1);            }         }     } }
