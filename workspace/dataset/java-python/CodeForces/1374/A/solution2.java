import java.util.*; public class Main {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int t = in.nextInt();        while (t-- > 0) {            int x = in.nextInt();            int y = in.nextInt();            int n = in.nextInt();            if (n % x == y) {                System.out.println(n);             }            else if (n % x > y) {                System.out.println(n - (n % x - y));             }            else {                System.out.println((n / x - 1) * x + y);            }         }      }  }    
