import java.util.Arrays;import java.util.Scanner; public class solution {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int time = sc.nextInt();        int[] book = new int[n];        int ans = 0;        int sum = 0;        int l = 0;        for (int i = 0; i < n; i++) {            book[i] = sc.nextInt();            sum += book[i];            while (sum > time) {                sum -= book[l++];            }            ans = Math.max(i - l + 1, ans);        }        System.out.println(ans);    }}