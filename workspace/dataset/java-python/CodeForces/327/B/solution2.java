import java.util.Scanner; public class B327 {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        int n = s.nextInt();        int c = n;        for (int i = 0; i < n; i++) {            System.out.print(++c + (i == n-1 ? "" : " "));        }    }}
