import java.util.Scanner; public class Main {     static long n, a, b;     static long sqr(long x) {        return x * x;    }     public static void main(String[] args) {        Scanner l = new Scanner(System.in);        n = l.nextLong();        a = l.nextLong();        b = l.nextLong();        if (n > b) {            System.out.println("-1");        } else {            if (sqr(b - n + 1) + n - 1 < a) {                System.out.println("-1");            } else {                for (long i = 0; i < n - 1; i++) {                    System.out.println(1);                }                System.out.println(b - n + 1);            }        }    }}