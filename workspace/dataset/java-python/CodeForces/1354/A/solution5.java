import java.util.Scanner; public class P1354A {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while (t-- > 0) {            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();             if(b >= a) {                System.out.println(b);            } else if(c > d) {                long diff = c-d;                long i = (a-b)/diff;                long ans = (a-b) % diff == 0 ? i * c + b : (i+1) * c + b;                System.out.println(ans);            } else {                System.out.println(-1);            }        }    }}
