import java.util.Scanner; public class CodeForces {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int a = sc.nextInt();        int b = sc.nextInt();        int n = sc.nextInt();        while (n>=0){            n=n-gcd(a,n);            if (n<0){                System.out.println(1);                break;            }            n=n-gcd(b,n);            if (n<0){                System.out.println(0);            }         }     }    private static int gcd(int a, int b) {        if (b == 0)            return a;        else            return gcd(b, a % b);    }}