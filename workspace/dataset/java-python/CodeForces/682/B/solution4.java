import java.util.Arrays;import java.util.Scanner; public class MexArray {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);         int n = scan.nextInt();        Integer[] a = new Integer[n];         for (int i = 0; i < n; i++) a[i] = scan.nextInt();         Arrays.sort(a);         int mex = n + 1;        int pp = 0;        for (int i = 0; i < n; i++) {            if(a[i] < i+1-pp){                mex--;                pp++;            }        }         System.out.println(mex);    }}