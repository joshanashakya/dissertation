import java.util.Arrays;import java.util.Scanner; public class P767A {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt(), t = n;        int[] a = new int[n+1];        for (int i = 0; i < n; i++) {            int val = sc.nextInt();            a[val] = 1;            while (a[t] == 1) {                System.out.print(t-- + " ");            }            System.out.println();        }    }}
