import java.util.Scanner; public class A1296 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int t = scanner.nextInt();        for (int i = 0; i < t; i++) {            int n = scanner.nextInt(), odd = 0, even = 0;            for (int j = 0; j < n; j++) {                int a = scanner.nextInt();                if (a % 2 == 0) even++;                else odd++;            }            System.out.println(odd % 2 == 0 && even == 0 || odd == 0 ? "NO" : "YES");        }    }}