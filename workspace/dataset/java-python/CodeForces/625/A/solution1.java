import java.util.Scanner; public class BottleBuyer {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         long n = scanner.nextLong();        long a = scanner.nextLong();        long b = scanner.nextLong();        long c = scanner.nextLong();        long bc = b - c;        long ans = 0;         if(a <= bc || b > n) ans = n/a;        else {            ans = (n - b)/bc + 1 + ((n - b)%bc + c)/a;        }         System.out.println(ans);    }}