import java.util.ArrayList;        import java.util.Arrays;        import java.util.Scanner; public class Singleton_Pattern {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int a = sc.nextInt();        int b = sc.nextInt();        if (a>b){            a=a^b;            b=a^b;            a=a^b;        }        int rem = b-a;        int n =rem/2;        int x =n*(n+1);        if (rem%2==1)            x+=(n+1);        System.out.println(x);    }}
