import java.util.Scanner; public class PolandBall {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();         for (int i = 1; i <= 1000; i++) {            int result = n * i + 1;            if (!isPrime(result)) {                System.out.println(i);                break;            }        }    }     private static boolean isPrime(int n) {        if (n <= 1) {            return false;        }        for (int i = 2; i < n / 2 + 1; i++) {            if (n % i == 0) {                return false;            }        }        return true;    }}
