import java.util.*;public class _1409B {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while (t-- > 0) {            int a = sc.nextInt();            int b = sc.nextInt();            int x = sc.nextInt();            int y = sc.nextInt();            int n = sc.nextInt();            long res1 = 0,res2=0, a1, b1,a2,b2;                a1 = Math.max(a - n, x);                b1= Math.max(b - Math.max(n-(a-x), 0), y);                a2 = Math.max(b - n, y);                b2 = Math.max(a - Math.max(n-(b-y),0), x);            System.out.println(Math.min(a1 * b1, a2 * b2));        }    }}