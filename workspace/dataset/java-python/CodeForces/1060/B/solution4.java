import java.util.*; public class Test {    public static void main(String[] args) {         Scanner input = new Scanner(System.in);        long n = input.nextLong();         long a = (long)Math.pow(10, (long)Math.log10(n)) - 1;        long b = n - a;        int sum = 0;         while (a > 0) {            sum += a % 10;            a /= 10;        }         while (b > 0) {            sum += b % 10;            b /= 10;        }        System.out.println(sum);    }}
