import java.util.*; public class Solve {     static Scanner scan = new Scanner(System.in);     public static void solve(int n,int[] a){        int fingers = 0;        for (int i = 0; i < n; i++) {            fingers += a[i];        }         int count = 0;        for (int i = 1; i <= 5; i++) {            if((fingers+i)%(n+1) == 1){                count++;            }        }        System.out.println(5-count);    }      public static void main(String[] args) {         int n = scan.nextInt();        int[] a = new int[n];         for (int i = 0; i < n; i++) {            a[i] = scan.nextInt();        }         solve(n,a);    }}