import java.util.Scanner; public class Holidays {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();         int min = 0;        int max = 0;         for (int i = 1; i <= n; i++) {            if (i % 7 == 0 || (i + 1) % 7 == 0) {                min++;            }            if (i % 7 == 1 || i % 7 == 2) {                max++;            }        }         System.out.println(min);        System.out.println(max);     }}