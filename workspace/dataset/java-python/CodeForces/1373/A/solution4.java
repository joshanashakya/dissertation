import java.util.*; public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while(t-->0) {            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();            if(b == 1) {                if(a == c) System.out.println("-1 -1");                else if(a < c) System.out.println("1 -1");                else System.out.println("-1 1");            }            else if(a == c) System.out.println("-1 2");            else if(a > c) System.out.println("-1 1");            else {                if(a*b > c) System.out.println("1 "+b);                else System.out.println("1 -1");            }        }    }}
