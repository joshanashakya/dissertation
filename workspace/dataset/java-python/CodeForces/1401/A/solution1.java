import java.util.Scanner; public class CodeForces {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        for (int i = 0; i < t; i++) {            int n = sc.nextInt();            int m = sc.nextInt();            if (n>m){                System.out.println((n-m)%2);            }else {                System.out.println(m-n);            }        }    }}
