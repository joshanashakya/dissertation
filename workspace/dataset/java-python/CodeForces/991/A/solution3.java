//package y2019.m10.d22; import java.util.Scanner; public class A991 {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();        int N = s.nextInt();        if(a>N || b>N || c>N || c>a || c>b) System.out.println(-1);        else        {            int totalPassed = a+b-c;            System.out.println(N-totalPassed>0?N-totalPassed:-1);        }    }}
