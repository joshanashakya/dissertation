import java.util.ArrayList;import java.util.Arrays;        import java.util.Scanner; public class Singleton_Pattern {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int[] a = new int[n];        for (int i = 0; i < n; i++) {            int x = sc.nextInt();            a[i] = x;        }         int m = sc.nextInt();        int[] b = new int[m];        for (int i = 0; i < m; i++) {            int x = sc.nextInt();            b[i] = x;        }        Arrays.sort(a);        Arrays.sort(b);        System.out.println(a[a.length-1]+ " " + b[b.length-1]);    }}
