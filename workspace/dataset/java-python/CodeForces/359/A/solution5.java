import java.util.Scanner; public class TableColoring {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);         int n = scan.nextInt();        int m = scan.nextInt();         for (int i = 0; i < n; i++) {            for (int j = 0; j < m; j++){                if (scan.nextInt() == 1 && (i == 0 || i == n - 1 || j == 0 || j == m - 1)) {                    System.out.println(2);                    return;                }            }        }        System.out.println(4);    }}
